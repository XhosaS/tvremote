package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urs {
    public static final zdy a = zdy.h("com/google/android/libraries/tv/setupwraith/gm3/background/Gtvm3BackgroundScrimFactory");

    public static final int a(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/tv/setupwraith/gm3/background/Gtvm3BackgroundScrimFactory", "getColorFromAttribute", 96, "Gtvm3BackgroundScrimFactory.java")).v("Attribute %d not found or invalid. Defaulting color to transparent.", i);
            return 0;
        }
        if (typedValue.isColorType()) {
            return typedValue.data;
        }
        ((zdv) ((zdv) a.d()).q("com/google/android/libraries/tv/setupwraith/gm3/background/Gtvm3BackgroundScrimFactory", "getColorFromAttribute", 99, "Gtvm3BackgroundScrimFactory.java")).v("Attribute %d does not resolve to a color. Defaulting color to transparent.", i);
        return 0;
    }
}
