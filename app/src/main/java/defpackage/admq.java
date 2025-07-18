package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admq extends abxd implements abyr {
    public static final admq a;
    public static final abxc b;
    private static volatile abyy i;
    public int c;
    public String d = "";
    public abxs e = abzb.b;
    public String f = "";
    public String g = "";
    public boolean h;

    static {
        admq admqVar = new admq();
        a = admqVar;
        admqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(admq.class, admqVar);
        b = new abxc(adrb.a, admqVar, admqVar, new abxb(null, 420374974, acap.MESSAGE, false, false));
    }

    private admq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"c", "d", "e", adsm.class, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new admq();
        }
        if (i3 == 4) {
            return new admp();
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
        synchronized (admq.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
