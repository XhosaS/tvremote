package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhg extends abxd implements abyr {
    public static final yhg a;
    private static volatile abyy b;

    static {
        yhg yhgVar = new yhg();
        a = yhgVar;
        yhgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yhg.class, yhgVar);
    }

    private yhg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new yhg();
        }
        if (i2 == 4) {
            return new yhf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yhg.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
