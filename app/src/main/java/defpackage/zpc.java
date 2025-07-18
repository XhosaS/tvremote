package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpc extends abxd implements abyr {
    public static final zpc a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        zpc zpcVar = new zpc();
        a = zpcVar;
        zpcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zpc.class, zpcVar);
    }

    private zpc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", zpb.a});
        }
        if (i2 == 3) {
            return new zpc();
        }
        if (i2 == 4) {
            return new zpa();
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
        synchronized (zpc.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
