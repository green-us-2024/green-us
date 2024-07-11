package kr.ac.kpu.green_us

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kr.ac.kpu.green_us.databinding.ActivityLoginBinding

// 로그인 화면 - 이메일, 비밀번호 입력, 자동로그인 지원, 이메일 찾기, 비밀번호 찾기, 회원가입 화면으로 이동 가능
class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(getLayoutInflater())
        setContentView(binding.root)

        var id_msg = ""
        var pw_msg = ""

        // 아이디, 비밀번호 입력 시 로그인 버튼 활성화
        binding.login.isEnabled = false
        binding.login.setAlpha(0.5f)
        binding.id.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                id_msg = binding.id.getText().toString()
                pw_msg = binding.pw.getText().toString()
                if(id_msg.isNotEmpty()&&pw_msg.isNotEmpty()) {
                    binding.login.isEnabled = true
                    binding.login.setAlpha(1f)
                }
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                id_msg = binding.id.getText().toString()
                pw_msg = binding.pw.getText().toString()
                if(id_msg.isNotEmpty()&&pw_msg.isNotEmpty()) {
                    binding.login.isEnabled = true
                    binding.login.setAlpha(1f)
                }
                else{
                    binding.login.isEnabled = false
                    binding.login.setAlpha(0.5f)
                }
            }
        })

        binding.pw.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                id_msg = binding.id.getText().toString()
                pw_msg = binding.pw.getText().toString()
                if(id_msg.isNotEmpty()&&pw_msg.isNotEmpty()) {
                    binding.login.isEnabled = true
                    binding.login.setAlpha(1f)
                }
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                id_msg = binding.id.getText().toString()
                pw_msg = binding.pw.getText().toString()
                if(id_msg.isNotEmpty()&&pw_msg.isNotEmpty()) {
                    binding.login.isEnabled = true
                    binding.login.setAlpha(1f)
                }
                else{
                    binding.login.isEnabled = false
                    binding.login.setAlpha(0.5f)
                }
            }
        })


        // 로그인 버튼 클릭 시
        binding.login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // 아이디 찾기 버튼 클릭 시
        binding.findEmail.setOnClickListener {
            val intent = Intent(this, FindEmailActivity::class.java)
            startActivity(intent)
        }

        //비밀번호 찾기 버튼 클릭 시
        binding.findPw.setOnClickListener {
            val intent = Intent(this, FindPwActivity::class.java)
            startActivity(intent)
        }

        //회원가입 버튼 클릭 시
        binding.join.setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }
    }
}