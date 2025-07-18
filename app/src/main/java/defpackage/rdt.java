package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdt extends abxd implements abyr {
    public static final rdt a;
    public static final abxc b;
    private static volatile abyy k;
    public int c;
    public boolean e;
    public boolean i;
    public String d = "";
    public String f = "";
    public String g = "";
    public abxj h = abxe.a;
    public abxs j = abzb.b;

    static {
        rdt rdtVar = new rdt();
        a = rdtVar;
        rdtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rdt.class, rdtVar);
        b = new abxc(rdk.a, rdtVar, rdtVar, new abxb(null, 334728578, acap.MESSAGE, false, false));
    }

    private rdt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new rdt();
        }
        if (i2 == 4) {
            return new rds();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rdt.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
