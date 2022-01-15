package org.techtown.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.techtown.imageviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {
            binding.ivProfile.setImageResource(R.drawable.robot) // 이미지 뷰에 새로운 이미지 등록
            Toast.makeText(this@MainActivity,"버튼이 클릭 되었습니다.",Toast.LENGTH_SHORT).show()
        }
    }
}