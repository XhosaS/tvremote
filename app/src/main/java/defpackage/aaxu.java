package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxu extends abxd implements abyr {
    public static final aaxu a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        aaxu aaxuVar = new aaxu();
        a = aaxuVar;
        aaxuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aaxu.class, aaxuVar);
    }

    private aaxu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaxu();
        }
        if (i2 == 4) {
            return new aaxt();
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
        synchronized (aaxu.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
