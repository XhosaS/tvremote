package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abft extends abxd implements abyr {
    public static final abft a;
    private static volatile abyy i;
    public int b;
    public abfv c;
    public String d;
    public String e;
    public abff f;
    public abfy g;
    public abgv h;
    private abzu j;

    static {
        abft abftVar = new abft();
        a = abftVar;
        abftVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abft.class, abftVar);
    }

    private abft() {
        Object[] objArr = abzb.a;
        this.d = "";
        this.e = "";
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0000\u0007\u0000\u0001\u00016\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0004Ȉ\u0006Ȉ\fဉ\u0001\u0012ဉ\u0003\u0014ဉ\u00046ဉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "j", "h"});
        }
        if (i3 == 3) {
            return new abft();
        }
        if (i3 == 4) {
            return new abfs();
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
        synchronized (abft.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
