package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaf extends abxd implements abyr {
    public static final adaf a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public String d = "";

    static {
        adaf adafVar = new adaf();
        a = adafVar;
        adafVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adaf.class, adafVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), adafVar, adafVar, new abxb(null, 455760676, acap.MESSAGE, false, false));
    }

    private adaf() {
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
            return new adaf();
        }
        if (i2 == 4) {
            return new adae();
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
        synchronized (adaf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
