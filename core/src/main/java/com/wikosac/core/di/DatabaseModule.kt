package com.wikosac.core.di

import android.content.Context
import androidx.room.Room
import com.wikosac.core.data.source.local.room.WishlistDao
import com.wikosac.core.data.source.local.room.WishlistDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): WishlistDatabase {
        val passPhrase: ByteArray = SQLiteDatabase.getBytes("secureDbPass".toCharArray())
        val factory = SupportFactory(passPhrase)
        return Room.databaseBuilder(
            context.applicationContext,
            WishlistDatabase::class.java,
            "wishlist.db"
        ).fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }

    @Provides
    @Singleton
    fun provideTaskDao(db: WishlistDatabase): WishlistDao = db.wishlistDao()

}