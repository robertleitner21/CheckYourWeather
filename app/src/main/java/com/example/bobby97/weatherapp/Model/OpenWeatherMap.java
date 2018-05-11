package com.example.bobby97.weatherapp.Model;

import java.util.List;

public class OpenWeatherMap {
    private String base;
    private Coord coord;
    private Clouds clouds;
    private Main main;
    private Wind wind;
    private Sys sys;
    private List<Weather> weather;
    private int id;
    private String name;
    private int cod;
    private int dt;

    public OpenWeatherMap() {
    }

    public OpenWeatherMap(String base, Coord coord, Clouds clouds, Main main, Wind wind, Sys sys, List<Weather> weather, int id, String name, int cod, int dt) {
        this.base = base;
        this.coord = coord;
        this.clouds = clouds;
        this.main = main;
        this.wind = wind;
        this.sys = sys;
        this.weather = weather;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.dt = dt;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }
}
