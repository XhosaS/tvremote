package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piy extends abxd implements abyr {
    public static final piy a;
    public static volatile abyy b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        piy piyVar = new piy();
        a = piyVar;
        piyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(piy.class, piyVar);
    }

    private piy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002", new Object[]{"c", "d", "e", "g", "f"});
        }
        if (i2 == 3) {
            return new piy();
        }
        if (i2 == 4) {
            return new pix();
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
        synchronized (piy.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
