package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtv extends abxd implements abyr {
    public static final abxk a = new abtt();
    public static final abtv b;
    private static volatile abyy n;
    public int c;
    public long d;
    public long e;
    public String f = "";
    public int g;
    public abxj h;
    public abxj i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;

    static {
        abtv abtvVar = new abtv();
        b = abtvVar;
        abtvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abtv.class, abtvVar);
    }

    private abtv() {
        abxe abxeVar = abxe.a;
        this.h = abxeVar;
        this.i = abxeVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\n\u0000\u0001\u0001\u000f\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0003\u0003'\u0004ࠬ\u0005ဇ\b\u0006ဇ\u0006\nဃ\u0001\u000bဈ\u0002\fဇ\t\u000f᠌\n", new Object[]{"c", "d", "g", "h", "i", abqo.a, "k", "j", "e", "f", "l", "m", abtl.a});
        }
        if (i2 == 3) {
            return new abtv();
        }
        if (i2 == 4) {
            return new abtu();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abtv.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
