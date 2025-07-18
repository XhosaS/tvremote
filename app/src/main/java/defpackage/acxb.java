package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxb extends abxd implements abyr {
    public static final acxb a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        acxb acxbVar = new acxb();
        a = acxbVar;
        acxbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acxb.class, acxbVar);
    }

    private acxb() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", acxd.class});
        }
        if (i2 == 3) {
            return new acxb();
        }
        if (i2 == 4) {
            return new acxa();
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
        synchronized (acxb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
