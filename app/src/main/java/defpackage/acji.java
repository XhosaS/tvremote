package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acji extends abwz implements abxa {
    public static final acji a;
    private static volatile abyy i;
    public int b;
    public int c;
    public long e;
    public int f;
    private byte j = 2;
    public String d = "";
    public String g = "";
    public String h = "";

    static {
        acji acjiVar = new acji();
        a = acjiVar;
        acjiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acji.class, acjiVar);
    }

    private acji() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဋ\u0003", new Object[]{"b", "c", addk.a, "d", "e", "g", "h", "f"});
        }
        if (i3 == 3) {
            return new acji();
        }
        if (i3 == 4) {
            return new acjh();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acji.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
