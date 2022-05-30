
package net.mcreator.cum.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.cum.init.DraniumModItems;

public class EndBreathPickaxeItem extends PickaxeItem {
	public EndBreathPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6096;
			}

			public float getSpeed() {
				return 27f;
			}

			public float getAttackDamageBonus() {
				return 16f;
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
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
