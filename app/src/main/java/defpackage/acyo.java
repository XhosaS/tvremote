package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyo extends abxd implements abyr {
    public static final acyo a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        acyo acyoVar = new acyo();
        a = acyoVar;
        acyoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acyo.class, acyoVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), acyoVar, acyoVar, new abxb(null, 170382720, acap.MESSAGE, false, false));
    }

    private acyo() {
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
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acyo();
        }
        if (i2 == 4) {
            return new acyn();
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
        synchronized (acyo.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
