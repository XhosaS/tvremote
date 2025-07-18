package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwm extends abxd implements abyr {
    public static final adwm a;
    private static volatile abyy d;
    public double b;
    public double c;

    static {
        adwm adwmVar = new adwm();
        a = adwmVar;
        adwmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adwm.class, adwmVar);
    }

    private adwm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new adwm();
        }
        if (i2 == 4) {
            return new adwl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adwm.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
