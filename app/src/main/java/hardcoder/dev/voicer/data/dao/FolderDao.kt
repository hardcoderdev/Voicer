package hardcoder.dev.voicer.data.dao

import androidx.room.*
import hardcoder.dev.voicer.data.entities.FolderEntity
import hardcoder.dev.voicer.data.entities.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FolderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(folderEntity: FolderEntity)

    @Delete
    suspend fun delete(folderEntity: FolderEntity)

    @Update
    suspend fun update(folderEntity: FolderEntity)

    @Query("SELECT * FROM folders")
    fun getAllFolders(): Flow<List<FolderEntity>>

    @Query("SELECT * FROM folders WHERE id = :folderId")
    fun getAllNotesInFolder(folderId: Int): Flow<NoteEntity>
}