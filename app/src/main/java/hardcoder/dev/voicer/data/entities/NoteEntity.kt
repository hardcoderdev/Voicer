package hardcoder.dev.voicer.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val folderId: Int? = null,
    val name: String,
    val createdTime: Long
)
