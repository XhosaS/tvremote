package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkw extends abxd implements abyr {
    public static final lkw a;
    private static volatile abyy h;
    public int b;
    public abxs c = abzb.b;
    public String d = "";
    public long e;
    public long f;
    public int g;

    static {
        lkw lkwVar = new lkw();
        a = lkwVar;
        lkwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lkw.class, lkwVar);
    }

    private lkw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"b", "c", lla.class, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new lkw();
        }
        if (i2 == 4) {
            return new lkv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lkw.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
