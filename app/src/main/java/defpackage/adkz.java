package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkz extends abxd implements abyr {
    public static final adkz a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public boolean d = true;
    public String e = "";
    public boolean f;

    static {
        adkz adkzVar = new adkz();
        a = adkzVar;
        adkzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkz.class, adkzVar);
        b = new abxc(adkb.a, adkzVar, adkzVar, new abxb(null, 144480581, acap.MESSAGE, false, false));
    }

    private adkz() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0003\f\u0003\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဈ\u0003\fဇ\u0005", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new adkz();
        }
        if (i2 == 4) {
            return new adky();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
