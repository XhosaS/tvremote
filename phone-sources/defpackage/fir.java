package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fir extends fiq {
    private int a;
    private boolean o;
    private feo p;
    private sro q;
    private dhq r;

    @Override // defpackage.fiq
    protected final long a(edi ediVar) {
        byte b = ediVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        sro sroVar = this.q;
        eci.e(sroVar);
        int i = !((shy[]) sroVar.c)[(b >> 1) & (255 >>> (8 - sroVar.a))].a ? ((feo) sroVar.e).e : ((feo) sroVar.e).f;
        int i2 = this.o ? (this.a + i) / 4 : 0;
        int iB = ediVar.b();
        int i3 = ediVar.c + 4;
        if (iB < i3) {
            ediVar.H(Arrays.copyOf(ediVar.a, i3));
        } else {
            ediVar.J(i3);
        }
        long j = i2;
        byte[] bArr = ediVar.a;
        int i4 = ediVar.c;
        bArr[i4 - 4] = (byte) (j & 255);
        bArr[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.o = true;
        this.a = i;
        return j;
    }

    @Override // defpackage.fiq
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.q = null;
            this.p = null;
            this.r = null;
        }
        this.a = 0;
        this.o = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fiq
    protected final boolean c(edi ediVar, long j, hig higVar) throws eaf {
        sro sroVar;
        int i;
        int iA;
        int i2;
        int[] iArr;
        int i3 = 0;
        if (this.q != null) {
            higVar.a.getClass();
            return false;
        }
        feo feoVar = this.p;
        int i4 = 1;
        if (feoVar == null) {
            fki.J(1, ediVar, false);
            ediVar.g();
            int iJ = ediVar.j();
            int iG = ediVar.g();
            int iF = ediVar.f();
            int i5 = iF <= 0 ? -1 : iF;
            int iF2 = ediVar.f();
            int i6 = iF2 <= 0 ? -1 : iF2;
            ediVar.f();
            int iJ2 = ediVar.j();
            int iPow = (int) Math.pow(2.0d, iJ2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iJ2 & 240) >> 4);
            ediVar.j();
            this.p = new feo(iJ, iG, i5, i6, iPow, iPow2, Arrays.copyOf(ediVar.a, ediVar.c));
        } else {
            int i7 = 4;
            dhq dhqVar = this.r;
            if (dhqVar == null) {
                this.r = fki.ai(ediVar, true, true);
            } else {
                int i8 = ediVar.c;
                byte[] bArr = new byte[i8];
                System.arraycopy(ediVar.a, 0, bArr, 0, i8);
                int i9 = feoVar.a;
                int i10 = 5;
                fki.J(5, ediVar, false);
                int iJ3 = ediVar.j() + 1;
                fen fenVar = new fen(ediVar.a);
                int i11 = 8;
                fenVar.b(ediVar.b * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = i3;
                    int i15 = 16;
                    if (i12 < iJ3) {
                        int i16 = i11;
                        if (fenVar.a(24) != 5653314) {
                            throw new eaf("expected code book to start with [0x56, 0x43, 0x42] at " + ((fenVar.a * 8) + fenVar.b), null, true, 1);
                        }
                        int iA2 = fenVar.a(16);
                        int iA3 = fenVar.a(24);
                        if (fenVar.c()) {
                            fenVar.b(i10);
                            for (int iA4 = i14; iA4 < iA3; iA4 += fenVar.a(fki.H(iA3 - iA4))) {
                            }
                        } else {
                            boolean zC = fenVar.c();
                            for (int i17 = i14; i17 < iA3; i17++) {
                                if (!zC) {
                                    fenVar.b(i10);
                                } else if (fenVar.c()) {
                                    fenVar.b(i10);
                                }
                            }
                        }
                        int i18 = i7;
                        int iA5 = fenVar.a(i18);
                        if (iA5 > 2) {
                            throw new eaf(a.cf(iA5, "lookup type greater than 2 not decodable: "), null, true, 1);
                        }
                        if (iA5 != i4) {
                            if (iA5 == 2) {
                            }
                            i12++;
                            i11 = i16;
                            i3 = i14;
                            i7 = 4;
                            i10 = 5;
                            i4 = 1;
                        } else {
                            i13 = iA5;
                        }
                        fenVar.b(32);
                        fenVar.b(32);
                        int iA6 = fenVar.a(i18) + i4;
                        fenVar.b(i4);
                        fenVar.b((int) ((i13 == i4 ? iA2 != 0 ? (long) Math.floor(Math.pow(iA3, 1.0d / iA2)) : 0L : iA2 * iA3) * iA6));
                        i12++;
                        i11 = i16;
                        i3 = i14;
                        i7 = 4;
                        i10 = 5;
                        i4 = 1;
                    } else {
                        int i19 = i11;
                        boolean z = i4;
                        int i20 = 6;
                        int iA7 = fenVar.a(6) + (z ? 1 : 0);
                        for (int i21 = i14; i21 < iA7; i21++) {
                            if (fenVar.a(16) != 0) {
                                throw new eaf("placeholder of time domain transforms not zeroed out", null, z, z ? 1 : 0);
                            }
                        }
                        int iA8 = fenVar.a(6) + (z ? 1 : 0);
                        int i22 = i14;
                        int i23 = z;
                        while (true) {
                            int i24 = 3;
                            if (i22 < iA8) {
                                int iA9 = fenVar.a(i15);
                                if (iA9 == 0) {
                                    int i25 = i19;
                                    fenVar.b(i25);
                                    fenVar.b(16);
                                    fenVar.b(16);
                                    fenVar.b(6);
                                    fenVar.b(i25);
                                    int iA10 = fenVar.a(4) + i23;
                                    int i26 = i14;
                                    while (i26 < iA10) {
                                        fenVar.b(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (iA9 != i23) {
                                        throw new eaf(a.cf(iA9, "floor type greater than 1 not decodable: "), null, true, 1);
                                    }
                                    int iA11 = fenVar.a(5);
                                    int[] iArr2 = new int[iA11];
                                    int i27 = -1;
                                    for (int i28 = i14; i28 < iA11; i28++) {
                                        int iA12 = fenVar.a(4);
                                        iArr2[i28] = iA12;
                                        if (iA12 > i27) {
                                            i27 = iA12;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr3 = new int[i29];
                                    int i30 = i14;
                                    while (i30 < i29) {
                                        int i31 = 1;
                                        iArr3[i30] = fenVar.a(i24) + 1;
                                        int iA13 = fenVar.a(2);
                                        if (iA13 > 0) {
                                            i2 = i19;
                                            fenVar.b(i2);
                                        } else {
                                            i2 = i19;
                                        }
                                        int i32 = i29;
                                        int i33 = i14;
                                        while (true) {
                                            int i34 = i31 << iA13;
                                            iArr = iArr2;
                                            if (i33 < i34) {
                                                fenVar.b(i2);
                                                i33++;
                                                iArr2 = iArr;
                                                i2 = 8;
                                                i31 = 1;
                                            }
                                        }
                                        i30++;
                                        iArr2 = iArr;
                                        i29 = i32;
                                        i19 = 8;
                                        i24 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    fenVar.b(2);
                                    int iA14 = fenVar.a(4);
                                    int i35 = i14;
                                    int i36 = i35;
                                    int i37 = i36;
                                    while (i35 < iA11) {
                                        i36 += iArr3[iArr4[i35]];
                                        while (i37 < i36) {
                                            fenVar.b(iA14);
                                            i37++;
                                        }
                                        i35++;
                                    }
                                }
                                i22++;
                                i19 = 8;
                                i20 = 6;
                                i15 = 16;
                                i23 = 1;
                            } else {
                                int i38 = 1;
                                int iA15 = fenVar.a(i20) + 1;
                                int i39 = i14;
                                while (i39 < iA15) {
                                    if (fenVar.a(16) > 2) {
                                        throw new eaf("residueType greater than 2 is not decodable", null, true, 1);
                                    }
                                    fenVar.b(24);
                                    fenVar.b(24);
                                    fenVar.b(24);
                                    int iA16 = fenVar.a(i20) + i38;
                                    int i40 = 8;
                                    fenVar.b(8);
                                    int[] iArr5 = new int[iA16];
                                    for (int i41 = i14; i41 < iA16; i41++) {
                                        iArr5[i41] = ((fenVar.c() ? fenVar.a(5) : i14) * 8) + fenVar.a(3);
                                    }
                                    int i42 = i14;
                                    while (i42 < iA16) {
                                        int i43 = i14;
                                        while (i43 < i40) {
                                            if ((iArr5[i42] & (1 << i43)) != 0) {
                                                fenVar.b(i40);
                                            }
                                            i43++;
                                            i40 = 8;
                                        }
                                        i42++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    i20 = 6;
                                    i38 = 1;
                                }
                                int iA17 = fenVar.a(i20) + i38;
                                for (int i44 = i14; i44 < iA17; i44++) {
                                    int iA18 = fenVar.a(16);
                                    if (iA18 != 0) {
                                        edb.c("VorbisUtil", a.cf(iA18, "mapping type other than 0 not supported: "));
                                    } else {
                                        if (fenVar.c()) {
                                            i = 1;
                                            iA = fenVar.a(4) + 1;
                                        } else {
                                            i = 1;
                                            iA = 1;
                                        }
                                        if (fenVar.c()) {
                                            int iA19 = fenVar.a(8) + i;
                                            for (int i45 = i14; i45 < iA19; i45++) {
                                                int i46 = i9 - 1;
                                                fenVar.b(fki.H(i46));
                                                fenVar.b(fki.H(i46));
                                            }
                                        }
                                        if (fenVar.a(2) != 0) {
                                            throw new eaf("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                        }
                                        if (iA > 1) {
                                            for (int i47 = i14; i47 < i9; i47++) {
                                                fenVar.b(4);
                                            }
                                        }
                                        for (int i48 = i14; i48 < iA; i48++) {
                                            fenVar.b(8);
                                            fenVar.b(8);
                                            fenVar.b(8);
                                        }
                                    }
                                }
                                int iA20 = fenVar.a(6);
                                int i49 = iA20 + 1;
                                shy[] shyVarArr = new shy[i49];
                                for (int i50 = i14; i50 < i49; i50++) {
                                    boolean zC2 = fenVar.c();
                                    fenVar.a(16);
                                    fenVar.a(16);
                                    fenVar.a(8);
                                    shyVarArr[i50] = new shy(zC2);
                                }
                                if (!fenVar.c()) {
                                    throw new eaf("framing bit after modes not set as expected", null, true, 1);
                                }
                                sroVar = new sro(feoVar, dhqVar, bArr, shyVarArr, fki.H(iA20));
                            }
                        }
                    }
                }
            }
        }
        sroVar = null;
        this.q = sroVar;
        if (sroVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        feo feoVar2 = (feo) sroVar.e;
        arrayList.add(feoVar2.g);
        arrayList.add(sroVar.b);
        ead eadVarI = fki.I(ImmutableList.copyOf((Object[]) ((dhq) sroVar.d).a));
        dzd dzdVar = new dzd();
        dzdVar.a("audio/ogg");
        dzdVar.d("audio/vorbis");
        dzdVar.h = feoVar2.d;
        dzdVar.i = feoVar2.c;
        dzdVar.E = feoVar2.a;
        dzdVar.F = feoVar2.b;
        dzdVar.p = arrayList;
        dzdVar.k = eadVarI;
        higVar.a = new dze(dzdVar);
        return true;
    }

    @Override // defpackage.fiq
    protected final void g(long j) {
        this.h = j;
        this.o = j != 0;
        feo feoVar = this.p;
        this.a = feoVar != null ? feoVar.e : 0;
    }
}
