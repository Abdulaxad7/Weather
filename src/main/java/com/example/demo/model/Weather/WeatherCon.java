package com.example.demo.model.Weather;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeatherCon {

       private ObjectMapper mapper = new ObjectMapper();


       private String url = "https://api.openweathermap.org/data/2.5/weather?q=Tashkent,uz&APPID=85ff24d69e39551a1e7fef7df8100e36";
       private CloseableHttpClient client = HttpClients.createDefault();
       private HttpGet request = new HttpGet(url);

       private CloseableHttpResponse response;
       private JsonNode node;
        {
            try {
                response = client.execute(request);
                node = mapper.readValue(response.getEntity().getContent(), JsonNode.class);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    public List<String> getCoord()  {

        List<String> weathers=Arrays.asList(
                node.get("name").toString(),
                node.get("coord").get("lon").toString(),
                node.get("coord").get("lat").toString()

        );
        return weathers;
    }
    public List<String> getWeather() {

            List<String>weathers=new ArrayList<>();
        String name=node.get("name").toString();

        JsonNode weatherArrayNode = node.get("weather");
        for (JsonNode weatherNode : weatherArrayNode) {
            String id = weatherNode.get("id").toString();
            String main = weatherNode.get("main").toString();
            String description = weatherNode.get("description").asText();
            String icon = weatherNode.get("icon").asText();
            weathers.addAll(Arrays.asList(name,id,main,description,icon));
            return weathers;
        }
        return weathers;
    }


 public List<Integer> getMain() {
        List<Integer> main = new ArrayList<>(Arrays.asList(
                node.get("main").get("temp").asInt()-273,
                node.get("main").get("feels_like").asInt()-273,
                node.get("main").get("pressure").asInt(),
                node.get("main").get("humidity").asInt()
        ));


        return main;
    }

    public List<String> getWind() {
        List<String> wind=Arrays.asList(
                node.get("name").toString(),
                node.get("wind").get("speed").toString(),
                node.get("wind").get("deg").toString()
        );
        return wind;
    }

    public List<String> getSys() {
        List<String> wind=Arrays.asList(
                node.get("name").toString(),
                node.get("sys").get("id").toString(),
                node.get("sys").get("country").toString()
        );
        return wind;
    }
}
