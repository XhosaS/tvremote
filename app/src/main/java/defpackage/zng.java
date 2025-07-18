package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zng extends abxd implements abyr {
    public static final zng a;
    private static volatile abyy e;
    public int b;
    public int c;
    public String d = "";

    static {
        zng zngVar = new zng();
        a = zngVar;
        zngVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zng.class, zngVar);
    }

    private zng() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", znf.a, "d"});
        }
        if (i2 == 3) {
            return new zng();
        }
        if (i2 == 4) {
            return new zne();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zng.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
