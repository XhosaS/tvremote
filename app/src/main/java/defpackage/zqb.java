package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqb extends abxd implements abyr {
    public static final zqb a;
    private static volatile abyy g;
    public int b;
    public Object d;
    public zpv e;
    public int c = 0;
    private byte h = 2;
    public abxs f = abzb.b;

    static {
        zqb zqbVar = new zqb();
        a = zqbVar;
        zqbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqb.class, zqbVar);
    }

    private zqb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", zpv.class, zpy.class});
        }
        if (i2 == 3) {
            return new zqb();
        }
        if (i2 == 4) {
            return new zpw();
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
        synchronized (zqb.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
