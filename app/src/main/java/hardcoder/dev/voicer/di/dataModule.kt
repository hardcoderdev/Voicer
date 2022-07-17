package hardcoder.dev.voicer.di

import android.content.Context
import androidx.room.Room
import hardcoder.dev.voicer.R
import hardcoder.dev.voicer.data.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

fun dataModule(context: Context) = module {
    provideDatabase(context)
    provideDao()
}

fun Module.provideDao() {
    single {
        get<AppDatabase>().noteDao()
    }
    single {
        get<AppDatabase>().folderDao()
    }
}

fun Module.provideDatabase(context: Context) {
    single {
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            context.getString(R.string.app_db_name)
        )
    }
}