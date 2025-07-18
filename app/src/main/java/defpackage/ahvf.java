package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvf extends abxd implements abyr {
    public static final ahvf a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ahvf ahvfVar = new ahvf();
        a = ahvfVar;
        ahvfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvf.class, ahvfVar);
    }

    private ahvf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ahvf();
        }
        if (i2 == 4) {
            return new ahve();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvf.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
