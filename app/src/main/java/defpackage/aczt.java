package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczt extends abxd implements abyr {
    public static final aczt a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public String d = "";
    public float e;
    public float f;

    static {
        aczt acztVar = new aczt();
        a = acztVar;
        acztVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczt.class, acztVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), acztVar, acztVar, new abxb(null, 455760611, acap.MESSAGE, false, false));
    }

    private aczt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aczt();
        }
        if (i2 == 4) {
            return new aczs();
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
        synchronized (aczt.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
