package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgx extends abxd implements abyr {
    public static final sgx a;
    private static volatile abyy b;

    static {
        sgx sgxVar = new sgx();
        a = sgxVar;
        sgxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(sgx.class, sgxVar);
    }

    private sgx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new sgx();
        }
        if (i2 == 4) {
            return new sgw();
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
        synchronized (sgx.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
