
package com.bulutcorbaci.bemzey.dranium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.bulutcorbaci.bemzey.dranium.init.DraniumModItems;

public class DraniumShovelItem extends ShovelItem {
	public DraniumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 980;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DraniumModItems.DRANIUM.get()));
			}
		}, 1, -2.7f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
