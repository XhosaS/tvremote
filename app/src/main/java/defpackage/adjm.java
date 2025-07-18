package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjm extends abwz implements abxa {
    public static final adjm a;
    private static volatile abyy f;
    public int b;
    public boolean c;
    private byte g = 2;
    public String d = "";
    public String e = "";

    static {
        adjm adjmVar = new adjm();
        a = adjmVar;
        adjmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjm.class, adjmVar);
    }

    private adjm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0007ဇ\u0001", new Object[]{"b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new adjm();
        }
        if (i2 == 4) {
            return new adjl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjm.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
