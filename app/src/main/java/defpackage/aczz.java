package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczz extends abxd implements abyr {
    public static final aczz a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public float e;
    public CommandOuterClass$Command f;
    private byte h = 2;
    public String d = "";

    static {
        aczz aczzVar = new aczz();
        a = aczzVar;
        aczzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczz.class, aczzVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczzVar, aczzVar, new abxb(null, 315252720, acap.MESSAGE, false, false));
    }

    private aczz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ခ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aczz();
        }
        if (i2 == 4) {
            return new aczy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aczz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
