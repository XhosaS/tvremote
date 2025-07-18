package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruo extends abwz implements rup {
    public static final ruo a;
    private static volatile abyy m;
    public int b;
    public int g;
    public ruh h;
    public long i;
    public run j;
    public rul k;
    public boolean l;
    private byte o = 2;
    public int c = 6;
    public int d = 16000;
    public int e = 1;
    public int f = 2;

    static {
        ruo ruoVar = new ruo();
        a = ruoVar;
        ruoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ruo.class, ruoVar);
    }

    private ruo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0001\u0001i\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0006ဋ\u0004\u0007ဃ\u0007\bဉ\u0005\fဉ\b\u000fဉ\tiဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new ruo();
        }
        if (i2 == 4) {
            return new rui();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ruo.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
