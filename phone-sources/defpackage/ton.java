package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ton {
    public final float a;
    public tow b = tow.NONE;
    public float c = 0.0f;

    public ton(float f) {
        this.a = f;
    }

    public static tow b(float f, float f2) {
        float f3 = f + f2;
        float f4 = f - f2;
        return f3 > 0.0f ? f4 > 0.0f ? tow.RIGHT : tow.UP : f4 > 0.0f ? tow.DOWN : tow.LEFT;
    }

    public final Pair a() {
        float f = this.c;
        float f2 = this.a;
        Float fValueOf = Float.valueOf(0.0f);
        if (f < f2) {
            return Pair.create(fValueOf, fValueOf);
        }
        int iOrdinal = this.b.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? Pair.create(fValueOf, fValueOf) : Pair.create(fValueOf, Float.valueOf(-f2)) : Pair.create(Float.valueOf(-f2), fValueOf) : Pair.create(fValueOf, Float.valueOf(f2)) : Pair.create(Float.valueOf(f2), fValueOf);
    }
}
