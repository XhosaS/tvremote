package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuc extends abxd implements abyr {
    public static final xuc a;
    private static volatile abyy e;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public abxs d = abzb.b;

    static {
        xuc xucVar = new xuc();
        a = xucVar;
        xucVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xuc.class, xucVar);
    }

    private xuc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0000\u0001\t\u0003\u0000\u0001\u0002\u0001м\u0000\u0002Л\t;\u0000", new Object[]{"c", "b", xqo.class, "d", xub.class});
        }
        if (i2 == 3) {
            return new xuc();
        }
        if (i2 == 4) {
            return new xtx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xuc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
