package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnk extends abxd implements abyr {
    public static final abnk a;
    private static volatile abyy f;
    public int b;
    public abxs c = abzb.b;
    public int d = -1;
    public int e;

    static {
        abnk abnkVar = new abnk();
        a = abnkVar;
        abnkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abnk.class, abnkVar);
    }

    private abnk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001a\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"b", "c", "d", adbm.a, "e", abnj.a});
        }
        if (i2 == 3) {
            return new abnk();
        }
        if (i2 == 4) {
            return new abni();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abnk.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
