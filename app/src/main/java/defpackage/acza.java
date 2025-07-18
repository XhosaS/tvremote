package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acza extends abxd implements abyr {
    public static final acza a;
    public static final abxc b;
    private static volatile abyy c;
    private byte d = 2;

    static {
        acza aczaVar = new acza();
        a = aczaVar;
        aczaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acza.class, aczaVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczaVar, aczaVar, new abxb(null, 501637953, acap.MESSAGE, false, false));
    }

    private acza() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acza();
        }
        if (i2 == 4) {
            return new acyz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acza.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
