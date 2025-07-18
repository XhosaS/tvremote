package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhs extends abxd implements abyr {
    public static final yhs a;
    private static volatile abyy c;
    public boolean b;
    private int d;
    private byte e = 2;

    static {
        yhs yhsVar = new yhs();
        a = yhsVar;
        yhsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yhs.class, yhsVar);
    }

    private yhs() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဇ\b", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new yhs();
        }
        if (i2 == 4) {
            return new yhr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yhs.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
