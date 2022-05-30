
package com.bulutcorbaci.bemzey.dranium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import com.bulutcorbaci.bemzey.dranium.init.DraniumModItems;

public class EndBreathShovelItem extends ShovelItem {
	public EndBreathShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 6096;
			}

			public float getSpeed() {
				return 27f;
			}

			public float getAttackDamageBonus() {
				return 7.75f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 45;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DraniumModItems.FROZEN_END_BREATH.get()));
			}
		}, 1, -2.9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
