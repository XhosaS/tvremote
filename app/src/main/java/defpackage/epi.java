package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epi extends abxd implements abyr {
    public static final epi a;
    private static volatile abyy g;
    public int b;
    public Object d;
    public int e;
    public epf f;
    private zpp h;
    public int c = 0;
    private byte i = 2;

    static {
        epi epiVar = new epi();
        a = epiVar;
        epiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(epi.class, epiVar);
    }

    private epi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001᠌\u0000\u0003ဉ\u0003\u00045\u0000\u0005;\u0000\u0006ᐉ\u0002", new Object[]{"d", "c", "b", "e", eph.a, "f", "h"});
        }
        if (i2 == 3) {
            return new epi();
        }
        if (i2 == 4) {
            return new epg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (epi.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
