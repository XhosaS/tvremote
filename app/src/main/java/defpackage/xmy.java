package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmy extends abxd implements abyr {
    public static final xmy a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        xmy xmyVar = new xmy();
        a = xmyVar;
        xmyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xmy.class, xmyVar);
    }

    private xmy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", xmx.class});
        }
        if (i2 == 3) {
            return new xmy();
        }
        if (i2 == 4) {
            return new xmv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xmy.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
