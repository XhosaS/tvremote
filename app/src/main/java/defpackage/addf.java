package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addf extends abxd implements abyr {
    public static final addf a;
    public static final abxc b;
    private static volatile abyy d;
    public zpk c;
    private int e;
    private byte f = 2;

    static {
        addf addfVar = new addf();
        a = addfVar;
        addfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addf.class, addfVar);
        b = new abxc(addd.a, addfVar, addfVar, new abxb(null, 350545586, acap.MESSAGE, false, false));
    }

    private addf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new addf();
        }
        if (i2 == 4) {
            return new adde();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (addf.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
