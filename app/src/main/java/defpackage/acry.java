package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acry extends abxd implements abyr {
    public static final acry a;
    private static volatile abyy o;
    public int b;
    public float d;
    public int e;
    public int f;
    public abxs g;
    public abxs h;
    public boolean i;
    public abxs j;
    public int k;
    public abxs l;
    public acse m;
    public abxs n;
    private byte p = 2;
    public String c = "";

    static {
        acry acryVar = new acry();
        a = acryVar;
        acryVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acry.class, acryVar);
    }

    private acry() {
        abzb abzbVar = abzb.b;
        this.g = abzbVar;
        this.h = abzbVar;
        this.i = true;
        this.j = abzbVar;
        this.l = abzbVar;
        this.n = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0005\u0004\u0001ဈ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005Л\u0006Л\u0007ဇ\u0004\bЛ\t᠌\u0005\nЛ\u000bဉ\u0006\r\u001b", new Object[]{"b", "c", "d", "e", acsn.a, "f", acsh.a, "g", acsa.class, "h", acsm.class, "i", "j", acrw.class, "k", acsr.a, "l", acsc.class, "m", "n", acsk.class});
        }
        if (i2 == 3) {
            return new acry();
        }
        if (i2 == 4) {
            return new acrx();
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
        synchronized (acry.class) {
            abwxVar = o;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                o = abwxVar;
            }
        }
        return abwxVar;
    }
}
