package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxz extends abxd implements abyr {
    public static final acxz a;
    public static final abxc b;
    private static volatile abyy e;
    public CommandOuterClass$Command d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        acxz acxzVar = new acxz();
        a = acxzVar;
        acxzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acxz.class, acxzVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acxzVar, acxzVar, new abxb(null, 325347951, acap.MESSAGE, false, false));
    }

    private acxz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
        }
        if (i2 == 3) {
            return new acxz();
        }
        if (i2 == 4) {
            return new acxy();
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
        synchronized (acxz.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
