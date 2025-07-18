package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advh extends abwz implements abxa {
    public static final advh a;
    public static final abxc b;
    private static volatile abyy e;
    public Object d;
    public int c = 0;
    private byte f = 2;

    static {
        advh advhVar = new advh();
        a = advhVar;
        advhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(advh.class, advhVar);
        b = new abxc(adkf.a, advhVar, advhVar, new abxb(null, 1253625, acap.MESSAGE, false, false));
    }

    private advh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0010\u0001\u0000\u0001\u0014\u0010\u0000\u0000\u0003\u0001м\u0000\u0002<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000bм\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0010м\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"d", "c", adik.class, adhr.class, adhj.class, adhn.class, adib.class, advf.class, adhl.class, advd.class, acie.class, adiv.class, advn.class, adhv.class, acic.class, adid.class, adiq.class, advl.class});
        }
        if (i2 == 3) {
            return new advh();
        }
        if (i2 == 4) {
            return new advg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (advh.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
