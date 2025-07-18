package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpi extends bov {
    private static final bpc q = new bow(6);
    public final bpk d;
    public final float e;
    public final float f;
    public final bpj g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final bpc k;
    public final yjv l;
    public final bpc m;
    public final bpc n;
    public final yjv o;
    public final bpc p;
    private final boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public bpi(String str, float[] fArr, bpk bpkVar, final double d, float f, float f2, int i) {
        bpc bpcVar;
        bpc bpcVar2;
        if (d == 1.0d) {
            bpcVar = q;
        } else {
            final int i2 = 1;
            bpcVar = new bpc() { // from class: bph
                @Override // defpackage.bpc
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        bpc bpcVar3 = bpcVar;
        if (d == 1.0d) {
            bpcVar2 = q;
        } else {
            final int i3 = 0;
            bpcVar2 = new bpc() { // from class: bph
                @Override // defpackage.bpc
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, bpkVar, null, bpcVar3, bpcVar2, f, f2, new bpj(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    @Override // defpackage.bov
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.bov
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.bov
    public final float c(float f, float f2, float f3) {
        bpc bpcVar = this.p;
        float fA = (float) bpcVar.a(f);
        float fA2 = (float) bpcVar.a(f2);
        float fA3 = (float) bpcVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.bov
    public final long d(float f, float f2, float f3) {
        bpc bpcVar = this.p;
        float fA = (float) bpcVar.a(f);
        float fA2 = (float) bpcVar.a(f2);
        float fA3 = (float) bpcVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        float f9 = fArr[7] * fA3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.bov
    public final long e(float f, float f2, float f3, float f4, bov bovVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        bpc bpcVar = this.m;
        return bny.k((float) bpcVar.a(f5 + f6 + f7), (float) bpcVar.a(f8 + f9 + f10), (float) bpcVar.a(f11 + f12 + f13), f4, bovVar);
    }

    @Override // defpackage.bov
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        bpi bpiVar = (bpi) obj;
        if (Float.compare(bpiVar.e, this.e) != 0 || Float.compare(bpiVar.f, this.f) != 0 || !yks.e(this.d, bpiVar.d) || !Arrays.equals(this.h, bpiVar.h)) {
            return false;
        }
        bpj bpjVar = this.g;
        if (bpjVar != null) {
            return yks.e(bpjVar, bpiVar.g);
        }
        if (bpiVar.g == null) {
            return true;
        }
        if (yks.e(this.k, bpiVar.k)) {
            return yks.e(this.n, bpiVar.n);
        }
        return false;
    }

    @Override // defpackage.bov
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.bov
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        bpj bpjVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (bpjVar != null ? bpjVar.hashCode() : 0);
        return bpjVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public bpi(String str, float[] fArr, bpk bpkVar, final bpj bpjVar, int i) {
        bpc bpcVar;
        bpc bpcVar2;
        if (bpjVar.a()) {
            final int i2 = 6;
            bpcVar = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i2) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else if (bpjVar.b()) {
            final int i3 = 7;
            bpcVar = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i3) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else if (bpjVar.f == 0.0d && bpjVar.g == 0.0d) {
            final int i4 = 8;
            bpcVar = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i4) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else {
            final int i5 = 9;
            bpcVar = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i5) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        }
        bpc bpcVar3 = bpcVar;
        if (bpjVar.a()) {
            final int i6 = 2;
            bpcVar2 = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i6) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else if (bpjVar.b()) {
            final int i7 = 3;
            bpcVar2 = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i7) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else if (bpjVar.f == 0.0d && bpjVar.g == 0.0d) {
            final int i8 = 4;
            bpcVar2 = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i8) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        } else {
            final int i9 = 5;
            bpcVar2 = new bpc() { // from class: bpg
                @Override // defpackage.bpc
                public final double a(double d) {
                    switch (i9) {
                        case 0:
                            return ((bpi) bpjVar).n.a(ykn.f(d, r14.e, r14.f));
                        case 1:
                            bpi bpiVar = (bpi) bpjVar;
                            return ykn.f(bpiVar.k.a(d), bpiVar.e, bpiVar.f);
                        case 2:
                            float[] fArr2 = box.a;
                            return box.a((bpj) bpjVar, d);
                        case 3:
                            float[] fArr3 = box.a;
                            return box.c((bpj) bpjVar, d);
                        case 4:
                            bpj bpjVar2 = (bpj) bpjVar;
                            double d2 = bpjVar2.a;
                            double d3 = bpjVar2.e;
                            return brx.v(d, bpjVar2.b, bpjVar2.c, bpjVar2.d, d3, d2);
                        case 5:
                            bpj bpjVar3 = (bpj) bpjVar;
                            if (d < bpjVar3.e) {
                                return (bpjVar3.d * d) + bpjVar3.g;
                            }
                            return Math.pow((bpjVar3.b * d) + bpjVar3.c, bpjVar3.a) + bpjVar3.f;
                        case 6:
                            float[] fArr4 = box.a;
                            return box.b((bpj) bpjVar, d);
                        case 7:
                            float[] fArr5 = box.a;
                            return box.d((bpj) bpjVar, d);
                        case 8:
                            bpj bpjVar4 = (bpj) bpjVar;
                            double d4 = bpjVar4.a;
                            double d5 = bpjVar4.e;
                            return brx.u(d, bpjVar4.b, bpjVar4.c, bpjVar4.d, d5, d4);
                        default:
                            bpj bpjVar5 = (bpj) bpjVar;
                            double d6 = bpjVar5.e;
                            double d7 = bpjVar5.d;
                            if (d < d6 * d7) {
                                return (d - bpjVar5.g) / d7;
                            }
                            double d8 = bpjVar5.a;
                            double d9 = bpjVar5.f;
                            return (Math.pow(d - d9, 1.0d / d8) - bpjVar5.c) / bpjVar5.b;
                    }
                }
            };
        }
        this(str, fArr, bpkVar, null, bpcVar3, bpcVar2, 0.0f, 1.0f, bpjVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0162  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bpi(java.lang.String r33, float[] r34, defpackage.bpk r35, float[] r36, defpackage.bpc r37, defpackage.bpc r38, float r39, float r40, defpackage.bpj r41, int r42) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpi.<init>(java.lang.String, float[], bpk, float[], bpc, bpc, float, float, bpj, int):void");
    }
}
