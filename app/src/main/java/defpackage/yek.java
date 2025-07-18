package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yek extends abxd implements abyr {
    public static final yek a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        yek yekVar = new yek();
        a = yekVar;
        yekVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yek.class, yekVar);
    }

    private yek() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", yej.class, yeh.class});
        }
        if (i2 == 3) {
            return new yek();
        }
        if (i2 == 4) {
            return new yef();
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
        synchronized (yek.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
