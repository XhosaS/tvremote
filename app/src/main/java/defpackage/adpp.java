package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpp extends abwz implements abxa {
    public static final adpp a;
    private static volatile abyy d;
    public int b;
    public int c;
    private byte e = 2;

    static {
        adpp adppVar = new adpp();
        a = adppVar;
        adppVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpp.class, adppVar);
    }

    private adpp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", adpn.a});
        }
        if (i2 == 3) {
            return new adpp();
        }
        if (i2 == 4) {
            return new adpm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adpp.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
