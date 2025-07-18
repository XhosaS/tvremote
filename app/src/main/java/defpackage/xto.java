package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xto extends abxd implements abyr {
    public static final xto a;
    private static volatile abyy b;
    private int c;
    private xvt d;

    static {
        xto xtoVar = new xto();
        a = xtoVar;
        xtoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xto.class, xtoVar);
    }

    private xto() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xto();
        }
        if (i2 == 4) {
            return new xtn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xto.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
