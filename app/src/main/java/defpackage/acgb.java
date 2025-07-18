package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgb extends abxd implements abyr {
    public static final acgb a;
    public static final abxc b;
    private static volatile abyy d;
    public abxs c = abzb.b;

    static {
        acgb acgbVar = new acgb();
        a = acgbVar;
        acgbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgb.class, acgbVar);
        b = new abxc(achk.a, acgbVar, acgbVar, new abxb(null, 352671901, acap.MESSAGE, false, false));
    }

    private acgb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"c"});
        }
        if (i2 == 3) {
            return new acgb();
        }
        if (i2 == 4) {
            return new acga();
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
        synchronized (acgb.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
