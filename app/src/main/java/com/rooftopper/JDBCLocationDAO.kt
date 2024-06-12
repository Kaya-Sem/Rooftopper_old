package com.rooftopper

import java.sql.SQLException

class JDBCLocationDAO(private var conn: java.sql.Connection) : LocationDAO {

    override fun getLocations() {
        try {
            conn.prepareStatement("SELECT * FROM location").use {
                stmt -> val resultSet = stmt.executeQuery()
            }
        } catch (e : SQLException) {
            e.printStackTrace()
        }
    }

    override fun insertLocation(location: Location) {
        TODO("Not yet implemented")
    }

    override fun updateLocation(location: Location) {
        TODO("Not yet implemented")
    }

    override fun deleteLocation(locationId: Int) {
        TODO("Not yet implemented")
    }

}