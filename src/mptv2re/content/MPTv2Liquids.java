package mptv2re.content;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class MPTv2Liquids {
    public static Liquid
        meter
    ;

    public static void load() {
        meter = new Liquid("meter", Color.valueOf("076c83")){{
            heatCapacity = 99f;
            temperature = -270f;
            viscosity = 0.0000001f;
        }};
    }
}
