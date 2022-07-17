package hardcoder.dev.voicer.data

import androidx.room.Database
import androidx.room.RoomDatabase
import hardcoder.dev.voicer.data.dao.FolderDao
import hardcoder.dev.voicer.data.dao.NoteDao
import hardcoder.dev.voicer.data.entities.FolderEntity
import hardcoder.dev.voicer.data.entities.NoteEntity
import hardcoder.dev.voicer.data.entities.VoiceEntity

@Database(
    entities = [
        FolderEntity::class,
        NoteEntity::class,
        VoiceEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun folderDao(): FolderDao
    abstract fun noteDao(): NoteDao
}