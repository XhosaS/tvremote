package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxd extends abxd implements abyr {
    public static final acxd a;
    private static volatile abyy g;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int c = 0;
    private byte h = 2;

    static {
        acxd acxdVar = new acxd();
        a = acxdVar;
        acxdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acxd.class, acxdVar);
    }

    private acxd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001;\u0000\u0002=\u0000\u0003<\u0000\u0004ဋ\u0000\u0005ဋ\u0001\u0006м\u0000", new Object[]{"d", "c", "b", acwx.class, "e", "f", acwz.class});
        }
        if (i2 == 3) {
            return new acxd();
        }
        if (i2 == 4) {
            return new acxc();
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
        synchronized (acxd.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
