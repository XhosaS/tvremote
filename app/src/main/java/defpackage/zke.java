package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zke extends abxd implements abyr {
    public static final zke a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        zke zkeVar = new zke();
        a = zkeVar;
        zkeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zke.class, zkeVar);
    }

    private zke() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new zke();
        }
        if (i2 == 4) {
            return new zkd();
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
        synchronized (zke.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
