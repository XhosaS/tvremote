package defpackage;

import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhb implements fdp {
    public static final Map c;
    private final fhc C;
    private final SparseArray D;
    private final boolean E;
    private final fjg F;
    private final edi G;
    private final edi H;
    private final edi I;
    private final edi J;
    private final edi K;
    private final edi L;
    private final edi M;
    private final edi N;
    private final edi O;
    private final edi P;
    private ByteBuffer Q;
    private long R;
    private boolean S;
    private int T;
    private long U;
    private int V;
    private int W;
    private int[] X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private byte ai;
    private boolean aj;
    private final fgz ak;
    public final boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public fha k;
    public boolean l;
    public int m;
    public long n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public long s;
    public int t;
    public boolean u;
    public long v;
    public fdr w;
    public ira x;
    public ira y;
    private static final byte[] z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = edt.ar("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] A = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] B = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        c = DesugarCollections.unmodifiableMap(map);
    }

    @Deprecated
    public fhb() {
        this(new fgz(), 2, fjg.a);
    }

    private final int n() {
        int i = this.ac;
        s();
        return i;
    }

    private final int o(fdq fdqVar, fha fhaVar, int i, boolean z2) throws eaf {
        int i2;
        if ("S_TEXT/UTF8".equals(fhaVar.c)) {
            t(fdqVar, z, i);
            return n();
        }
        if ("S_TEXT/ASS".equals(fhaVar.c) || "S_TEXT/SSA".equals(fhaVar.c)) {
            t(fdqVar, A, i);
            return n();
        }
        if ("S_TEXT/WEBVTT".equals(fhaVar.c)) {
            t(fdqVar, B, i);
            return n();
        }
        fel felVar = fhaVar.Z;
        if (!this.ae) {
            if (fhaVar.i) {
                this.aa &= -1073741825;
                if (!this.af) {
                    edi ediVar = this.I;
                    fdqVar.j(ediVar.a, 0, 1);
                    this.ab++;
                    byte b2 = ediVar.a[0];
                    if ((b2 & 128) == 128) {
                        throw new eaf("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.ai = b2;
                    this.af = true;
                }
                byte b3 = this.ai;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.aa |= 1073741824;
                    if (!this.aj) {
                        edi ediVar2 = this.N;
                        fdqVar.j(ediVar2.a, 0, 8);
                        this.ab += 8;
                        this.aj = true;
                        edi ediVar3 = this.I;
                        ediVar3.a[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        ediVar3.K(0);
                        felVar.d(ediVar3, 1, 1);
                        this.ac++;
                        ediVar2.K(0);
                        felVar.d(ediVar2, 8, 1);
                        this.ac += 8;
                    }
                    if (i3 == 2) {
                        if (!this.ag) {
                            edi ediVar4 = this.I;
                            fdqVar.j(ediVar4.a, 0, 1);
                            this.ab++;
                            ediVar4.K(0);
                            this.ah = ediVar4.j();
                            this.ag = true;
                        }
                        int i4 = this.ah * 4;
                        edi ediVar5 = this.I;
                        ediVar5.G(i4);
                        fdqVar.j(ediVar5.a, 0, i4);
                        this.ab += i4;
                        int i5 = (this.ah >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        ByteBuffer byteBuffer = this.Q;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.Q = ByteBuffer.allocate(i6);
                        }
                        this.Q.position(0);
                        this.Q.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.ah;
                            if (i7 >= i2) {
                                break;
                            }
                            int iM = ediVar5.m();
                            int i9 = iM - i8;
                            if (i7 % 2 == 0) {
                                this.Q.putShort((short) i9);
                            } else {
                                this.Q.putInt(i9);
                            }
                            i7++;
                            i8 = iM;
                        }
                        int i10 = (i - this.ab) - i8;
                        if ((i2 & 1) == 1) {
                            this.Q.putInt(i10);
                        } else {
                            this.Q.putShort((short) i10);
                            this.Q.putInt(0);
                        }
                        edi ediVar6 = this.O;
                        ediVar6.I(this.Q.array(), i6);
                        felVar.d(ediVar6, i6, 1);
                        this.ac += i6;
                    }
                }
            } else {
                byte[] bArr = fhaVar.j;
                if (bArr != null) {
                    this.L.I(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(fhaVar.c) ? fhaVar.g > 0 : z2) {
                this.aa |= 268435456;
                this.P.G(0);
                int i11 = (this.L.c + i) - this.ab;
                edi ediVar7 = this.I;
                ediVar7.G(4);
                byte[] bArr2 = ediVar7.a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                felVar.d(ediVar7, 4, 2);
                this.ac += 4;
            }
            this.ae = true;
        }
        edi ediVar8 = this.L;
        int i12 = i + ediVar8.c;
        if (!"V_MPEG4/ISO/AVC".equals(fhaVar.c) && !"V_MPEGH/ISO/HEVC".equals(fhaVar.c)) {
            if (fhaVar.V != null) {
                a.ab(ediVar8.c == 0);
                fhaVar.V.d(fdqVar);
            }
            while (true) {
                int i13 = this.ab;
                if (i13 >= i12) {
                    break;
                }
                int iP = p(fdqVar, felVar, i12 - i13);
                this.ab += iP;
                this.ac += iP;
            }
        } else {
            edi ediVar9 = this.H;
            byte[] bArr3 = ediVar9.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = fhaVar.aa;
            int i15 = 4 - i14;
            while (this.ab < i12) {
                int i16 = this.ad;
                if (i16 == 0) {
                    int iMin = Math.min(i14, ediVar8.a());
                    fdqVar.j(bArr3, i15 + iMin, i14 - iMin);
                    if (iMin > 0) {
                        ediVar8.F(bArr3, i15, iMin);
                    }
                    this.ab += i14;
                    ediVar9.K(0);
                    this.ad = ediVar9.m();
                    edi ediVar10 = this.G;
                    ediVar10.K(0);
                    felVar.c(ediVar10, 4);
                    this.ac += 4;
                } else {
                    int iP2 = p(fdqVar, felVar, i16);
                    this.ab += iP2;
                    this.ac += iP2;
                    this.ad -= iP2;
                }
            }
        }
        if ("A_VORBIS".equals(fhaVar.c)) {
            edi ediVar11 = this.J;
            ediVar11.K(0);
            felVar.c(ediVar11, 4);
            this.ac += 4;
        }
        return n();
    }

    private final int p(fdq fdqVar, fel felVar, int i) {
        edi ediVar = this.L;
        int iA = ediVar.a();
        if (iA <= 0) {
            return felVar.a(fdqVar, i, false);
        }
        int iMin = Math.min(i, iA);
        felVar.c(ediVar, iMin);
        return iMin;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        r2 = u(r10, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(defpackage.fha r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.q(fha, long, int, int, int):void");
    }

    private final void r(fdq fdqVar, int i) {
        edi ediVar = this.I;
        if (ediVar.c >= i) {
            return;
        }
        if (ediVar.b() < i) {
            int iB = ediVar.b();
            ediVar.D(Math.max(iB + iB, i));
        }
        byte[] bArr = ediVar.a;
        int i2 = ediVar.c;
        fdqVar.j(bArr, i2, i - i2);
        ediVar.J(i);
    }

    private final void s() {
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = 0;
        this.ai = (byte) 0;
        this.aj = false;
        this.L.G(0);
    }

    private final void t(fdq fdqVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        edi ediVar = this.M;
        if (ediVar.b() < i2) {
            ediVar.H(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, ediVar.a, 0, length);
        }
        fdqVar.j(ediVar.a, length, i);
        ediVar.K(0);
        ediVar.J(i2);
    }

    private static byte[] u(long j, String str, long j2) {
        a.H(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return edt.ar(String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] v(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.q = -9223372036854775807L;
        int i = 0;
        this.T = 0;
        fgz fgzVar = this.ak;
        fgzVar.d = 0;
        fgzVar.b.clear();
        fgzVar.c.d();
        this.C.d();
        s();
        while (true) {
            SparseArray sparseArray = this.D;
            if (i >= sparseArray.size()) {
                return;
            }
            fem femVar = ((fha) sparseArray.valueAt(i)).V;
            if (femVar != null) {
                femVar.b();
            }
            i++;
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        nue nueVar = new nue((byte[]) null, (byte[]) null);
        long j = ((fdi) fdqVar).a;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        edi ediVar = (edi) nueVar.b;
        fdqVar.i(ediVar.a, 0, 4);
        long jR = ediVar.r();
        nueVar.a = 4;
        while (true) {
            if (jR != 440786851) {
                int i = (int) j2;
                int i2 = nueVar.a + 1;
                nueVar.a = i2;
                if (i2 == i) {
                    break;
                }
                fdqVar.i(ediVar.a, 0, 1);
                jR = ((jR << 8) & (-256)) | (ediVar.a[0] & 255);
            } else {
                long jL = nueVar.l(fdqVar);
                long j3 = nueVar.a;
                if (jL != Long.MIN_VALUE) {
                    long j4 = j3 + jL;
                    if (j == -1 || j4 < j) {
                        while (true) {
                            long j5 = nueVar.a;
                            if (j5 < j4) {
                                if (nueVar.l(fdqVar) == Long.MIN_VALUE) {
                                    break;
                                }
                                long jL2 = nueVar.l(fdqVar);
                                if (jL2 < 0) {
                                    break;
                                }
                                if (jL2 != 0) {
                                    int i3 = (int) jL2;
                                    fdqVar.g(i3);
                                    nueVar.a += i3;
                                }
                            } else if (j5 == j4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a12, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0c21, code lost:
    
        r4 = ((defpackage.fdi) r3).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0c28, code lost:
    
        if (r0.o == false) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0c2a, code lost:
    
        r0.R = r4;
        r37.a = r0.p;
        r0.o = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0c32, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0c36, code lost:
    
        if (r0.l == false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0c38, code lost:
    
        r4 = r0.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0c3c, code lost:
    
        if (r4 == (-1)) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0c3e, code lost:
    
        r37.a = r4;
        r0.R = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0c46, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a6d A[LOOP:1: B:6:0x0012->B:555:0x0a6d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0a79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0b53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0b60 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0b7e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c0e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v54 */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r36, defpackage.rsj r37) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 3918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.g(fdq, rsj):int");
    }

    public final long h(long j) throws eaf {
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            return edt.B(j, j2, 1000L);
        }
        throw new eaf("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    public final fha i(int i) {
        k(i);
        return this.k;
    }

    public final void j(int i) {
        if (this.x == null || this.y == null) {
            throw new eaf(a.cd(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    public final void k(int i) {
        if (this.k == null) {
            throw new eaf(a.cd(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    public final void l() {
        eci.e(this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void m(int i, int i2, fdq fdqVar) throws eaf {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        Throwable th = null;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.T != 2) {
                    return;
                }
                fha fhaVar = (fha) this.D.get(this.Y);
                if (this.t != 4 || !"V_VP9".equals(fhaVar.c)) {
                    fdqVar.l(i2);
                    return;
                }
                edi ediVar = this.P;
                ediVar.G(i2);
                fdqVar.j(ediVar.a, 0, i2);
                return;
            }
            if (i10 == 16877) {
                fha fhaVarI = i(i);
                int i13 = fhaVarI.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    fdqVar.l(i2);
                    return;
                } else {
                    fhaVarI.P = new byte[i2];
                    fdqVar.j(fhaVarI.P, 0, i2);
                    return;
                }
            }
            if (i10 == 16981) {
                k(i);
                fha fhaVar2 = this.k;
                fhaVar2.j = new byte[i2];
                fdqVar.j(fhaVar2.j, 0, i2);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr = new byte[i2];
                fdqVar.j(bArr, 0, i2);
                i(i).k = new fek(1, bArr, 0, 0);
                return;
            }
            if (i10 == 21419) {
                edi ediVar2 = this.K;
                Arrays.fill(ediVar2.a, (byte) 0);
                fdqVar.j(ediVar2.a, 4 - i2, i2);
                ediVar2.K(0);
                this.m = (int) ediVar2.r();
                return;
            }
            if (i10 == 25506) {
                k(i);
                fha fhaVar3 = this.k;
                fhaVar3.l = new byte[i2];
                fdqVar.j(fhaVar3.l, 0, i2);
                return;
            }
            if (i10 != 30322) {
                throw new eaf(a.cf(i10, "Unexpected id: "), null, true, 1);
            }
            k(i);
            fha fhaVar4 = this.k;
            fhaVar4.x = new byte[i2];
            fdqVar.j(fhaVar4.x, 0, i2);
            return;
        }
        int i14 = 8;
        if (this.T == 0) {
            fhc fhcVar = this.C;
            this.Y = (int) fhcVar.c(fdqVar, false, true, 8);
            this.Z = fhcVar.a;
            this.s = -9223372036854775807L;
            this.T = 1;
            this.I.G(0);
        }
        fha fhaVar5 = (fha) this.D.get(this.Y);
        if (fhaVar5 == null) {
            fdqVar.l(i2 - this.Z);
            this.T = 0;
            return;
        }
        fhaVar5.c();
        if (this.T == 1) {
            r(fdqVar, 3);
            edi ediVar3 = this.I;
            int i15 = (ediVar3.a[2] & 6) >> 1;
            if (i15 == 0) {
                this.W = 1;
                int[] iArrV = v(this.X, 1);
                this.X = iArrV;
                iArrV[0] = (i2 - this.Z) - 3;
            } else {
                r(fdqVar, 4);
                int i16 = (ediVar3.a[3] & 255) + 1;
                this.W = i16;
                int[] iArrV2 = v(this.X, i16);
                this.X = iArrV2;
                if (i15 == 2) {
                    int i17 = (i2 - this.Z) - 4;
                    int i18 = this.W;
                    Arrays.fill(iArrV2, 0, i18, i17 / i18);
                } else {
                    if (i15 != 1) {
                        if (i15 != 3) {
                            throw new eaf("Unexpected lacing value: 2", null, true, 1);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = this.W - 1;
                            if (i19 >= i22) {
                                i4 = i11;
                                this.X[i22] = ((i2 - this.Z) - i21) - i20;
                                break;
                            }
                            this.X[i19] = i11;
                            int i23 = i21 + 1;
                            r(fdqVar, i23);
                            int i24 = i11;
                            if (ediVar3.a[i21] == 0) {
                                boolean z2 = i12;
                                throw new eaf("No valid varint length mask found", th, z2, z2 ? 1 : 0);
                            }
                            int i25 = i24;
                            while (true) {
                                if (i25 >= i14) {
                                    i5 = i14;
                                    j = 0;
                                    break;
                                }
                                i5 = i14;
                                int i26 = i12 << (7 - i25);
                                if ((ediVar3.a[i21] & i26) != 0) {
                                    i23 += i25;
                                    r(fdqVar, i23);
                                    j = ediVar3.a[i21] & 255 & (~i26);
                                    for (int i27 = i21 + 1; i27 < i23; i27++) {
                                        j = (j << i5) | (ediVar3.a[i27] & 255);
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i25 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i14 = i5;
                                    i12 = 1;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.X;
                            int i28 = (int) j;
                            if (i19 != 0) {
                                i28 += iArr[i19 - 1];
                            }
                            iArr[i19] = i28;
                            i20 += i28;
                            i19++;
                            i21 = i23;
                            i11 = i24;
                            i14 = i5;
                            th = null;
                            i12 = 1;
                        }
                        throw new eaf("EBML lacing sample size out of range.", null, true, 1);
                    }
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        i6 = this.W - 1;
                        if (i29 >= i6) {
                            break;
                        }
                        this.X[i29] = 0;
                        while (true) {
                            i7 = i31 + 1;
                            r(fdqVar, i7);
                            int i32 = ediVar3.a[i31] & 255;
                            int[] iArr2 = this.X;
                            i8 = iArr2[i29] + i32;
                            iArr2[i29] = i8;
                            if (i32 != 255) {
                                break;
                            } else {
                                i31 = i7;
                            }
                        }
                        i30 += i8;
                        i29++;
                        i31 = i7;
                    }
                    this.X[i6] = ((i2 - this.Z) - i31) - i30;
                }
            }
            i4 = 0;
            int i33 = ediVar3.a[i4] << 8;
            this.U = this.q + h((r2[1] & 255) | i33);
            if (fhaVar5.e == 2) {
                i9 = 1;
                this.aa = i9;
                this.T = 2;
                this.V = i4;
                i3 = 163;
            } else {
                if (i10 != 163) {
                    i9 = i4;
                } else if ((ediVar3.a[2] & 128) == 128) {
                    i10 = 163;
                    i9 = 1;
                } else {
                    i9 = i4;
                    i10 = 163;
                }
                this.aa = i9;
                this.T = 2;
                this.V = i4;
                i3 = 163;
            }
        } else {
            i3 = 163;
        }
        if (i10 == i3) {
            while (true) {
                int i34 = this.V;
                if (i34 >= this.W) {
                    this.T = 0;
                    return;
                }
                int iO = o(fdqVar, fhaVar5, this.X[i34], false);
                fha fhaVar6 = fhaVar5;
                q(fhaVar6, this.U + ((this.V * fhaVar5.f) / 1000), this.aa, iO, 0);
                this.V++;
                fhaVar5 = fhaVar6;
            }
        } else {
            while (true) {
                int i35 = this.V;
                if (i35 >= this.W) {
                    return;
                }
                int[] iArr3 = this.X;
                iArr3[i35] = o(fdqVar, fhaVar5, iArr3[i35], true);
                this.V++;
            }
        }
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        if (this.E) {
            fdrVar = new fjj(fdrVar, this.F);
        }
        this.w = fdrVar;
    }

    public fhb(fgz fgzVar, int i, fjg fjgVar) {
        this.f = -1L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.p = -1L;
        this.R = -1L;
        this.q = -9223372036854775807L;
        this.ak = fgzVar;
        fgzVar.g = new pku(this);
        this.F = fjgVar;
        this.d = 1 == ((i & 1) ^ 1);
        this.E = (i & 2) == 0;
        this.C = new fhc();
        this.D = new SparseArray();
        this.I = new edi(4);
        this.J = new edi(ByteBuffer.allocate(4).putInt(-1).array());
        this.K = new edi(4);
        this.G = new edi(eee.a);
        this.H = new edi(4);
        this.L = new edi();
        this.M = new edi();
        this.N = new edi(8);
        this.O = new edi();
        this.P = new edi();
        this.X = new int[1];
    }

    public fhb(fjg fjgVar, int i) {
        this(new fgz(), i, fjgVar);
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
