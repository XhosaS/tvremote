package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achk extends abwz implements abxa {
    public static final achk a;
    private static volatile abyy e;
    public int b;
    public int c;
    private xfp f;
    private byte g = 2;
    public int d = 1;

    static {
        achk achkVar = new achk();
        a = achkVar;
        achkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(achk.class, achkVar);
    }

    private achk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004᠌\u0004\u0007᠌\u0005", new Object[]{"b", "f", "c", achl.a, "d", achn.a});
        }
        if (i2 == 3) {
            return new achk();
        }
        if (i2 == 4) {
            return new achj();
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
        synchronized (achk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
