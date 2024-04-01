package io.github.jmbrands.createadventuring;

import java.util.List;
import java.util.ArrayList;
import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateAdventuring.MODID)
public class CreateAdventuring {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "create_adventuring";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under
    // the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under
    // the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be
    // registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MODID);

    public static List<RegistryObject<Block>> BLOCKS_LIST = new ArrayList<RegistryObject<Block>>();
    public static List<RegistryObject<Item>> ITEMS_LIST = new ArrayList<RegistryObject<Item>>();

    // Creates a new Block with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Block> BEEF_BLOCK = BLOCKS.register("beef_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(BEEF_BLOCK);
    }
    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> BEEF_BLOCK_ITEM = ITEMS.register("beef_block",
            () -> new BlockItem(BEEF_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3 * 9).saturationMod(1.8f * 9f).build())));
    static {
        ITEMS_LIST.add(BEEF_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> PORK_BLOCK = BLOCKS.register("pork_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(PORK_BLOCK);
    }
    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> PORK_BLOCK_ITEM = ITEMS.register("pork_block",
            () -> new BlockItem(PORK_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3 * 9).saturationMod(0.6f * 9f).build())));
    static {
        ITEMS_LIST.add(PORK_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> CHICKEN_BLOCK = BLOCKS.register("chicken_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(CHICKEN_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> CHICKEN_BLOCK_ITEM = ITEMS.register("chicken_block",
            () -> new BlockItem(CHICKEN_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2 * 9).saturationMod(1.2f * 9f).build())));
    static {
        ITEMS_LIST.add(CHICKEN_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> RABBIT_BLOCK = BLOCKS.register("rabbit_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(RABBIT_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> RABBIT_BLOCK_ITEM = ITEMS.register("rabbit_block",
            () -> new BlockItem(RABBIT_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3 * 9).saturationMod(1.8f * 9f).build())));
    static {
        ITEMS_LIST.add(RABBIT_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> MUTTON_BLOCK = BLOCKS.register("mutton_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(MUTTON_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> MUTTON_BLOCK_ITEM = ITEMS.register("mutton_block",
            () -> new BlockItem(MUTTON_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2 * 9).saturationMod(1.2f * 9f).build())));
    static {
        ITEMS_LIST.add(MUTTON_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> COD_BLOCK = BLOCKS.register("cod_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(COD_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> COD_BLOCK_ITEM = ITEMS.register("cod_block",
            () -> new BlockItem(COD_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2 * 9).saturationMod(0.4f * 9f).build())));
    static {
        ITEMS_LIST.add(COD_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> SALMON_BLOCK = BLOCKS.register("salmon_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(SALMON_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> SALMON_BLOCK_ITEM = ITEMS.register("salmon_block",
            () -> new BlockItem(SALMON_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2 * 9).saturationMod(0.2f * 9f).build())));
    static {
        ITEMS_LIST.add(SALMON_BLOCK_ITEM);
    }

    public static final RegistryObject<Block> POTATO_BLOCK = BLOCKS.register("potato_block",
            () -> new MeatBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    static {
        BLOCKS_LIST.add(POTATO_BLOCK);
    }

    // Creates a new BlockItem with the id "examplemod:example_block", combining the
    // namespace and path
    public static final RegistryObject<Item> POTATO_BLOCK_ITEM = ITEMS.register("potato_block",
            () -> new BlockItem(POTATO_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1 * 9).saturationMod(0.6f * 9f).build())));
    static {
        ITEMS_LIST.add(POTATO_BLOCK_ITEM);
    }

    /*
     * public static final CreateRegistrate REGISTRATE =
     * CreateRegistrate.create(MODID);
     * 
     * public static final BlockEntry<Block> BEEF_BLOCK =
     * REGISTRATE.block("beef_block", Block::new)
     * .initialProperties(() -> Blocks.STONE)
     * .item()
     * .build()
     * .register();
     */
    // Creates a creative tab with the id "examplemod:example_tab" for the example
    // item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> ADVENTURING_TAB = CREATIVE_MODE_TABS
            .register("create_adventuring_tab", () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(new IconSupplier(new ItemStack(BEEF_BLOCK_ITEM.get())))
                    .title(Component.translatable("itemGroup." + MODID + ".create_adventuring"))
                    .displayItems((parameters, output) -> {
                        // output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For
                        // your own tabs, this method is preferred over the event
                        for (RegistryObject<Item> item : ITEMS_LIST) {
                            output.accept(item.get());
                        }

                    }).build());

    public CreateAdventuring() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        // modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the
        // config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    // private void addCreative(BuildCreativeModeTabContentsEvent event)
    // {
    // if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
    // event.accept(BEEF_BLOCK_ITEM);
    // }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods
    // in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
