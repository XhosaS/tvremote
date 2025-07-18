package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxv extends abxd implements abyr {
    public static final acxv a;
    public static final abxc b;
    private static volatile abyy h;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$Command g;
    private byte i = 2;

    static {
        acxv acxvVar = new acxv();
        a = acxvVar;
        acxvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acxv.class, acxvVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acxvVar, acxvVar, new abxb(null, 170382629, acap.MESSAGE, false, false));
    }

    private acxv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acxv();
        }
        if (i2 == 4) {
            return new acxu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acxv.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
