package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adey extends abxd implements abyr {
    public static final adey a;
    private static volatile abyy i;
    public int b;
    public boolean d;
    public boolean e;
    public acvi f;
    public acvk h;
    public float c = 4.0f;
    public boolean g = true;

    static {
        adey adeyVar = new adey();
        a = adeyVar;
        adeyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adey.class, adeyVar);
    }

    private adey() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0005\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
        }
        if (i3 == 3) {
            return new adey();
        }
        if (i3 == 4) {
            return new adex();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adey.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
