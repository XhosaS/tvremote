package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozw extends abxd implements abyr {
    public static final ozw a;
    private static volatile abyy n;
    public int b;
    public abxs c;
    public abxs d;
    public abxs e;
    public abxs f;
    public abxs g;
    public String h;
    public String i;
    public abxs j;
    public abxs k;
    public abgi l;
    public boolean m;
    private byte o = 2;

    static {
        ozw ozwVar = new ozw();
        a = ozwVar;
        ozwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ozw.class, ozwVar);
    }

    private ozw() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
        this.e = abzbVar;
        this.f = abzbVar;
        this.g = abzbVar;
        this.h = "";
        this.i = "";
        this.j = abzbVar;
        this.k = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0000\u0001\u0002\f\u000b\u0000\u0007\u0002\u0002Л\u0003\u001b\u0004\u001b\u0005Ȉ\u0006Ȉ\u0007Л\b\u001b\t\u001b\n\u001b\u000b\u0007\fဉ\u0000", new Object[]{"b", "c", abhn.class, "d", abft.class, "e", abhk.class, "h", "i", "j", abhf.class, "f", abge.class, "g", abeu.class, "k", abgt.class, "m", "l"});
        }
        if (i2 == 3) {
            return new ozw();
        }
        if (i2 == 4) {
            return new ozv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ozw.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
