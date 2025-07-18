package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class znu implements znp {
    static final long[] a = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    private long l;
    private long m;
    private int o;
    private final byte[] j = new byte[8];
    private final long[] n = new long[80];
    private int k = 0;

    protected znu() {
        i();
    }

    private final void j() {
        long j = this.l;
        if (j > 2305843009213693951L) {
            this.m += j >>> 61;
            this.l = j & 2305843009213693951L;
        }
    }

    private static final long k(long j, long j2, long j3) {
        return (j & j2) ^ ((~j) & j3);
    }

    private static final long l(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private static final long m(long j) {
        return (((j >>> 28) | (j << 36)) ^ ((j << 30) | (j >>> 34))) ^ ((j << 25) | (j >>> 39));
    }

    private static final long n(long j) {
        return (((j >>> 14) | (j << 50)) ^ ((j << 46) | (j >>> 18))) ^ ((j << 23) | (j >>> 41));
    }

    @Override // defpackage.znp
    public final void d(byte b) {
        int i = this.k;
        int i2 = i + 1;
        this.k = i2;
        byte[] bArr = this.j;
        bArr[i] = b;
        if (i2 == 8) {
            h(bArr, 0);
            this.k = 0;
        }
        this.l++;
    }

    @Override // defpackage.znp
    public final void e(byte[] bArr, int i, int i2) {
        while (this.k != 0 && i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
        while (i2 >= 8) {
            h(bArr, i);
            i += 8;
            this.l += 8;
            i2 -= 8;
        }
        while (i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
    }

    public final void f() {
        j();
        long j = this.l << 3;
        long j2 = this.m;
        d(Byte.MIN_VALUE);
        while (this.k != 0) {
            d((byte) 0);
        }
        if (this.o > 14) {
            g();
        }
        long[] jArr = this.n;
        jArr[14] = j2;
        jArr[15] = j;
        g();
    }

    protected final void g() {
        j();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.n;
            long j = jArr[i - 2];
            long j2 = ((j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)))) + jArr[i - 7];
            long j3 = jArr[i - 15];
            jArr[i] = j2 + ((j3 >>> 7) ^ (((j3 << 63) | (j3 >>> 1)) ^ ((j3 << 56) | (j3 >>> 8)))) + jArr[i - 16];
        }
        long j4 = this.b;
        long j5 = this.c;
        long j6 = this.d;
        long j7 = this.e;
        long j8 = this.f;
        long j9 = this.g;
        long j10 = j5;
        long j11 = this.h;
        long j12 = this.i;
        int i2 = 0;
        long j13 = j8;
        long j14 = j9;
        long j15 = j11;
        long j16 = j6;
        long jM = j4;
        long j17 = j7;
        int i3 = 0;
        while (i3 < 10) {
            long jN = n(j13);
            int i4 = i3;
            long j18 = j13;
            long j19 = j14;
            long jK = k(j18, j19, j15);
            long[] jArr2 = a;
            long j20 = jN + jK + jArr2[i2];
            long[] jArr3 = this.n;
            int i5 = i2 + 1;
            long j21 = j12 + j20 + jArr3[i2];
            long j22 = j17 + j21;
            long jM2 = m(jM);
            long j23 = j16;
            long j24 = j10;
            long jL = l(jM, j24, j23);
            int i6 = i2 + 2;
            long jN2 = j15 + n(j22) + k(j22, j18, j19) + jArr2[i5] + jArr3[i5];
            long j25 = j23 + jN2;
            long j26 = j21 + jM2 + jL;
            long j27 = jM;
            long jL2 = l(j26, j27, j24);
            int i7 = i2 + 3;
            long jN3 = j19 + n(j25) + k(j25, j22, j18) + jArr2[i6] + jArr3[i6];
            long j28 = j24 + jN3;
            long jM3 = jN2 + m(j26) + jL2;
            long jL3 = l(jM3, j26, j27);
            int i8 = i2 + 4;
            long jN4 = j18 + n(j28) + k(j28, j25, j22) + jArr2[i7] + jArr3[i7];
            long j29 = j27 + jN4;
            int i9 = i2 + 5;
            long jN5 = j22 + n(j29) + k(j29, j28, j25) + jArr2[i8] + jArr3[i8];
            long j30 = j26 + jN5;
            int i10 = i2 + 6;
            long jN6 = j25 + n(j30) + k(j30, j29, j28) + jArr2[i9] + jArr3[i9];
            long j31 = jM3 + jN6;
            int i11 = i2 + 7;
            long jN7 = n(j31) + k(j31, j30, j29) + jArr2[i10] + jArr3[i10];
            long j32 = jArr2[i11];
            long jM4 = jN3 + m(jM3) + jL3;
            long j33 = j28 + jN7;
            long j34 = jM4 + j33;
            j14 = j34;
            i2 += 8;
            long jN8 = n(j34) + k(j34, j31, j30) + j32 + jArr3[i11];
            long jM5 = jN4 + m(jM4) + l(jM4, jM3, j26);
            long jM6 = jN5 + m(jM5) + l(jM5, jM4, jM3);
            long jM7 = jN6 + m(jM6) + l(jM6, jM5, jM4);
            long j35 = j29 + jN8;
            long jM8 = j33 + m(jM7) + l(jM7, jM6, jM5);
            j13 = jM5 + j35;
            i3 = i4 + 1;
            j10 = jM8;
            j16 = jM7;
            j17 = jM6;
            j15 = j31;
            jM = j35 + m(jM8) + l(jM8, jM7, jM6);
            j12 = j30;
        }
        this.b += jM;
        this.c += j10;
        this.d += j16;
        this.e += j17;
        this.f += j13;
        this.g += j14;
        this.h += j15;
        this.i += j12;
        this.o = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.n[i12] = 0;
        }
    }

    protected final void h(byte[] bArr, int i) {
        this.n[this.o] = (vxr.aQ(bArr, i + 4) & 4294967295L) | ((vxr.aQ(bArr, i) & 4294967295L) << 32);
        int i2 = this.o + 1;
        this.o = i2;
        if (i2 == 16) {
            g();
        }
    }

    public void i() {
        this.l = 0L;
        this.m = 0L;
        int i = 0;
        this.k = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.j;
            if (i2 >= 8) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.o = 0;
        while (true) {
            long[] jArr = this.n;
            if (i == 80) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }
}
