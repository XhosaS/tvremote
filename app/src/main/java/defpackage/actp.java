package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actp extends abxd implements abyr {
    public static final actp a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public float d;

    static {
        actp actpVar = new actp();
        a = actpVar;
        actpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actp.class, actpVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actpVar, actpVar, new abxb(null, 472454038, acap.MESSAGE, false, false));
    }

    private actp() {
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
            return new actp();
        }
        if (i2 == 4) {
            return new acto();
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
        synchronized (actp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
