package wenjalan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import wenjalan.generators.GaeaGenerator;

public class SetMeanGroundHeight implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        try {
            double height = Double.parseDouble(strings[0]);
            GaeaGenerator.mean_height = height;
            return true;
        } catch (IllegalArgumentException e) {
            commandSender.sendMessage("Invalid argument: " + e.getMessage());
            return false;
        }
    }
}
