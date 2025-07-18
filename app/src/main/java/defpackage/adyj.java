package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyj extends abxd implements abyr {
    public static final adyj a;
    private static volatile abyy g;
    public int b;
    public adxr c;
    public adyd d;
    public adww e;
    public abxs f;
    private byte h = 2;

    static {
        adyj adyjVar = new adyj();
        a = adyjVar;
        adyjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyj.class, adyjVar);
    }

    private adyj() {
        abvo abvoVar = abvo.b;
        this.f = abzb.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0004\u0010\u0004\u0000\u0001\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u000fဉ\f\u0010Л", new Object[]{"b", "c", "d", "e", "f", adwu.class});
        }
        if (i2 == 3) {
            return new adyj();
        }
        if (i2 == 4) {
            return new adyi();
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
        synchronized (adyj.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
