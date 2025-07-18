package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adci extends abxd implements abyr {
    public static final adci a;
    private static volatile abyy d;
    public int b;
    public String c = "";

    static {
        adci adciVar = new adci();
        a = adciVar;
        adciVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adci.class, adciVar);
    }

    private adci() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new adci();
        }
        if (i2 == 4) {
            return new adch();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adci.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
