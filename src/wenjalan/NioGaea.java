package wenjalan;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import wenjalan.commands.SetOctaveGeneratorOctaves;
import wenjalan.commands.SetOctaveGeneratorScale;
import wenjalan.generators.GaeaGenerator;

public class NioGaea extends JavaPlugin {

    @Override
    public void onEnable() {
        // assign command executors
        getCommand("setoctavegeneratoroctaves").setExecutor(new SetOctaveGeneratorOctaves());
        getCommand("setoctavegeneratorscale").setExecutor(new SetOctaveGeneratorScale());

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new GaeaGenerator(id);
    }

}
