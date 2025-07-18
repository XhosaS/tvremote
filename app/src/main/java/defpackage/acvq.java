package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvq extends abxd implements abyr {
    public static final acvq a;
    public static final abxc b;
    private static volatile abyy e;
    public acuz c;
    public acrq d;
    private int f;
    private byte g = 2;

    static {
        acvq acvqVar = new acvq();
        a = acvqVar;
        acvqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvq.class, acvqVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acvqVar, acvqVar, new abxb(null, 206181248, acap.MESSAGE, false, false));
    }

    private acvq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
        }
        if (i2 == 3) {
            return new acvq();
        }
        if (i2 == 4) {
            return new acvp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acvq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
