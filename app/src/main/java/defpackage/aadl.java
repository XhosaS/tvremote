package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class aadl extends abxd implements abyr {
    public static final aadl a;
    private static volatile abyy b;

    static {
        aadl aadlVar = new aadl();
        a = aadlVar;
        aadlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aadl.class, aadlVar);
    }

    private aadl() {
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
            return new abzc(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new aadl();
        }
        if (i2 == 4) {
            return new aadk();
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
        synchronized (aadl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
