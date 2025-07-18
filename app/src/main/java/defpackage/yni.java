package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yni extends abxd implements abyr {
    public static final yni a;
    private static volatile abyy h;
    public int b;
    public Object d;
    public int e;
    public ymq g;
    public int c = 0;
    public abvo f = abvo.b;

    static {
        yni yniVar = new yni();
        a = yniVar;
        yniVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yni.class, yniVar);
    }

    private yni() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003<\u0000\u0004ဉ\u0002", new Object[]{"d", "c", "b", "e", yng.a, "f", ymo.class, "g"});
        }
        if (i2 == 3) {
            return new yni();
        }
        if (i2 == 4) {
            return new ynf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yni.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
