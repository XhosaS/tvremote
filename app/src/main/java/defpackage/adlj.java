package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlj extends abxd implements abyr {
    public static final adlj a;
    public static final abxc b;
    private static volatile abyy d;
    public abxs c = abzb.b;

    static {
        adlj adljVar = new adlj();
        a = adljVar;
        adljVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adlj.class, adljVar);
        b = new abxc(adpr.a, abzb.b, adljVar, new abxb(null, 386458583, acap.MESSAGE, true, false));
    }

    private adlj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", adlh.class});
        }
        if (i2 == 3) {
            return new adlj();
        }
        if (i2 == 4) {
            return new adli();
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
        synchronized (adlj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
