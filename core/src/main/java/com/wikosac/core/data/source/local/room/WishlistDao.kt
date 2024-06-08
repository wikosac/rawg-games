package com.wikosac.core.data.source.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WishlistDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(wishlistEntity: WishlistEntity)

    @Query("DELETE FROM wishlist WHERE wishlist.id = :id")
    fun delete(id: Int)

    @Query("SELECT * from wishlist ORDER BY id ASC")
    fun getWishlist(): Flow<List<WishlistEntity>>

    @Query("SELECT count(*) FROM wishlist WHERE wishlist.id = :id")
    fun check(id: Int): Flow<Int>

}