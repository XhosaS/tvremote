package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfu extends abxd implements abyr {
    public static final acfu a;
    private static volatile abyy h;
    public int b;
    public int c;
    public abxs f;
    public abxs g;
    private byte i = 2;
    public String d = "";
    public String e = "";

    static {
        acfu acfuVar = new acfu();
        a = acfuVar;
        acfuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfu.class, acfuVar);
    }

    private acfu() {
        abzb abzbVar = abzb.b;
        this.f = abzbVar;
        this.g = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", acgc.a, "d", "e", "f", acgi.class, "g", acgi.class});
        }
        if (i2 == 3) {
            return new acfu();
        }
        if (i2 == 4) {
            return new acft();
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
        synchronized (acfu.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
