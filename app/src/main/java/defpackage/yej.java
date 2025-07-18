package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yej extends abxd implements abyr {
    public static final yej a;
    private static volatile abyy l;
    public int b;
    public boolean d;
    public boolean h;
    public abxs i;
    public abxs j;
    public int k;
    public abxj c = abxe.a;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        yej yejVar = new yej();
        a = yejVar;
        yejVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yej.class, yejVar);
    }

    private yej() {
        abzb abzbVar = abzb.b;
        this.i = abzbVar;
        this.j = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001\u0016\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007\u001b\b\u001b\tင\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", ygq.class, "j", ygk.class, "k"});
        }
        if (i2 == 3) {
            return new yej();
        }
        if (i2 == 4) {
            return new yei();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yej.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
