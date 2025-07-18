package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmh extends abxd implements abyr {
    public static final acmh a;
    private static volatile abyy b;
    private int c;
    private ackb d;
    private byte e = 2;

    static {
        acmh acmhVar = new acmh();
        a = acmhVar;
        acmhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acmh.class, acmhVar);
    }

    private acmh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0007", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acmh();
        }
        if (i2 == 4) {
            return new acmg();
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
        synchronized (acmh.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
