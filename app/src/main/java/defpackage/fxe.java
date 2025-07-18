package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxe extends abxd implements abyr {
    public static final fxe a;
    private static volatile abyy r;
    public int b;
    public fvv d;
    public fvz e;
    public fwc f;
    public fwf g;
    public fwi i;
    public fwm j;
    public fwp k;
    public fwt l;
    public boolean n;
    public fwv o;
    public fwy p;
    public fxa q;
    public abxs c = abzb.b;
    public String h = "";
    public String m = "";

    static {
        fxe fxeVar = new fxe();
        a = fxeVar;
        fxeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fxe.class, fxeVar);
    }

    private fxe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0001\u0000\u0002ဉ\u0003\u0003ဉ\n\u0004ဉ\u0005\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0004\bဉ\u0000\nဉ\b\u000bȈ\f\u0007\rȈ\u000eဉ\u0006\u000fဉ\t\u0010Ț\u0011ဉ\u0007", new Object[]{"b", "g", "q", "j", "e", "f", "i", "d", "o", "m", "n", "h", "k", "p", "c", "l"});
        }
        if (i2 == 3) {
            return new fxe();
        }
        if (i2 == 4) {
            return new fxd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = r;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fxe.class) {
            abwxVar = r;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                r = abwxVar;
            }
        }
        return abwxVar;
    }
}
