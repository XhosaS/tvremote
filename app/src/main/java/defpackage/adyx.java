package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyx extends abxd implements abyr {
    public static final adyx a;
    private static volatile abyy i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public adwy g;
    public int h;

    static {
        adyx adyxVar = new adyx();
        a = adyxVar;
        adyxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyx.class, adyxVar);
    }

    private adyx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဉ\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new adyx();
        }
        if (i3 == 4) {
            return new adyw();
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
        synchronized (adyx.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
