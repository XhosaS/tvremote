package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczp extends abxd implements abyr {
    public static final aczp a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        aczp aczpVar = new aczp();
        a = aczpVar;
        aczpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczp.class, aczpVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczpVar, aczpVar, new abxb(null, 336926123, acap.MESSAGE, false, false));
    }

    private aczp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aczp();
        }
        if (i2 == 4) {
            return new aczo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aczp.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
