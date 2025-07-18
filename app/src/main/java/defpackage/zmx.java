package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmx extends abwz implements abxa {
    public static final zmx a;
    private static volatile abyy j;
    private zll A;
    private znn B;
    private zlc C;
    private xxf D;
    private znv E;
    private zpe F;
    private zoj G;
    private znx H;
    private acjt I;
    private byte J = 2;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public ahpb h;
    public zof i;
    private int k;
    private int l;
    private int m;
    private int o;
    private int p;
    private zmv q;
    private zmz r;
    private zmz s;
    private zlr t;
    private ahvw u;
    private znl v;
    private acja w;
    private znb x;
    private znd y;
    private zpi z;

    static {
        zmx zmxVar = new zmx();
        a = zmxVar;
        zmxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zmx.class, zmxVar);
    }

    private zmx() {
        abvo abvoVar = abvo.b;
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.J);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0018\u0000\b\u0001Ō\u0018\u0000\u0000\u0014\u0001ဃ\u0000/ᐉ67ᐉI8ᐉJiဃelᐉjqဃmvᐉr\u0081ᐉ\u007f\u0088ᐉ\u0087\u0093ᐉ\u008fÀᐉ\u0090Ãဉ»ßᐉÒäᐉµüᐉÄĠᐉäġᐉçĤᐉïĥᐉðħᐉóĻᐉêľᐉÿŌᐉñ", new Object[]{"b", "k", "l", "c", "m", "o", "p", "d", "e", "q", "r", "s", "f", "t", "g", "u", "v", "w", "x", "y", "A", "C", "z", "B", "D", "E", "h", "i", "H", "F", "I", "G"});
        }
        if (i2 == 3) {
            return new zmx();
        }
        if (i2 == 4) {
            return new zmw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.J = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zmx.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
