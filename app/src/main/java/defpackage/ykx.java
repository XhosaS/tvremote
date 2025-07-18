package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ykx extends abxd implements abyr {
    public static final ykx a;
    private static volatile abyy g;
    public int b;
    private abyl h = abyl.a;
    public String c = "";
    public String d = "";
    public abxs e = abzb.b;
    public String f = "";

    static {
        ykx ykxVar = new ykx();
        a = ykxVar;
        ykxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ykx.class, ykxVar);
    }

    private ykx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0015\u0005\u0001\u0001\u0000\u0001ဈ\u0000\rဈ\u0001\u000f\u001a\u0010ဈ\f\u00152", new Object[]{"b", "c", "d", "e", "f", "h", ykw.a});
        }
        if (i2 == 3) {
            return new ykx();
        }
        if (i2 == 4) {
            return new ykt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ykx.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
