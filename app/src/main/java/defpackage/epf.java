package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epf extends abxd implements abyr {
    public static final epf a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int d;
    public int e;
    public abxj f = abxe.a;

    static {
        epf epfVar = new epf();
        a = epfVar;
        epfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(epf.class, epfVar);
    }

    private epf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004'", new Object[]{"b", "c", "d", "e", zzg.a, "f"});
        }
        if (i2 == 3) {
            return new epf();
        }
        if (i2 == 4) {
            return new epe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (epf.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
