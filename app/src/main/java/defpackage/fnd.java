package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnd extends abxd implements abyr {
    public static final fnd a;
    private static volatile abyy i;
    public int b;
    public abyl c = abyl.a;
    public abxs d;
    public aeaz e;
    public abxs f;
    public fmy g;
    public abxs h;

    static {
        fnd fndVar = new fnd();
        a = fndVar;
        fndVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fnd.class, fndVar);
    }

    private fnd() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.f = abzbVar;
        this.h = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0001\u0003\u0000\u00012\u0002Ț\u0003Ț\u0005ဉ\u0001\u0006ဉ\u0000\u0007Ț", new Object[]{"b", "c", fmw.a, "d", "f", "g", "e", "h"});
        }
        if (i3 == 3) {
            return new fnd();
        }
        if (i3 == 4) {
            return new fmv();
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
        synchronized (fnd.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
