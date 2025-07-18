package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ades extends abxd implements abyr {
    public static final ades a;
    public static final abxc b;
    private static volatile abyy d;
    public boolean c;
    private int e;

    static {
        ades adesVar = new ades();
        a = adesVar;
        adesVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ades.class, adesVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), adesVar, adesVar, new abxb(null, 289523653, acap.MESSAGE, false, false));
    }

    private ades() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new ades();
        }
        if (i2 == 4) {
            return new ader();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ades.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
