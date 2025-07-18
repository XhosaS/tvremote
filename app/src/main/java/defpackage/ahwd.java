package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwd extends abxd implements abyr {
    public static final ahwd a;
    private static volatile abyy b;
    private byte c = 2;

    static {
        ahwd ahwdVar = new ahwd();
        a = ahwdVar;
        ahwdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwd.class, ahwdVar);
    }

    private ahwd() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ahwd();
        }
        if (i2 == 4) {
            return new ahwc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahwd.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
