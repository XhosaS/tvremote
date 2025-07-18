package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tun extends abxd implements abyr {
    public static final tun a;
    private static volatile abyy g;
    public int b;
    public abxs c = abzb.b;
    public long d;
    public int e;
    public tsm f;

    static {
        tun tunVar = new tun();
        a = tunVar;
        tunVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tun.class, tunVar);
    }

    private tun() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", tul.a, "f"});
        }
        if (i2 == 3) {
            return new tun();
        }
        if (i2 == 4) {
            return new tuk();
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
        synchronized (tun.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
