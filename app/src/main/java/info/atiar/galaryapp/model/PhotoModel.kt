package info.atiar.galaryapp.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class PhotoModel(
    val id: String,
    val description: String?,
    val urls: PhotoUrls,
    val user: PhotoUsers
) : Parcelable {

    @Parcelize
    data class PhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String,
    ) : Parcelable

    @Parcelize
    data class PhotoUsers(
        val name: String,
        val username: String
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchApp&utm_medium=referral"
    }
}