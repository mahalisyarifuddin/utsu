package com.utsusynth.utsu.common.data;

import com.google.common.base.Optional;

public class NoteConfigData {
    private final Optional<Double> preutter;
    private final Optional<Double> overlap;
    private final double consonantVelocity;
    private final double startPoint;
    private final int intensity;
    private final String noteFlags;

    public NoteConfigData(
            Optional<Double> preutter,
            Optional<Double> overlap,
            double consonantVelocity,
            double startPoint,
            int intensity,
            String noteFlags) {
        this.preutter = preutter;
        this.overlap = overlap;
        this.consonantVelocity = consonantVelocity;
        this.startPoint = startPoint;
        this.intensity = intensity;
        this.noteFlags = noteFlags;
    }

    public Optional<Double> getPreutter() {
        return preutter;
    }

    public Optional<Double> getOverlap() {
        return overlap;
    }

    public double getConsonantVelocity() {
        return consonantVelocity;
    }

    public double getStartPoint() {
        return startPoint;
    }

    public int getIntensity() {
        return intensity;
    }

    public String getNoteFlags() {
        return noteFlags;
    }
}
