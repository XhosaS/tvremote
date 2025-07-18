package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqv extends abwz implements abxa {
    public static final adqv a;
    private static volatile abyy e;
    public int b;
    public adrf d;
    private byte f = 2;
    public abxs c = abzb.b;

    static {
        adqv adqvVar = new adqv();
        a = adqvVar;
        adqvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqv.class, adqvVar);
    }

    private adqv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001\u001a\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new adqv();
        }
        if (i2 == 4) {
            return new adqu();
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
        synchronized (adqv.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
