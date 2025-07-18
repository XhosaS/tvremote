package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhw implements fdp {
    public static final /* synthetic */ int b = 0;
    private static final byte[] c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final dze d;
    private int A;
    private long B;
    private long C;
    private long D;
    private fhv E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private fdr K;
    private fel[] L;
    private boolean M;
    private long N;
    private final fse O;
    private final dhq P;
    public fel[] a;
    private final fjg e;
    private final int f;
    private final List g;
    private final SparseArray h;
    private final edi i;
    private final edi j;
    private final edi k;
    private final byte[] l;
    private final edi m;
    private final edo n;
    private final edi o;
    private final ArrayDeque p;
    private final ArrayDeque q;
    private final eeh r;
    private final fel s;
    private ImmutableList t;
    private int u;
    private int v;
    private long w;
    private int x;
    private edi y;
    private long z;

    static {
        dzd dzdVar = new dzd();
        dzdVar.d("application/x-emsg");
        d = new dze(dzdVar);
    }

    @Deprecated
    public fhw() {
        this(fjg.a, 32, null, ImmutableList.of(), null);
    }

    private static Pair h(edi ediVar, long j) throws eaf {
        long jS;
        long jS2;
        ediVar.K(8);
        int iB = fhs.b(ediVar.e());
        ediVar.L(4);
        long jR = ediVar.r();
        if (iB == 0) {
            jS = ediVar.r();
            jS2 = ediVar.r();
        } else {
            jS = ediVar.s();
            jS2 = ediVar.s();
        }
        long j2 = j + jS2;
        long jB = edt.B(jS, 1000000L, jR);
        ediVar.L(2);
        int iN = ediVar.n();
        int[] iArr = new int[iN];
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        long[] jArr3 = new long[iN];
        long j3 = j2;
        long jB2 = jB;
        int i = 0;
        while (i < iN) {
            int iE = ediVar.e();
            if ((Integer.MIN_VALUE & iE) != 0) {
                throw new eaf("Unhandled indirect reference", null, true, 1);
            }
            long jR2 = ediVar.r();
            iArr[i] = iE & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            jArr[i] = j3;
            jArr3[i] = jB2;
            jS += jR2;
            long[] jArr4 = jArr3;
            jB2 = edt.B(jS, 1000000L, jR);
            jArr2[i] = jB2 - jArr4[i];
            ediVar.L(4);
            j3 += iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jB), new fdg(iArr, jArr, jArr2, jArr3));
    }

    private static dza i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            edx edxVar = (edx) list.get(i);
            if (edxVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = edxVar.a.a;
                UUID uuidD = fki.d(bArr);
                if (uuidD == null) {
                    edb.e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new dyz(uuidD, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new dza(null, false, (dyz[]) arrayList.toArray(new dyz[0]));
    }

    private final void j() {
        this.u = 0;
        this.x = 0;
    }

    private static void k(edi ediVar, int i, fie fieVar) throws eaf {
        ediVar.K(i + 8);
        int iA = fhs.a(ediVar.e());
        if ((iA & 1) != 0) {
            throw new eaf("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (iA & 2) != 0;
        int iM = ediVar.m();
        if (iM == 0) {
            Arrays.fill(fieVar.l, 0, fieVar.e, false);
            return;
        }
        int i2 = fieVar.e;
        if (iM != i2) {
            throw new eaf(a.ce(i2, iM, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        Arrays.fill(fieVar.l, 0, iM, z);
        fieVar.b(ediVar.a());
        edi ediVar2 = fieVar.n;
        ediVar.F(ediVar2.a, 0, ediVar2.c);
        ediVar2.K(0);
        fieVar.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x0700, code lost:
    
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0703, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(long r56) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhw.l(long):void");
    }

    private static void m(int i) throws eaf {
        if (i < 0) {
            throw new eaf(a.cf(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final fht n(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (fht) sparseArray.valueAt(0);
        }
        fht fhtVar = (fht) sparseArray.get(i);
        fhtVar.getClass();
        return fhtVar;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((fhv) sparseArray.valueAt(i)).f();
        }
        this.q.clear();
        this.A = 0;
        this.r.a.clear();
        this.B = j2;
        this.p.clear();
        j();
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        fej fejVarA = fib.a(fdqVar, true, false);
        this.t = fejVarA != null ? ImmutableList.of(fejVarA) : ImmutableList.of();
        return fejVarA == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        if (r5 <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f6, code lost:
    
        r11 = r7.g;
        r17 = r8[4];
        r2 = defpackage.eee.a;
        r2 = r11.Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0202, code lost:
    
        if (j$.util.Objects.equals(r2, r10) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0204, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020c, code lost:
    
        if (defpackage.eae.k(r11.U, r10) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020f, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0213, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021a, code lost:
    
        if ((r17 & 31) == 6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0220, code lost:
    
        if (j$.util.Objects.equals(r2, "video/hevc") != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0228, code lost:
    
        if (defpackage.eae.k(r11.U, "video/hevc") == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0230, code lost:
    
        if (((r17 & android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle) >> 1) != 39) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0232, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0235, code lost:
    
        r21 = r9;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023b, code lost:
    
        r29.J = r2;
        r12.c(r3, r5);
        r29.G += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0245, code lost:
    
        if (r5 <= 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0249, code lost:
    
        if (r29.I != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0251, code lost:
    
        if (defpackage.eee.h(r8, r5, r7.g) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0253, code lost:
    
        r29.I = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0257, code lost:
    
        r9 = r21;
        r10 = r22;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0260, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026a, code lost:
    
        throw new defpackage.eaf("Invalid NAL length", null, r2, r2 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026b, code lost:
    
        r28 = r2;
        r21 = r9;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0274, code lost:
    
        if (r29.J == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0276, code lost:
    
        r2 = r29.k;
        r2.G(r5);
        r30.j(r2.a, 0, r29.H);
        r12.c(r2, r29.H);
        r5 = r29.H;
        r9 = defpackage.eee.e(r2.a, r2.c);
        r2.K(0);
        r2.J(r9);
        r9 = r7.g.aa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x029d, code lost:
    
        if (r9 != (-1)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        r9 = r29.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a3, code lost:
    
        if (r9.b == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a5, code lost:
    
        r9.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a9, code lost:
    
        r10 = r29.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ad, code lost:
    
        if (r10.b == r9) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02af, code lost:
    
        r10.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b2, code lost:
    
        r9 = r29.r;
        r9.a(r13, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02bf, code lost:
    
        if ((r28.a() & 4) == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c1, code lost:
    
        r9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c5, code lost:
    
        r20 = 4;
        r5 = r12.a(r30, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02cc, code lost:
    
        r29.G += r5;
        r29.H -= r5;
        r9 = r21;
        r10 = r22;
        r2 = r28;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r1 = r28.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e8, code lost:
    
        if (r29.I != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ea, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ed, code lost:
    
        r22 = r1;
        r1 = r28.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f3, code lost:
    
        if (r1 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f5, code lost:
    
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02fa, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02fc, code lost:
    
        r20 = r13;
        r12.e(r20, r22, r29.F, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0309, code lost:
    
        r1 = r29.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030f, code lost:
    
        if (r1.isEmpty() != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0311, code lost:
    
        r1 = (defpackage.fhu) r1.removeFirst();
        r2 = r29.A;
        r9 = r1.c;
        r29.A = r2 - r9;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0322, code lost:
    
        if (r1.b == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0324, code lost:
    
        r2 = r2 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0326, code lost:
    
        if (r4 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0328, code lost:
    
        r2 = r4.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x032c, code lost:
    
        r6 = r2;
        r1 = r29.L;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0331, code lost:
    
        if (r3 >= r2) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0333, code lost:
    
        r1[r3].e(r6, 1, r9, r29.A, null);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0343, code lost:
    
        if (r28.g() != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0345, code lost:
    
        r29.E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0348, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0349, code lost:
    
        r29.u = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x034d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        r10 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r29.u != 3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r2.k != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r4 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r29.F = r4;
        r4 = r2.d.a.g.Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (j$.util.Objects.equals(r4, "video/avc") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        j$.util.Objects.equals(r4, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        r29.I = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r2.f >= r2.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r30.l(r29.F);
        r1 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        r4 = r2.b;
        r6 = r4.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (r1 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r6.L(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r4.c(r2.f) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        r6.L(r6.n() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        if (r2.g() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        r29.E = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
    
        if (r2.d.a.h != 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010c, code lost:
    
        r29.F -= 8;
        r30.l(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.Y) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r29.G = r2.b(r29.F, 7);
        r4 = r29.F;
        r12 = r29.m;
        defpackage.fcx.a(r4, r12);
        r2.a.c(r12, 7);
        r4 = r29.G + 7;
        r29.G = r4;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        r7 = 0;
        r4 = r2.b(r29.F, 0);
        r29.G = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        r29.F += r4;
        r29.u = 4;
        r29.H = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        r4 = r2.d;
        r7 = r4.a;
        r12 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        if (r2.k != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        r13 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r13 = r2.b.a(r2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
    
        r4 = r29.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        r13 = r4.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        r15 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        if (r15 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0178, code lost:
    
        r5 = r29.G;
        r6 = r29.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        if (r5 >= r6) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017e, code lost:
    
        r29.G += r12.a(r30, r6 - r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r3 = r29.j;
        r8 = r3.a;
        r8[0] = 0;
        r8[1] = 0;
        r8[r17] = 0;
        r19 = true;
        r9 = 4 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
    
        if (r29.G >= r29.F) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        r5 = r29.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        if (r5 != 0) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ab, code lost:
    
        if (r29.a.length > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (r29.I != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b2, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        r5 = defpackage.eee.d(r7.g);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c7, code lost:
    
        if ((r15 + r5) <= (r29.F - r29.G)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c9, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        r30.j(r8, r9, r15 + r5);
        r3.K(0);
        r11 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d7, code lost:
    
        if (r11 < 0) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d9, code lost:
    
        r29.H = r11 - r5;
        r11 = r29.i;
        r11.K(0);
        r12.c(r11, 4);
        r29.G += 4;
        r29.F += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f2, code lost:
    
        if (r29.a.length <= 0) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Type inference failed for: r2v153, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r30, defpackage.rsj r31) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhw.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return this.t;
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        int i;
        int i2 = this.f;
        if ((i2 & 32) == 0) {
            fdrVar = new fjj(fdrVar, this.e);
        }
        this.K = fdrVar;
        j();
        fel[] felVarArr = new fel[2];
        this.L = felVarArr;
        fel felVar = this.s;
        int i3 = 0;
        if (felVar != null) {
            felVarArr[0] = felVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            felVarArr[i] = this.K.dq(100, 5);
            i4 = 101;
            i++;
        }
        fel[] felVarArr2 = (fel[]) edt.as(this.L, i);
        this.L = felVarArr2;
        for (fel felVar2 : felVarArr2) {
            felVar2.b(d);
        }
        List list = this.g;
        this.a = new fel[list.size()];
        while (i3 < this.a.length) {
            fel felVarDq = this.K.dq(i4, 3);
            felVarDq.b((dze) list.get(i3));
            this.a[i3] = felVarDq;
            i3++;
            i4++;
        }
    }

    public fhw(fjg fjgVar, int i) {
        this(fjgVar, i, null, ImmutableList.of(), null);
    }

    public fhw(fjg fjgVar, int i, edo edoVar, List list, fel felVar) {
        this.e = fjgVar;
        this.f = i;
        this.n = edoVar;
        this.g = DesugarCollections.unmodifiableList(list);
        this.s = felVar;
        this.O = new fse();
        this.o = new edi(16);
        this.i = new edi(eee.a);
        this.j = new edi(6);
        this.k = new edi();
        byte[] bArr = new byte[16];
        this.l = bArr;
        this.m = new edi(bArr);
        this.p = new ArrayDeque();
        this.q = new ArrayDeque();
        this.h = new SparseArray();
        this.t = ImmutableList.of();
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.K = fdr.F;
        this.L = new fel[0];
        this.a = new fel[0];
        this.r = new eeh(new fml(this, 1));
        this.P = new dhq((byte[]) null, (byte[]) null);
        this.N = -1L;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
