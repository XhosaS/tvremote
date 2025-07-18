package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciu extends abxd implements abyr {
    public static final aciu a;
    private static volatile abyy h;
    public int b;
    public int c;
    public int d;
    public long e;
    public acis f;
    public float g;

    static {
        aciu aciuVar = new aciu();
        a = aciuVar;
        aciuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aciu.class, aciuVar);
    }

    private aciu() {
        abxe abxeVar = abxe.a;
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
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0005ဉ\u0004\u0007ခ\u0007", new Object[]{"b", "c", aciw.a, "d", aciv.a, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aciu();
        }
        if (i2 == 4) {
            return new acit();
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
        synchronized (aciu.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
