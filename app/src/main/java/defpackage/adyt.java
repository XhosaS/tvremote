package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyt extends abxd implements abyr {
    public static final adyt a;
    private static volatile abyy f;
    public int b;
    public double c;
    public double d;
    public String e = "";

    static {
        adyt adytVar = new adyt();
        a = adytVar;
        adytVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyt.class, adytVar);
    }

    private adyt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new adyt();
        }
        if (i2 == 4) {
            return new adys();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adyt.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
