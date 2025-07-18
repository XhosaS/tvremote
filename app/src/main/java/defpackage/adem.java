package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adem extends abxd implements abyr {
    public static final adem a;
    public static final abxc b;
    private static volatile abyy d;
    public int c;
    private int e;

    static {
        adem ademVar = new adem();
        a = ademVar;
        ademVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adem.class, ademVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), ademVar, ademVar, new abxb(null, 435702396, acap.MESSAGE, false, false));
    }

    private adem() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"e", "c", adek.a});
        }
        if (i2 == 3) {
            return new adem();
        }
        if (i2 == 4) {
            return new adej();
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
        synchronized (adem.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
