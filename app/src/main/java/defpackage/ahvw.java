package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvw extends abxd implements abyr {
    public static final ahvw a;
    private static volatile abyy y;
    public int b;
    public long c;
    public ahsf f;
    public ahvy g;
    public ahsq h;
    public ahuv i;
    public ahvn j;
    public ahps k;
    public ahvh l;
    public ahte m;
    public ahpk n;
    public ahqm o;
    public ahug p;
    public abxs q;
    public ahvb r;
    public abxs s;
    public ahum t;
    public ahvu u;
    public ahvd v;
    public ahqu w;
    public ahuj x;
    private ahuo z;
    private byte A = 2;
    public String d = "";
    public String e = "";

    static {
        ahvw ahvwVar = new ahvw();
        a = ahvwVar;
        ahvwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvw.class, ahvwVar);
    }

    private ahvw() {
        abxe abxeVar = abxe.a;
        abzb abzbVar = abzb.b;
        this.q = abzbVar;
        this.s = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.A);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0017\u0000\u0001\u0001'\u0017\u0000\u0002\n\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011%Л&\u001b'ဉ\u0014", new Object[]{"b", "f", "c", "d", "g", "t", "h", "i", "u", "j", "k", "l", "w", "m", "e", "x", "v", "z", "p", "r", "n", "q", ahwf.class, "s", ahvj.class, "o"});
        }
        if (i2 == 3) {
            return new ahvw();
        }
        if (i2 == 4) {
            return new ahvv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.A = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = y;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvw.class) {
            abwxVar = y;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                y = abwxVar;
            }
        }
        return abwxVar;
    }
}
