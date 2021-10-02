package com.odds.activityservice.service;

import com.odds.activityservice.model.Activity;
import com.odds.activityservice.repository.ActivityRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class ActivityService {

    private ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getActivityByName(String name) {
        Activity activity = new Activity();
        activity.setName(name);
        Example<Activity> example = Example.of(activity);

        return activityRepository.findAll(example);
    }

    public List<Activity> getAll() {
        List<Activity> activities = activityRepository.findAll();
        return activities;
    }
}
