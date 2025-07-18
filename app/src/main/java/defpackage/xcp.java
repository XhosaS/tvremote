package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcp extends abxd implements abyr {
    public static final xcp a;
    private static volatile abyy i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public xcv f;
    public int g;
    public xct h;

    static {
        xcp xcpVar = new xcp();
        a = xcpVar;
        xcpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xcp.class, xcpVar);
    }

    public xcp() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005᠌\u0002\u0007ဉ\u0003", new Object[]{"d", "c", "b", "e", xcn.a, xcx.class, xcr.class, "f", "g", xcl.a, "h"});
        }
        if (i3 == 3) {
            return new xcp();
        }
        if (i3 == 4) {
            return new xck();
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
        synchronized (xcp.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
