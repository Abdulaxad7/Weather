
package com.example.demo.model.Weather;

import com.fasterxml.jackson.annotation.JsonProperty;

class Weather {
    double lon;
    double lat;
    int id;
    String main;
    String description;
    String icon;
    double temp;
    double feels_like;
    double temp_min;
    double temp_max;
    double pressure;
    double humidity;
    double speed;
    double deg;
    int visibility;
    int all;
    int type;
    String country;
    double sunrise;
    double sunset;
    int timezone;
    int cod;

    public Weather(@JsonProperty("lon")double lon,
                   @JsonProperty("lat")double lat,
                   @JsonProperty("id")int id,
                   @JsonProperty("main")String main,
                   @JsonProperty("description")String description,
                   @JsonProperty("temp")String icon,
                   @JsonProperty("temp") double temp,
                   @JsonProperty("feels_like")double feels_like,
                   @JsonProperty("temp_min")double temp_min,
                   @JsonProperty("temp_max")double temp_max,
                   @JsonProperty("pressure")double pressure,
                   @JsonProperty("humidity")double humidity,
                   @JsonProperty("speed")double speed,
                   @JsonProperty("deg")double deg,
                   @JsonProperty("visibility")int visibility,
                   @JsonProperty("all")int all,
                   @JsonProperty("type")int type,
                   @JsonProperty("country")String country,
                   @JsonProperty("sunrise")double sunrise,
                   @JsonProperty("sunset")double sunset,
                   @JsonProperty("timezone")int timezone,
                   @JsonProperty("cod")int cod)
    {
        this.lon = lon;
        this.lat = lat;
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
        this.deg = deg;
        this.visibility = visibility;
        this.all = all;
        this.type = type;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.timezone = timezone;
        this.cod = cod;
    }


}
