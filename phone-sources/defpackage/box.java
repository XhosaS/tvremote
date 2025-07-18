package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class box {
    private static final bpj A;
    private static final bpj B;
    public static final float[] a;
    public static final float[] b;
    public static final bpj c;
    public static final bpj d;
    public static final bpi e;
    public static final bpi f;
    public static final bpi g;
    public static final bpi h;
    public static final bpi i;
    public static final bpi j;
    public static final bpi k;
    public static final bpi l;
    public static final bpi m;
    public static final bpi n;
    public static final bpi o;
    public static final bpi p;
    public static final bpi q;
    public static final bpi r;
    public static final bov s;
    public static final bov t;
    public static final bpi u;
    public static final bpi v;
    public static final bpi w;
    public static final bov x;
    public static final bov[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        bpj bpjVar = new bpj(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A = bpjVar;
        bpj bpjVar2 = new bpj(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        B = bpjVar2;
        bpj bpjVar3 = new bpj(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = bpjVar3;
        bpj bpjVar4 = new bpj(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = bpjVar4;
        bpk bpkVar = bpd.a;
        bpi bpiVar = new bpi("sRGB IEC61966-2.1", fArr, bpd.d, bpjVar, 0);
        e = bpiVar;
        bpi bpiVar2 = new bpi("sRGB IEC61966-2.1 (Linear)", fArr, bpd.d, 1.0d, 0.0f, 1.0f, 1);
        f = bpiVar2;
        bpi bpiVar3 = new bpi("scRGB-nl IEC 61966-2-2:2003", fArr, bpd.d, null, new bow(1), new bow(0), -0.799f, 2.399f, bpjVar, 2);
        g = bpiVar3;
        bpi bpiVar4 = new bpi("scRGB IEC 61966-2-2:2003", fArr, bpd.d, 1.0d, -0.5f, 7.499f, 3);
        h = bpiVar4;
        bpi bpiVar5 = new bpi("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, bpd.d, new bpj(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = bpiVar5;
        bpi bpiVar6 = new bpi("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, bpd.d, new bpj(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = bpiVar6;
        bpi bpiVar7 = new bpi("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new bpk(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = bpiVar7;
        bpi bpiVar8 = new bpi("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, bpd.d, bpjVar, 7);
        l = bpiVar8;
        bpi bpiVar9 = new bpi("NTSC (1953)", fArr2, bpd.a, new bpj(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = bpiVar9;
        bpi bpiVar10 = new bpi("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, bpd.d, new bpj(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = bpiVar10;
        bpi bpiVar11 = new bpi("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, bpd.d, 2.2d, 0.0f, 1.0f, 10);
        o = bpiVar11;
        bpi bpiVar12 = new bpi("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, bpd.b, new bpj(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = bpiVar12;
        bpi bpiVar13 = new bpi("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, bpd.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = bpiVar13;
        bpi bpiVar14 = new bpi("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, bpd.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = bpiVar14;
        bpl bplVar = new bpl();
        s = bplVar;
        bpe bpeVar = new bpe();
        t = bpeVar;
        bpi bpiVar15 = new bpi("None", fArr, bpd.d, bpjVar2, 16);
        u = bpiVar15;
        bpi bpiVar16 = new bpi("Hybrid Log Gamma encoding", fArr3, bpd.d, null, new bow(2), new bow(3), 0.0f, 1.0f, bpjVar3, 17);
        v = bpiVar16;
        bpi bpiVar17 = new bpi("Perceptual Quantizer encoding", fArr3, bpd.d, null, new bow(4), new bow(5), 0.0f, 1.0f, bpjVar4, 18);
        w = bpiVar17;
        bpf bpfVar = new bpf();
        x = bpfVar;
        y = new bov[]{bpiVar, bpiVar2, bpiVar3, bpiVar4, bpiVar5, bpiVar6, bpiVar7, bpiVar8, bpiVar9, bpiVar10, bpiVar11, bpiVar12, bpiVar13, bpiVar14, bplVar, bpeVar, bpiVar15, bpiVar16, bpiVar17, bpfVar};
    }

    public static final double a(bpj bpjVar, double d2) {
        double dExp;
        double d3 = bpjVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = bpjVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = Math.pow(d6, bpjVar.c);
        } else {
            dExp = Math.exp((d5 - bpjVar.f) * bpjVar.d) + bpjVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(bpj bpjVar, double d2) {
        double d3 = 1.0d / bpjVar.b;
        double d4 = 1.0d / bpjVar.c;
        double d5 = 1.0d / bpjVar.d;
        double d6 = bpjVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : bpjVar.f + (d5 * Math.log(d8 - bpjVar.e)));
    }

    public static final double c(bpj bpjVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = bpjVar.d;
        double dPow = bpjVar.b + (bpjVar.c * Math.pow(d4, d5));
        return d3 * Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (bpjVar.e + (bpjVar.f * Math.pow(d4, d5))), bpjVar.g);
    }

    public static final double d(bpj bpjVar, double d2) {
        double d3 = -bpjVar.b;
        double d4 = 1.0d / bpjVar.g;
        double d5 = -bpjVar.f;
        double d6 = 1.0d / bpjVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (bpjVar.e * Math.pow(d8, d4)), 0.0d) / (bpjVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}
