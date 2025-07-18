package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmy extends abxd implements abyr {
    public static final rmy a;
    private static volatile abyy h;
    public int b;
    public long f;
    public String c = "";
    public abvo d = abvo.b;
    public String e = "";
    public abxs g = abzb.b;

    static {
        rmy rmyVar = new rmy();
        a = rmyVar;
        rmyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rmy.class, rmyVar);
    }

    private rmy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", rna.class});
        }
        if (i2 == 3) {
            return new rmy();
        }
        if (i2 == 4) {
            return new rmx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rmy.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
