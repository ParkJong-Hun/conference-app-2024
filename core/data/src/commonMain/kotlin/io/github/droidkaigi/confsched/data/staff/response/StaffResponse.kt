package io.github.droidkaigi.confsched.data.staff.response

import kotlinx.serialization.Serializable

@Serializable
internal data class StaffResponse(
    val id: Long,
    val username: String,
    val profileUrl: String,
    val iconUrl: String,
)
