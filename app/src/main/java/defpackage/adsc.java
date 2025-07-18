package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsc extends abwz implements abxa {
    public static final adsc a;
    private static volatile abyy b;
    private int c;
    private adrt d;
    private byte e = 2;

    static {
        adsc adscVar = new adsc();
        a = adscVar;
        adscVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adsc.class, adscVar);
    }

    private adsc() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adsc();
        }
        if (i2 == 4) {
            return new adsb();
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
        synchronized (adsc.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
