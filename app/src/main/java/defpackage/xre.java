package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xre extends abxd implements abyr {
    public static final xre a;
    private static volatile abyy b;
    private int c;
    private int d;
    private xfp e;
    private aazu f;
    private xrl g;
    private xrg h;
    private xrq i;
    private byte j = 2;

    static {
        xre xreVar = new xre();
        a = xreVar;
        xreVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xre.class, xreVar);
    }

    private xre() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0002\u0003:\u0005\u0000\u0000\u0002\u0003ᐉ\u0006\u000bᐉ\u000e\u001dဉ$'ဉ\u0018:ဉ7", new Object[]{"c", "d", "e", "f", "h", "g", "i"});
        }
        if (i2 == 3) {
            return new xre();
        }
        if (i2 == 4) {
            return new xrd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xre.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
