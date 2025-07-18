package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuy extends abxd implements abyr {
    public static final ahuy a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int d;
    public abxj e;
    public abxj f;

    static {
        ahuy ahuyVar = new ahuy();
        a = ahuyVar;
        ahuyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahuy.class, ahuyVar);
    }

    private ahuy() {
        abxe abxeVar = abxe.a;
        this.e = abxeVar;
        this.f = abxeVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ahuy();
        }
        if (i2 == 4) {
            return new ahux();
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
        synchronized (ahuy.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
