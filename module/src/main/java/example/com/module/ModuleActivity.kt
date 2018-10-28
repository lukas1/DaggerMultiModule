package example.com.module

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_module.*
import javax.inject.Inject

class ModuleActivity : AppCompatActivity() {

    @Inject lateinit var dependency: ModuleActivityDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        textViewModuleActivity.text = dependency.text
    }
}
