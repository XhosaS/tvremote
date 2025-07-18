package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adph extends abxd implements abyr {
    public static final adph a;
    private static volatile abyy c;
    public float b;
    private int d;

    static {
        adph adphVar = new adph();
        a = adphVar;
        adphVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adph.class, adphVar);
    }

    private adph() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ခ\u0001", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adph();
        }
        if (i2 == 4) {
            return new adpg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adph.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
