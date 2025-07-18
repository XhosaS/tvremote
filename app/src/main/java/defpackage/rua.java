package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rua extends abxd implements abyr {
    public static final rua a;
    private static volatile abyy j;
    public int b;
    public int c = 4;
    public int d = 3;
    public boolean e = true;
    public boolean f;
    public sgo g;
    public int h;
    public sur i;

    static {
        rua ruaVar = new rua();
        a = ruaVar;
        ruaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rua.class, ruaVar);
    }

    private rua() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0005ဉ\u0004\u0006င\u0005\bဇ\u0003\tဉ\u0006", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i"});
        }
        if (i2 == 3) {
            return new rua();
        }
        if (i2 == 4) {
            return new rtz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rua.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
