package com.example.devandroidconcepts.junit.instrumentalTesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.devandroidconcepts.R
import org.junit.Assert.*
import org.junit.Rule

import org.junit.Test
import java.util.regex.Pattern.matches
import kotlin.reflect.typeOf

class ExpressoActivityTest {

    @get:Rule
     val activityScenarioRule =ActivityScenarioRule(ExpressoActivity::class.java)
    @Test
    fun btnSubmit(){
     onView(withId(R.id.edt_name)).perform(typeText("lalit"))
     onView(withId(R.id.edt_surname)).perform(typeText("baraskar"))
     onView(withId(R.id.btn_submit)).perform(click())

   //  onView(withId(R.id.txt)).check(matches(withText("lalit baraskar")))
    }
}