package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pia extends abxd implements abyr {
    public static final pia a;
    public static volatile abyy b;
    public int c;
    public phw d;
    public String e = "";
    public String f = "";
    public int g;
    public abuy h;
    public abuy i;
    public int j;
    public long k;
    public long l;
    public pim m;
    public boolean n;
    public abxs o;
    public int p;
    public abxs q;
    public int r;
    public long s;
    public String t;
    public ahwr u;
    public String v;

    static {
        pia piaVar = new pia();
        a = piaVar;
        piaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pia.class, piaVar);
    }

    private pia() {
        abzb abzbVar = abzb.b;
        this.o = abzbVar;
        this.q = abzbVar;
        this.t = "";
        this.v = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0013\u0000\u0001\u0001年皤\u0013\u0000\u0002\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0017ဂ\u000f\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"c", "e", "o", phu.class, "k", "f", "g", "l", "j", phx.a, "m", "n", "p", "q", pio.class, "r", qfo.a, "s", "t", "h", "u", "i", "v", "d"});
        }
        if (i2 == 3) {
            return new pia();
        }
        if (i2 == 4) {
            return new phz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pia.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
