package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yoq extends abxd implements abyr {
    public static final yoq a;
    private static volatile abyy b;
    private int c;
    private yoo d;

    static {
        yoq yoqVar = new yoq();
        a = yoqVar;
        yoqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yoq.class, yoqVar);
    }

    private yoq() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0000\u0017ဉ\r", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new yoq();
        }
        if (i2 == 4) {
            return new yop();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yoq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
