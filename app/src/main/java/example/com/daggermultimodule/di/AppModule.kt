package example.com.daggermultimodule.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import example.com.daggermultimodule.MainActivity
import example.com.module.ModuleActivity

@Module(includes = [
    AndroidSupportInjectionModule::class
])
abstract class AppModule {
    @ActivityScope @ContributesAndroidInjector()
    abstract fun contributesMainActivityInjector(): MainActivity

    @ActivityScope @ContributesAndroidInjector()
    abstract fun contributesModuleActivityInjector(): ModuleActivity
}