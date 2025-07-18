package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjd extends abxd implements abyr {
    public static final pjd a;
    private static volatile abyy h;
    public int b;
    public abzy c;
    public boolean e;
    public pjh f;
    public abyl g = abyl.a;
    public abxs d = abzb.b;

    static {
        pjd pjdVar = new pjd();
        a = pjdVar;
        pjdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pjd.class, pjdVar);
    }

    private pjd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"b", "c", "d", piq.class, "e", "f", "g", pjc.a});
        }
        if (i2 == 3) {
            return new pjd();
        }
        if (i2 == 4) {
            return new pjb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pjd.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
