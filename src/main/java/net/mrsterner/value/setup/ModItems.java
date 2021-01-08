package net.mrsterner.value.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> COPPER_COIN = Registration.ITEMS.register("copper_coin", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> SILVER_COIN = Registration.ITEMS.register("silver_coin", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> GOLD_COIN = Registration.ITEMS.register("gold_coin", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_COIN = Registration.ITEMS.register("platinum_coin", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_TICKET = Registration.ITEMS.register("green_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RED_TICKET = Registration.ITEMS.register("red_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LIME_TICKET = Registration.ITEMS.register("lime_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CYAN_TICKET = Registration.ITEMS.register("cyan_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BLUE_TICKET = Registration.ITEMS.register("blue_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> GOLDEN_TICKET = Registration.ITEMS.register("golden_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PINK_TICKET = Registration.ITEMS.register("pink_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PURPLE_TICKET = Registration.ITEMS.register("purple_ticket", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    static void register() {}
}
