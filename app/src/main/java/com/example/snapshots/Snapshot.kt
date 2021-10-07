package com.example.snapshots

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Snapshot(@get:Exclude var id: String = "", //Con esta anotación lo que hacemos es excluir la propiedad de firebase
                    var title: String = "",
                    var photoUrl: String = "",
                    var likeList: Map<String, Boolean> = mutableMapOf())
