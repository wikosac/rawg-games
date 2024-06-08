package com.wikosac.core.data.source.local.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wishlist")
data class WishlistEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val imageUrl: String,
    val rating: Double,
    val platforms: List<String>,
    val genres: List<String>
)
