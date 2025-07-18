package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ador extends abwz implements abxa {
    public static final ador a;
    private static volatile abyy w;
    public int b;
    public int c;
    public adry d;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public adod k;
    public adon l;
    public boolean m;
    public int o;
    public boolean p;
    public adnx q;
    public String r;
    public boolean s;
    public boolean t;
    public adno u;
    public boolean v;
    private byte x = 2;
    public boolean e = true;

    static {
        ador adorVar = new ador();
        a = adorVar;
        adorVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ador.class, adorVar);
    }

    private ador() {
        float[] fArr = abwt.a;
        this.f = "";
        this.i = true;
        this.r = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.x);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0012\u0000\u0002\nϧ\u0012\u0000\u0000\u0002\nဇ\t\rဈ\u0010\u000fဇ\u0012\u0010ဇ\u0013\u0011ဇ\u0014\u0012᠌\u0016\u0013ဉ\u0017\u0014ဇ\u001a\u0016ᐉ \u0017ဉ\b\u0018ဈ!\u0019ဇ\"\u001aဇ\u001c\u001bဉ\u0018\u001f᠌\u001b/ဇ(0ᐉ)ϧဇ+", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", adll.a, "k", "m", "q", "d", "r", "s", "p", "l", "o", adop.a, "t", "u", "v"});
        }
        if (i2 == 3) {
            return new ador();
        }
        if (i2 == 4) {
            return new adoo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.x = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = w;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ador.class) {
            abwxVar = w;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                w = abwxVar;
            }
        }
        return abwxVar;
    }
}
