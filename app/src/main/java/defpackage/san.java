package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class san extends abxd implements abyr {
    public static final san a;
    private static volatile abyy f;
    public int b;
    public sap c;
    public int d;
    public boolean e;
    private byte g = 2;

    static {
        san sanVar = new san();
        a = sanVar;
        sanVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(san.class, sanVar);
    }

    private san() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", tiw.a, "e"});
        }
        if (i2 == 3) {
            return new san();
        }
        if (i2 == 4) {
            return new sam();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (san.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
