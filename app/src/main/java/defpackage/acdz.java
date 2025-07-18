package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdz extends abxd implements abyr {
    public static final acdz a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public abxs d = abzb.b;
    public String e = "";
    public String f = "";

    static {
        acdz acdzVar = new acdz();
        a = acdzVar;
        acdzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdz.class, acdzVar);
    }

    private acdz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", aceo.class, "e", "f"});
        }
        if (i2 == 3) {
            return new acdz();
        }
        if (i2 == 4) {
            return new acdy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acdz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
