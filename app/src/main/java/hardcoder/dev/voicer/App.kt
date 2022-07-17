package hardcoder.dev.voicer

import android.app.Application
import hardcoder.dev.voicer.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpKoin()
    }

    private fun setUpKoin() {
        startKoin {
            androidContext(this@App)
            androidLogger(level = Level.DEBUG)
            modules(dataModule(this@App))
        }
    }
}