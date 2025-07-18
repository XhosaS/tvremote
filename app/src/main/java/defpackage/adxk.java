package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxk extends abxd implements abyr {
    public static final adxk a;
    private static volatile abyy h;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public xjp f;
    public String g;

    static {
        adxk adxkVar = new adxk();
        a = adxkVar;
        adxkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxk.class, adxkVar);
    }

    private adxk() {
        Object[] objArr = abzb.a;
        this.g = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0004ဈ\u0003\tဉ\u0006\nဈ\u0007", new Object[]{"b", "c", adxi.a, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new adxk();
        }
        if (i2 == 4) {
            return new adxh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxk.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
