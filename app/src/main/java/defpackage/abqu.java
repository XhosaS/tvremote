package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqu extends abxd implements abyr {
    public static final abqu a;
    private static volatile abyy b;
    private int c;
    private abra d;
    private byte e = 2;

    static {
        abqu abquVar = new abqu();
        a = abquVar;
        abquVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqu.class, abquVar);
    }

    private abqu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new abqu();
        }
        if (i2 == 4) {
            return new abqt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abqu.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
