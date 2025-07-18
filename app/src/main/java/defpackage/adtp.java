package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtp extends abxd implements abyr {
    public static final adtp a;
    private static volatile abyy b;

    static {
        adtp adtpVar = new adtp();
        a = adtpVar;
        adtpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtp.class, adtpVar);
    }

    private adtp() {
        float[] fArr = abwt.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new adtp();
        }
        if (i2 == 4) {
            return new adto();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adtp.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
