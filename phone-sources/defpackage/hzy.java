package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum hzy {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map G = new HashMap();

    public static hzy a(String str) {
        Map map = G;
        hzy hzyVar = (hzy) map.get(str);
        if (hzyVar != null) {
            return hzyVar;
        }
        if (str.equals("switch")) {
            hzy hzyVar2 = SWITCH;
            map.put(str, hzyVar2);
            return hzyVar2;
        }
        try {
            hzy hzyVar3 = (hzy) Enum.valueOf(hzy.class, str);
            if (hzyVar3 != SWITCH) {
                map.put(str, hzyVar3);
                return hzyVar3;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = G;
        hzy hzyVar4 = UNSUPPORTED;
        map2.put(str, hzyVar4);
        return hzyVar4;
    }
}
