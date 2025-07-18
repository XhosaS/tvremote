package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accy extends abxd implements abyr {
    public static final abxk a = new accu();
    public static final abxk b = new accv();
    public static final abxk c = new accw();
    public static final accy d;
    private static volatile abyy h;
    public abxj e;
    public abxj f;
    public abxj g;

    static {
        accy accyVar = new accy();
        d = accyVar;
        accyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(accy.class, accyVar);
    }

    private accy() {
        abxe abxeVar = abxe.a;
        this.e = abxeVar;
        this.f = abxeVar;
        this.g = abxeVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            abxh abxhVar = acgc.a;
            return new abzc(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001ࠬ\u0002ࠬ\u0003ࠬ", new Object[]{"e", abxhVar, "g", abxhVar, "f", abxhVar});
        }
        if (i2 == 3) {
            return new accy();
        }
        if (i2 == 4) {
            return new accx();
        }
        if (i2 == 5) {
            return d;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (accy.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(d);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
