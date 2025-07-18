package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actz extends abxd implements abyr {
    public static final actz a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public actx d;

    static {
        actz actzVar = new actz();
        a = actzVar;
        actzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actz.class, actzVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actzVar, actzVar, new abxb(null, 409052762, acap.MESSAGE, false, false));
    }

    private actz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new actz();
        }
        if (i2 == 4) {
            return new acty();
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
        synchronized (actz.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
