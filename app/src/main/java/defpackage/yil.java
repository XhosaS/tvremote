package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yil extends abxd implements abyr {
    public static final yil a;
    private static volatile abyy q;
    public int b;
    public int c;
    public int e;
    public ylj f;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public String l;
    public int m;
    public int n;
    public long o;
    public boolean p;
    public String d = "";
    public String g = "";

    static {
        yil yilVar = new yil();
        a = yilVar;
        yilVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yil.class, yilVar);
    }

    private yil() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
        this.i = "";
        this.j = "";
        this.l = "";
        this.p = true;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\r\u0000\u0002\u0001:\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0004ဉ\u0007\u0005ဈ\b\u0007ဇ\n\u0016ဈ\"\"ဈ%)ဇ+,ဈ0.᠌2/᠌32ဂ4:ဇ7", new Object[]{"b", "c", "d", "e", yij.a, "f", "g", "h", "i", "j", "k", "l", "m", yih.a, "n", yif.a, "o", "p"});
        }
        if (i2 == 3) {
            return new yil();
        }
        if (i2 == 4) {
            return new yig();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = q;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yil.class) {
            abwxVar = q;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                q = abwxVar;
            }
        }
        return abwxVar;
    }
}
