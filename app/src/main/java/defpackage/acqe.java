package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqe extends abxd implements abyr {
    public static final acqe a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        acqe acqeVar = new acqe();
        a = acqeVar;
        acqeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acqe.class, acqeVar);
        epd epdVar = epd.a;
        acpz acpzVar = acpz.a;
        b = new abxc(epdVar, acpzVar, acpzVar, new abxb(null, 520870272, acap.MESSAGE, false, false));
    }

    private acqe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acqe();
        }
        if (i2 == 4) {
            return new acqd();
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
        synchronized (acqe.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
