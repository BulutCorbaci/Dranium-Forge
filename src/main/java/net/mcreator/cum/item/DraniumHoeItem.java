
package net.mcreator.cum.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.cum.init.DraniumModItems;

public class DraniumHoeItem extends HoeItem {
	public DraniumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 980;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 1.9999999999999996f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DraniumModItems.DRANIUM.get()));
			}
		}, 0, -2.5999999999999999f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
