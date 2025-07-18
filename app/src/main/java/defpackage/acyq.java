package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyq extends abxd implements abyr {
    public static final acyq a;
    public static volatile abyy b;
    public static final abxc c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;

    static {
        acyq acyqVar = new acyq();
        a = acyqVar;
        acyqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyq.class, acyqVar);
        c = new abxc(acyd.a, acyqVar, acyqVar, new abxb(null, 200077771, acap.MESSAGE, false, false));
    }

    private acyq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new acyq();
        }
        if (i2 == 4) {
            return new acyp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acyq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
