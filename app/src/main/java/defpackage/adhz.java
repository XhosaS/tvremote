package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhz extends abxd implements abyr {
    public static final adhz a;
    private static volatile abyy c;
    private int d;
    private adgw e;
    private adgw f;
    private adgw g;
    private byte h = 2;
    public abxs b = abzb.b;

    static {
        adhz adhzVar = new adhz();
        a = adhzVar;
        adhzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adhz.class, adhzVar);
    }

    private adhz() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0004\u0001Л\u0004ᐉ\u0003\u0005ᐉ\u0004\nᐉ\u0005", new Object[]{"d", "b", adhx.class, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new adhz();
        }
        if (i2 == 4) {
            return new adhy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adhz.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
