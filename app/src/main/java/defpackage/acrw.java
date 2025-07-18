package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acrw extends abwz implements abxa {
    public static final acrw a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int d;
    public acvw e;
    public int f;
    private byte h = 2;

    static {
        acrw acrwVar = new acrw();
        a = acrwVar;
        acrwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acrw.class, acrwVar);
    }

    private acrw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0003ᐉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", acrt.a});
        }
        if (i2 == 3) {
            return new acrw();
        }
        if (i2 == 4) {
            return new acrv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acrw.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
