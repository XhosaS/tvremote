package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtx extends abxd implements abyr {
    public static final abtx a;
    private static volatile abyy d;
    public int b;
    public abub c;
    private byte e = 2;

    static {
        abtx abtxVar = new abtx();
        a = abtxVar;
        abtxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abtx.class, abtxVar);
    }

    private abtx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abtx();
        }
        if (i2 == 4) {
            return new abtw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abtx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
