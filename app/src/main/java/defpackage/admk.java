package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admk extends abxd implements abyr {
    public static final admk a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        admk admkVar = new admk();
        a = admkVar;
        admkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(admk.class, admkVar);
    }

    private admk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", admj.a});
        }
        if (i2 == 3) {
            return new admk();
        }
        if (i2 == 4) {
            return new admi();
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
        synchronized (admk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
