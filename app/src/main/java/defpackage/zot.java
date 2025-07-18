package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zot extends abwz implements abxa {
    public static final zot a;
    private static volatile abyy l;
    public int b;
    public int c;
    public int g;
    public acjc h;
    public int i;
    public zmh k;
    private byte m = 2;
    public int d = -1;
    public abxj e = abxe.a;
    public String f = "";
    public int j = -1;

    static {
        zot zotVar = new zot();
        a = zotVar;
        zotVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zot.class, zotVar);
    }

    private zot() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"b", "c", "d", "e", "f", "i", zor.a, "g", "h", "j", "k"});
        }
        if (i2 == 3) {
            return new zot();
        }
        if (i2 == 4) {
            return new zoq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zot.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
