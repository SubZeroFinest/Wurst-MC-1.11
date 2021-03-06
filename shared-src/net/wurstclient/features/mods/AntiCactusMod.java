/*
 * Copyright � 2014 - 2017 | Wurst-Imperium | All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wurstclient.features.mods;

import net.wurstclient.features.HelpPage;
import net.wurstclient.features.Mod;
import net.wurstclient.features.SearchTags;

@SearchTags({"anti cactus"})
@HelpPage("Mods/AntiCactus")
@Mod.Bypasses(ghostMode = false, latestNCP = false)
public final class AntiCactusMod extends Mod
{
	public AntiCactusMod()
	{
		super("AntiCactus", "Protects you from cactus damage.");
	}
}
