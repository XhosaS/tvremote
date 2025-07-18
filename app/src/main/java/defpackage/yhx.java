package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhx extends abwz implements abxa {
    public static final yhx a;
    private static volatile abyy b;
    private abyl c = abyl.a;
    private byte d = 2;

    static {
        yhx yhxVar = new yhx();
        a = yhxVar;
        yhxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yhx.class, yhxVar);
    }

    private yhx() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"c", yhw.a});
        }
        if (i2 == 3) {
            return new yhx();
        }
        if (i2 == 4) {
            return new yhv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yhx.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
