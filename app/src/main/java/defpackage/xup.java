package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xup extends abxd implements abyr {
    public static final xup a;
    private static volatile abyy e;
    public Object c;
    public int b = 0;
    private byte f = 2;
    public abxs d = abzb.b;

    static {
        xup xupVar = new xup();
        a = xupVar;
        xupVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xup.class, xupVar);
    }

    private xup() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0000\u0001\t\u0003\u0000\u0001\u0002\u0001м\u0000\u0002Л\t;\u0000", new Object[]{"c", "b", xqo.class, "d", xuo.class});
        }
        if (i2 == 3) {
            return new xup();
        }
        if (i2 == 4) {
            return new xuk();
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
        synchronized (xup.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
