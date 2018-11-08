package com.example.admin.myapplication;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class StudentTestCase {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TestStudentworkFlow(){
        tapwithId(R.id.rv_recyclerview,10);
    }

  /*  public static RecyclerViewMatcher withRecyclerView(final int RecyclerViewId){
        return new RecyclerViewMatcher(RecyclerViewId);
    }
    public void tapRecyclerViewItem(int recyclerViewId,int position){
        onView(withId(recyclerViewId)).perform(scrollToPosition(position));
        onView(withRecyclerView(recyclerViewId).atPosition(position)).perform(click());
    }*/
    public void tapwithId(int recyclerViewId,int position){
        onView(withId(recyclerViewId))
                .perform(
                        RecyclerViewActions.actionOnItemAtPosition(
                                position,
                                new ViewAction() {
                                    @Override
                                    public Matcher<View> getConstraints() {
                                        return null;
                                    }

                                    @Override
                                    public String getDescription() {
                                        return "Click on specific button";
                                    }

                                    @Override
                                    public void perform(UiController uiController, View view) {
                                        View name = view.findViewById(R.id.tv_name);
                                        View rollno = view.findViewById(R.id.tv_rollno);
                                        // Maybe check for null
                                        name.performClick();
//                                        rollno.performClick();
                                    }
                                })
                );
    }
}
