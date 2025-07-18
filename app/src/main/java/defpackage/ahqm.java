package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqm extends abxd implements abyr {
    public static final ahqm a;
    private static volatile abyy g;
    public int b;
    public int c;
    public abwf d;
    public long e;
    public int f;

    static {
        ahqm ahqmVar = new ahqm();
        a = ahqmVar;
        ahqmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahqm.class, ahqmVar);
    }

    private ahqm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", ahql.a});
        }
        if (i2 == 3) {
            return new ahqm();
        }
        if (i2 == 4) {
            return new ahqk();
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
        synchronized (ahqm.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
