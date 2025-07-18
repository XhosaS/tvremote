package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xha extends abxd implements abyr {
    public static final xha a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public xgy d;

    static {
        xha xhaVar = new xha();
        a = xhaVar;
        xhaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xha.class, xhaVar);
    }

    private xha() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xha();
        }
        if (i2 == 4) {
            return new xgz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xha.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
