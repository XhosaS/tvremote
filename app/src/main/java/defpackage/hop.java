package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hop {
    public final int a;
    public final int b;

    public hop(int i, int i2, int i3, int i4) {
        int iMax = Math.max(1, (i2 - i3) / (i4 + i3));
        this.a = iMax;
        this.b = (i / iMax) + (i % iMax == 0 ? 0 : 1);
    }
}
