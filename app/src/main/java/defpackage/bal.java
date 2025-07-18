package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bal {
    public final int a;
    public final int b;
    public final int c;

    public bal(int i, int i2, int i3) {
        this.a = i;
        if (i2 == i) {
            i2 = Color.argb((int) ((Color.alpha(i) * 0.85f) + 38.25f), (int) ((Color.red(i) * 0.85f) + 38.25f), (int) ((Color.green(i) * 0.85f) + 38.25f), (int) ((Color.blue(i) * 0.85f) + 38.25f));
        }
        this.b = i2;
        this.c = i3;
    }
}
