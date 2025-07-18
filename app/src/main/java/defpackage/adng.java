package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adng extends abxd implements abyr {
    public static final adng a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public boolean d;
    public boolean e;

    static {
        adng adngVar = new adng();
        a = adngVar;
        adngVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adng.class, adngVar);
        b = new abxc(ador.a, adngVar, adngVar, new abxb(null, 310837649, acap.MESSAGE, false, false));
    }

    private adng() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\tဇ\b\nဇ\t", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new adng();
        }
        if (i2 == 4) {
            return new adnf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adng.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
