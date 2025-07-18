package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stl extends abxd implements abyr {
    public static final stl a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        stl stlVar = new stl();
        a = stlVar;
        stlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(stl.class, stlVar);
    }

    private stl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ssx.class});
        }
        if (i2 == 3) {
            return new stl();
        }
        if (i2 == 4) {
            return new stk();
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
        synchronized (stl.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
