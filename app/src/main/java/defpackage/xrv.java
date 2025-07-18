package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrv extends abxd implements abyr {
    public static final xrv a;
    private static volatile abyy b;
    private int c;
    private int d;
    private xso f;
    private xtk g;
    private xst h;
    private xtf i;
    private xsi j;
    private xry k;
    private xrs l;
    private xsy m;
    private xto n;
    private acbs o;
    private xsf p;
    private abyl e = abyl.a;
    private byte q = 2;

    static {
        xrv xrvVar = new xrv();
        a = xrvVar;
        xrvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xrv.class, xrvVar);
    }

    private xrv() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\f\u0000\u0002\u0001;\f\u0001\u0000\u0000\u0001ဉ\u0000\fဉ\u0006\u0011ဉ\t\u0013ဉ\f\u0015ဉ\r\u0017ဉ\u000e'ဉ\u001a+ဉ\u001e.ဉ /ဉ!4ဉ#;2", new Object[]{"c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "e", xru.a});
        }
        if (i2 == 3) {
            return new xrv();
        }
        if (i2 == 4) {
            return new xrt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xrv.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
