package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//drag button9 horizontally and see the effect on button8 width while button8 is 0dp width with layout_constrainedWidth true
//same way we can check button7 layout_constraintWidth_percent property while button7 is 0dp
class PercentageConstraintWidthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percentage_width_constraint)
    }
}