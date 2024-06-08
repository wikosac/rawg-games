package com.wikosac.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [WishlistEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class WishlistDatabase : RoomDatabase() {
    abstract fun wishlistDao(): WishlistDao
}