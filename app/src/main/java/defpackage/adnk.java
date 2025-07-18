package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnk extends abxd implements abyr {
    public static final adnk a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public int d;
    public boolean e = true;

    static {
        adnk adnkVar = new adnk();
        a = adnkVar;
        adnkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adnk.class, adnkVar);
        b = new abxc(adnx.a, adnkVar, adnkVar, new abxb(null, 462237659, acap.MESSAGE, false, false));
    }

    private adnk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"c", "d", adni.a, "e"});
        }
        if (i2 == 3) {
            return new adnk();
        }
        if (i2 == 4) {
            return new adnh();
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
        synchronized (adnk.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
