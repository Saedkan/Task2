package com.example.task2.data.dao

import androidx.room.*
import com.example.task2.data.model.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getUsers(): List<UserEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: UserEntity)
}
