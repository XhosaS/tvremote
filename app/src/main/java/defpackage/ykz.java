package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ykz extends abxd implements abyr {
    public static final ykz a;
    private static volatile abyy j;
    public int b;
    public String c = "";
    public abxs d;
    public abxs e;
    public String f;
    public String g;
    public boolean h;
    public abxs i;

    static {
        ykz ykzVar = new ykz();
        a = ykzVar;
        ykzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ykz.class, ykzVar);
    }

    private ykz() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
        this.f = "";
        this.g = "";
        this.i = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0003\u0000\u0001ဈ\u0000\b\u001a\f\u001a\rဈ\u0007\u000eဈ\b\u000fဇ\t\u0010\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ykz();
        }
        if (i2 == 4) {
            return new yky();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ykz.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
