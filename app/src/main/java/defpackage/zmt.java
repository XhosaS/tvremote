package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmt extends abxd implements abyr {
    public static final zmt a;
    private static volatile abyy f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        zmt zmtVar = new zmt();
        a = zmtVar;
        zmtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zmt.class, zmtVar);
    }

    private zmt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new Object[]{"c", "b", "e", "d", zpp.class, zpk.class, zpn.class});
        }
        if (i2 == 3) {
            return new zmt();
        }
        if (i2 == 4) {
            return new zms();
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
        synchronized (zmt.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
