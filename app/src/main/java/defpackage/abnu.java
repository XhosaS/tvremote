package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnu extends abwz implements abxa {
    public static final abnu a;
    private static volatile abyy i;
    public int b;
    public int d;
    public long e;
    public long f;
    private abnw j;
    public byte h = 2;
    public String c = "";
    public abxs g = abzb.b;

    static {
        abnu abnuVar = new abnu();
        a = abnuVar;
        abnuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abnu.class, abnuVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0002\u0002ဈ\u0000\u0003င\u0001\u0004ဂ\u0002\u0006ဂ\u0004\u0007Л\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", aboa.class, "j"});
        }
        if (i3 == 3) {
            return new abnu();
        }
        if (i3 == 4) {
            return new abnt();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abnu.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
