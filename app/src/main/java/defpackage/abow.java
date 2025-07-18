package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abow extends abwz implements abxa {
    public static final abow a;
    public static final abxc b;
    private static volatile abyy e;
    private int f;
    private byte g = 2;
    public String c = "";
    public abxs d = abzb.b;

    static {
        abow abowVar = new abow();
        a = abowVar;
        abowVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abow.class, abowVar);
        b = new abxc(abou.a, abowVar, abowVar, new abxb(null, 1002, acap.MESSAGE, false, false));
    }

    private abow() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0004Л", new Object[]{"f", "c", "d", aboi.class});
        }
        if (i2 == 3) {
            return new abow();
        }
        if (i2 == 4) {
            return new abov();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abow.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
