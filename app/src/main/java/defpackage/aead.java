package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aead extends abxd implements abyr {
    public static final aead a;
    private static volatile abyy f;
    public int b = 1;
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        aead aeadVar = new aead();
        a = aeadVar;
        aeadVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aead.class, aeadVar);
    }

    private aead() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0007ဈ\u0007\bဈ\b", new Object[]{"g", "b", aeab.a, "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aead();
        }
        if (i2 == 4) {
            return new aeaa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aead.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
