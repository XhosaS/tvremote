package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adik extends abwz implements abxa {
    public static final adik a;
    private static volatile abyy f;
    public int b;
    public int c;
    public adio d;
    public adhz e;
    private adio g;
    private adio h;
    private adih i;
    private byte j = 2;

    static {
        adik adikVar = new adik();
        a = adikVar;
        adikVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adik.class, adikVar);
    }

    private adik() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0004\u0001᠌\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\nဉ\n", new Object[]{"b", "c", adii.a, "d", "e", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new adik();
        }
        if (i2 == 4) {
            return new adie();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adik.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
