package com.example.ucp2

import com.example.ucp2.data.FormState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class FormView {
    private val _stateUI = MutableStateFlow(FormState())
    val statsUI: StateFlow<FormState> = _stateUI.asStateFlow()
}