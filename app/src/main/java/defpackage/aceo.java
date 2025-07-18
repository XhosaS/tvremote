package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceo extends abxd implements abyr {
    public static final aceo a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;

    static {
        aceo aceoVar = new aceo();
        a = aceoVar;
        aceoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aceo.class, aceoVar);
    }

    private aceo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001c", new Object[]{"b", "c", acen.a, "d"});
        }
        if (i2 == 3) {
            return new aceo();
        }
        if (i2 == 4) {
            return new acem();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aceo.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
