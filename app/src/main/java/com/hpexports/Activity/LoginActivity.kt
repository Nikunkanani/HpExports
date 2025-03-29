package com.hpexports.Activity

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.hpexports.R
import com.hpexports.Webservice.UserLocalStore
import com.hpexports.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    var binding: ActivityLoginBinding? = null
    var strMobile: String? = null
    var strPassword: String? = null

    // LoginViewModel loginViewModel;
    var userLocalStore: UserLocalStore? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        //getSupportActionBar().hide();
        userLocalStore = UserLocalStore(this@LoginActivity)

        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        binding!!.ivShowPassword.setOnClickListener { togglePasswordVisibility() }


        binding!!.idLogin.setOnClickListener {
            strMobile = binding!!.edtUsername.text.toString().trim { it <= ' ' }
            strPassword = binding!!.edtPassword.text.toString().trim { it <= ' ' }
            if (TextUtils.isEmpty(strMobile)) {
                Toast.makeText(
                    this@LoginActivity,
                    R.string.please_enter_your_mobile_number,
                    Toast.LENGTH_SHORT
                ).show()
            } else if (strMobile!!.length < 10) {
                Toast.makeText(
                    this@LoginActivity,
                    R.string.please_enter_your_valid_mobile_number,
                    Toast.LENGTH_SHORT
                ).show()
            } else if (TextUtils.isEmpty(strPassword)) {
                Toast.makeText(
                    this@LoginActivity,
                    R.string.please_enter_your_password,
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                //login();

                // loginViewModel.login(strMobile, strPassword);
                // startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                /*  Intent i_Home = new Intent(LoginActivity.this, HomeActivity.class);
                        i_Home.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);*/

                val i = Intent(
                    this@LoginActivity,
                    PolishedMeasurementActivity::class.java
                )
                //i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i)
            }
        }
    }

    private fun togglePasswordVisibility() {
        if (binding!!.edtPassword.transformationMethod == null) {
            binding!!.edtPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            binding!!.ivShowPassword.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_eye_off,
                    null
                )
            )
        } else {
            binding!!.edtPassword.transformationMethod = null
            binding!!.ivShowPassword.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.baseline_visibility_24,
                    null
                )
            )
        }

        // Move cursor to the end of the text
        binding!!.edtPassword.setSelection(binding!!.edtPassword.text.length)
    }
}