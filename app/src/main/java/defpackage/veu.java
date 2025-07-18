package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class veu extends abxd implements abyr {
    public static final veu a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        veu veuVar = new veu();
        a = veuVar;
        veuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(veu.class, veuVar);
    }

    private veu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new veu();
        }
        if (i2 == 4) {
            return new vet();
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
        synchronized (veu.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
