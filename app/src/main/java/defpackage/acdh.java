package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdh extends abxd implements abyr {
    public static final abxk a = new acdf();
    public static final acdh b;
    private static volatile abyy z;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public aced g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public accy n;
    public boolean o;
    public boolean p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean q = true;
    public abxj u = abxe.a;

    static {
        acdh acdhVar = new acdh();
        b = acdhVar;
        acdhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdh.class, acdhVar);
    }

    private acdh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0001\u0016\u0000\u0001\u0002\u001d\u0016\u0000\u0001\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\bဇ\u0007\tဇ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017ဇ\u0016\u0019ࠬ\u001aဇ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", acgc.a, "v", "w", "x", "y"});
        }
        if (i2 == 3) {
            return new acdh();
        }
        if (i2 == 4) {
            return new acdg();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = z;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acdh.class) {
            abwxVar = z;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                z = abwxVar;
            }
        }
        return abwxVar;
    }
}
