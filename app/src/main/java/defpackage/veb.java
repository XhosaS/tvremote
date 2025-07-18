package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class veb extends abxd implements abyr {
    public static final veb a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public int d;
    public long e;
    public int f;

    static {
        veb vebVar = new veb();
        a = vebVar;
        vebVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(veb.class, vebVar);
    }

    private veb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", vec.a, "e", "f"});
        }
        if (i2 == 3) {
            return new veb();
        }
        if (i2 == 4) {
            return new vea();
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
        synchronized (veb.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
