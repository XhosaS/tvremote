package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
enum hzx {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;

    private static final Map aO = new HashMap();

    public static hzx a(String str) {
        Map map = aO;
        hzx hzxVar = (hzx) map.get(str);
        if (hzxVar != null) {
            return hzxVar;
        }
        if (str.equals("class")) {
            hzx hzxVar2 = CLASS;
            map.put(str, hzxVar2);
            return hzxVar2;
        }
        if (str.indexOf(95) != -1) {
            hzx hzxVar3 = UNSUPPORTED;
            map.put(str, hzxVar3);
            return hzxVar3;
        }
        try {
            hzx hzxVar4 = (hzx) Enum.valueOf(hzx.class, str.replace('-', '_'));
            if (hzxVar4 != CLASS) {
                map.put(str, hzxVar4);
                return hzxVar4;
            }
        } catch (IllegalArgumentException unused) {
        }
        Map map2 = aO;
        hzx hzxVar5 = UNSUPPORTED;
        map2.put(str, hzxVar5);
        return hzxVar5;
    }
}
