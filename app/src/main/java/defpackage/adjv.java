package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjv extends abwz implements abxa {
    public static final adjv a;
    public static final abxc b;
    private static volatile abyy c;
    private byte d = 2;

    static {
        adjv adjvVar = new adjv();
        a = adjvVar;
        adjvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjv.class, adjvVar);
        b = new abxc(adkb.a, adjvVar, adjvVar, new abxb(null, 47096292, acap.MESSAGE, false, false));
    }

    private adjv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new adjv();
        }
        if (i2 == 4) {
            return new adju();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjv.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
