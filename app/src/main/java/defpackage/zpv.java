package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpv extends abxd implements abyr {
    public static final zpv a;
    private static volatile abyy g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public abxs f = abzb.b;

    static {
        zpv zpvVar = new zpv();
        a = zpvVar;
        zpvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zpv.class, zpvVar);
    }

    private zpv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", zpu.class});
        }
        if (i2 == 3) {
            return new zpv();
        }
        if (i2 == 4) {
            return new zps();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zpv.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
