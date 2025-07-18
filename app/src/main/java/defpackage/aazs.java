package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazs extends abxd implements abyr {
    public static final aazs a;
    private static volatile abyy b;
    private int c;
    private aaze d;
    private byte e = 2;

    static {
        aazs aazsVar = new aazs();
        a = aazsVar;
        aazsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aazs.class, aazsVar);
    }

    private aazs() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u0002", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new aazs();
        }
        if (i2 == 4) {
            return new aazr();
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
        synchronized (aazs.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
