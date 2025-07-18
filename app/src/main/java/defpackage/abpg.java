package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpg extends abxd implements abyr {
    public static final abpg a;
    private static volatile abyy b;
    private abyl c;
    private abyl d;

    static {
        abpg abpgVar = new abpg();
        a = abpgVar;
        abpgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abpg.class, abpgVar);
    }

    private abpg() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.d = abylVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0002\u0000\u0000\u00022\u00032", new Object[]{"c", abpe.a, "d", abpf.a});
        }
        if (i2 == 3) {
            return new abpg();
        }
        if (i2 == 4) {
            return new abpd();
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
        synchronized (abpg.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
