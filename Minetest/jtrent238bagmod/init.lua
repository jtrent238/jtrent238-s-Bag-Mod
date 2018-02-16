-- jtrent238bagmod (Bag Mod 1.0.0.0)
-- Bag mod made by jtrent238

-- Definitions made by this mod that other mods can use too
jtrent238bagmod = {}

jtrent238bagmod.modname = minetest.get_current_modname()

-- Load other files
--dofile(minetest.get_modpath("hammermod").."/functions.lua")
--dofile(minetest.get_modpath("hammermod").."/playerchecker.lua")
--(minetest.get_modpath("hammermod").."/coreinjection.lua")
--dofile(minetest.get_modpath("hammermod").."/hammerdefinition.lua")

-- Set a noticeable inventory formspec for players
minetest.register_on_joinplayer(function(player)
	local cb = function(player)
		minetest.chat_send_player(player:get_player_name(), "jtrent238's Bag Mod made by: jtrent238")
	end
	minetest.after(2.0, cb, player)
end)

jtrent238bagmod.form = "size[8,7]" ..
	default.gui_bg ..
	default.gui_bg_img ..
	default.gui_slots ..
	"list[current_name;main;0,0.3;8,2]" ..
	"list[current_player;main;0,2.85;8,1]" ..
	"list[current_player;main;0,4.08;8,3;8]" ..
	"listring[current_name;main]" ..
	"listring[current_player;main]"
	
jtrent238bagmod.on_construct = function(pos)
	local meta = minetest.get_meta(pos)
	meta:set_string("infotext", "Bag")
	meta:set_string("formspec", jtrent238bagmod.form)
	local inv = meta:get_inventory()
	inv:set_size("main", 8*2)
end

jtrent238bagmod.allow_metadata_inventory_put = function(pos, listname, index, stack, player)
	if not string.match(stack:get_name(), "jtrent238bagmod:ItemBag_") then
		return stack:get_count()
	else
		return 0
	end
end

-- ITEMS
minetest.register_craftitem('jtrent238bagmod:ItemBag_Plain', {
    description = 'Plain Bag',
    inventory_image = 'ItemBag.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_red', {
    description = 'Red Bag',
    inventory_image = 'ItemBag_red.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_green', {
    description = 'Green Bag',
    inventory_image = 'ItemBag_green.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_blue', {
    description = 'Blue Bag',
    inventory_image = 'ItemBag_blue.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_purple', {
    description = 'Purple Bag',
    inventory_image = 'ItemBag_purple.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_cyan', {
    description = 'Cyan Bag',
    inventory_image = 'ItemBag_cyan.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_pink', {
    description = 'Pink Bag',
    inventory_image = 'ItemBag_pink.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_lime', {
    description = 'Lime Bag',
    inventory_image = 'ItemBag_lime.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_yellow', {
    description = 'Yellow Bag',
    inventory_image = 'ItemBag_yellow.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_lightBlue', {
    description = 'Light Blue Bag',
    inventory_image = 'ItemBag_lightBlue.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_magenta', {
    description = 'Magenta Bag',
    inventory_image = 'ItemBag_magenta.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_orange', {
    description = 'Orange Bag',
    inventory_image = 'ItemBag_orange.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_Cow', {
    description = 'Cow Bag',
    inventory_image = 'ItemBag_Cow.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_JSQ', {
    description = 'xJSQ Bag',
    inventory_image = 'ItemBag_JSQ.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag__MrGregor_', {
    description = '_MrGregor_ Bag',
    inventory_image = 'ItemBag__MrGregor_.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_jtrent238', {
    description = 'jtrent238 Bag',
    inventory_image = 'ItemBag_jtrent238.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

minetest.register_craftitem('jtrent238bagmod:ItemBag_banana', {
    description = 'Banana Bag',
    inventory_image = 'ItemBag_banana.png',
    stack_max = 1,
	allow_metadata_inventory_put = jtrent238bagmod.allow_metadata_inventory_put,
})

--Debug Item
--minetest.register_craftitem('jtrent238bagmod:ItemDebug', {
--    description = 'Debug',
--    inventory_image = 'ItemDebug.png',
--    stack_max = 1,
--})

--CRAFTS
if mobs and ( mobs.redo or mobs.mod == 'redo') then
	minetest.register_craft({
		output = "jtrent238bagmod:ItemBag_Plain",
		recipe = {
			{"mobs:leather", "mobs:leather", "mobs:leather"},
			{"mobs:leather", "",             "mobs:leather"},
			{"mobs:leather", "mobs:leather", "mobs:leather"},
		}
	})
end