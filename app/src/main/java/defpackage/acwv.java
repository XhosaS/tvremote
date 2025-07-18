package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwv extends abxd implements abyr {
    public static final acwv a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        acwv acwvVar = new acwv();
        a = acwvVar;
        acwvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwv.class, acwvVar);
        b = new abxc(acsq.a, acwvVar, acwvVar, new abxb(null, 389740320, acap.MESSAGE, false, false));
    }

    private acwv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acwv();
        }
        if (i2 == 4) {
            return new acwu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acwv.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
