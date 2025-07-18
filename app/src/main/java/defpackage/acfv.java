package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfv extends abxd implements abyr {
    public static final acfv a;
    private static volatile abyy g;
    public int b;
    public achk e;
    private byte h = 2;
    public abxs c = abzb.b;
    public String d = "";
    public int f = 3;

    static {
        acfv acfvVar = new acfv();
        a = acfvVar;
        acfvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfv.class, acfvVar);
    }

    private acfv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", acfu.class, "d", "e", "f", achp.a});
        }
        if (i2 == 3) {
            return new acfv();
        }
        if (i2 == 4) {
            return new acfs();
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
        synchronized (acfv.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
