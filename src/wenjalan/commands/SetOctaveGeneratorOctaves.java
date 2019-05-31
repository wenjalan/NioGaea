package wenjalan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import wenjalan.generators.GaeaGenerator;

// handles the setting of octaves via commands
public class SetOctaveGeneratorOctaves implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        try {
            int octaves = Integer.parseInt(strings[0]);
            GaeaGenerator.simplex_octave_generator_octaves = octaves;
            return true;
        } catch (IllegalArgumentException e) {
            commandSender.sendMessage("Invalid argument: " + e.getMessage());
            return false;
        }

    }
}
