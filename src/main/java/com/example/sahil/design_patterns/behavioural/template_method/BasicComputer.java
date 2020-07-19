package com.example.sahil.design_patterns.behavioural.template_method;

public class BasicComputer extends Computer{

    @Override
    public String getCpu() {
        return "Intel Core i3 7th Gen";
    }

    @Override
    public String getGpu() {
        return "Intel basic integrated GPU";
    }

    @Override
    public String getRam() {
        return "2GB DDR3";
    }

    @Override
    public String getStorage() {
        return "250 GB HDD";
    }

    @Override
    public String getOs() {
        return "Windows 10 Home";
    }

    @Override
    public String getMonitor() {
        return "Samsung FHD";
    }

    @Override
    public float getMonitorSizeInInches() {
        return 15f;
    }

    @Override
    public String getMouse() {
        return "Samsung BasicMouse";
    }

    @Override
    public String getKeyboard() {
        return "Logitech A100 Full Keyboard";
    }
}
