package com.example.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

//this activity is self example of chain
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoBasicConstraintActivity(view: View){
        startActivity(Intent(this, BasicConstraintActivity::class.java))
    }

    fun gotoBaselineConstraintActivity(view: View){
        startActivity(Intent(this, BaselineConstraintActivity::class.java))
    }

    fun gotoCenterToViewConstraintActivity(view: View){
        startActivity(Intent(this, CenterToViewConstraintActivity::class.java))
    }

    fun gotoBiasAndMarginGoneConstraintActivity(view: View){
        startActivity(Intent(this, BiasAndMarginGoneConstraintActivity::class.java))
    }

    fun gotodp0ConstraintActivity(view: View){
        startActivity(Intent(this, dp0ConstraintActivity::class.java))
    }

    fun gotoPercentageConstraintActivity(view: View){
        startActivity(Intent(this, PercentageConstraintWidthActivity::class.java))
    }

    fun gotoChainStyleWeightActivity(view: View){
        startActivity(Intent(this, ChainStyleWeightActivity::class.java))
    }

    fun gotoGroupConstraintActivity(view: View){
        startActivity(Intent(this, GroupConstraintActivity::class.java))
    }

    fun gotoBarrierConstraintActivity(view: View){
        startActivity(Intent(this, BarrierConstraintActivity::class.java))
    }

}