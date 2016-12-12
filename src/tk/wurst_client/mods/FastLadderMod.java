/*
 * Copyright � 2014 - 2016 | Wurst-Imperium | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.mods;

import tk.wurst_client.events.listeners.UpdateListener;

@Mod.Info(
	description = "Allows you to climb up ladders twice as fast.",
	name = "FastLadder",
	tags = "FastClimb, fast ladder, fast climb",
	help = "Mods/FastLadder")
@Mod.Bypasses(ghostMode = false)
public class FastLadderMod extends Mod implements UpdateListener
{
	@Override
	public void onEnable()
	{
		wurst.events.add(UpdateListener.class, this);
	}
	
	@Override
	public void onUpdate()
	{
		if(mc.player.isOnLadder() && mc.player.isCollidedHorizontally)
			mc.player.motionY = 0.2872;
	}
	
	@Override
	public void onDisable()
	{
		wurst.events.remove(UpdateListener.class, this);
	}
}
