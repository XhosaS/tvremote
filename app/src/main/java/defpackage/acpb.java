package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acpb extends abxd implements abyr {
    public static final acpb a;
    private static volatile abyy d;
    public int b;
    public acoy c;
    private int e;

    static {
        acpb acpbVar = new acpb();
        a = acpbVar;
        acpbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acpb.class, acpbVar);
    }

    private acpb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"e", "b", acgc.a, "c"});
        }
        if (i2 == 3) {
            return new acpb();
        }
        if (i2 == 4) {
            return new acpa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acpb.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
