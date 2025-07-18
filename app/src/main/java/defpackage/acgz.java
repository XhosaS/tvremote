package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgz extends abxd implements abyr {
    public static final acgz a;
    private static volatile abyy c;
    public abyl b = abyl.a;
    private byte d = 2;

    static {
        acgz acgzVar = new acgz();
        a = acgzVar;
        acgzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgz.class, acgzVar);
    }

    private acgz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", acgu.a});
        }
        if (i2 == 3) {
            return new acgz();
        }
        if (i2 == 4) {
            return new acgp();
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
        synchronized (acgz.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
