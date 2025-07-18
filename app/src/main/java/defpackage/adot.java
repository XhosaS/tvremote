package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adot extends abwz implements abxa {
    public static final adot a;
    private static volatile abyy l;
    public int b;
    public adns c;
    public adob d;
    public ador e;
    public adof f;
    public adlo h;
    public adlu i;
    public adrp j;
    public adnq k;
    private adly m;
    private byte o = 2;
    public String g = "";

    static {
        adot adotVar = new adot();
        a = adotVar;
        adotVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adot.class, adotVar);
    }

    private adot() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ဉ\u0005\u0007ဈ\u0006\tဉ\b\nဉ\t\fဉ\u000b\u0011ဉ\n\u0014ဉ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "j", "k"});
        }
        if (i2 == 3) {
            return new adot();
        }
        if (i2 == 4) {
            return new ados();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adot.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
