package fr.mathisdu41.LoupGarroux.Stockage;

import static org.bukkit.ChatColor.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.Player;

import fr.mathisdu41.LoupGarroux.Role.RoleExecutor;
import fr.mathisdu41.LoupGarroux.Role.utils.RoleInterface;

public class Stockage {

	public static String PluginName = "LoupGarroux";
	public static String PluginPrefix = BLUE + "[" + AQUA + PluginName + BLUE + "]";
	public static String PluginPrefixGame = BLUE + "[" + AQUA + PluginName + "Game" + BLUE + "]";
	
	public static Integer MaxPlayers = 30;
	
	public static RoleExecutor RolesList;
	public static HashMap<RoleInterface, ArrayList<Player>> RolesPlayers;
	
}
