package wenjalan;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import wenjalan.commands.*;
import wenjalan.generators.GaeaGenerator;

public class NioGaea extends JavaPlugin {

    @Override
    public void onEnable() {
        // assign command executors
        getCommand("setoctavegeneratoroctaves").setExecutor(new SetOctaveGeneratorOctaves());
        getCommand("setoctavegeneratorscale").setExecutor(new SetOctaveGeneratorScale());
        getCommand("setmeanheight").setExecutor(new SetMeanGroundHeight());
        getCommand("setnoisescale").setExecutor(new SetNoiseScale());
        getCommand("setnoisefrequency").setExecutor(new SetNoiseFrequency());
        getCommand("setnoiseamplitude").setExecutor(new SetNoiseAmplitude());

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new GaeaGenerator();
    }

}
