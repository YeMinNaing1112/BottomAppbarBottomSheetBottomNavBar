package com.yeminnaing.bottomnavigation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.yeminnaing.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

class BottomSheet : AppCompatActivity(R.layout.activity_bottom_sheet) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            val sheet= BottomSheetBehavior.from(bottomSheet)
             sheet.isHideable=true
//        sheet.state=BottomSheetBehavior.STATE_EXPANDED
        btnShow.setOnClickListener {
            when{
                   sheet.state!=BottomSheetBehavior.STATE_EXPANDED->{
                    sheet.state= BottomSheetBehavior.STATE_EXPANDED
                }
                else->{
                    sheet.state=BottomSheetBehavior.STATE_COLLAPSED
                }
            }
        }
    }
}