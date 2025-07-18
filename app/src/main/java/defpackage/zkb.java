package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkb extends abxd implements abyr {
    public static final zkb a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        zkb zkbVar = new zkb();
        a = zkbVar;
        zkbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zkb.class, zkbVar);
    }

    private zkb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new zkb();
        }
        if (i2 == 4) {
            return new zka();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zkb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
