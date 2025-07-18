package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class aczh extends abxd implements abyr {
    public static final aczh a;
    public static final abxc b;
    private static volatile abyy e;
    public String c = "";
    public abvo d = abvo.b;
    private int f;

    static {
        aczh aczhVar = new aczh();
        a = aczhVar;
        aczhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczh.class, aczhVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczhVar, aczhVar, new abxb(null, 170382760, acap.MESSAGE, false, false));
    }

    private aczh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"f", "c", "d"});
        }
        if (i2 == 3) {
            return new aczh();
        }
        if (i2 == 4) {
            return new aczg();
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
        synchronized (aczh.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
