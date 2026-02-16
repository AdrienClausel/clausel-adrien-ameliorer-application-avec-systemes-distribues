package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;

import java.util.List;

public record UserAttractions(
    Location location,
    List<UserAttractionsInfo> userAttractionsInfos
) {
}

