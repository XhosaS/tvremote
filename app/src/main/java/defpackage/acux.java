package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acux extends abxd implements abyr {
    public static final acux a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        acux acuxVar = new acux();
        a = acuxVar;
        acuxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acux.class, acuxVar);
    }

    private acux() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u083f\u0000\u00024\u0000\u0003;\u0000\u0004:\u0000\u0005=\u0000\u0006<\u0000\u0007<\u0000\b7\u0000\t>\u0000", new Object[]{"c", "b", acus.a, acuv.class, acup.class});
        }
        if (i2 == 3) {
            return new acux();
        }
        if (i2 == 4) {
            return new acuw();
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
        synchronized (acux.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
