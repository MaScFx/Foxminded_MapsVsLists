package com.example.task4;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void collectionFragmentTest() {
        checkingStartCollectionScreen();

        onView(withId(R.id.et_collectionSize)).perform(typeText("10"));
        onView(withId(R.id.btn_calculate_list)).perform(click());

        onView(withId(R.id.et_collectionSize)).check(ViewAssertions.matches(Matchers.not(isDisplayed())));
        onView(withId(R.id.btn_calculate_list)).check(ViewAssertions.matches(Matchers.not(isDisplayed())));
        onView(withId(R.id.tv_addingBeginning)).check(ViewAssertions.matches(isDisplayed()));

        Espresso.pressBack();
        onView(withId(R.id.btn_clear_list)).perform(click());

        checkingStartCollectionScreen();
    }

    @Test
    public void mapsFragmentTest() {
        onView(withText("Maps")).perform(click());
        onView(withText("Collections")).perform(click());
        onView(withText("Maps")).perform(click());

        checkingStartMapsScreen();

        onView(withId(R.id.et_mapSize)).perform(typeText("10"));
        onView(withId(R.id.btn_calculate_map)).perform(click());

        onView(withId(R.id.btn_clear_map)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btn_calculate_map)).check(ViewAssertions
                .matches(Matchers.not(isDisplayed())));
        onView(withId(R.id.et_mapSize)).check(ViewAssertions.matches(Matchers.not(isDisplayed())));

        Espresso.pressBack();
        onView(withId(R.id.btn_clear_map)).perform(click());

        checkingStartMapsScreen();
    }

    public void checkingStartCollectionScreen() {
        onView(withId(R.id.btn_clear_list)).check(ViewAssertions
                .matches(Matchers.not(isDisplayed())));
        onView(withId(R.id.et_collectionSize)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btn_calculate_list)).check(ViewAssertions.matches(isDisplayed()));
    }

    public void checkingStartMapsScreen() {
        onView(withId(R.id.btn_clear_map)).check(ViewAssertions.matches(Matchers.not(isDisplayed())));
        onView(withId(R.id.btn_calculate_map)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.et_mapSize)).check(ViewAssertions.matches(isDisplayed()));
    }
}
