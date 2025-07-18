package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmt extends abxd implements abyr {
    public static final abmt a;
    private static volatile abyy i;
    public int b;
    public long e;
    public abmz g;
    public boolean h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public int f = 1;

    static {
        abmt abmtVar = new abmt();
        a = abmtVar;
        abmtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmt.class, abmtVar);
    }

    private abmt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဂ\u0002\u0003᠌\u0003\u0004ᐉ\u0004\u0005ဈ\u0000\u0007ဇ\u0005", new Object[]{"b", "d", "e", "f", abmw.a, "g", "c", "h"});
        }
        if (i3 == 3) {
            return new abmt();
        }
        if (i3 == 4) {
            return new abms();
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
        synchronized (abmt.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
