package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczr extends abxd implements abyr {
    public static final aczr a;
    public static final abxc b;
    private static volatile abyy i;
    public int c;
    public Object e;
    public float g;
    public CommandOuterClass$Command h;
    public int d = 0;
    private byte j = 2;
    public String f = "";

    static {
        aczr aczrVar = new aczr();
        a = aczrVar;
        aczrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aczr.class, aczrVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), aczrVar, aczrVar, new abxb(null, 455760581, acap.MESSAGE, false, false));
    }

    private aczr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0003ခ\u0002\u0004м\u0000\u0005;\u0000\u0006ᐉ\u0003", new Object[]{"e", "d", "c", "f", "g", CommandOuterClass$Command.class, "h"});
        }
        if (i3 == 3) {
            return new aczr();
        }
        if (i3 == 4) {
            return new aczq();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aczr.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
