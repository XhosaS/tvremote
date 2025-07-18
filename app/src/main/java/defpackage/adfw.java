package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfw extends abxd implements abyr {
    public static final adfw a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        adfw adfwVar = new adfw();
        a = adfwVar;
        adfwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfw.class, adfwVar);
    }

    private adfw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", adfv.a});
        }
        if (i2 == 3) {
            return new adfw();
        }
        if (i2 == 4) {
            return new adfu();
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
        synchronized (adfw.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
