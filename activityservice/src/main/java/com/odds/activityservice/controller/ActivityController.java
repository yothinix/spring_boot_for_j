package com.odds.activityservice.controller;

import com.odds.activityservice.model.Activity;
import com.odds.activityservice.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ActivityController {

    private ActivityService service;

    public ActivityController(ActivityService activityService) {
        this.service = activityService;
    }

    @GetMapping(value = "/activity")
    public List<Activity> getActivity() {
        List<Activity> activities = service.getAll();
        return activities;
    }

    @GetMapping(value = "/activity/{name}")
    public List<Activity> getActivityByName(
            @PathVariable(value = "name") String name) {
        return service.getActivityByName(name);
    }

}
