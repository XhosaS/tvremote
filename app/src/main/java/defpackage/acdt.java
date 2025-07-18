package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdt extends abxd implements abyr {
    public static final acdt a;
    private static volatile abyy l;
    public int b;
    public Object d;
    public int e;
    public acds f;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int c = 0;
    public String g = "";

    static {
        acdt acdtVar = new acdt();
        a = acdtVar;
        acdtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdt.class, acdtVar);
    }

    private acdt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001;\u0000\u0003င\u0000\u0004ဉ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\t;\u0000\n᠌\u0006", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", acdp.a});
        }
        if (i2 == 3) {
            return new acdt();
        }
        if (i2 == 4) {
            return new acdo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acdt.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
