package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqe extends abxd implements abyr {
    public static final qqe a;
    private static volatile abyy e;
    public abzy c;
    public int d;
    private int f;
    private byte g = 2;
    public abxs b = abzb.b;

    static {
        qqe qqeVar = new qqe();
        a = qqeVar;
        qqeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qqe.class, qqeVar);
    }

    private qqe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"f", "b", ahwf.class, "c", "d", qqc.a});
        }
        if (i2 == 3) {
            return new qqe();
        }
        if (i2 == 4) {
            return new qqb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (qqe.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
