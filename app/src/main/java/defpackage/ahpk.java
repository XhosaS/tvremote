package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpk extends abxd implements abyr {
    public static final ahpk a;
    private static volatile abyy f;
    public int b;
    public ahpm d;
    public int e;
    private byte g = 2;
    public abxs c = abzb.b;

    static {
        ahpk ahpkVar = new ahpk();
        a = ahpkVar;
        ahpkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahpk.class, ahpkVar);
    }

    private ahpk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", ahpi.class, "d", "e"});
        }
        if (i2 == 3) {
            return new ahpk();
        }
        if (i2 == 4) {
            return new ahpj();
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
        synchronized (ahpk.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
