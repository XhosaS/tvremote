package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfj extends abxd implements abyr {
    public static final vfj a;
    private static volatile abyy e;
    public int b;
    public int c;
    public boolean d;

    static {
        vfj vfjVar = new vfj();
        a = vfjVar;
        vfjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vfj.class, vfjVar);
    }

    private vfj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new vfj();
        }
        if (i2 == 4) {
            return new vfi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (vfj.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
