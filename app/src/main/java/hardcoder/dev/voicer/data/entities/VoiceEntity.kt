package hardcoder.dev.voicer.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "voice")
data class VoiceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val noteId: Int? = null,
    val filePath: String,
    val duration: Int
)
