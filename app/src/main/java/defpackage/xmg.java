package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmg extends abxd implements abyr {
    public static final xmg a;
    private static volatile abyy i;
    public int b;
    public xal d;
    public int e;
    public int g;
    public int h;
    private byte j = 2;
    public String c = "";
    public int f = 1;

    static {
        xmg xmgVar = new xmg();
        a = xmgVar;
        xmgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xmg.class, xmgVar);
    }

    private xmg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", xmb.a, "f", xmd.a, "g", "h"});
        }
        if (i3 == 3) {
            return new xmg();
        }
        if (i3 == 4) {
            return new xmf();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xmg.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
