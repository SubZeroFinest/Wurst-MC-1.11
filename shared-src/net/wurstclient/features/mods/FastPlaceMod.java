/*
 * Copyright � 2014 - 2017 | Wurst-Imperium | All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wurstclient.features.mods;

import net.wurstclient.events.listeners.UpdateListener;
import net.wurstclient.features.Feature;
import net.wurstclient.features.HelpPage;
import net.wurstclient.features.Mod;
import net.wurstclient.features.SearchTags;

@SearchTags({"fast place"})
@HelpPage("Mods/FastPlace")
@Mod.Bypasses
public final class FastPlaceMod extends Mod implements UpdateListener
{
	public FastPlaceMod()
	{
		super("FastPlace", "Allows you to place blocks 5 times faster.\n"
			+ "Tip: This can speed up AutoBuild.");
	}
	
	@Override
	public Feature[] getSeeAlso()
	{
		return new Feature[]{wurst.mods.fastBreakMod, wurst.mods.buildRandomMod,
			wurst.mods.autoBuildMod};
	}
	
	@Override
	public void onEnable()
	{
		wurst.events.add(UpdateListener.class, this);
	}
	
	@Override
	public void onDisable()
	{
		wurst.events.remove(UpdateListener.class, this);
	}
	
	@Override
	public void onUpdate()
	{
		mc.rightClickDelayTimer = 0;
	}
}
