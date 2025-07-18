package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwf extends abxd implements abyr {
    public static final ahwf a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public ahwd e;
    public int c = 0;
    private byte g = 2;

    static {
        ahwf ahwfVar = new ahwf();
        a = ahwfVar;
        ahwfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwf.class, ahwfVar);
    }

    private ahwf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", ahtq.class, "e", ahwl.class});
        }
        if (i2 == 3) {
            return new ahwf();
        }
        if (i2 == 4) {
            return new ahwe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahwf.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
