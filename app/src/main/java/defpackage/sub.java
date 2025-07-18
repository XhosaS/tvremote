package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sub extends abxd implements abyr {
    public static final sub a;
    private static volatile abyy h;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public String f = "";
    public int g = -1;

    static {
        sub subVar = new sub();
        a = subVar;
        subVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(sub.class, subVar);
    }

    private sub() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004ဈ\u0001\u0005င\u0002", new Object[]{"d", "c", "b", "e", stc.a, rxj.class, rxd.class, "f", "g"});
        }
        if (i2 == 3) {
            return new sub();
        }
        if (i2 == 4) {
            return new sua();
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
        synchronized (sub.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
