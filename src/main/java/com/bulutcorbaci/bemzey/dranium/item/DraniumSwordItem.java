
package com.bulutcorbaci.bemzey.dranium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.bulutcorbaci.bemzey.dranium.init.DraniumModItems;

public class DraniumSwordItem extends SwordItem {
	public DraniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 980;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
