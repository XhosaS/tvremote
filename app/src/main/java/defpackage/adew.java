package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adew extends abxd implements abyr {
    public static final adew a;
    public static final abxc b;
    private static volatile abyy d;
    public boolean c = true;
    private int e;

    static {
        adew adewVar = new adew();
        a = adewVar;
        adewVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adew.class, adewVar);
        b = new abxc(aczf.a, adewVar, adewVar, new abxb(null, 326709173, acap.MESSAGE, false, false));
    }

    private adew() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new adew();
        }
        if (i2 == 4) {
            return new adev();
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
        synchronized (adew.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
