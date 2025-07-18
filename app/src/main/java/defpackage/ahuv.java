package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuv extends abxd implements abyr {
    public static final ahuv a;
    private static volatile abyy m;
    public int b;
    public boolean c;
    public ahuc d;
    public int g;
    public zqb i;
    public acjg j;
    public ahuz k;
    public ahut l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        ahuv ahuvVar = new ahuv();
        a = ahuvVar;
        ahuvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahuv.class, ahuvVar);
    }

    private ahuv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", ahuu.a, "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new ahuv();
        }
        if (i2 == 4) {
            return new ahup();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahuv.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
