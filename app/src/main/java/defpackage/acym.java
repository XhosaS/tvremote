package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acym extends abxd implements abyr {
    public static final acym a;
    public static final abxc b;
    private static volatile abyy d;
    private byte e = 2;
    public abxs c = abzb.b;

    static {
        acym acymVar = new acym();
        a = acymVar;
        acymVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acym.class, acymVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acymVar, acymVar, new abxb(null, 170382688, acap.MESSAGE, false, false));
    }

    private acym() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", CommandOuterClass$Command.class});
        }
        if (i2 == 3) {
            return new acym();
        }
        if (i2 == 4) {
            return new acyl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acym.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
