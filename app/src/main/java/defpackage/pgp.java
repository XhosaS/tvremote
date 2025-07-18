package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgp extends abwz implements abxa {
    public static final pgp a;
    private static volatile abyy c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        pgp pgpVar = new pgp();
        a = pgpVar;
        pgpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgp.class, pgpVar);
    }

    private pgp() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new pgp();
        }
        if (i2 == 4) {
            return new pgo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pgp.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
