
package net.mcreator.cum.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.cum.init.DraniumModItems;

public class EndBreathSwordItem extends SwordItem {
	public EndBreathSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6096;
			}

			public float getSpeed() {
				return 27f;
			}

			public float getAttackDamageBonus() {
				return 22f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 45;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DraniumModItems.FROZEN_END_BREATH.get()));
			}
		}, 3, -2.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
