package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczv extends abxd implements abyr {
    public static final aczv a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;

    static {
        aczv aczvVar = new aczv();
        a = aczvVar;
        aczvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczv.class, aczvVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczvVar, aczvVar, new abxb(null, 329240327, acap.MESSAGE, false, false));
    }

    private aczv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "d", aczw.a});
        }
        if (i2 == 3) {
            return new aczv();
        }
        if (i2 == 4) {
            return new aczu();
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
        synchronized (aczv.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
