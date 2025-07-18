package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcc extends abwz implements abxa {
    public static final pcc a;
    private static volatile abyy i;
    public int b;
    public zpk d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public abxj c = abxe.a;

    static {
        pcc pccVar = new pcc();
        a = pccVar;
        pccVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pcc.class, pccVar);
    }

    private pcc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", zor.a, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new pcc();
        }
        if (i3 == 4) {
            return new pcb();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pcc.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
