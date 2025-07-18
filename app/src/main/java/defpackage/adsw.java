package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsw extends abxd implements abyr {
    public static final adsw a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int d;
    public adls e;
    public int f;

    static {
        adsw adswVar = new adsw();
        a = adswVar;
        adswVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adsw.class, adswVar);
    }

    private adsw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဉ\u0002\b᠌\u0005", new Object[]{"b", "c", adst.a, "d", adsv.a, "e", "f", adss.a});
        }
        if (i2 == 3) {
            return new adsw();
        }
        if (i2 == 4) {
            return new adsr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adsw.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
