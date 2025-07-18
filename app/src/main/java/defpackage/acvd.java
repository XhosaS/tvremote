package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvd extends abxd implements abyr {
    public static final acvd a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public float d;
    public CommandOuterClass$Command e;
    private byte g = 2;

    static {
        acvd acvdVar = new acvd();
        a = acvdVar;
        acvdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvd.class, acvdVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acvdVar, acvdVar, new abxb(null, 182590845, acap.MESSAGE, false, false));
    }

    private acvd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ခ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new acvd();
        }
        if (i2 == 4) {
            return new acvc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acvd.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
