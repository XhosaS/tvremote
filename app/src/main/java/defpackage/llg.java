package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llg extends abxd implements abyr {
    public static final llg a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        llg llgVar = new llg();
        a = llgVar;
        llgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(llg.class, llgVar);
    }

    private llg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", lky.class});
        }
        if (i2 == 3) {
            return new llg();
        }
        if (i2 == 4) {
            return new llf();
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
        synchronized (llg.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
