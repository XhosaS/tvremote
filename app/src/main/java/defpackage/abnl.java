package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnl extends abxd implements abyr {
    public static final abnl a;
    private static volatile abyy g;
    public int b;
    public Object d;
    public abnk f;
    public int c = 0;
    private byte h = 2;
    public String e = "";

    static {
        abnl abnlVar = new abnl();
        a = abnlVar;
        abnlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abnl.class, abnlVar);
    }

    private abnl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0001\u0001\u0001\n\t\u0000\u0000\u0004\u0001м\u0000\u0002;\u0000\u0003<\u0000\u0004м\u0000\u0005;\u0000\u0006м\u0000\u0007ဈ\u0000\tဉ\u0002\nм\u0000", new Object[]{"d", "c", "b", ackd.class, abne.class, abqj.class, ackp.class, "e", "f", ablp.class});
        }
        if (i2 == 3) {
            return new abnl();
        }
        if (i2 == 4) {
            return new abnh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abnl.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
