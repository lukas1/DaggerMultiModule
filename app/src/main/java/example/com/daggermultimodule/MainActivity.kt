package example.com.daggermultimodule

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import example.com.module.ModuleActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var dependency: MainActivityDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewMainActivity.text = dependency.text

        buttonMainActivity.setOnClickListener {
            startActivity(Intent(this, ModuleActivity::class.java))
        }
    }
}
