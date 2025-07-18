package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadh extends abxd implements abyr {
    public static final aadh a;
    private static volatile abyy f;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        aadh aadhVar = new aadh();
        a = aadhVar;
        aadhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aadh.class, aadhVar);
    }

    private aadh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aadh();
        }
        if (i2 == 4) {
            return new aadg();
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
        synchronized (aadh.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
