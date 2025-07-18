package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actl extends abxd implements abyr {
    public static final actl a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public acub d;
    public acub e;
    public acub f;

    static {
        actl actlVar = new actl();
        a = actlVar;
        actlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actl.class, actlVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actlVar, actlVar, new abxb(null, 455145426, acap.MESSAGE, false, false));
    }

    private actl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new actl();
        }
        if (i2 == 4) {
            return new actk();
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
        synchronized (actl.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
