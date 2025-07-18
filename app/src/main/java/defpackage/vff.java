package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vff extends abxd implements abyr {
    public static final abxk a = new vfd();
    public static final vff b;
    private static volatile abyy e;
    public String c = "";
    public abxj d = abxe.a;
    private int f;

    static {
        vff vffVar = new vff();
        b = vffVar;
        vffVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vff.class, vffVar);
    }

    private vff() {
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
            return new abzc(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"f", "c", "d", vez.a});
        }
        if (i2 == 3) {
            return new vff();
        }
        if (i2 == 4) {
            return new vfe();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (vff.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
