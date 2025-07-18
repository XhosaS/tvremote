package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addw extends abxd implements abyr {
    public static final addw a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public acrq e;
    private byte h = 2;
    public abxs d = abzb.b;
    public String f = "";

    static {
        addw addwVar = new addw();
        a = addwVar;
        addwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addw.class, addwVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), addwVar, addwVar, new abxb(null, 292553553, acap.MESSAGE, false, false));
    }

    private addw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"c", "d", adcn.class, "e", "f"});
        }
        if (i2 == 3) {
            return new addw();
        }
        if (i2 == 4) {
            return new addv();
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
        synchronized (addw.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
