package com.wikosac.core.data.model

import com.google.gson.annotations.SerializedName

data class GameResponse(

	@field:SerializedName("next")
	val next: String,

	@field:SerializedName("previous")
	val previous: Any,

	@field:SerializedName("count")
	val count: Int,

	@field:SerializedName("results")
	val results: List<GameItem>
)

data class GenresItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("slug")
	val slug: String
)

data class GameItem(

	@field:SerializedName("added")
	val added: Int,

	@field:SerializedName("rating")
	val rating: Any,

	@field:SerializedName("metacritic")
	val metacritic: Int,

	@field:SerializedName("playtime")
	val playtime: Int,

	@field:SerializedName("short_screenshots")
	val shortScreenshots: List<ShortScreenshotsItem>,

	@field:SerializedName("platforms")
	val platforms: List<PlatformsItem>,

	@field:SerializedName("user_game")
	val userGame: Any,

	@field:SerializedName("score")
	val score: Any,

	@field:SerializedName("rating_top")
	val ratingTop: Int,

	@field:SerializedName("reviews_text_count")
	val reviewsTextCount: Int,

	@field:SerializedName("ratings")
	val ratings: List<RatingsItem>,

	@field:SerializedName("genres")
	val genres: List<GenresItem>,

	@field:SerializedName("saturated_color")
	val saturatedColor: String,

	@field:SerializedName("added_by_status")
	val addedByStatus: AddedByStatus,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("parent_platforms")
	val parentPlatforms: List<ParentPlatformsItem>,

	@field:SerializedName("ratings_count")
	val ratingsCount: Int,

	@field:SerializedName("slug")
	val slug: String,

	@field:SerializedName("released")
	val released: String,

	@field:SerializedName("stores")
	val stores: List<StoresItem>,

	@field:SerializedName("suggestions_count")
	val suggestionsCount: Int,

	@field:SerializedName("tags")
	val tags: List<TagsItem>,

	@field:SerializedName("background_image")
	val backgroundImage: String,

	@field:SerializedName("tba")
	val tba: Boolean,

	@field:SerializedName("dominant_color")
	val dominantColor: String,

	@field:SerializedName("esrb_rating")
	val esrbRating: EsrbRating,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("updated")
	val updated: String,

	@field:SerializedName("clip")
	val clip: Any,

	@field:SerializedName("reviews_count")
	val reviewsCount: Int
)

data class EsrbRating(

	@field:SerializedName("name_ru")
	val nameRu: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("slug")
	val slug: String,

	@field:SerializedName("name_en")
	val nameEn: String
)

data class Store(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("slug")
	val slug: String
)

data class TagsItem(

	@field:SerializedName("games_count")
	val gamesCount: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("language")
	val language: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("image_background")
	val imageBackground: String,

	@field:SerializedName("slug")
	val slug: String
)

data class Platform(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("slug")
	val slug: String
)

data class AddedByStatus(

	@field:SerializedName("owned")
	val owned: Int,

	@field:SerializedName("beaten")
	val beaten: Int,

	@field:SerializedName("dropped")
	val dropped: Int,

	@field:SerializedName("yet")
	val yet: Int,

	@field:SerializedName("playing")
	val playing: Int,

	@field:SerializedName("toplay")
	val toplay: Int
)

data class PlatformsItem(

	@field:SerializedName("platform")
	val platform: Platform
)

data class RatingsItem(

	@field:SerializedName("count")
	val count: Int,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("percent")
	val percent: Any
)

data class StoresItem(

	@field:SerializedName("store")
	val store: Store
)

data class ParentPlatformsItem(

	@field:SerializedName("platform")
	val platform: Platform
)

data class ShortScreenshotsItem(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("id")
	val id: Int
)
