package dev.hossain.model

import com.squareup.moshi.JsonClass

/**
 * ```
 * {
 *   "url": "https://maps.google.com/maps?q=23.0..63,-61.6..85",
 *   "geo": {
 *     "geo_coordinates_v2": {
 *       "latitude": 23.0...3,
 *       "longitude": -61.6...85
 *     }
 *   },
 *   "representative_image": {
 *     "type": [
 *       "IMAGE_OBJECT_V2",
 *       "MEDIA_OBJECT_V2",
 *       "CREATIVE_WORK_V2",
 *       "THING_V2",
 *       "THING"
 *     ],
 *     "id": "https://maps.googleapis.com/maps/api/staticmap?center=23.0....85,-61.6....91&zoom=15&markers=color:red%7C23.0...63,-61.6....85&size=400x400&sensor=false&visual_refresh=true",
 *     "image_object_v2": {
 *       "url": "https://maps.googleapis.com/maps/api/staticmap?center=23.0....85,-61.6....91&zoom=15&markers=color:red%7C23.0...63,-61.6....85&size=400x400&sensor=false&visual_refresh=true&key=AIz.....eqiA="
 *     }
 *   }
 * }
 * ```
 */
@JsonClass(generateAdapter = true)
data class EmbedPlace(
    val url: String,
    val geo: GeoData,
    val representative_image: RepresentativeImage
)

