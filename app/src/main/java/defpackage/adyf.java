package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyf extends abxd implements abyr {
    public static final adyf a;
    private static volatile abyy i;
    public int b;
    public abxs c = abzb.b;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        adyf adyfVar = new adyf();
        a = adyfVar;
        adyfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyf.class, adyfVar);
    }

    private adyf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", aead.class, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new adyf();
        }
        if (i3 == 4) {
            return new adye();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adyf.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
