package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgw extends abxd implements abyr {
    public static final acgw a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        acgw acgwVar = new acgw();
        a = acgwVar;
        acgwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgw.class, acgwVar);
    }

    private acgw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", acgt.class});
        }
        if (i2 == 3) {
            return new acgw();
        }
        if (i2 == 4) {
            return new acgv();
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
        synchronized (acgw.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
