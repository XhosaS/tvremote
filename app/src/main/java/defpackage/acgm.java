package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgm extends abxd implements abyr {
    public static final acgm a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public acgk d;

    static {
        acgm acgmVar = new acgm();
        a = acgmVar;
        acgmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgm.class, acgmVar);
        b = new abxc(achk.a, acgmVar, acgmVar, new abxb(null, 402926957, acap.MESSAGE, false, false));
    }

    private acgm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acgm();
        }
        if (i2 == 4) {
            return new acgl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acgm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
