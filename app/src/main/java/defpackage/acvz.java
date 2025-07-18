package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvz extends abxd implements abyr {
    public static final acvz a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        acvz acvzVar = new acvz();
        a = acvzVar;
        acvzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvz.class, acvzVar);
    }

    private acvz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acvz();
        }
        if (i2 == 4) {
            return new acvy();
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
        synchronized (acvz.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
