package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjl extends abxd implements abyr {
    public static final acjl a;
    public static final abxc b;
    private static volatile abyy h;
    public int c;
    public int d;
    public int f;
    public acji g;
    private byte i = 2;
    public String e = "";

    static {
        acjl acjlVar = new acjl();
        a = acjlVar;
        acjlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acjl.class, acjlVar);
        b = new abxc(ahqu.a, acjlVar, acjlVar, new abxb(null, 486185550, acap.MESSAGE, false, false));
    }

    private acjl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001᠌\u0000\u0004ဈ\u0001\u0005င\u0002\u0006ᐉ\u0003", new Object[]{"c", "d", acsv.a, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acjl();
        }
        if (i2 == 4) {
            return new acjk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acjl.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
