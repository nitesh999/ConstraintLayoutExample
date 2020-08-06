package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//here textView4 is not visible but still layout_goneMarginEnd="32dp" is taken by textView3, but when both are visible then both are sticking with each other and no margin is not there
class BiasAndMarginGoneConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bias_and_margin_gone)
    }
}