package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqw extends abxd implements abyr {
    public static final acqw a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public String d = "";

    static {
        acqw acqwVar = new acqw();
        a = acqwVar;
        acqwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acqw.class, acqwVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acqwVar, acqwVar, new abxb(null, 391562483, acap.MESSAGE, false, false));
    }

    private acqw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acqw();
        }
        if (i2 == 4) {
            return new acqv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acqw.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
