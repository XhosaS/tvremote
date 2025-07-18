package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voi extends abxd implements abyr {
    public static final voi a;
    private static volatile abyy e;
    public int b;
    public abyl d = abyl.a;
    private byte f = 2;
    public int c = 1;

    static {
        voi voiVar = new voi();
        a = voiVar;
        voiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(voi.class, voiVar);
    }

    private voi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", vog.a});
        }
        if (i2 == 3) {
            return new voi();
        }
        if (i2 == 4) {
            return new voh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (voi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
