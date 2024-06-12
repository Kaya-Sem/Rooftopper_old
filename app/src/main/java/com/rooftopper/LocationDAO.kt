package com.rooftopper

interface LocationDAO {
    fun getLocations()
    fun insertLocation(location: Location)
    fun updateLocation(location: Location)
    fun deleteLocation(locationId: Int)
}