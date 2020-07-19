package com.example.sahil.design_patterns.behavioural.template_method;

public abstract class Computer {
    private StringBuilder sb = new StringBuilder();
    private int index = 0;

    public abstract String getCpu();

    public abstract String getGpu();

    public abstract String getRam();

    public abstract String getStorage();

    public abstract String getOs();

    public abstract String getMonitor();

    public abstract float getMonitorSizeInInches();

    public abstract String getMouse();

    public abstract String getKeyboard();

    //Template Method
    public final String build() {   // Template method must be final to prevent overriding from subclasses
        sb.append("Preparing your Desktop :\n");
        setupMotherboard();
        setUpInputDevices();
        setUpOutputDevices();
        installOs();
        sb.append("You desktop is ready! Thank you for your business!");
        return sb.toString();
    }

    private void setupMotherboard() {
        sb.append(index++).append(" CPU added -> ").append(getCpu()).append("\n");
        sb.append(index++).append(" GPU added -> ").append(getGpu()).append("\n");
        sb.append(index++).append(" RAM added -> ").append(getRam()).append("\n");
        sb.append(index++).append(" HardDisk added -> ").append(getStorage()).append("\n");
    }

    private void setUpInputDevices() {
        sb.append(index++).append(" KeyBoard Added -> ").append(getKeyboard()).append("\n");
        sb.append(index++).append(" Mouse Added -> ").append(getMouse()).append("\n");

    }

    private void setUpOutputDevices() {
        sb.append(index++).append(" Monitor Setup -> ").append(getMonitor());
        sb.append(", Size is ").append(getMonitorSizeInInches()).append(" Inches\n");

    }

    private void installOs() {
        sb.append(index++).append(" OS Installed -> ").append(getOs()).append("\n");
    }

}
