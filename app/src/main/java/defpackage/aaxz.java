package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxz extends abxd implements abyr {
    public static final aaxz a;
    private static volatile abyy k;
    public int b;
    public int c;
    public long d;
    public ahqu e;
    public aaxq f;
    public zpr g;
    public aaxs h;
    public abxs i;
    public aaxy j;
    private byte l = 2;

    static {
        aaxz aaxzVar = new aaxz();
        a = aaxzVar;
        aaxzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aaxz.class, aaxzVar);
    }

    private aaxz() {
        abvo abvoVar = abvo.b;
        this.i = abzb.b;
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0002\u0010\b\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\u0007ဉ\u0006\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", "i", aaye.class, "c", aaxw.a, "d", "e", "j"});
        }
        if (i2 == 3) {
            return new aaxz();
        }
        if (i2 == 4) {
            return new aaxv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aaxz.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
