package net.nukebob.elements.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nukebob.elements.ElementsSurvival;

public class ElementTaskScreen extends Screen {
    private static final Identifier WINDOW_TEXTURE = new Identifier(ElementsSurvival.MOD_ID, "textures/gui/window.png");


    public ElementTaskScreen() {
        super(Text.literal("Amongus"));
    }

    //public ButtonWidget button1;

    @Override
    protected void init() {
        super.init();
        /*
        button1 = ButtonWidget.builder(Text.literal("Button 1"), button -> {
                    System.out.println("You clicked button1!");
                })
                .dimensions(width / 2 - 205, 20, 200, 20)
                .tooltip(Tooltip.of(Text.literal("Tooltip of button1")))
                .build();
        */
        
    }


}
