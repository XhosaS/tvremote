package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqi extends abxd implements abyr {
    public static final ahqi a;
    private static volatile abyy ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public ahqg G;
    public long H;
    public ahqg I;
    public ahqg J;
    public ahqg K;
    public ahqg L;
    public ahqg M;
    public ahqg N;
    public ahqg O;
    public ahqg P;
    public ahqg Q;
    public ahqg R;
    public ahqg S;
    public ahqg T;
    public ahqg U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public ahqg ak;
    public long al;
    public long am;
    public long an;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public abxs h;
    public abxs i;
    public abxs j;
    public abxs k;
    public abxs l;
    public abxs m;
    public ahqg n;
    public abxs o;
    public abxs p;
    public abxs q;
    public abxs r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        ahqi ahqiVar = new ahqi();
        a = ahqiVar;
        ahqiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahqi.class, ahqiVar);
    }

    private ahqi() {
        abzb abzbVar = abzb.b;
        this.h = abzbVar;
        this.i = abzbVar;
        this.j = abzbVar;
        this.k = abzbVar;
        this.l = abzbVar;
        this.m = abzbVar;
        this.o = abzbVar;
        this.p = abzbVar;
        this.q = abzbVar;
        this.r = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"b", "c", "d", "e", "f", "g", "h", ahqg.class, "i", ahqg.class, "j", ahqg.class, "k", ahqg.class, "l", ahqg.class, "m", ahqg.class, "n", "o", ahqg.class, "p", ahqa.class, "q", ahqc.class, "r", ahpy.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an"});
        }
        if (i2 == 3) {
            return new ahqi();
        }
        if (i2 == 4) {
            return new ahqh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = ao;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahqi.class) {
            abwxVar = ao;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                ao = abwxVar;
            }
        }
        return abwxVar;
    }
}
