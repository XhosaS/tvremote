package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeo extends abxd implements abyr {
    public static final adeo a;
    public static final abxc b;
    private static volatile abyy m;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean j;
    public adeq k;
    public int l;

    static {
        adeo adeoVar = new adeo();
        a = adeoVar;
        adeoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adeo.class, adeoVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), adeoVar, adeoVar, new abxb(null, 305333016, acap.MESSAGE, false, false));
    }

    private adeo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001င\u0000\u0003ခ\u0001\u0004င\u0002\u0005င\u0003\u0006ဇ\u0004\u0007ဂ\u0005\bဇ\u0006\tဉ\u0007\nင\b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new adeo();
        }
        if (i2 == 4) {
            return new aden();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adeo.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
