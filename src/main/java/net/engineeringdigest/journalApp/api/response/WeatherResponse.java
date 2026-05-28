package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WeatherResponse {


    private Current current;
    @Setter
    @Getter
    public class Current{

        private int temperature;
        @JsonProperty("weather_descriptions")
        private List<String> weatherDescriptions;
        @JsonProperty("weather_icons")
        private List<String> weatherIcons;
        @JsonProperty("feelslike")
        private int feelsLike;

    }


}



