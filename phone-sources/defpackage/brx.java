package defpackage;

import android.graphics.Shader;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyInputElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class brx {
    public brx() {
    }

    public static float[] A(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static /* synthetic */ bov B(bov bovVar, bpk bpkVar) {
        boolean zS = a.s(bovVar.b, 12884901888L);
        bot botVar = bot.b;
        if (zS) {
            bovVar.getClass();
            bpi bpiVar = (bpi) bovVar;
            bpk bpkVar2 = bpiVar.d;
            if (!w(bpkVar2, bpkVar)) {
                return new bpi(bpiVar.a, bpiVar.h, bpkVar, z(x(botVar.c, bpkVar2.a(), bpkVar.a()), bpiVar.i), bpiVar.k, bpiVar.n, bpiVar.e, bpiVar.f, bpiVar.g, -1);
            }
        }
        return bovVar;
    }

    public static void C(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static bpa D(bov bovVar, bov bovVar2) {
        if (bovVar == bovVar2) {
            return new boy(bovVar);
        }
        if (!a.s(bovVar.b, 12884901888L) || !a.s(bovVar2.b, 12884901888L)) {
            return new bpa(bovVar, bovVar2, 0);
        }
        bovVar.getClass();
        bovVar2.getClass();
        return new boz((bpi) bovVar, (bpi) bovVar2);
    }

    public static long E(float f, float f2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        long j = bop.a;
        return (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    public static /* synthetic */ void F(bpq bpqVar, long j, float f, long j2, brx brxVar, int i) {
        if ((i & 2) != 0) {
            f = bna.b(bpqVar.n()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = bpqVar.m();
        }
        long j3 = j2;
        float f3 = (i & 8) != 0 ? 1.0f : 0.0f;
        if ((i & 16) != 0) {
            brxVar = bps.a;
        }
        bpqVar.w(j, f2, j3, f3, brxVar);
    }

    public static /* synthetic */ void G(bpq bpqVar, bnn bnnVar, long j, long j2, float f, brx brxVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        bpqVar.t(bnnVar, j3, (i2 & 4) != 0 ? a.at(bpqVar.n(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? bps.a : brxVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void H(bpq bpqVar, bnn bnnVar, long j, long j2, long j3, brx brxVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = a.at(bpqVar.n(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        if ((i & 32) != 0) {
            brxVar = bps.a;
        }
        bpqVar.y(bnnVar, j, j2, j3, f, brxVar);
    }

    public static /* synthetic */ void I(bpq bpqVar, bni bniVar, long j, brx brxVar, int i) {
        if ((i & 8) != 0) {
            brxVar = bps.a;
        }
        bpqVar.x(bniVar, j, (i & 4) != 0 ? 1.0f : 0.0f, brxVar);
    }

    public static /* synthetic */ void J(bpq bpqVar, bni bniVar, bnn bnnVar, float f, brx brxVar, int i) {
        if ((i & 8) != 0) {
            brxVar = bps.a;
        }
        brx brxVar2 = brxVar;
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        bpqVar.u(bniVar, bnnVar, f, brxVar2, i2);
    }

    private static void K(bni bniVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            K(bniVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * dSqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = dSqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double dAtan2 = Math.atan2(d12 - d9, d15 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d16 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 += dAtan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * dCos;
        double d28 = d26 * dSin;
        double d29 = d25 * dSin;
        double d30 = d26 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d32 * dSin3;
        double d34 = d6 * dSin2;
        double d35 = d34 * dCos3;
        double d36 = d31 * dSin2;
        double d37 = d6 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = d2;
        double d40 = dAtan22;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = dAtan2;
        double d44 = d;
        while (i < iCeil) {
            int i2 = i;
            double d45 = d43 + (d40 / iCeil);
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d45 - d43;
            double dTan = Math.tan(d46 / 2.0d);
            double dSin5 = (Math.sin(d46) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * dSin5);
            int i3 = iCeil;
            double d48 = d29 + d30 + (d10 * dSin2 * dCos4) + (d37 * dSin4);
            double d49 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
            d42 = (dSin4 * d36) + (dCos4 * d37);
            d41 = (d32 * dSin4) - (d34 * dCos4);
            bniVar.d((float) (d44 + (d41 * dSin5)), (float) d47, (float) (d49 - (dSin5 * d41)), (float) (d48 - (dSin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            dCos2 = dCos2;
            d36 = d36;
            d39 = d48;
            iCeil = i3;
            dSin2 = dSin2;
            d10 = d5;
        }
    }

    public static int a(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static long b(KeyEvent keyEvent) {
        return bny.K(keyEvent.getKeyCode());
    }

    public static bkp c(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new KeyInputElement(yjvVar, null));
    }

    public static void d(bqk bqkVar, brm brmVar) {
        List list = brmVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            brx brxVar = (brx) list.get(i);
            if (brxVar instanceof brp) {
                bqn bqnVar = new bqn();
                brp brpVar = (brp) brxVar;
                bqnVar.c = brpVar.b;
                bqnVar.m = true;
                bqnVar.f();
                bqnVar.p.m(brpVar.c);
                bqnVar.f();
                String str = brpVar.a;
                bqnVar.f();
                bqnVar.a = brpVar.d;
                bqnVar.f();
                bqnVar.b = brpVar.e;
                bqnVar.f();
                bqnVar.f = brpVar.f;
                bqnVar.f();
                bqnVar.d = brpVar.g;
                bqnVar.f();
                bqnVar.e = brpVar.h;
                bqnVar.n = true;
                bqnVar.f();
                bqnVar.g = brpVar.i;
                bqnVar.n = true;
                bqnVar.f();
                bqnVar.h = brpVar.j;
                bqnVar.n = true;
                bqnVar.f();
                bqnVar.i = brpVar.k;
                bqnVar.n = true;
                bqnVar.f();
                bqnVar.j = brpVar.l;
                bqnVar.o = true;
                bqnVar.f();
                bqnVar.k = brpVar.m;
                bqnVar.o = true;
                bqnVar.f();
                bqnVar.l = brpVar.n;
                bqnVar.o = true;
                bqnVar.f();
                bqkVar.c(i, bqnVar);
            } else if (brxVar instanceof brm) {
                bqk bqkVar2 = new bqk();
                brm brmVar2 = (brm) brxVar;
                bqkVar2.f = brmVar2.a;
                bqkVar2.f();
                bqkVar2.g = brmVar2.b;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.j = brmVar2.e;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.k = brmVar2.f;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.l = brmVar2.g;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.m = brmVar2.h;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.h = brmVar2.c;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.i = brmVar2.d;
                bqkVar2.n = true;
                bqkVar2.f();
                bqkVar2.c = brmVar2.i;
                bqkVar2.d = true;
                bqkVar2.f();
                d(bqkVar2, brmVar2);
                bqkVar.c(i, bqkVar2);
            }
        }
    }

    public static void e(List list, bni bniVar) {
        int i;
        float f;
        int i2;
        brh brhVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        List list2 = list;
        bni bniVar2 = bniVar;
        int iA = bniVar2.a();
        bniVar2.l();
        bniVar2.m(iA);
        brh brhVar2 = list2.isEmpty() ? bqp.a : (brh) list2.get(0);
        int size = list2.size();
        float f16 = 0.0f;
        int i3 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i3 < size) {
            brh brhVar3 = (brh) list2.get(i3);
            if (brhVar3 instanceof bqp) {
                bniVar2.c();
                i = size;
                f = f16;
                i2 = i3;
                brhVar = brhVar3;
                f17 = f21;
                f20 = f17;
                f18 = f22;
                f19 = f18;
            } else {
                if (brhVar3 instanceof brb) {
                    brb brbVar = (brb) brhVar3;
                    float f23 = brbVar.a;
                    f19 += f23;
                    float f24 = brbVar.b;
                    f20 += f24;
                    bniVar2.a.rMoveTo(f23, f24);
                    i = size;
                    f = f16;
                    i2 = i3;
                    f22 = f19;
                    f21 = f20;
                } else {
                    if (brhVar3 instanceof bqt) {
                        bqt bqtVar = (bqt) brhVar3;
                        float f25 = bqtVar.a;
                        float f26 = bqtVar.b;
                        bniVar2.f(f25, f26);
                        f20 = f26;
                        f21 = f20;
                        f19 = f25;
                        f22 = f19;
                    } else {
                        if (brhVar3 instanceof bra) {
                            bra braVar = (bra) brhVar3;
                            float f27 = braVar.a;
                            f15 = braVar.b;
                            bniVar2.i(f27, f15);
                            f19 += f27;
                        } else {
                            if (brhVar3 instanceof bqs) {
                                bqs bqsVar = (bqs) brhVar3;
                                f4 = bqsVar.a;
                                f5 = bqsVar.b;
                                bniVar2.e(f4, f5);
                            } else if (brhVar3 instanceof bqz) {
                                float f28 = ((bqz) brhVar3).a;
                                bniVar2.i(f28, f16);
                                f19 += f28;
                            } else if (brhVar3 instanceof bqr) {
                                float f29 = ((bqr) brhVar3).a;
                                bniVar2.e(f29, f20);
                                f19 = f29;
                            } else if (brhVar3 instanceof brf) {
                                f15 = ((brf) brhVar3).a;
                                bniVar2.i(f16, f15);
                            } else if (brhVar3 instanceof brg) {
                                float f30 = ((brg) brhVar3).a;
                                bniVar2.e(f19, f30);
                                f20 = f30;
                            } else {
                                if (brhVar3 instanceof bqy) {
                                    bqy bqyVar = (bqy) brhVar3;
                                    float f31 = bqyVar.a;
                                    float f32 = bqyVar.b;
                                    f11 = bqyVar.c;
                                    f12 = bqyVar.d;
                                    f13 = bqyVar.e;
                                    f14 = bqyVar.f;
                                    bniVar2.h(f31, f32, f11, f12, f13, f14);
                                } else {
                                    if (brhVar3 instanceof bqq) {
                                        bqq bqqVar = (bqq) brhVar3;
                                        float f33 = bqqVar.a;
                                        float f34 = bqqVar.b;
                                        f18 = bqqVar.c;
                                        f6 = bqqVar.d;
                                        f7 = bqqVar.e;
                                        f8 = bqqVar.f;
                                        bniVar.d(f33, f34, f18, f6, f7, f8);
                                    } else if (brhVar3 instanceof brd) {
                                        if (brhVar2.h) {
                                            f9 = f19 - f18;
                                            f10 = f20 - f17;
                                        } else {
                                            f9 = f16;
                                            f10 = f9;
                                        }
                                        brd brdVar = (brd) brhVar3;
                                        f11 = brdVar.a;
                                        f12 = brdVar.b;
                                        f13 = brdVar.c;
                                        f14 = brdVar.d;
                                        bniVar.h(f9, f10, f11, f12, f13, f14);
                                    } else if (brhVar3 instanceof bqv) {
                                        if (brhVar2.h) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        bqv bqvVar = (bqv) brhVar3;
                                        f18 = bqvVar.a;
                                        f6 = bqvVar.b;
                                        f7 = bqvVar.c;
                                        f8 = bqvVar.d;
                                        bniVar.d(f19, f20, f18, f6, f7, f8);
                                    } else if (brhVar3 instanceof brc) {
                                        brc brcVar = (brc) brhVar3;
                                        float f35 = brcVar.a;
                                        float f36 = brcVar.b;
                                        float f37 = brcVar.c;
                                        float f38 = brcVar.d;
                                        bniVar.j(f35, f36, f37, f38);
                                        float f39 = f35 + f19;
                                        float f40 = f36 + f20;
                                        f19 += f37;
                                        f20 += f38;
                                        f18 = f39;
                                        f17 = f40;
                                    } else if (brhVar3 instanceof bqu) {
                                        bqu bquVar = (bqu) brhVar3;
                                        float f41 = bquVar.a;
                                        float f42 = bquVar.b;
                                        f4 = bquVar.c;
                                        f5 = bquVar.d;
                                        bniVar.g(f41, f42, f4, f5);
                                        f18 = f41;
                                        f17 = f42;
                                    } else if (brhVar3 instanceof bre) {
                                        if (brhVar2.i) {
                                            f2 = f20 - f17;
                                            f3 = f19 - f18;
                                        } else {
                                            f2 = f16;
                                            f3 = f2;
                                        }
                                        bre breVar = (bre) brhVar3;
                                        float f43 = breVar.a;
                                        float f44 = breVar.b;
                                        bniVar.j(f3, f2, f43, f44);
                                        float f45 = f3 + f19;
                                        float f46 = f2 + f20;
                                        f19 += f43;
                                        f20 += f44;
                                        f18 = f45;
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        brhVar = brhVar3;
                                        f17 = f46;
                                    } else if (brhVar3 instanceof bqw) {
                                        if (brhVar2.i) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        bqw bqwVar = (bqw) brhVar3;
                                        float f47 = bqwVar.a;
                                        float f48 = bqwVar.b;
                                        bniVar.g(f19, f20, f47, f48);
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        f18 = f19;
                                        brhVar = brhVar3;
                                        f19 = f47;
                                        f17 = f20;
                                        f20 = f48;
                                    } else if (brhVar3 instanceof bqx) {
                                        double d = f19;
                                        bqx bqxVar = (bqx) brhVar3;
                                        float f49 = bqxVar.f + f19;
                                        float f50 = bqxVar.g + f20;
                                        f = 0.0f;
                                        i2 = i3;
                                        i = size;
                                        K(bniVar, d, f20, f49, f50, bqxVar.a, bqxVar.b, bqxVar.c, bqxVar.d, bqxVar.e);
                                        f18 = f49;
                                        f19 = f18;
                                        f17 = f50;
                                        f20 = f17;
                                        brhVar = brhVar3;
                                    } else {
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        if (!(brhVar3 instanceof bqo)) {
                                            throw new yfu();
                                        }
                                        bqo bqoVar = (bqo) brhVar3;
                                        float f51 = bqoVar.f;
                                        float f52 = bqoVar.g;
                                        brhVar = brhVar3;
                                        K(bniVar, f19, f20, f51, f52, bqoVar.a, bqoVar.b, bqoVar.c, bqoVar.d, bqoVar.e);
                                        f18 = f51;
                                        f19 = f18;
                                        f17 = f52;
                                        f20 = f17;
                                    }
                                    f17 = f6;
                                    f19 = f7;
                                    f20 = f8;
                                }
                                f18 = f11 + f19;
                                float f53 = f12 + f20;
                                f19 += f13;
                                f20 += f14;
                                f17 = f53;
                            }
                            f20 = f5;
                            f19 = f4;
                        }
                        f20 += f15;
                    }
                    i = size;
                    f = f16;
                    i2 = i3;
                }
                brhVar = brhVar3;
            }
            i3 = i2 + 1;
            list2 = list;
            bniVar2 = bniVar;
            size = i;
            brhVar2 = brhVar;
            f16 = f;
        }
    }

    public static brm f(bql bqlVar) {
        return new brm(bqlVar.a, bqlVar.b, bqlVar.c, bqlVar.d, bqlVar.e, bqlVar.f, bqlVar.g, bqlVar.h, bqlVar.i, bqlVar.j);
    }

    public static bql g(ArrayList arrayList) {
        return (bql) arrayList.get(arrayList.size() - 1);
    }

    public static void h(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        arrayList.add(new bql(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public static void i(ArrayList arrayList) {
        g(arrayList).j.add(f((bql) arrayList.remove(arrayList.size() - 1)));
    }

    public static bnn j(nuh nuhVar) {
        if (!nuhVar.t()) {
            return null;
        }
        Object obj = nuhVar.b;
        return obj != null ? new bno((Shader) obj) : new bon(bny.i(nuhVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(defpackage.bpq r20, defpackage.bpu r21) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brx.k(bpq, bpu):void");
    }

    public static long l(bpq bpqVar) {
        return d.p(((bpo) bpqVar).b.a());
    }

    public static long m(bpq bpqVar) {
        return ((bpo) bpqVar).b.a();
    }

    public static /* synthetic */ void n(bpq bpqVar, long j, long j2, long j3, float f, int i, int i2) {
        int i3 = i & ((i2 & 16) != 0 ? 0 : 1);
        if ((i2 & 8) != 0) {
            f = 0.0f;
        }
        bpqVar.q(j, j2, j3, f, i3);
    }

    public static /* synthetic */ void o(bpq bpqVar, long j, long j2, long j3, float f, bnr bnrVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        bpqVar.s(j, j4, (i & 4) != 0 ? a.at(bpqVar.n(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? bps.a : null, (i & 32) != 0 ? null : bnrVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void p(bpq bpqVar, bng bngVar, bnr bnrVar) {
        bpo bpoVar = ((byu) bpqVar).a;
        bpoVar.a.c.s(bngVar, bpo.C(bpoVar, null, bps.a, 1.0f, bnrVar, 3));
    }

    public static /* synthetic */ void q(bpq bpqVar, bng bngVar, long j, long j2, float f, bnr bnrVar, int i, int i2) {
        long jB = (i2 & 4) != 0 ? (bngVar.b() & 4294967295L) | (bngVar.c() << 32) : j;
        bpqVar.A(bngVar, jB, (i2 & 16) != 0 ? jB : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? bps.a : null, (i2 & 128) != 0 ? null : bnrVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static /* synthetic */ int r(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static float s(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static boolean t(double d, bpc bpcVar, bpc bpcVar2) {
        return Math.abs(bpcVar.a(d) - bpcVar2.a(d)) <= 0.001d;
    }

    public static double u(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static double v(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static boolean w(bpk bpkVar, bpk bpkVar2) {
        if (bpkVar != bpkVar2) {
            return Math.abs(bpkVar.a - bpkVar2.a) < 0.001f && Math.abs(bpkVar.b - bpkVar2.b) < 0.001f;
        }
        return true;
    }

    public static float[] x(float[] fArr, float[] fArr2, float[] fArr3) {
        C(fArr, fArr2);
        C(fArr, fArr3);
        return z(y(fArr), A(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static float[] y(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static float[] z(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public brx(byte[] bArr) {
    }
}
