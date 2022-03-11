package com.example.pinterest.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pinterest.database.Saved

@Dao
interface SavedDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertProduct(saved: Saved)

    @Query("SELECT * FROM Saved")
    fun getSaved(): List<Saved>
}