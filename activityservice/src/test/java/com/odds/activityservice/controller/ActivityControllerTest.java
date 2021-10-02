package com.odds.activityservice.controller;

import com.odds.activityservice.model.Activity;
import com.odds.activityservice.service.ActivityService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActivityControllerTest {

    @Mock
    private ActivityService activityService;

    @Spy
    @InjectMocks
    private ActivityController controller;

    @Test
    void getActivityShouldReturnResponseTest() {
        Activity activity = new Activity();
        Mockito.when(activityService.getAll()).thenReturn(List.of(activity));

        Date createdAt = new Date(1220227200L * 1000);
        Mockito.doReturn(createdAt).when(controller).getDate();

        List<Activity> actual = controller.getActivity();

        Assertions.assertEquals(1, actual.size());
        Assertions.assertEquals("Mon Sep 01 07:00:00 ICT 2008", actual.get(0).getCreatedAt().toString());
    }
}