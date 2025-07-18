package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdd extends abxd implements abyr {
    public static final acdd a;
    private static volatile abyy d;
    public abxm b = abyf.a;
    public abxs c = abzb.b;

    static {
        acdd acddVar = new acdd();
        a = acddVar;
        acddVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdd.class, acddVar);
    }

    private acdd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acdd();
        }
        if (i2 == 4) {
            return new acdc();
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
        synchronized (acdd.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
