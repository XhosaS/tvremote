package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmq extends abxd implements abyr {
    public static final abmq a;
    private static volatile abyy e;
    public int b;
    public int d;
    private byte f = 2;
    public abxs c = abzb.b;

    static {
        abmq abmqVar = new abmq();
        a = abmqVar;
        abmqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmq.class, abmqVar);
    }

    private abmq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002᠌\u0000", new Object[]{"b", "c", xpk.class, "d", xpw.a});
        }
        if (i2 == 3) {
            return new abmq();
        }
        if (i2 == 4) {
            return new abmp();
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
        synchronized (abmq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
