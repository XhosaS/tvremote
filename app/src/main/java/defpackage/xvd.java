package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvd extends abxd implements abyr {
    public static final xvd a;
    private static volatile abyy e;
    public int b;
    private xrv f;
    private xrc g;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        xvd xvdVar = new xvd();
        a = xvdVar;
        xvdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xvd.class, xvdVar);
    }

    private xvd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\bᐉ\u0007", new Object[]{"b", "c", "d", "f", "g"});
        }
        if (i2 == 3) {
            return new xvd();
        }
        if (i2 == 4) {
            return new xvc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xvd.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
