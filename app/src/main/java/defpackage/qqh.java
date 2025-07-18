package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqh extends abxd implements abyr {
    public static final qqh a;
    private static volatile abyy g;
    public int b;
    public long c;
    public abzy d;
    public byte f = 2;
    public abxs e = abzb.b;

    static {
        qqh qqhVar = new qqh();
        a = qqhVar;
        qqhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qqh.class, qqhVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", qpy.class});
        }
        if (i2 == 3) {
            return new qqh();
        }
        if (i2 == 4) {
            return new qpw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (qqh.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
