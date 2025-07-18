package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahtq extends abxd implements abyr {
    public static final ahtq a;
    private static volatile abyy d;
    public abzy b;
    public abxs c = abzb.b;
    private int e;

    static {
        ahtq ahtqVar = new ahtq();
        a = ahtqVar;
        ahtqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahtq.class, ahtqVar);
    }

    private ahtq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0001\u0000\u0004ဉ\u0004\u0007\u001b", new Object[]{"e", "b", "c", ahty.class});
        }
        if (i2 == 3) {
            return new ahtq();
        }
        if (i2 == 4) {
            return new ahtp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahtq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
