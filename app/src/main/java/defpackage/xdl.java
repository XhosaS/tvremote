package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdl extends abxd implements abyr {
    public static final xdl a;
    private static volatile abyy o;
    public int b;
    public int c;
    public int d;
    public xkq g;
    public xky h;
    public int i;
    public boolean j;
    public int k;
    public xdo l;
    public xdh m;
    public int n;
    private byte p = 2;
    public String e = "";
    public String f = "";

    static {
        xdl xdlVar = new xdl();
        a = xdlVar;
        xdlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xdl.class, xdlVar);
    }

    private xdl() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0003\u0001]\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဉ\u0004\u0007ဉ\b\u000eဇ\f\u0010᠌\u0011\u0015ဉ\u001c\u001cဉ#8င\n]᠌W", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", xdk.a, "l", "m", "i", "n", xdj.a});
        }
        if (i2 == 3) {
            return new xdl();
        }
        if (i2 == 4) {
            return new xdi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = o;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xdl.class) {
            abwxVar = o;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                o = abwxVar;
            }
        }
        return abwxVar;
    }
}
