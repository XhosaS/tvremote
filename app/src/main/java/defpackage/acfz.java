package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfz extends abxd implements abyr {
    public static final acfz a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        acfz acfzVar = new acfz();
        a = acfzVar;
        acfzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfz.class, acfzVar);
    }

    private acfz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", acfy.class});
        }
        if (i2 == 3) {
            return new acfz();
        }
        if (i2 == 4) {
            return new acfw();
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
        synchronized (acfz.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
