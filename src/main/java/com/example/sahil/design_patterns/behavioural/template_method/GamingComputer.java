package com.example.sahil.design_patterns.behavioural.template_method;

public class GamingComputer extends Computer{

    @Override
    public String getCpu() {
        return "AMD Ryzen R2 Overclocked";
    }

    @Override
    public String getGpu() {
        return "16GB GTX GeForce 1660";
    }

    @Override
    public String getRam() {
        return "16GB DDR5";
    }

    @Override
    public String getStorage() {
        return "1TB SSD NVMe";
    }

    @Override
    public String getOs() {
        return "Windows 10 Pro";
    }

    @Override
    public String getMonitor() {
        return "Samsung 4K";
    }

    @Override
    public float getMonitorSizeInInches() {
        return 22.5f;
    }

    @Override
    public String getMouse() {
        return "RazorBlade Wireless GamingMouse";
    }

    @Override
    public String getKeyboard() {
        return "MSI Wireless Gaming KeyBoard";
    }
}
