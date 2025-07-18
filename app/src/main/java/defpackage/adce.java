package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adce extends abxd implements abyr {
    public static final adce a;
    private static volatile abyy b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        adce adceVar = new adce();
        a = adceVar;
        adceVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adce.class, adceVar);
    }

    private adce() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᔄ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adce();
        }
        if (i2 == 4) {
            return new adcd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adce.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
