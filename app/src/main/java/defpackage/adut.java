package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adut extends abxd implements abyr {
    public static final adut a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adut adutVar = new adut();
        a = adutVar;
        adutVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adut.class, adutVar);
    }

    private adut() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0001\u0000\u0002\f\u000b\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"c", "b", aduj.class, aduf.class, adul.class, aduh.class, adub.class, adur.class, adud.class, adtx.class, adup.class, advb.class, adun.class});
        }
        if (i2 == 3) {
            return new adut();
        }
        if (i2 == 4) {
            return new adus();
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
        synchronized (adut.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
