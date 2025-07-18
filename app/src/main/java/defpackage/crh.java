package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crh implements crg, cro, cre {
    private final String b;
    private final cqd c;
    private final boolean d;
    private final boolean e;
    private final crt f;
    private final crt g;
    private final crt h;
    private final crt i;
    private final crt j;
    private final crt k;
    private final crt l;
    private boolean n;
    private final int o;
    private final Path a = new Path();
    private final cqv m = new cqv();

    public crh(cqd cqdVar, cug cugVar, ctt cttVar) {
        this.c = cqdVar;
        this.b = cttVar.a;
        int i = cttVar.k;
        this.o = i;
        this.d = cttVar.i;
        this.e = cttVar.j;
        crt crtVarA = cttVar.b.a();
        this.f = crtVarA;
        crt crtVarA2 = cttVar.c.a();
        this.g = crtVarA2;
        crt crtVarA3 = cttVar.d.a();
        this.h = crtVarA3;
        crt crtVarA4 = cttVar.f.a();
        this.j = crtVarA4;
        crt crtVarA5 = cttVar.h.a();
        this.l = crtVarA5;
        if (i == 1) {
            this.i = cttVar.e.a();
            this.k = cttVar.g.a();
        } else {
            this.i = null;
            this.k = null;
        }
        cugVar.k(crtVarA);
        cugVar.k(crtVarA2);
        cugVar.k(crtVarA3);
        cugVar.k(crtVarA4);
        cugVar.k(crtVarA5);
        if (i == 1) {
            cugVar.k(this.i);
            cugVar.k(this.k);
        }
        crtVarA.h(this);
        crtVarA2.h(this);
        crtVarA3.h(this);
        crtVarA4.h(this);
        crtVarA5.h(this);
        if (i == 1) {
            this.i.h(this);
            this.k.h(this);
        }
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crt crtVar;
        crt crtVar2;
        crt crtVar3;
        if (obj == cqi.w) {
            crtVar = this.f;
        } else if (obj == cqi.x) {
            crtVar = this.h;
        } else if (obj == cqi.n) {
            crtVar = this.g;
        } else {
            if (obj == cqi.y && (crtVar3 = this.i) != null) {
                crtVar3.d = cxbVar;
                return;
            }
            if (obj == cqi.z) {
                crtVar = this.j;
            } else if (obj == cqi.A && (crtVar2 = this.k) != null) {
                crtVar2.d = cxbVar;
                return;
            } else if (obj != cqi.B) {
                return;
            } else {
                crtVar = this.l;
            }
        }
        crtVar.d = cxbVar;
    }

    @Override // defpackage.cro
    public final void d() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cqw cqwVar = (cqw) list.get(i);
            if (cqwVar instanceof crn) {
                crn crnVar = (crn) cqwVar;
                if (crnVar.e == 1) {
                    this.m.a(crnVar);
                    crnVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.b;
    }

    @Override // defpackage.crg
    public final Path i() {
        float f;
        float fSin;
        float f2;
        double d;
        float fCos;
        float f3;
        double d2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i;
        boolean z;
        float f9;
        float f10;
        int i2;
        double d3;
        if (this.n) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.d) {
            this.n = true;
            return path;
        }
        int i3 = this.o;
        if (i3 == 0) {
            throw null;
        }
        if (i3 != 1) {
            int iFloor = (int) Math.floor(((Float) this.f.e()).floatValue());
            double dFloatValue = ((Float) this.h.e()).floatValue();
            crt crtVar = this.l;
            double radians = Math.toRadians(dFloatValue - 90.0d);
            float fFloatValue = ((Float) crtVar.e()).floatValue() / 100.0f;
            float fFloatValue2 = ((Float) this.j.e()).floatValue();
            double d4 = fFloatValue2;
            float fCos2 = (float) (d4 * Math.cos(radians));
            float fSin2 = (float) (d4 * Math.sin(radians));
            path.moveTo(fCos2, fSin2);
            double d5 = iFloor;
            float f11 = 0.0f;
            double d6 = (float) (6.283185307179586d / d5);
            double dCeil = Math.ceil(d5);
            double d7 = radians + d6;
            int i4 = 0;
            while (i4 < dCeil) {
                float f12 = f11;
                Path path2 = path;
                float fCos3 = (float) (Math.cos(d7) * d4);
                float fSin3 = (float) (d4 * Math.sin(d7));
                if (fFloatValue != f12) {
                    d3 = d4;
                    double dAtan2 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float f13 = fFloatValue2 * fFloatValue * 0.25f;
                    float f14 = fCos2 - (fCos4 * f13);
                    float f15 = fSin2 - (f13 * fSin4);
                    float fCos5 = (((float) Math.cos(dAtan22)) * f13) + fCos3;
                    float fSin5 = fSin3 + (f13 * ((float) Math.sin(dAtan22)));
                    i2 = i4;
                    path = path2;
                    path.cubicTo(f14, f15, fCos5, fSin5, fCos3, fSin3);
                } else {
                    i2 = i4;
                    d3 = d4;
                    path = path2;
                    path.lineTo(fCos3, fSin3);
                }
                d7 += d6;
                i4 = i2 + 1;
                fCos2 = fCos3;
                fSin2 = fSin3;
                f11 = f12;
                d4 = d3;
            }
            PointF pointF = (PointF) this.g.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else {
            double d8 = -1.5707963267948966d;
            float fFloatValue3 = ((Float) this.f.e()).floatValue();
            double dFloatValue2 = ((Float) this.h.e()).floatValue();
            double d9 = fFloatValue3;
            boolean z2 = this.e;
            float f16 = (float) (6.283185307179586d / d9);
            double radians2 = Math.toRadians(dFloatValue2 - 90.0d);
            if (z2) {
                f16 = -f16;
            }
            float f17 = f16;
            float f18 = fFloatValue3 - ((int) fFloatValue3);
            float f19 = f17 / 2.0f;
            if (f18 != 0.0f) {
                radians2 += (1.0f - f18) * f19;
            }
            float fFloatValue4 = ((Float) this.j.e()).floatValue();
            float fFloatValue5 = ((Float) this.i.e()).floatValue();
            crt crtVar2 = this.k;
            float fFloatValue6 = crtVar2 != null ? ((Float) crtVar2.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue7 = ((Float) this.l.e()).floatValue() / 100.0f;
            if (f18 != 0.0f) {
                float f20 = fFloatValue5 + ((fFloatValue4 - fFloatValue5) * f18);
                f = 2.0f;
                double d10 = f20;
                double d11 = radians2;
                fCos = (float) (d10 * Math.cos(radians2));
                fSin = (float) (d10 * Math.sin(d11));
                path.moveTo(fCos, fSin);
                f3 = f20;
                d = d11 + ((f17 * f18) / 2.0f);
                f2 = f19;
            } else {
                double d12 = radians2;
                f = 2.0f;
                double d13 = fFloatValue4;
                float fCos6 = (float) (Math.cos(d12) * d13);
                fSin = (float) (d13 * Math.sin(d12));
                path.moveTo(fCos6, fSin);
                f2 = f19;
                d = d12 + f2;
                fCos = fCos6;
                f3 = 0.0f;
            }
            double dCeil2 = Math.ceil(d9);
            double d14 = dCeil2 + dCeil2;
            double d15 = d;
            int i5 = 0;
            boolean z3 = false;
            while (true) {
                double d16 = i5;
                if (d16 >= d14) {
                    break;
                }
                float f21 = true != z3 ? fFloatValue5 : fFloatValue4;
                if (f3 == 0.0f || d16 != d14 - 2.0d) {
                    d2 = d8;
                    f4 = f2;
                } else {
                    double d17 = d8;
                    f4 = (f17 * f18) / f;
                    d2 = d17;
                }
                if (f3 == 0.0f || d16 != d14 - 1.0d) {
                    f5 = f18;
                    f6 = f21;
                } else {
                    f5 = f18;
                    f6 = f3;
                }
                double d18 = f6;
                double dCos = d18 * Math.cos(d15);
                float f22 = f21;
                float f23 = f17;
                double dSin = d18 * Math.sin(d15);
                float f24 = (float) dCos;
                float f25 = (float) dSin;
                if (fFloatValue6 == 0.0f && fFloatValue7 == 0.0f) {
                    path.lineTo(f24, f25);
                    f7 = f23;
                    f8 = fFloatValue4;
                    i = i5;
                    z = z3;
                    f9 = f24;
                    f10 = f25;
                } else {
                    f7 = f23;
                    Path path3 = path;
                    double dAtan23 = (float) (Math.atan2(fSin, fCos) + d2);
                    float fCos7 = (float) Math.cos(dAtan23);
                    float fSin6 = (float) Math.sin(dAtan23);
                    f8 = fFloatValue4;
                    float f26 = fCos;
                    double dAtan24 = (float) (Math.atan2(f25, f24) + d2);
                    float fCos8 = (float) Math.cos(dAtan24);
                    float fSin7 = (float) Math.sin(dAtan24);
                    float f27 = true != z3 ? fFloatValue7 : fFloatValue6;
                    float f28 = true != z3 ? fFloatValue6 : fFloatValue7;
                    float f29 = (true != z3 ? f8 : fFloatValue5) * f27 * 0.47829f;
                    float f30 = fCos7 * f29;
                    float f31 = f29 * fSin6;
                    float f32 = f22 * f28 * 0.47829f;
                    float f33 = fCos8 * f32;
                    float f34 = f32 * fSin7;
                    if (f18 != 0.0f) {
                        if (i5 == 0) {
                            f30 *= f5;
                            f31 *= f5;
                        } else if (d16 == d14 - 1.0d) {
                            f33 *= f5;
                            f34 *= f5;
                        }
                    }
                    i = i5;
                    path = path3;
                    z = z3;
                    f9 = f24;
                    f10 = f25;
                    path.cubicTo(f26 - f30, fSin - f31, f33 + f24, f34 + f25, f9, f10);
                }
                d15 += f4;
                i5 = i + 1;
                fCos = f9;
                fSin = f10;
                f17 = f7;
                fFloatValue4 = f8;
                z3 = !z;
                f18 = f5;
                d8 = d2;
            }
            PointF pointF2 = (PointF) this.g.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.m.b(path);
        this.n = true;
        return path;
    }
}
