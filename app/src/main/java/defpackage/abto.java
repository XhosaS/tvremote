package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abto extends abxd implements abyr {
    public static final abto a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        abto abtoVar = new abto();
        a = abtoVar;
        abtoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abto.class, abtoVar);
    }

    private abto() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abto();
        }
        if (i2 == 4) {
            return new abtn();
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
        synchronized (abto.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
