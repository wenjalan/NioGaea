package wenjalan.generators.presets;

public abstract class GeneratorPreset {

    // Terrain Scale
    protected double w_scale = 0.0005D;
    protected final double x_scale = 0.0125D;
    protected final double y_scale = 0.0125D;
    protected final double z_scale = 0.0005D;

    // Mean Height
    protected final double mean_height = 50.0D;

    // Noise
    protected final double noise_scale = 15.0D;
    protected final double noise_frequency = 0.5D;
    protected final double noise_amplitude = 0.5D;

    // Getters
    public double getW_scale() {
        return w_scale;
    }

    public double getX_scale() {
        return x_scale;
    }

    public double getY_scale() {
        return y_scale;
    }

    public double getZ_scale() {
        return z_scale;
    }

    public double getMean_height() {
        return mean_height;
    }

    public double getNoise_scale() {
        return noise_scale;
    }

    public double getNoise_frequency() {
        return noise_frequency;
    }

    public double getNoise_amplitude() {
        return noise_amplitude;
    }

}
