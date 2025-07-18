package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeai extends abxd implements abyr {
    public static final aeai a;
    private static volatile abyy h;
    public int b;
    public aebo c;
    public adyt e;
    public String g;
    public String d = "";
    public int f = 1;

    static {
        aeai aeaiVar = new aeai();
        a = aeaiVar;
        aeaiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeai.class, aeaiVar);
    }

    private aeai() {
        Object[] objArr = abzb.a;
        this.g = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဈ\u0004\u0006ဉ\u0005\u0007᠌\u0006\u000fဈ\r", new Object[]{"b", "c", "d", "e", "f", aeah.a, "g"});
        }
        if (i2 == 3) {
            return new aeai();
        }
        if (i2 == 4) {
            return new aeag();
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
        synchronized (aeai.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
