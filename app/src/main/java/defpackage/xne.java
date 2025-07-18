package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xne extends abxd implements abyr {
    public static final xne a;
    private static volatile abyy f;
    public int b;
    public xbg c;
    public abxs d;
    public abxs e;
    private byte g = 2;

    static {
        xne xneVar = new xne();
        a = xneVar;
        xneVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xne.class, xneVar);
    }

    private xne() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002\u001b\u0003Л", new Object[]{"b", "c", "d", xjp.class, "e", xnc.class});
        }
        if (i2 == 3) {
            return new xne();
        }
        if (i2 == 4) {
            return new xnd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xne.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
