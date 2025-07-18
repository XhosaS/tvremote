package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqa extends abxd implements abyr {
    public static final zqa a;
    private static volatile abyy f;
    public int b;
    public zpv c;
    public int d;
    private byte g = 2;
    public abxj e = abxe.a;

    static {
        zqa zqaVar = new zqa();
        a = zqaVar;
        zqaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqa.class, zqaVar);
    }

    private zqa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zqa();
        }
        if (i2 == 4) {
            return new zpz();
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
        synchronized (zqa.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
