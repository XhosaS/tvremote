package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lme extends abxd implements abyr {
    public static final lme a;
    private static volatile abyy i;
    public int b;
    public int c;
    public abxs d = abzb.b;
    public String e = "";
    public String f = "";
    public boolean g;
    public double h;

    static {
        lme lmeVar = new lme();
        a = lmeVar;
        lmeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lme.class, lmeVar);
    }

    private lme() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"b", "c", lmc.a, "d", lme.class, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new lme();
        }
        if (i3 == 4) {
            return new lmb();
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
        synchronized (lme.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
