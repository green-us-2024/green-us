package kr.ac.kpu.green_us

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kr.ac.kpu.green_us.databinding.FragmentHomeBinding
import kr.ac.kpu.green_us.databinding.FragmentJoin1Binding
import kr.ac.kpu.green_us.databinding.FragmentMypageBinding

class MypageFragment : Fragment() {

    lateinit var binding: FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater,container,false)
        binding.profileSetting.setOnClickListener {
            val intent = Intent(getActivity(), MyProfileActivity::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}