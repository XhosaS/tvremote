package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llc extends abxd implements abyr {
    public static final llc a;
    private static volatile abyy f;
    public int b;
    public abxs c = abzb.b;
    public String d = "";
    public String e = "";

    static {
        llc llcVar = new llc();
        a = llcVar;
        llcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(llc.class, llcVar);
    }

    private llc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001", new Object[]{"b", "c", lle.class, "d", "e"});
        }
        if (i2 == 3) {
            return new llc();
        }
        if (i2 == 4) {
            return new llb();
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
        synchronized (llc.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
