package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnl extends abxd implements abyr {
    public static final xnl a;
    public static final abxc b;
    private static volatile abyy d;
    public abiy c;
    private int e;
    private byte f = 2;

    static {
        xnl xnlVar = new xnl();
        a = xnlVar;
        xnlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xnl.class, xnlVar);
        b = new abxc(xnj.a, xnlVar, xnlVar, new abxb(null, 148505702, acap.MESSAGE, false, false));
    }

    private xnl() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new xnl();
        }
        if (i2 == 4) {
            return new xnk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xnl.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
