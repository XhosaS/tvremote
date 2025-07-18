package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rye extends abxd implements abyr {
    public static final rye a;
    private static volatile abyy m;
    public int b;
    public Object d;
    public int e;
    public long f;
    public long g;
    public int h;
    public sdo i;
    public int j;
    public sgo k;
    public long l;
    public int c = 0;
    private byte n = 2;

    static {
        rye ryeVar = new rye();
        a = ryeVar;
        ryeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rye.class, ryeVar);
    }

    private rye() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000e\u0001\u0001\u0001Î\u000e\u0000\u0000\u0003\u0001᠌\u0000dဂ\u0001eဂ\u0002f᠌\u0003gဉ\u0004i᠌\u0005jဉ\u0006kဂ\u0007Èм\u0000Éм\u0000Êм\u0000Ì<\u0000Í<\u0000Î<\u0000", new Object[]{"d", "c", "b", "e", ryj.a, "f", "g", "h", rxm.a, "i", "j", rvg.a, "k", "l", rvc.class, rvf.class, rzh.class, rvt.class, rws.class, swl.class});
        }
        if (i2 == 3) {
            return new rye();
        }
        if (i2 == 4) {
            return new ryd();
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
        synchronized (rye.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
