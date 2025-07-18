package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjg extends abxd implements abyr {
    public static final xjg a;
    private static volatile abyy g;
    public int b;
    public xjp d;
    public xbg e;
    public xmk f;
    private byte h = 2;
    public String c = "";

    static {
        xjg xjgVar = new xjg();
        a = xjgVar;
        xjgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjg.class, xjgVar);
    }

    private xjg() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\u0007ဉ\u0001", new Object[]{"b", "c", "e", "f", "d"});
        }
        if (i2 == 3) {
            return new xjg();
        }
        if (i2 == 4) {
            return new xjf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xjg.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
