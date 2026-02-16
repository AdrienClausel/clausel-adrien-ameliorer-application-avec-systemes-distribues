package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;

public record UserAttractionsInfo(
        String name,
        Location location,
        Double distance,
        int rewardPoints
){}
