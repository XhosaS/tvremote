package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfx extends abxd implements abyr {
    public static final xfx a;
    private static volatile abyy i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public abxs f = abzb.b;
    public String g = "";
    public String h = "";

    static {
        xfx xfxVar = new xfx();
        a = xfxVar;
        xfxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfx.class, xfxVar);
    }

    private xfx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new xfx();
        }
        if (i3 == 4) {
            return new xfw();
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
        synchronized (xfx.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
