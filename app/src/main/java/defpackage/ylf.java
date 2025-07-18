package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylf extends abxd implements abyr {
    public static final ylf a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        ylf ylfVar = new ylf();
        a = ylfVar;
        ylfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylf.class, ylfVar);
    }

    private ylf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ykz.class});
        }
        if (i2 == 3) {
            return new ylf();
        }
        if (i2 == 4) {
            return new yle();
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
        synchronized (ylf.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
