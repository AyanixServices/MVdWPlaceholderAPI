package be.maximvdw.placeholderapi.internal;

import org.bukkit.plugin.Plugin;

import be.maximvdw.placeholderapi.PlaceholderReplacer;

/**
 * Placeholder Added event
 * 
 * @author Maxim Van de Wynckel
 */
public interface PlaceholderAddedEvent {
	 void onPlaceholderAdded(Plugin plugin, String placeholder,
			PlaceholderReplacer replacer);
}
