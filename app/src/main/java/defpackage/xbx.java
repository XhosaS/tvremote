package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbx extends abxd implements abyr {
    public static final xbx a;
    private static volatile abyy f;
    public int b;
    public xbg c;
    public String d = "";
    public abvo e;

    static {
        xbx xbxVar = new xbx();
        a = xbxVar;
        xbxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xbx.class, xbxVar);
    }

    private xbx() {
        Object[] objArr = abzb.a;
        this.e = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005ည\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xbx();
        }
        if (i2 == 4) {
            return new xbw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xbx.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
