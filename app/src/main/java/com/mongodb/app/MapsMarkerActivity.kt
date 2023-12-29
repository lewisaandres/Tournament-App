// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.mongodb.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.mongodb.app.R

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
// [START maps_marker_on_map_ready]
class MapsMarkerActivity : AppCompatActivity(), OnMapReadyCallback {

    // [START_EXCLUDE]
    // [START maps_marker_get_map_async]
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps)

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }
    // [END maps_marker_get_map_async]
    // [END_EXCLUDE]

    // [START maps_marker_on_map_ready_add_marker]
    override fun onMapReady(googleMap: GoogleMap) {
        val tourney2 = LatLng(34.022,-118.285)
        googleMap.addMarker(MarkerOptions().position(tourney2).title("Tournament 2 USC"))

        val tourney3 = LatLng(34.414,-118.848)
        googleMap.addMarker(MarkerOptions().position(tourney3).title("Tournament 3 UCSB"))

        val tourney4 = LatLng(36.102,-115.170)
        googleMap.addMarker(MarkerOptions().position(tourney4).title("Finals League Of Legends"))

        val tourney5 = LatLng(34.066,-118.168)
        googleMap.addMarker(MarkerOptions().position(tourney5).title("Tournament 4 CSULA"))

        val tourney6 = LatLng(33.882,-117.885)
        googleMap.addMarker(MarkerOptions().position(tourney6).title("Tournament 6 CSUF"))

        val tourney7 = LatLng(40.729,-73.996)
        googleMap.addMarker(MarkerOptions().position(tourney7).title("Tournament 6 NYU"))

        val tourney8 = LatLng(36.809,-119.738)
        googleMap.addMarker(MarkerOptions().position(tourney8).title("Tournament 7 CSUFresno"))

        val tourney9 = LatLng(34.068,-118.445)
        googleMap.addMarker(MarkerOptions().position(tourney9).title("Tournament 8 UCLA"))

        val tourney10 = LatLng(29.643,-82.354)
        googleMap.addMarker(MarkerOptions().position(tourney10).title("Finals UoF"))

        val tourney11 = LatLng(33.953,-118.339)
        googleMap.addMarker(MarkerOptions().position(tourney11).title("Chad Cup SoFi"))

        val tourney12 = LatLng(29.888,-97.938)
        googleMap.addMarker(MarkerOptions().position(tourney12).title("Texas State U Finals"))

        val tourney13 = LatLng(42.377,-71.116)
        googleMap.addMarker(MarkerOptions().position(tourney13).title("Harvard Cup"))

        val tourney14 = LatLng(40.007,-105.265)
        googleMap.addMarker(MarkerOptions().position(tourney14).title("University of Colorado Boulder Games"))

        val tourney15 = LatLng(33.424,-111.928)
        googleMap.addMarker(MarkerOptions().position(tourney15).title("ASU Tournament"))

        val tourney16= LatLng(44.563,-123.279)
        googleMap.addMarker(MarkerOptions().position(tourney16).title("OSU Cup"))

        val tourney17 = LatLng(34.043,-118.267)
        googleMap.addMarker(MarkerOptions().position(tourney17).title("Champions League"))

        val tourney18 = LatLng(27.975,-82.503)
        googleMap.addMarker(MarkerOptions().position(tourney18).title("Ray James E-Sports"))

        val tourney19 = LatLng(41.852,-87.615)
        googleMap.addMarker(MarkerOptions().position(tourney19).title("Conventions Games"))

        val tourney20 = LatLng(39.954,-75.160)
        googleMap.addMarker(MarkerOptions().position(tourney20).title("Hunger Games"))

        val perthLocation = LatLng(-31.90, 115.86)
        googleMap.addMarker(MarkerOptions().position(perthLocation).draggable(true))


        val sydney = LatLng(33.783, -118.114)
        googleMap.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Tournament 1 CSULB")
        )
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        // [END_EXCLUDE]
    }
    // [END maps_marker_on_map_ready_add_marker]
}
// [END maps_marker_on_map_ready]
