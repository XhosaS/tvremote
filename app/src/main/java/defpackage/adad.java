package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adad extends abxd implements abyr {
    public static final adad a;
    public static final abxc b;
    private static volatile abyy d;
    public String c = "";
    private int e;

    static {
        adad adadVar = new adad();
        a = adadVar;
        adadVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adad.class, adadVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), adadVar, adadVar, new abxb(null, 315253727, acap.MESSAGE, false, false));
    }

    private adad() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new adad();
        }
        if (i2 == 4) {
            return new adac();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adad.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
