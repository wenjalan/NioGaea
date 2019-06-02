package wenjalan.generators.presets;

public class GrandOcean extends GeneratorPreset {

    // the Ocean Level
    public static final int ocean_level = 80;

    @Override
    public double getMean_height() {
        return 75.0D;
    }

    @Override
    public double getNoise_scale() {
        return 15;
    }

    @Override
    public double getX_scale() {
        return 0.0125;
    }

    @Override
    public double getY_scale() {
        return 0.0125;
    }

}
