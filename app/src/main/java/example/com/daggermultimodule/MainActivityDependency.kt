package example.com.daggermultimodule

import javax.inject.Inject

class MainActivityDependency @Inject constructor() {
    val text = "Hello World from Main Activity Dependency"
}