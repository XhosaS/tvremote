package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtr extends abxd implements abyr {
    public static final xtr a;
    private static volatile abyy b;
    private abyl c = abyl.a;
    private byte d = 2;

    static {
        xtr xtrVar = new xtr();
        a = xtrVar;
        xtrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xtr.class, xtrVar);
    }

    private xtr() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"c", xtq.a});
        }
        if (i2 == 3) {
            return new xtr();
        }
        if (i2 == 4) {
            return new xtp();
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
        synchronized (xtr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
