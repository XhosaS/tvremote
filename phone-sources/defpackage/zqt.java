package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zqt extends zqv {
    protected static final short c(int i) {
        return (short) ((i >>> 21) ^ ((((i >>> 9) & 4088) ^ ((i & 4095) ^ (i >>> 12))) ^ ((i >>> 18) & 56)));
    }

    protected static final short d(short s) {
        return c(wef.X(s));
    }

    @Override // defpackage.zqv
    public final short a(short s) {
        short sB = b(d(s), s);
        short sB2 = b(d(d(sB)), sB);
        return d(b(d(b(d(d(b(d(d(d(d(sB2)))), sB2))), sB)), s));
    }

    @Override // defpackage.zqv
    public final short b(short s, short s2) {
        int i = (s2 & 1) * s;
        for (int i2 = 1; i2 < 12; i2++) {
            i ^= ((1 << i2) & s2) * s;
        }
        return c(i);
    }
}
