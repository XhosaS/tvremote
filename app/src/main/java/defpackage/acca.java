package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acca extends abxd implements abyr {
    public static final acca a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        acca accaVar = new acca();
        a = accaVar;
        accaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acca.class, accaVar);
    }

    private acca() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", accc.class});
        }
        if (i2 == 3) {
            return new acca();
        }
        if (i2 == 4) {
            return new acbz();
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
        synchronized (acca.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
