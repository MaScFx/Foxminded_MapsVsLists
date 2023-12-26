package com.example.task4.adapter;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import androidx.fragment.app.FragmentActivity;

import com.example.task4.fragments.CollectionsFragment;
import com.example.task4.fragments.MapsFragment;

import org.junit.Before;
import org.junit.Test;

public class PagerAdapterTest {

    private PagerAdapter pagerAdapter;

    @Before
    public void setUp() {
        FragmentActivity fragmentActivity = mock(FragmentActivity.class);
        pagerAdapter = new PagerAdapter(fragmentActivity);

    }

    @Test
    public void testCreateFragment() {
        assertEquals(CollectionsFragment.class, pagerAdapter.createFragment(0).getClass());
        assertEquals(MapsFragment.class, pagerAdapter.createFragment(1).getClass());
    }

    @Test
    public void testGetItemCount() {
        assertEquals(2, pagerAdapter.getItemCount());
    }
}