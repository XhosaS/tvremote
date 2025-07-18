package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlr extends abxd implements abyr {
    public static final zlr a;
    private static volatile abyy b;
    private int c;
    private zpk d;
    private byte e = 2;

    static {
        zlr zlrVar = new zlr();
        a = zlrVar;
        zlrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zlr.class, zlrVar);
    }

    private zlr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new zlr();
        }
        if (i2 == 4) {
            return new zlq();
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
        synchronized (zlr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
