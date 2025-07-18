package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abid extends abxd implements abyr {
    public static final abid a;
    private static volatile abyy b;

    static {
        abid abidVar = new abid();
        a = abidVar;
        abidVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abid.class, abidVar);
    }

    private abid() {
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
            return new abid();
        }
        if (i2 == 4) {
            return new abic();
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
        synchronized (abid.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
