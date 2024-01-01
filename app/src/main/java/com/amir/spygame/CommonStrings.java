package com.amir.spygame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonStrings {

    public static ArrayList<String> objectList = new ArrayList<>();

    public static String[] objectList2 = {
            "sidewalk", "pop can", "water bottle", "hanger", "handful of change",
            "shirt", "radio", "clock", "rusty nail", "matchbook", "stick of incense",
            "roll of toilet paper", "dove", "carton of ice cream", "marble", "clay pot",
            "class ring", "box of baking soda", "pair of binoculars", "pair of socks",
            "kitchen knife", "coffee mug", "pair of earrings", "statuette", "tennis ball",
            "bottle of oil", "pair of dice", "domino set", "jar of jam", "blouse", "pillow",
            "shawl", "bow", "credit card", "milk", "chalk", "cork", "spool of ribbon",
            "fishing hook", "trucks", "panda", "notebook", "purse", "sticky note", "vase",
            "pair of water goggles", "canvas", "handheld game system", "coffee pot",
            "book of matches", "turtle", "flashlight", "pair of glasses", "conditioner",
            "washcloth", "magnet", "video games", "clothes", "plush unicorn", "keyboard",
            "roll of duct tape", "comb", "bottle of ink", "window", "pocketknife",
            "pasta strainer", "grocery list", "flyswatter", "quartz crystal", "lamp",
            "bottle of soda", "paintbrush", "multitool", "cup", "belt", "flowers", "broccoli",
            "cellphone", "hair clip", "card", "water", "bottle of lotion", "baseball hat",
            "ice pick", "sharpie", "egg timer", "wedding ring", "mobile phone", "hair tie",
            "cookie jar", "brush", "crowbar", "cell phone", "CD", "money", "squirrel",
            "rubber duck", "pants", "lime", "tweezers", "Christmas ornament", "rhino",
            "microphone", "house", "soap", "small pouch", "miniature portrait", "remote",
            "magnifying glass", "plush dinosaur", "bonesaw", "cucumber", "tea pot", "slipper",
            "candle", "ball of yarn", "rolling pin", "sword",
            "spool of wire", "book of jokes", "shark", "acorn", "necktie",
            "children's book", "hand fan", "buckle", "bottle cap", "dolphin",
            "can of beans", "bowl", "martini glass", "shirt button", "pool stick",
            "tv", "garden spade", "chain", "rock", "beaded necklace", "packet of seeds",
            "monitor", "squirt gun", "spring", "feather duster", "puddle", "glow stick",
            "dog", "roll of masking tape", "needle", "jar of pickles", "keychain",
            "tooth pick", "pack of cards", "baseball", "paper", "paint brush", "rabbit",
            "couch", "cement stone", "letter opener", "bandana", "washing machine",
            "toothbrush", "white out", "fork", "bracelet", "keys", "candy wrapper",
            "crow", "giraffe", "pair of handcuffs", "helmet", "thimble", "box of chocolates",
            "beef", "pearl necklace", "bottle of pills", "package of crisp and crunchy edibles",
            "pair of scissors", "zebra", "nail", "can of whipped cream", "bottle of glue",
            "lemon", "floor", "bag of popcorn", "tube of lipstick", "shoe lace", "handbasket",
            "tissue box", "pair of rubber gloves", "catalogue", "flag", "pinecone", "fish",
            "fake flowers", "plate", "box of tissues", "toy plane", "wristwatch", "tree",
            "purse/bag", "game CD", "box of markers", "butter knife", "nail filer", "carrot",
            "toy car", "chenille stick", "eraser", "toothpick", "outlet", "hair ribbon",
            "box of crayons", "candlestick", "pocketwatch", "egg beater", "package of glitter",
            "rubber stamp", "egg", "container of pudding", "knife", "plush dog", "snowglobe",
            "towel", "glasses", "pepper shaker", "sand paper", "mop", "plush cat", "dictionary",
            "hand bag", "sticker book", "street lights", "plush pony", "apple", "map", "plush frog",
            "magazine", "chapter book", "safety pin", "socks", "music CD", "extension cord", "mouse pad",
            "thread", "light", "ocarina", "bottle of syrup", "plush rabbit", "straw", "box of Q-tips",
            "pencil holder", "spatula", "picture frame", "shovel", "leg warmers", "grid paper",
            "ice cream stick", "shopping bag", "lamp shade", "chicken", "watch", "bottle of honey",
            "pail", "umbrella", "bouquet of flowers", "tomato", "hamster", "piece of gum", "tiger",
            "bananas", "hammer", "beaded bracelet", "sheep", "drill press", "sandglass", "bread",
            "baseball bat", "can of chili", "bottle of water", "bow tie", "sandal", "bag",
            "bar of soap", "salt shaker", "chair", "desk", "bottle", "cowboy hat", "tube of lip balm",
            "wooden spoon", "candy bar", "tire swing", "box of chalk", "cars", "shampoo", "ipod charger",
            "lip gloss", "frying pan", "sponge", "craft book", "zipper", "few batteries", "light bulb",
            "clothes pin", "scallop shell", "phone", "door", "mp3 player", "bag of rubber bands",
            "postage stamp", "spoon", "plush bear", "notepad", "sofa", "pen", "stockings",
            "check book", "model car", "bottle of paint", "toilet paper tube", "twister",
            "can of peas", "sun glasses", "boom box", "mirror", "bottle of perfume", "feather",
            "bookmark", "sketch pad", "jar of peanut butter", "wishbone", "button", "whip",
            "banana", "novel", "toy robot", "empty jar", "lace", "toy boat", "plush octopus",
            "empty bottle", "laser pointer", "key", "harmonica", "comic book", "shoes", "bed",
            "orange", "speakers", "toilet", "word search", "empty tin can", "eye liner", "basketball",
            "cookie tin", "table", "wine glass", "incense holder", "trash bag", "chocolate", "paperclip",
            "book", "sailboat", "rug", "pencil", "whistle", "game cartridge", "pair of sunglasses",
            "canteen", "wallet", "pair of safety goggles", "rat", "soccer ball", "nail clippers", "drawer",
            "hair brush", "bag of cotton balls", "jigsaw puzzle", "deodorant", "whale", "toy top", "steak knife",
            "lighter", "screwdriver", "face wash", "snail shell", "toothpaste", "quilt", "dagger", "computer",
            "plastic fork", "bottle of sunscreen", "roll of stickers", "teddies", "bell", "spool of thread",
            "lotion", "cat", "scotch tape", "football", "stop sign", "photo album", "rope", "cow", "camera",
            "pair of tongs", "car", "ipod", "rubber band", "stick", "ice cube", "tennis racket",
            "bottle of nail polish", "roll of gauze", "scarf", "hand mirror", "screw", "lion", "toe ring",
            "perfume", "ladle", "television", "spool of string", "seat belt", "fridge", "box", "key chain",
            "spectacles", "pair of knitting needles", "food", "locket", "toy soldier", "carrots",
            "wireless control", "balloon", "ring", "candy cane", "spice bottle", "sheet of paper", "tea cup",
            "thermometer", "wrench", "hair pin", "glass", "bangle bracelet", "blowdryer"
    };

    public CommonStrings() {

    }

    public ArrayList<String> getObjectList() {
        List<String> stringList = Arrays.asList(objectList2); // Converting array to List
        ArrayList<String> objectArrayList = new ArrayList<>(stringList);// Converting List to ArrayList
        return objectArrayList;
    }
}