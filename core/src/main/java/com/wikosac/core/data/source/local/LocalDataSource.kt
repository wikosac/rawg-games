package com.wikosac.core.data.source.local

import com.wikosac.core.data.source.local.room.WishlistDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val wishlistDao: WishlistDao) {
}