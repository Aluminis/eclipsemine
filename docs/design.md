# Aluminis Ultimine (EclipseMine)

## Features

- Shape Mining
- Enchanted Book
- GUI for Shape Switching (3 methods)
  - Config Default
  - button push switcher
  - Two button GUI expantion(Like Gamemode switcher)

## Optional
- Custom Shapes(GUI or Config)(Build Gadget)
  - Two options
    - Built into normal veinmining
    - Two enchants/tools to preform Shaped and Shapeless





### Config Options
### Server
- features
  - Boolean Right-click with an axe to strip multiple logs/scrape copper
    - #minecraft:logs
      - note (#minecraft:crimson_stems,#minecraft:logs_that_burn,#minecraft:warped_stems)
  - Boolean Right-click with a shovel to flatten grass/dirt blocks into paths, rooted to dirt
  - Boolean Right-click with a hoe to till grass/dirt blocks into farmland, coarse dirt to dirt
  - boolean Right-click crops to harvest multiple crop blocks
    - #minecraft:crops
- cost_limits
  - double Hunger to consume per block mined
  - double Experience to consume per block mined
- Limits/Restrictions
  - int Max Blocks to mine at once
  - long cooldown
  - boolean Require a damageable tool, or an item in the aluminisultimine:tools tag,
  - boolean Require correct tool for mining operation
    - Axe
      - #minecraft:mineable/axe
    - Hoe
      - #minecraft:mineable/hoe
    - Pickaxe
      - #minecraft:mineable/pickaxe
    - Shovel
      - #minecraft:mineable/shovel
    - Sword
      - minecraft:cobwebs
      - minecraft:bamboo
      - minecraft:bamboo_sapling
    - Shears
      - #minecraft:wool
      - #minecraft:wool_carpets
- misc
  - list merge_tags
  - list merge_tags_shaped
  - int prevent_tool_break
  - boolean cancel_on_block_break_fail
- Custom Shapes
  - make a sintaxe to make custom shapes in Config
  - ? make GUI interface for making custom shapes
  - This will need to sync with server if changes have been done


    
### Client
- Render
  - Int Number of blocks the white outline should be rendered for
- Overlay
  - Int Number of display items above and below current shape in flipping menu
- Key Configs
  - Boolean Shift needed for mining
    - Default is not required
  - Key for flipping menu
    - Default is none
  - Two Keys for GUI selector
    - Default is F1 + F2
  - Keys for each shape
    - Default is set to none
- Default Shape to have selected when loading into word
  - Default is Shapeless

