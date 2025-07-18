package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvo extends abxd implements abyr {
    public static final acvo a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public int d;
    public int e;

    static {
        acvo acvoVar = new acvo();
        a = acvoVar;
        acvoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvo.class, acvoVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), acvoVar, acvoVar, new abxb(null, 449848976, acap.MESSAGE, false, false));
    }

    private acvo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acvo();
        }
        if (i2 == 4) {
            return new acvn();
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
        synchronized (acvo.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
