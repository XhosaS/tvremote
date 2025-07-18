package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abki extends abxd implements abyr {
    public static final abki a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        abki abkiVar = new abki();
        a = abkiVar;
        abkiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abki.class, abkiVar);
    }

    private abki() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", abkh.class, abkd.class, abju.class, abjw.class, abjs.class, abjy.class, abka.class, abkf.class});
        }
        if (i2 == 3) {
            return new abki();
        }
        if (i2 == 4) {
            return new abjp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abki.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
