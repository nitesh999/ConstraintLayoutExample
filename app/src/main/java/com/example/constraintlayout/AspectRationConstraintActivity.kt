package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//layout_constraintDimensionRatio 2, aspect ration means keep width manually as 0 so that android adjust it and change height to check the effect
class AspectRationConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aspect_ration_constraint)
    }
}