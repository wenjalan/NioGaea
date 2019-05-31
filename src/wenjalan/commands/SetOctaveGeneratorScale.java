package wenjalan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import wenjalan.generators.GaeaGenerator;

// handles the setting of octave generator scales via commands
public class SetOctaveGeneratorScale implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        try {
            // get the scale
            double scale = Double.parseDouble(strings[1]);

            // get the coordinate to which to assign that scale, and assign it
            String coord = strings[0].toLowerCase();
            if (coord.equals("w")) {
                GaeaGenerator.simplex_octave_generator_w_scale = scale;
            } else if (coord.equals("x")) {
                GaeaGenerator.simplex_octave_generator_x_scale = scale;
            } else if (coord.equals("y")) {
                GaeaGenerator.simplex_octave_generator_y_scale = scale;
            } else if (coord.equals("z")) {
                GaeaGenerator.simplex_octave_generator_z_scale = scale;
            } else {
                throw new IllegalArgumentException("Coordinate must be W, X, Y, or Z");
            }
            return true;
        } catch (IllegalArgumentException e) {
            commandSender.sendMessage("Invalid argument: " + e.getMessage());
            return false;
        }
    }

}
