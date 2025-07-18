package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazu extends abxd implements abyr {
    public static final aazu a;
    private static volatile abyy b;
    private acia A;
    private byte B = 2;
    private int c;
    private int d;
    private int e;
    private aazw f;
    private abag g;
    private abag h;
    private abac i;
    private aazw j;
    private aazk k;
    private abai l;
    private aazy m;
    private abae n;
    private aazi o;
    private aazo p;
    private aazm q;
    private aazs r;
    private aazq s;
    private abaa t;
    private aazg u;
    private aazc v;
    private aayy w;
    private aazw x;
    private aazw y;
    private achy z;

    static {
        aazu aazuVar = new aazu();
        a = aazuVar;
        aazuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aazu.class, aazuVar);
    }

    private aazu() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.B);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0016\u0000\u0003\u0001Ĭ\u0016\u0000\u0000\u0016\u0001ᔉ\u0000\u0002ᐉ\u0001\nᐉ\b\u0013ᐉ\u000b\u001fᐉ\u0019 ᐉ\u001a\"ᐉ\u001d+ᐉ!,ᐉ\"3ᐉ(8ᐉ,;ᐉ\u0002<ᐉ-Lᐉ\u0017Rᐉ4Wᐉ\u001f\\ᐉ7]ᐉ8^ᐉ9xᐉIzᐉHĬᐉ5", new Object[]{"c", "d", "e", "f", "g", "i", "j", "l", "m", "n", "p", "q", "r", "s", "h", "t", "k", "u", "o", "w", "x", "y", "A", "z", "v"});
        }
        if (i2 == 3) {
            return new aazu();
        }
        if (i2 == 4) {
            return new aazt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.B = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aazu.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
