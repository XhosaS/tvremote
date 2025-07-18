package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeal extends abxd implements abyr {
    public static final aeal a;
    private static volatile abyy m;
    public int b;
    public adyj c;
    public abxs d;
    public abxs e;
    public adyv f;
    public adzv g;
    public String h;
    public String i;
    public adxe j;
    public String k;
    public int l;
    private byte n = 2;

    static {
        aeal aealVar = new aeal();
        a = aealVar;
        aealVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeal.class, aealVar);
    }

    private aeal() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
        this.h = "";
        this.i = "";
        this.k = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0001\u0002\u0017\n\u0000\u0002\u0002\u0002ᐉ\u0001\u0003\u001b\u0004Л\bဉ\u0005\nဈ\u0007\u000bဈ\b\fဉ\t\u0010ဉ\u0004\u0011ဈ\r\u0017᠌\u0011", new Object[]{"b", "c", "d", adyn.class, "e", aboe.class, "g", "h", "i", "j", "f", "k", "l", adzy.a});
        }
        if (i2 == 3) {
            return new aeal();
        }
        if (i2 == 4) {
            return new aeak();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aeal.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
