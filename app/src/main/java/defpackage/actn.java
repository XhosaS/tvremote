package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actn extends abxd implements abyr {
    public static final actn a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public actj d;
    public actj e;
    public acyb f;

    static {
        actn actnVar = new actn();
        a = actnVar;
        actnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actn.class, actnVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actnVar, actnVar, new abxb(null, 463642931, acap.MESSAGE, false, false));
    }

    private actn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new actn();
        }
        if (i2 == 4) {
            return new actm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (actn.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
