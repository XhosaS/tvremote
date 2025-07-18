package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryi extends abxd implements abyr {
    public static final ryi a;
    private static volatile abyy i;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public sdo f;
    public sgo g;
    public long h;

    static {
        ryi ryiVar = new ryi();
        a = ryiVar;
        ryiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ryi.class, ryiVar);
    }

    private ryi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\f\u0001\u0001\u0001Ì\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000d<\u0000e<\u0000f<\u0000Éဂ\u0000Êဉ\u0001Ëဉ\u0002Ìဂ\u0003", new Object[]{"d", "c", "b", rvk.class, rvm.class, rts.class, ruc.class, rxu.class, rzj.class, rzl.class, ryl.class, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ryi();
        }
        if (i3 == 4) {
            return new ryh();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ryi.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
