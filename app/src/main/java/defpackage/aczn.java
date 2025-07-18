package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczn extends abxd implements abyr {
    public static final aczn a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public String d = "";

    static {
        aczn acznVar = new aczn();
        a = acznVar;
        acznVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczn.class, acznVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acznVar, acznVar, new abxb(null, 360463768, acap.MESSAGE, false, false));
    }

    private aczn() {
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
            return new aczn();
        }
        if (i2 == 4) {
            return new aczm();
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
        synchronized (aczn.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
