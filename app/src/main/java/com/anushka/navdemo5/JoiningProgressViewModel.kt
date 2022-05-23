package com.anushka.navdemo5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoiningProgressViewModel : ViewModel() {
    private var _name = MutableLiveData<String>()
    private var _email = MutableLiveData<String>()

    val name : LiveData<String>
    get() = _name
    val email : LiveData<String>
    get() = _email

    fun setName(input:String) {
        _name.value = input
    }

    fun setEmail(input:String) {
        _email.value = input
    }

}