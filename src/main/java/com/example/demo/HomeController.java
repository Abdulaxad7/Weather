package com.example.demo;
import com.example.demo.model.User;
import com.example.demo.model.Weather.WeatherCon;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    private UserRepository repository;
@ModelAttribute
    public void modelData(Model model){
        model.addAttribute("name","User");
}
@RequestMapping(value="/")
    public String home(){
    return "index.jsp";
}

@RequestMapping(value ="login",method = RequestMethod.GET)
public String Login(@ModelAttribute("user") User user,Model model){
    for (User u:repository.findAll()){
        if(u.getId()==user.getId()){
            return "logged-in.jsp";
        }
    }
    return "index.jsp";
}
@RequestMapping(value = "weather",method = RequestMethod.GET)
    public String getWeather(@ModelAttribute User user, Model model){
    for(User u:repository.findAll()) {
        if (u.getId() == user.getId()) {
            WeatherCon weatherCon = new WeatherCon();
            model.addAttribute("weather", weatherCon.getWeather());
            return "CurrentWeather.jsp";
        }
      }
        return "index.jsp";
    }
    @RequestMapping(value = "weather-coord",method = RequestMethod.GET)
        public String getCoords(@ModelAttribute User user, Model model){
    for(User u:repository.findAll()){
        if(u.getId()==user.getId()){
        WeatherCon weatherCon=new WeatherCon();
        model.addAttribute("weather",weatherCon.getCoord() );
        return "CurrentWeather.jsp";
        }
    }
    return "index.jsp";
    }

    @RequestMapping(value = "weather-main",method = RequestMethod.GET)
        public String getMain(@ModelAttribute User user, Model model){
    for(User u:repository.findAll()){
        if(u.getId()==user.getId()){
        WeatherCon weatherCon=new WeatherCon();
        model.addAttribute("weather",weatherCon.getMain() );
        return "CurrentWeather.jsp";
        }
    }
    return "index.jsp";
    }

    @RequestMapping(value = "weather-wind",method = RequestMethod.GET)
        public String getWind(@ModelAttribute User user, Model model){
    for(User u:repository.findAll()){
        if(u.getId()==user.getId()){
        WeatherCon weatherCon=new WeatherCon();
        model.addAttribute("weather",weatherCon.getWind() );


        return "CurrentWeather.jsp";
        }
    }
    return "index.jsp";
    }

    @RequestMapping(value = "weather-sys",method = RequestMethod.GET)
         public String getSys(@ModelAttribute User user, Model model){
    for(User u:repository.findAll()){
        if(u.getId()==user.getId()){
        WeatherCon weatherCon=new WeatherCon();
        model.addAttribute("weather",weatherCon.getSys() );
        return "CurrentWeather.jsp";
        }
    }
    return "index.jsp";
    }

    @RequestMapping(value = "index-newUser",method = RequestMethod.GET)
         public String setNewUser(@ModelAttribute User user,Model model){
   for(User u:repository.findAll()){
       if(u.getId()==user.getId()){
           return "index.jsp";
       }
   }
   model.addAttribute("user",User.class);
repository.save(user);

    return "newUser.jsp";
}

    @RequestMapping(value = "rmUser",method = RequestMethod.DELETE)
        public String rmUser(@ModelAttribute User user, Model model){

    return "index.jsp";
}


}
