package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actr extends abxd implements abyr {
    public static final actr a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public float d;

    static {
        actr actrVar = new actr();
        a = actrVar;
        actrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actr.class, actrVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actrVar, actrVar, new abxb(null, 472454357, acap.MESSAGE, false, false));
    }

    private actr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new actr();
        }
        if (i2 == 4) {
            return new actq();
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
        synchronized (actr.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
