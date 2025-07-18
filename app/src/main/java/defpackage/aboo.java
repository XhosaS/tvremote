package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboo extends abxd implements abyr {
    public static final aboo a;
    public static final abxc b;
    private static volatile abyy d;
    public String c = "";
    private int e;

    static {
        aboo abooVar = new aboo();
        a = abooVar;
        abooVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aboo.class, abooVar);
        b = new abxc(aboi.a, abooVar, abooVar, new abxb(null, 83487759, acap.MESSAGE, false, false));
    }

    private aboo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new aboo();
        }
        if (i2 == 4) {
            return new abon();
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
        synchronized (aboo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
