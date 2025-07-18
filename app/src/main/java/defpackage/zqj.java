package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqj extends abxd implements abyr {
    public static final zqj a;
    private static volatile abyy x;
    public int b;
    public int c;
    public int d;
    public zqf e;
    public long f;
    public zrv g;
    public zqv h;
    public zqh i;
    public zrh j;
    public zqt k;
    public zrd l;
    public zqd m;
    public zrt n;
    public zqz o;
    public zqr p;
    public zql q;
    public zqp r;
    public zqx s;
    public zrp t;
    public zrf u;
    public zrj v;
    public zqn w;

    static {
        zqj zqjVar = new zqj();
        a = zqjVar;
        zqjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqj.class, zqjVar);
    }

    private zqj() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0013\u0000\u0003\nQ\u0013\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001f(ဉ'.ဉ-0ဉ/1ဉ03ဉ34ဉ46ဉ6?ဉ?BဉBCဉCGဉHHဉ\u0014KဉIMဉKPဉNQဉO", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "g", "t", "u", "v", "w"});
        }
        if (i2 == 3) {
            return new zqj();
        }
        if (i2 == 4) {
            return new zqi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = x;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zqj.class) {
            abwxVar = x;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                x = abwxVar;
            }
        }
        return abwxVar;
    }
}
