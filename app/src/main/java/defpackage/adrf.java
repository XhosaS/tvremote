package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrf extends abxd implements abyr {
    public static final adrf a;
    private static volatile abyy c;
    public String b;
    private int d;
    private abyl e;
    private abyl f;

    static {
        adrf adrfVar = new adrf();
        a = adrfVar;
        adrfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrf.class, adrfVar);
    }

    private adrf() {
        abyl abylVar = abyl.a;
        this.e = abylVar;
        this.f = abylVar;
        this.b = "";
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
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0002\u0000\u0000\u0002ဈ\u0001\u00062\u00072", new Object[]{"d", "b", "e", adre.a, "f", adrd.a});
        }
        if (i2 == 3) {
            return new adrf();
        }
        if (i2 == 4) {
            return new adrc();
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
        synchronized (adrf.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
