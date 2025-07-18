package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbg extends abxd implements abyr {
    public static final xbg a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        xbg xbgVar = new xbg();
        a = xbgVar;
        xbgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xbg.class, xbgVar);
    }

    private xbg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0001\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"c", "b", xaq.class, xas.class, xaw.class, xbi.class, xbc.class, xba.class, xbk.class, xbe.class, xay.class, xau.class});
        }
        if (i2 == 3) {
            return new xbg();
        }
        if (i2 == 4) {
            return new xbf();
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
        synchronized (xbg.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
