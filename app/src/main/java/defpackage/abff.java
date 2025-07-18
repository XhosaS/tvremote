package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abff extends abxd implements abyr {
    public static final abff a;
    private static volatile abyy d;
    public boolean b;
    public boolean c;

    static {
        abff abffVar = new abff();
        a = abffVar;
        abffVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abff.class, abffVar);
    }

    private abff() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abff();
        }
        if (i2 == 4) {
            return new abfe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abff.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
