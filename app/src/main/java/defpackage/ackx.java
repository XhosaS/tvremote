package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackx extends abxd implements abyr {
    public static final ackx a;
    private static volatile abyy b;
    private int c;
    private acnh d;
    private byte e = 2;

    static {
        ackx ackxVar = new ackx();
        a = ackxVar;
        ackxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ackx.class, ackxVar);
    }

    private ackx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new ackx();
        }
        if (i2 == 4) {
            return new ackw();
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
        synchronized (ackx.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
