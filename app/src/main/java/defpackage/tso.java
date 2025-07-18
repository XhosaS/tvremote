package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tso extends abxd implements abyr {
    public static final tso a;
    private static volatile abyy h;
    public int b;
    public abxs c;
    public abxi d;
    public abxs e;
    public String f;
    public abxs g;

    static {
        tso tsoVar = new tso();
        a = tsoVar;
        tsoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tso.class, tsoVar);
    }

    private tso() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abwt.b;
        this.e = abzbVar;
        this.f = "";
        this.g = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001a\u0002\u0013\u0003\u001b\u0004ဈ\u0000\u0005\u001b", new Object[]{"b", "c", "d", "e", adlj.class, "f", "g", tun.class});
        }
        if (i2 == 3) {
            return new tso();
        }
        if (i2 == 4) {
            return new tsn();
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
        synchronized (tso.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
