package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//drag button6 horizontally and see the effect on button5 width while button5 is 0dp width
//drag button6 horizontally and see the effect on button5 width while button5 is wrap_content width
class dp0ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dp0_constraint)
    }
}