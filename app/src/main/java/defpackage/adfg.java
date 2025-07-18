package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfg extends abxd implements abyr {
    public static final adfg a;
    public static final abxc b;
    private static volatile abyy j;
    public int c;
    public adfi d;
    public adfi e;
    public adfi f;
    public String g = "";
    public String h = "";
    public adfe i;

    static {
        adfg adfgVar = new adfg();
        a = adfgVar;
        adfgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfg.class, adfgVar);
        b = new abxc(aczf.a, adfgVar, adfgVar, new abxb(null, 452346931, acap.MESSAGE, false, false));
    }

    private adfg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new adfg();
        }
        if (i2 == 4) {
            return new adff();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adfg.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
