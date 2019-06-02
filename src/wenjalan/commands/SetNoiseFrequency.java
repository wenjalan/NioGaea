package wenjalan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import wenjalan.generators.GaeaGenerator;

public class SetNoiseFrequency implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        try {
            double noiseFrequency = Double.parseDouble(strings[0]);
            GaeaGenerator.noise_frequency = noiseFrequency;
            return true;
        } catch (IllegalArgumentException e) {
            commandSender.sendMessage("Invalid argument: " + e.getMessage());
            return false;
        }
    }

}
