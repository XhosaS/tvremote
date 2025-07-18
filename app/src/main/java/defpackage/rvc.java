package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvc extends abwz implements abxa {
    public static final rvc a;
    private static volatile abyy e;
    public int b;
    public sgo c;
    public int d;
    private byte f = 2;

    static {
        rvc rvcVar = new rvc();
        a = rvcVar;
        rvcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rvc.class, rvcVar);
    }

    private rvc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", ruz.a});
        }
        if (i2 == 3) {
            return new rvc();
        }
        if (i2 == 4) {
            return new rvb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rvc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
