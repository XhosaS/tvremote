package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyh extends abxd implements abyr {
    public static final acyh a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public acyb d;
    public acys e;
    public float f;

    static {
        acyh acyhVar = new acyh();
        a = acyhVar;
        acyhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyh.class, acyhVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), acyhVar, acyhVar, new abxb(null, 193804845, acap.MESSAGE, false, false));
    }

    private acyh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acyh();
        }
        if (i2 == 4) {
            return new acyg();
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
        synchronized (acyh.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
