package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class djt extends djv {
    @Override // defpackage.djv
    public final float a(int i, int i2, int i3, int i4) {
        if (h) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (Math.max(i2 / i4, i / i3) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r2);
    }

    @Override // defpackage.djv
    public final int b(int i, int i2, int i3, int i4) {
        return h ? 2 : 1;
    }
}
