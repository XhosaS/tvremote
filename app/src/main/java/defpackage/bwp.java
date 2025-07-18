package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class bwp {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final bwm d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final we l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public bwp() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new we();
        this.d = new bwm();
        this.m = new Path();
        this.n = new Path();
    }

    public final boolean a() {
        if (this.k == null) {
            this.k = Boolean.valueOf(this.d.b());
        }
        return this.k.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(bwm bwmVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        Matrix matrix2;
        float f;
        Matrix matrix3 = bwmVar.a;
        matrix3.set(matrix);
        matrix3.preConcat(bwmVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = bwmVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            bwn bwnVar = (bwn) arrayList.get(i4);
            if (bwnVar instanceof bwm) {
                b((bwm) bwnVar, matrix3, canvas, i, i2);
            } else if (bwnVar instanceof bwo) {
                bwo bwoVar = (bwo) bwnVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                Matrix matrix4 = this.o;
                float fMin = Math.min(f2, f3);
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i4;
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[z ? 1 : 0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f7 - f8) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    acu[] acuVarArr = bwoVar.m;
                    if (acuVarArr != null) {
                        acv.a(acuVarArr, path);
                    }
                    Path path2 = this.n;
                    path2.reset();
                    if (bwoVar.a()) {
                        path2.setFillType(bwoVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                        matrix2 = matrix3;
                    } else {
                        bwl bwlVar = (bwl) bwoVar;
                        float f9 = bwlVar.g;
                        if (f9 == 0.0f && bwlVar.h == 1.0f) {
                            matrix2 = matrix3;
                        } else {
                            float f10 = bwlVar.i;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (bwlVar.h + f10) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(path, z);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                matrix2 = matrix3;
                                this.p.getSegment(f13, length, path, true);
                                f = 0.0f;
                                this.p.getSegment(0.0f, f14, path, true);
                            } else {
                                matrix2 = matrix3;
                                f = 0.0f;
                                this.p.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        if (bwlVar.d.d()) {
                            aca acaVar = bwlVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (acaVar.a()) {
                                Shader shader = acaVar.a;
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(bwlVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(bws.a(acaVar.b, bwlVar.f));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(bwlVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        if (bwlVar.b.d()) {
                            aca acaVar2 = bwlVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = bwlVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = bwlVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(bwlVar.l);
                            if (acaVar2.a()) {
                                Shader shader2 = acaVar2.a;
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(bwlVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(bws.a(acaVar2.b, bwlVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(bwlVar.c * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                } else {
                    matrix2 = matrix3;
                }
                i4 = i3 + 1;
                matrix3 = matrix2;
                c = 0;
            }
            matrix2 = matrix3;
            i3 = i4;
            i4 = i3 + 1;
            matrix3 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public bwp(bwp bwpVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        we weVar = new we();
        this.l = weVar;
        this.d = new bwm(bwpVar.d, weVar);
        this.m = new Path(bwpVar.m);
        this.n = new Path(bwpVar.n);
        this.e = bwpVar.e;
        this.f = bwpVar.f;
        this.g = bwpVar.g;
        this.h = bwpVar.h;
        int i = bwpVar.q;
        this.q = 0;
        this.i = bwpVar.i;
        this.j = bwpVar.j;
        String str = bwpVar.j;
        if (str != null) {
            weVar.put(str, this);
        }
        this.k = bwpVar.k;
    }
}
