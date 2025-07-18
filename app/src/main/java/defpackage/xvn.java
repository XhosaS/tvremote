package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvn extends abxd implements abyr {
    public static final xvn a;
    private static volatile abyy g;
    public int b;
    public xvp c;
    public xdy d;
    public int e;
    public boolean f;
    private byte h = 2;

    static {
        xvn xvnVar = new xvn();
        a = xvnVar;
        xvnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xvn.class, xvnVar);
    }

    private xvn() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0001\u0002ဉ\u0000\u0003ᐉ\u0001\u0006င\u0004\bဇ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xvn();
        }
        if (i2 == 4) {
            return new xvm();
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
        synchronized (xvn.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
