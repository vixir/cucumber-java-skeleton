package io.cucumber.skeleton;

import java.util.concurrent.atomic.*;

public class Belly {

    private static final int BELLY_GROWL_THRESHOLD = 100;
    private final AtomicInteger cukes = new AtomicInteger(0);
    private final AtomicInteger waitHours = new AtomicInteger(0);

    public void eat(int cukes) {
        this.cukes.getAndAdd(cukes);
    }

    public void waitHours(int waitHours) {
        this.waitHours.getAndAdd(waitHours);
    }

    public boolean bellyGrowls() {
        return waitHours.get() * cukes.get() > BELLY_GROWL_THRESHOLD;
    }
}
