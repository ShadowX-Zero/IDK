
package net.mcreator.redsguns.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DaItem extends Item {
	public DaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
