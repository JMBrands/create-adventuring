package io.github.jmbrands.createadventuring;

import java.util.Collection;

import io.github.jmbrands.createadventuring.CreateAdventuring;
import com.tterrag.registrate.util.entry.RegistryEntry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class BaseCreativeModeTab extends CreativeModeTab {
	public BaseCreativeModeTab() {
		super(CreateAdventuring.MODID + ".create_adventuring");
	}

	@Override
	public void fillItemList(NonNullList<ItemStack> items) {
		addItems(items, true);
		addBlocks(items);
		addItems(items, false);
	}

	protected Collection<RegistryEntry<Item>> registeredItems() {
		return CreateAdventuring.REGISTRATE.getAll(ForgeRegistries.ITEMS.getRegistryKey());
	}

	public void addBlocks(NonNullList<ItemStack> items) {
		for (RegistryEntry<Item> entry : registeredItems())
			if (entry.get() instanceof BlockItem blockItem)
				blockItem.fillItemCategory(this, items);
	}

	public void addItems(NonNullList<ItemStack> items, boolean specialItems) {
		ItemRenderer itemRenderer = Minecraft.getInstance()
			.getItemRenderer();

		for (RegistryEntry<Item> entry : registeredItems()) {
			Item item = entry.get();
			if (item instanceof BlockItem)
				continue;
			ItemStack stack = new ItemStack(item);
			BakedModel model = itemRenderer.getModel(stack, null, null, 0);
			if (model.isGui3d() == specialItems)
				item.fillItemCategory(this, items);
		}
	}
}
