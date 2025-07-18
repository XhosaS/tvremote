package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuc {
    public static Paint.Join a(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
    }

    public static int[] b() {
        return new int[]{1, 2, 3};
    }
}
