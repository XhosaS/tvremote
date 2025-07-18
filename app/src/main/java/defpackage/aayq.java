package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayq extends abxd implements abyr {
    public static final aayq a;
    private static volatile abyy f;
    public int b;
    public long c;
    public abxm d;
    public abxs e;

    static {
        aayq aayqVar = new aayq();
        a = aayqVar;
        aayqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aayq.class, aayqVar);
    }

    private aayq() {
        Object[] objArr = abzb.a;
        this.d = abyf.a;
        this.e = abzb.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", aayp.class, "c", "d"});
        }
        if (i2 == 3) {
            return new aayq();
        }
        if (i2 == 4) {
            return new aayj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aayq.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
