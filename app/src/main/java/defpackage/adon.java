package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adon extends abxd implements abyr {
    public static final adon a;
    private static volatile abyy l;
    public int b;
    public abyl c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    private abyl m;

    static {
        adon adonVar = new adon();
        a = adonVar;
        adonVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adon.class, adonVar);
    }

    private adon() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.m = abylVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u00012\u0002ဇ\u0000\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u00062\u0007᠌\u0005\bဇ\u0006\tဇ\u0007\nဇ\u0001", new Object[]{"b", "c", adok.a, "d", "f", adoh.a, "g", "h", "m", adoj.a, "i", adol.a, "j", "k", "e"});
        }
        if (i2 == 3) {
            return new adon();
        }
        if (i2 == 4) {
            return new adog();
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
        synchronized (adon.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
