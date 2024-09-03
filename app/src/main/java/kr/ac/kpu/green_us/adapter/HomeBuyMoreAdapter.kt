package kr.ac.kpu.green_us.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.Firebase
import com.google.firebase.storage.storage
import kr.ac.kpu.green_us.R
import kr.ac.kpu.green_us.common.dto.Greening
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class HomeBuyMoreAdapter() :
    RecyclerView.Adapter<HomeBuyMoreAdapter.HomeBuyViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(gSeq:Int){}
    }

    var itemClickListener: OnItemClickListener? = null
    private var greeningList: List<Greening> = emptyList()

    inner class HomeBuyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var img: ImageView = view.findViewById(R.id.greening_img) // 대표이미지
        var title: TextView = view.findViewById(R.id.greeng_title) // 그리닝명
        var deadLine : TextView = view.findViewById(R.id.tv_time) // 마감시간
        var deadLineLayout : ConstraintLayout = view.findViewById(R.id.deadline_layout) // 마감시간 표시 영역
        var term : TextView = view.findViewById(R.id.tag_term)// 진행기간
        var freq : TextView = view.findViewById(R.id.tag_freq)// 인증빈도
        var method : TextView = view.findViewById(R.id.tag_certifi)// 인증수단
        var type : TextView = view.findViewById(R.id.type) //그리닝 유형
//        init{
//            view.setOnClickListener{ itemClickListener?.onItemClick("in") }
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): HomeBuyMoreAdapter.HomeBuyViewHolder {
        // create a new view
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_greening, parent, false)

        return HomeBuyViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: HomeBuyViewHolder, position: Int) {
        val greening = greeningList[position]

        // greening.gStartDate는 "yyyy-MM-dd" 형식의 문자열
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val startDate = LocalDate.parse(greening.gStartDate, formatter)

        // 현재 시간
        val currentDateTime = LocalDateTime.now(ZoneId.systemDefault())
        // startDate의 00시로 LocalDateTime을 설정
        val startDateTime = startDate.atStartOfDay()
        // 현재 시간과 startDateTime의 차이를 계산
        val duration = Duration.between(currentDateTime, startDateTime)

        // duration을 일, 시간, 분으로 나눠서 표시
        val days = duration.toDays()
        val hours = duration.toHours() % 24
        val minutes = duration.toMinutes() % 60

        val deadLind = if (duration.isNegative){
            "모집마감"
        }else{
            "${days}일 ${hours}시간 ${minutes}분"
        }

        var greenWeek = 0
        if(greening.gFreq != 0 && greening.gNumber != 0 && greening.gFreq != null && greening.gNumber != null) {
            greenWeek = (greening.gNumber)/(greening.gFreq)
        }
        val gseq = greeningList[position].gSeq.toString()
        val imgName = gseq
        val storage = Firebase.storage
        val ref = storage.getReference("greeningImgs/").child(imgName)
        ref.downloadUrl.addOnSuccessListener {
                uri -> Glide.with(holder.itemView.context).load(uri).into(holder.img)
        }
        holder.title.text = greening.gName ?: ""
        holder.deadLine.text = deadLind
        //holder.deadLineLayout
        holder.term.text = "${greenWeek}주"
        holder.freq.text = "주${greening.gFreq}회"
        holder.method.text = greening.gCertiWay
        holder.type.text = when(greening.gKind){
            1,3 -> "활동형"
            2,4 -> "구매형"
            else -> ""
        }

        holder.itemView.setOnClickListener{
            itemClickListener?.onItemClick(greening.gSeq)
        }
    }

    override fun getItemCount(): Int {
        return greeningList.size
    }

    fun updateData(newGreeningList: List<Greening>){
        greeningList = newGreeningList
        notifyDataSetChanged()
    }
}