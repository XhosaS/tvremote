package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbt extends abxd implements abyr {
    public static final adbt a;
    private static volatile abyy d;
    public int b;
    public int c;
    private abyl e;
    private abyl f;
    private abyl g;

    static {
        adbt adbtVar = new adbt();
        a = adbtVar;
        adbtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adbt.class, adbtVar);
    }

    private adbt() {
        abyl abylVar = abyl.a;
        this.e = abylVar;
        this.f = abylVar;
        this.g = abylVar;
        this.c = -1;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0003\u0000\u0000\u00012\u00022\u0004᠌\u0000\u00052", new Object[]{"b", "e", adbp.a, "f", adbo.a, "c", adbm.a, "g", adbs.a});
        }
        if (i2 == 3) {
            return new adbt();
        }
        if (i2 == 4) {
            return new adbn();
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
        synchronized (adbt.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
