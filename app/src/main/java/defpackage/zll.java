package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zll extends abxd implements abyr {
    public static final zll a;
    private static volatile abyy b;
    private abyl c;
    private abyl d;
    private abyl e;

    static {
        zll zllVar = new zll();
        a = zllVar;
        zllVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zll.class, zllVar);
    }

    private zll() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.d = abylVar;
        this.e = abylVar;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0000\u0003\f\u0003\u0003\u0000\u0000\u00032\u00072\f2", new Object[]{"c", zlj.a, "d", zlk.a, "e", zli.a});
        }
        if (i2 == 3) {
            return new zll();
        }
        if (i2 == 4) {
            return new zlh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zll.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
