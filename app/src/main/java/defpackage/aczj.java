package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczj extends abxd implements abyr {
    public static final aczj a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        aczj aczjVar = new aczj();
        a = aczjVar;
        aczjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczj.class, aczjVar);
        b = new abxc(acyw.a, aczjVar, aczjVar, new abxb(null, 172035250, acap.MESSAGE, false, false));
    }

    private aczj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aczj();
        }
        if (i2 == 4) {
            return new aczi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aczj.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
