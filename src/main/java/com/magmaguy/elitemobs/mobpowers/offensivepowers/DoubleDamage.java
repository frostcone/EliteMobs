/*
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.magmaguy.elitemobs.mobpowers.offensivepowers;

import com.magmaguy.elitemobs.MetadataHandler;
import com.magmaguy.elitemobs.mobpowers.minorpowers.MinorPowers;
import com.magmaguy.elitemobs.powerstances.MinorPowerPowerStance;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.IronGolem;
import org.bukkit.plugin.Plugin;

/**
 * Created by MagmaGuy on 04/05/2017.
 */
public class DoubleDamage extends MinorPowers {

    Plugin plugin = Bukkit.getPluginManager().getPlugin(MetadataHandler.ELITE_MOBS);
    String powerMetadata = MetadataHandler.DOUBLE_DAMAGE_MD;

    @Override
    public void applyPowers(Entity entity) {

        if (!(entity instanceof IronGolem)) {

            MetadataHandler.registerMetadata(entity, powerMetadata, true);
            MinorPowerPowerStance minorPowerPowerStance = new MinorPowerPowerStance();
            minorPowerPowerStance.itemEffect(entity);

        }

    }

    @Override
    public boolean existingPowers(Entity entity) {

        return entity.hasMetadata(powerMetadata);

    }

}