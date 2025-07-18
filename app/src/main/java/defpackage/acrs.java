package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acrs extends abxd implements abyr {
    public static final acrs a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public boolean d;
    public float e;

    static {
        acrs acrsVar = new acrs();
        a = acrsVar;
        acrsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acrs.class, acrsVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), acrsVar, acrsVar, new abxb(null, 196573526, acap.MESSAGE, false, false));
    }

    private acrs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acrs();
        }
        if (i2 == 4) {
            return new acrr();
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
        synchronized (acrs.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
