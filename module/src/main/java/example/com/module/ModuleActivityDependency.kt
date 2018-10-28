package example.com.module

import javax.inject.Inject

class ModuleActivityDependency @Inject constructor() {
    val text = "Hello World from Module Activity Dependency"
}