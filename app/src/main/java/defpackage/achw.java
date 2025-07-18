package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achw extends abxd implements abyr {
    public static final achw a;
    public static final abxc b;
    private static volatile abyy d;
    public abxs c = abzb.b;

    static {
        achw achwVar = new achw();
        a = achwVar;
        achwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(achw.class, achwVar);
        b = new abxc(achk.a, achwVar, achwVar, new abxb(null, 274192245, acap.MESSAGE, false, false));
    }

    private achw() {
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
            return new achw();
        }
        if (i2 == 4) {
            return new achv();
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
        synchronized (achw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
