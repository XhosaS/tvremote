package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyj extends abxd implements abyr {
    public static final acyj a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public long d;
    public String e = "";

    static {
        acyj acyjVar = new acyj();
        a = acyjVar;
        acyjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyj.class, acyjVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acyjVar, acyjVar, new abxb(null, 428067722, acap.MESSAGE, false, false));
    }

    private acyj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acyj();
        }
        if (i2 == 4) {
            return new acyi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acyj.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
