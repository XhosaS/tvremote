package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgr extends abxd implements abyr {
    public static final pgr a;
    private static volatile abyy i;
    public int b;
    public int e;
    public long g;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public abxs f = abzb.b;
    public String h = "";

    static {
        pgr pgrVar = new pgr();
        a = pgrVar;
        pgrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgr.class, pgrVar);
    }

    private pgr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u001a\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0006ဈ\u0001\nင\u0002\u0017ဂ\u000f\u001aဈ\u0010", new Object[]{"b", "c", "f", pgp.class, "d", "e", "g", "h"});
        }
        if (i3 == 3) {
            return new pgr();
        }
        if (i3 == 4) {
            return new pgq();
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
        synchronized (pgr.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
