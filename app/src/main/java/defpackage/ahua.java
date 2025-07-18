package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahua extends abxd implements abyr {
    public static final ahua a;
    private static volatile abyy i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public int g;
    public String f = "";
    public String h = "";

    static {
        ahua ahuaVar = new ahua();
        a = ahuaVar;
        ahuaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahua.class, ahuaVar);
    }

    private ahua() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ahua();
        }
        if (i3 == 4) {
            return new ahtz();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahua.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
