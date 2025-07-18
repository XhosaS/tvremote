package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkf extends abwz implements abxa {
    public static final adkf a;
    private static volatile abyy e;
    public int b;
    public int c;
    private int f;
    private byte g = 2;
    public String d = "";

    static {
        adkf adkfVar = new adkf();
        a = adkfVar;
        adkfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkf.class, adkfVar);
    }

    private adkf() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "b", adkd.a, "c", "d"});
        }
        if (i2 == 3) {
            return new adkf();
        }
        if (i2 == 4) {
            return new adkc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
