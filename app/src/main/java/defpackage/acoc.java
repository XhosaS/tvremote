package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoc extends abxd implements abyr {
    public static final acoc a;
    public static volatile abyy b;
    public int c;
    public abxs d = abzb.b;
    public long e;

    static {
        acoc acocVar = new acoc();
        a = acocVar;
        acocVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acoc.class, acocVar);
    }

    private acoc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"c", "d", acog.class, "e"});
        }
        if (i2 == 3) {
            return new acoc();
        }
        if (i2 == 4) {
            return new acob();
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
        synchronized (acoc.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
