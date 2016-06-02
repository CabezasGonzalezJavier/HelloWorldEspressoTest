package com.thedeveloperworldisyours.espressosetup;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
/**
 * Created by javierg on 25/05/16.
 */
public class HelloWorldEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void listGoesOverTheFold() {
        onView(withId(R.id.activity_main_text)).check(matches(isDisplayed()));
    }

    @Test
    public void testClickAndCheckDisplay() {
        String enter = "Cabezas";
        onView(withId(R.id.activity_main_edit_text)).perform(typeText(enter));
        onView(withId(R.id.activity_main_button)).perform(click());
        onView(withId(R.id.activity_main_text)).check(matches(withText(enter)));
    }
}
