package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfl extends abxd implements abyr {
    public static final abfl a;
    private static volatile abyy k;
    public int b;
    public Object d;
    public abft f;
    public String g;
    public String h;
    public int i;
    public String j;
    public int c = 0;
    public String e = "";

    static {
        abfl abflVar = new abfl();
        a = abflVar;
        abflVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abfl.class, abflVar);
    }

    private abfl() {
        Object[] objArr = abzb.a;
        this.g = "";
        this.h = "";
        this.j = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0004Ȼ\u0000\u0005Ȉ\u0006\f\u0007<\u0000\bȈ\tȈ", new Object[]{"d", "c", "b", "e", "f", "g", "i", abhh.class, "j", "h"});
        }
        if (i2 == 3) {
            return new abfl();
        }
        if (i2 == 4) {
            return new abfk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abfl.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
