package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsu extends abxd implements abyr {
    public static final acsu a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        acsu acsuVar = new acsu();
        a = acsuVar;
        acsuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acsu.class, acsuVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acsuVar, acsuVar, new abxb(null, 525000106, acap.MESSAGE, false, false));
    }

    private acsu() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acsu();
        }
        if (i2 == 4) {
            return new acst();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acsu.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
