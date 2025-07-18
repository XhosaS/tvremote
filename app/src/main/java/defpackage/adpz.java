package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpz extends abxd implements abyr {
    public static final abxk a = new adpx();
    public static final adpz b;
    private static volatile abyy g;
    public int c;
    public adpw d;
    public adrf e;
    public abxj f = abxe.a;

    static {
        adpz adpzVar = new adpz();
        b = adpzVar;
        adpzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpz.class, adpzVar);
    }

    private adpz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0006ࠞ", new Object[]{"c", "d", "e", "f", admt.a});
        }
        if (i2 == 3) {
            return new adpz();
        }
        if (i2 == 4) {
            return new adpy();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adpz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
