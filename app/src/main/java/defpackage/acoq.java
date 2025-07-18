package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoq extends abxd implements abyr {
    public static final acoq a;
    private static volatile abyy c;
    public abxm b = abyf.a;

    static {
        acoq acoqVar = new acoq();
        a = acoqVar;
        acoqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acoq.class, acoqVar);
    }

    private acoq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new acoq();
        }
        if (i2 == 4) {
            return new acop();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acoq.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
