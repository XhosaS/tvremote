package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnw extends abxd implements abyr {
    public static final acnw a;
    public static volatile abyy b;
    public abyl c = abyl.a;

    static {
        acnw acnwVar = new acnw();
        a = acnwVar;
        acnwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acnw.class, acnwVar);
    }

    private acnw() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", acnv.a});
        }
        if (i2 == 3) {
            return new acnw();
        }
        if (i2 == 4) {
            return new acnu();
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
        synchronized (acnw.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
