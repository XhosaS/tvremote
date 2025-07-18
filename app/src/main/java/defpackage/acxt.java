package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxt extends abwz implements abxa {
    public static final acxt a;
    public static volatile abyy b;
    public static final abxc c;
    public acxr d;
    private int e;
    private byte f = 2;

    static {
        acxt acxtVar = new acxt();
        a = acxtVar;
        acxtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acxt.class, acxtVar);
        c = new abxc(acyd.a, acxtVar, acxtVar, new abxb(null, 255496645, acap.MESSAGE, false, false));
    }

    private acxt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"e", "d"});
        }
        if (i2 == 3) {
            return new acxt();
        }
        if (i2 == 4) {
            return new acxs();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acxt.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
