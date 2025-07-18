package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrs extends abxd implements abyr {
    public static final abxk a = new ahrp();
    public static final ahrs b;
    public static final abxc c;
    public static final abxc d;
    private static volatile abyy m;
    public int e;
    public Object g;
    public int h;
    public int l;
    public int f = 0;
    public String i = "";
    public abxj j = abxe.a;
    public String k = "";

    static {
        ahrs ahrsVar = new ahrs();
        b = ahrsVar;
        ahrsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahrs.class, ahrsVar);
        c = new abxc(ahqu.a, ahrsVar, ahrsVar, new abxb(null, 15, acap.MESSAGE, false, false));
        d = new abxc(epd.a, ahrsVar, ahrsVar, new abxb(null, 485188144, acap.MESSAGE, false, false));
    }

    private ahrs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ࠬ\u0004ဈ\u0002\u0005᠌\u0003\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"g", "f", "e", "h", "i", "j", ybu.a, "k", "l", ahrr.a, ahrg.class, ahru.class, ahrc.class, ahri.class, ahre.class, ahrk.class, ahro.class, ahrw.class});
        }
        if (i2 == 3) {
            return new ahrs();
        }
        if (i2 == 4) {
            return new ahrq();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahrs.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
