package com.example.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//here textView7 is displacing to right when either button14 or textView6 will expand by increasing text so it depends upon both not only one element
//if we would have done it with adding constraint from textView7 start to end of either button14 or textView7 not both, but barrier provides both
class BarrierConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barrier_constraint)
    }
}