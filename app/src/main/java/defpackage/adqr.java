package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqr extends abwz implements abxa {
    public static final adqr a;
    private static volatile abyy c;
    private int d;
    private adrf e;
    private byte f = 2;
    public abxs b = abzb.b;

    static {
        adqr adqrVar = new adqr();
        a = adqrVar;
        adqrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqr.class, adqrVar);
    }

    private adqr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"d", "b", "e"});
        }
        if (i2 == 3) {
            return new adqr();
        }
        if (i2 == 4) {
            return new adqq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adqr.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
