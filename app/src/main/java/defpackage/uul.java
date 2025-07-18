package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uul {
    public static int a(int i, int i2, float f) {
        int iAlpha = Color.alpha(i2);
        return Color.argb(Math.round(f * Color.alpha(i)), b(Color.red(i), Color.red(i2), iAlpha), b(Color.green(i), Color.green(i2), iAlpha), b(Color.blue(i), Color.blue(i2), iAlpha));
    }

    private static int b(int i, int i2, int i3) {
        return (((i * (255 - i3)) + (i2 * i3)) + 128) / 255;
    }
}
