package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbj extends abxd implements abyr {
    public static final adbj a;
    private static volatile abyy b;
    private int c;
    private adbi d;
    private byte e = 2;

    static {
        adbj adbjVar = new adbj();
        a = adbjVar;
        adbjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adbj.class, adbjVar);
    }

    private adbj() {
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
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0012", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adbj();
        }
        if (i2 == 4) {
            return new adbe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adbj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
