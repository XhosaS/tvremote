package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczd extends abwz implements abxa {
    public static final aczd a;
    public static final abxc b;
    private static volatile abyy c;
    private byte d = 2;

    static {
        aczd aczdVar = new aczd();
        a = aczdVar;
        aczdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczd.class, aczdVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczdVar, aczdVar, new abxb(null, 194114827, acap.MESSAGE, false, false));
    }

    private aczd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aczd();
        }
        if (i2 == 4) {
            return new aczc();
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
        synchronized (aczd.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
