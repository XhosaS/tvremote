package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpr extends abwz implements abxa {
    public static final adpr a;
    private static volatile abyy g;
    public int b;
    public abxs c;
    public abxs d;
    public adrf e;
    public adrj f;
    private adpz h;
    private byte i = 2;

    static {
        adpr adprVar = new adpr();
        a = adprVar;
        adprVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpr.class, adprVar);
    }

    private adpr() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0002\u0001\u0001\u001a\u0004ဉ\u0005\u0007ဉ\u0007\nЛ\rဉ\u0004", new Object[]{"b", "c", "e", "f", "d", adqb.class, "h"});
        }
        if (i2 == 3) {
            return new adpr();
        }
        if (i2 == 4) {
            return new adpq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adpr.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
