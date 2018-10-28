package example.com.daggermultimodule.di

import dagger.Component
import example.com.daggermultimodule.App

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: App)
}