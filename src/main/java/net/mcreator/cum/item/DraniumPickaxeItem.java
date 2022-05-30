
package net.mcreator.cum.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.cum.init.DraniumModItems;

public class DraniumPickaxeItem extends PickaxeItem {
	public DraniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 3.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DraniumModItems.DRANIUM.get()));
			}
		}, 1, -2.6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
