package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhr extends abxd implements abyr {
    public static final abhr a;
    private static volatile abyy b;
    private abyl c = abyl.a;
    private byte d = 2;

    static {
        abhr abhrVar = new abhr();
        a = abhrVar;
        abhrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abhr.class, abhrVar);
    }

    private abhr() {
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
            return new abzc(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", abhq.a});
        }
        if (i2 == 3) {
            return new abhr();
        }
        if (i2 == 4) {
            return new abhp();
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
        synchronized (abhr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
