package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdl extends abxd implements abyr {
    public static final acdl a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;

    static {
        acdl acdlVar = new acdl();
        a = acdlVar;
        acdlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdl.class, acdlVar);
    }

    private acdl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", acdj.a, "d", acby.class});
        }
        if (i2 == 3) {
            return new acdl();
        }
        if (i2 == 4) {
            return new acdi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acdl.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
