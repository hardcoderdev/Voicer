package hardcoder.dev.voicer.data.dao

import androidx.room.*
import hardcoder.dev.voicer.data.entities.NoteEntity
import hardcoder.dev.voicer.data.entities.VoiceEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(noteEntity: NoteEntity)

    @Delete
    suspend fun delete(noteEntity: NoteEntity)

    @Update
    suspend fun update(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Query("SELECT * FROM voice WHERE id = :noteId")
    fun getAllVoicesInNote(noteId: Int): Flow<List<VoiceEntity>>
}