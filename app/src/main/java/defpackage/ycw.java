package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycw extends abxd implements abyr {
    public static final ycw a;
    private static volatile abyy i;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        ycw ycwVar = new ycw();
        a = ycwVar;
        ycwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ycw.class, ycwVar);
    }

    private ycw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            abxh abxhVar = ycu.a;
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", ycs.a, "d", abxhVar, "e", abxhVar, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ycw();
        }
        if (i3 == 4) {
            return new ycr();
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
        synchronized (ycw.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
