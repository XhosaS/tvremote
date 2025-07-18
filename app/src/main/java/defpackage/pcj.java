package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcj extends abxd implements abyr {
    public static final pcj a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public int d;

    static {
        pcj pcjVar = new pcj();
        a = pcjVar;
        pcjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pcj.class, pcjVar);
    }

    private pcj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", pch.a});
        }
        if (i2 == 3) {
            return new pcj();
        }
        if (i2 == 4) {
            return new pcg();
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
        synchronized (pcj.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
