package com.odds.activityservice.service;

import com.odds.activityservice.model.Activity;
import com.odds.activityservice.repository.ActivityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class ActivityServiceTest {

    @Mock
    ActivityRepository activityRepository;

    @InjectMocks
    ActivityService service;

    @Test
    void getAllShouldReturnOneActivityTest() {
        List<Activity> actual = service.getAll();

        Assertions.assertEquals(2, actual.size());
    }

    @Test
    void getAllShouldHaveNameLoginTest() {
        List<Activity> actual = service.getAll();

        Assertions.assertEquals(1, actual.get(0).getId());
        Assertions.assertEquals("Login", actual.get(0).getName());

        Assertions.assertEquals(2, actual.get(1).getId());
        Assertions.assertEquals("Logout", actual.get(1).getName());
    }
}