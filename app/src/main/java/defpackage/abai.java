package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abai extends abxd implements abyr {
    public static final abai a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private aazw e;
    private byte f = 2;

    static {
        abai abaiVar = new abai();
        a = abaiVar;
        abaiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abai.class, abaiVar);
    }

    private abai() {
        Object[] objArr = abzb.a;
        float[] fArr = abwt.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0003", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new abai();
        }
        if (i2 == 4) {
            return new abah();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abai.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
