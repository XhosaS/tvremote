package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczl extends abxd implements abyr {
    public static final aczl a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public String d = "";

    static {
        aczl aczlVar = new aczl();
        a = aczlVar;
        aczlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczl.class, aczlVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczlVar, aczlVar, new abxb(null, 362128797, acap.MESSAGE, false, false));
    }

    private aczl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new aczl();
        }
        if (i2 == 4) {
            return new aczk();
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
        synchronized (aczl.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
