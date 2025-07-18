package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqb extends abwz implements abxa {
    public static final adqb a;
    private static volatile abyy g;
    public int b;
    public abxs c;
    public long d;
    public adpl e;
    public abxs f;
    private byte h = 2;

    static {
        adqb adqbVar = new adqb();
        a = adqbVar;
        adqbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqb.class, adqbVar);
    }

    private adqb() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.f = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0012\u0004\u0000\u0002\u0000\u0001\u001a\u0002ဂ\u0000\u0003ဉ\u0001\u0012\u001b", new Object[]{"b", "c", "d", "e", "f", adrl.class});
        }
        if (i2 == 3) {
            return new adqb();
        }
        if (i2 == 4) {
            return new adqa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adqb.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
