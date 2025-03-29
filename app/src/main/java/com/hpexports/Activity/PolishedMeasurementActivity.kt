package com.hpexports.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.hpexports.databinding.ActivityPolishedMeasurementBinding

class PolishedMeasurementActivity : AppCompatActivity() {
    var binding: ActivityPolishedMeasurementBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        binding = ActivityPolishedMeasurementBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        //setContentView(R.layout.activity_polished_measurement);
        /*  ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}