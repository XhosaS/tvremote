package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.provider.Settings;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nby extends View implements TimeAnimator.TimeListener, ndg {
    public static final /* synthetic */ int f = 0;
    public final ndm a;
    public int b;
    public int c;
    public final ndh d;
    public int e;
    private final TimeAnimator g;
    private final AnimatorSet h;
    private final Paint i;
    private final Paint j;
    private float k;
    private boolean l;
    private float m;
    private final ndo n;
    private final ndo o;

    static {
        new nbv();
        new nbw();
    }

    public nby(Context context) {
        super(context, null);
        this.b = 0;
        this.c = 255;
        this.l = true;
        this.e = 0;
        this.m = 1.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        this.n = new ndo();
        this.o = new ndo();
        Paint paint = new Paint();
        this.i = paint;
        Paint paint2 = new Paint();
        this.j = paint2;
        ndm ndmVar = new ndm(context, a(), a(), a(), a(), a(), a(), new huo(new ndi(80.0f), new ndj(80.0f)), new ndj(1000.0f));
        this.a = ndmVar;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.g = timeAnimator;
        this.d = new ndh(ndmVar, new TimeAnimator(), this, new jys());
        this.m = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new gio(this, valueAnimatorOfInt, 2));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(100L);
        valueAnimatorOfInt2.addUpdateListener(new gio(this, valueAnimatorOfInt2, 3));
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.addListener(new nbx());
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        timeAnimator.setTimeListener(this);
    }

    public static ndl a() {
        return new ndl(new ndk(80.0f, 1000.0f), new ndi(360.0f), new ndk(80.0f, 160.0f), new ndk(320.0f, 40.0f), new ndk(160.0f, 1000.0f), new ndj(1000.0f), new ndj(160.0f), new ndj(160.0f), new ndj(320.0f), new ndj(80.0f));
    }

    private final float f() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float g() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final void h(Canvas canvas, ndo ndoVar) {
        Paint paint = this.i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(ndoVar.g);
        paint.setStrokeWidth(ndoVar.e);
        canvas.drawPath(ndoVar.c, paint);
        paint.setStrokeWidth(ndoVar.f);
        canvas.drawPath(ndoVar.d, paint);
    }

    private final void i() {
        ndm ndmVar = this.a;
        this.k = Math.min(g() / ndmVar.j, f() / ndmVar.k);
    }

    private final boolean j() {
        if (this.m == 0.0f) {
            return false;
        }
        return this.l;
    }

    @Override // defpackage.ndg
    public final void b() {
        TimeAnimator timeAnimator = this.g;
        if (timeAnimator.isStarted() || !j()) {
            return;
        }
        timeAnimator.start();
    }

    public final void c(boolean z) {
        TimeAnimator timeAnimator;
        if (this.m == 0.0f || (timeAnimator = this.g) == null || this.l == z) {
            return;
        }
        this.l = z;
        if (z) {
            if (this.b != 255 || this.c != 0) {
                this.d.c();
            }
            timeAnimator.setTimeListener(this);
            return;
        }
        this.h.cancel();
        timeAnimator.setTimeListener(null);
        timeAnimator.end();
        this.d.b();
    }

    public final void d(float f2, float f3) {
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        ndm ndmVar = this.a;
        ndmVar.j = f2;
        ndmVar.k = f3;
        i();
        invalidate();
    }

    public final void e(int i, boolean z) {
        this.e = i;
        boolean z2 = !j() || z;
        ndh ndhVar = this.d;
        if ((i != ndhVar.i || ndhVar.j != 0) && i != ndhVar.j) {
            ndhVar.j = i;
            ArrayDeque arrayDeque = ndhVar.c;
            arrayDeque.clear();
            jys jysVar = ndhVar.l;
            int iU = jys.U(ndhVar.i);
            int iU2 = jys.U(ndhVar.j);
            boolean z3 = iU != iU2;
            if (z3) {
                Deque dequeA = ndhVar.a(iU);
                Deque dequeA2 = ndhVar.a(iU2);
                while (!dequeA.isEmpty() && !dequeA2.isEmpty() && ((Integer) dequeA.getFirst()).equals(dequeA2.getFirst())) {
                    dequeA.removeFirst();
                    dequeA2.removeFirst();
                }
                Iterator itDescendingIterator = dequeA.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    arrayDeque.addLast(jys.S(((Integer) itDescendingIterator.next()).intValue()));
                }
                Iterator it = dequeA2.iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast(jys.R(((Integer) it.next()).intValue()));
                }
                if (ndhVar.g == arrayDeque.getFirst()) {
                    arrayDeque.pollFirst();
                }
            }
            arrayDeque.addLast(jys.T(ndhVar.j));
            if (z2) {
                while (!arrayDeque.isEmpty()) {
                    ndhVar.d((nde) arrayDeque.removeFirst());
                    ndhVar.f = 0L;
                    ndhVar.e = 0L;
                    nde ndeVar = ndhVar.g;
                    ndm ndmVar = ndhVar.b;
                    ndeVar.c(0L, Long.MAX_VALUE, ndmVar);
                    ndmVar.h();
                }
                ndhVar.k = false;
            } else if (!ndhVar.a.isStarted() || !z3 || (ndhVar.g != jys.R(iU) && ndhVar.g != jys.S(iU))) {
                ndhVar.e();
            }
        }
        if (j() && z) {
            ndhVar.c();
        } else {
            if (j()) {
                return;
            }
            ndhVar.b();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(isShown());
        this.d.d = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c(false);
        this.d.d = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f2;
        Iterator<ndl> it;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f5 = 2.0f;
        canvas2.translate(getPaddingLeft() + (g() / 2.0f), getPaddingTop() + (f() / 2.0f));
        ndm ndmVar = this.a;
        Iterator<ndl> it2 = ndmVar.iterator();
        while (it2.hasNext()) {
            ndl next = it2.next();
            Paint paint = this.i;
            float f6 = next.j.c;
            paint.setColor(f6 > 0.999f ? next.k : f6 < 0.001f ? next.l : csq.d(next.l, next.k, f6));
            paint.setAlpha(255);
            float f7 = next.a.c;
            float fB = ndmVar.b() + next.a();
            float f8 = next.d.c;
            float fC = next.c();
            double d = fB;
            float fCos = (((float) Math.cos(d)) * f7) + f8;
            float fSin = (f7 * ((float) Math.sin(d))) + fC;
            if (next.x()) {
                float fB2 = next.b();
                ndo ndoVar = this.o;
                ndoVar.a();
                if (next == ndmVar.b) {
                    ndoVar.h(ndoVar.c, ndn.a, 7.0f, -1.0f, fB2);
                    ndoVar.e = fB2 + fB2 + 4.0f;
                    ndoVar.g = Paint.Cap.ROUND;
                } else if (next == ndmVar.c) {
                    ndoVar.h(ndoVar.c, ndn.b, 14.0f, -1.0f, fB2);
                    ndoVar.e = (fB2 * (-2.0f)) + 4.0f;
                    ndoVar.g = fB2 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (next == ndmVar.d) {
                    ndoVar.h(ndoVar.c, ndn.c, 5.0f, -1.0f, fB2);
                    ndoVar.e = (fB2 * (-2.0f)) + 4.0f;
                    ndoVar.g = fB2 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (next == ndmVar.e) {
                    ndoVar.h(ndoVar.c, ndn.d, 4.0f, 10.0f, fB2);
                    ndoVar.e = (fB2 * (-2.0f)) + 4.0f;
                    ndoVar.g = fB2 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                }
                ndoVar.b(fCos, fSin, this.k);
                h(canvas2, ndoVar);
            } else {
                float f9 = next.h.c;
                if (f9 > 0.001f) {
                    float f10 = next.f();
                    ndo ndoVar2 = this.n;
                    ndoVar2.a();
                    f2 = f5;
                    if (next == ndmVar.b) {
                        float fD = ndo.d(f9);
                        float fC2 = ndo.c(f10, f9);
                        float f11 = ((0.66999996f * f9) + 1.0f) * fC2;
                        float fG = ndo.g(f11, f9);
                        float f12 = fG + (((fG * 1.08f) - fG) * f9);
                        ndoVar2.e = f12;
                        ndoVar2.g = Paint.Cap.BUTT;
                        float f13 = (fC2 - f11) + (((fG - f12) / f2) * f9);
                        if (fD > 0.0f) {
                            RectF rectF = ndoVar2.a;
                            ndo.e(rectF, f11, 0.97f);
                            rectF.offset(0.0f, f13);
                            Path path = ndoVar2.c;
                            path.addArc(rectF, 88.0f, 184.0f);
                            ndo.e(rectF, f11, 1.0f);
                            rectF.offset(0.0f, f13);
                            path.addArc(rectF, 88.0f, 184.0f);
                            float f14 = f11 + f13;
                            path.moveTo(0.0f, f14);
                            path.cubicTo(f11 * 0.83f, f14, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, ((-0.05f) * f11) + f13);
                            ndo.e(rectF, f11, 1.0f);
                            rectF.offset(0.0f, f13);
                            path.addArc(rectF, 270.0f, 90.0f - (46.0f * fD));
                            float f15 = 1.06f * f11 * fD;
                            float f16 = f11 * 1.08f;
                            float f17 = f13 + 0.42f;
                            path.moveTo(f16 - f15, f17);
                            path.lineTo(f16, f17);
                        } else {
                            ndoVar2.c.addCircle(0.0f, f13, f11, Path.Direction.CW);
                        }
                    } else if (next == ndmVar.c || next == ndmVar.d) {
                        ndoVar2.f(f9, f10);
                    } else if (next == ndmVar.f) {
                        float fD2 = ndo.d(f9);
                        float fC3 = ndo.c(f10, f9);
                        float fG2 = ndo.g(fC3, f9);
                        ndoVar2.g = Paint.Cap.BUTT;
                        ndoVar2.e = fG2;
                        if (fD2 > 0.0f) {
                            ndoVar2.e = fG2 / f2;
                            RectF rectF2 = ndoVar2.a;
                            ndo.e(rectF2, fC3, 0.92f);
                            float f18 = fG2 / 4.0f;
                            rectF2.inset(f18, f18);
                            Path path2 = ndoVar2.c;
                            path2.addOval(rectF2, Path.Direction.CW);
                            float f19 = (fG2 * (-2.0f)) / 4.0f;
                            rectF2.inset(f19 * 0.9f, f19);
                            rectF2.offset(-0.4f, 0.0f);
                            path2.addOval(rectF2, Path.Direction.CW);
                            rectF2.offset(0.5f, 0.0f);
                            path2.addArc(rectF2, 88.0f, 184.0f);
                            float f20 = fD2 / 0.1f;
                            float f21 = fD2 - 0.1f;
                            float fMin = Math.min(f20, 1.0f);
                            ndoVar2.f = fG2 * 1.05f;
                            if (fMin > 0.0f) {
                                float f22 = (-1.17f) * fC3 * fMin;
                                float f23 = 1.21f * fC3 * fMin;
                                float f24 = fC3 * 0.9f;
                                Path path3 = ndoVar2.d;
                                path3.moveTo(f24, f22);
                                path3.lineTo(f24, f23);
                            }
                            float f25 = f21 / 0.9f;
                            if (f25 > 0.0f) {
                                ndo.e(rectF2, fC3, 0.925f);
                                rectF2.offset(-0.14f, fC3 * 1.15f);
                                ndoVar2.d.addArc(rectF2, -2.0f, f25 * 158.0f);
                            }
                        } else {
                            ndoVar2.c.addCircle(0.0f, 0.0f, fC3, Path.Direction.CW);
                        }
                    } else if (next == ndmVar.e) {
                        ndoVar2.e = f10 * 4.0f * (((-0.35000002f) * f9) + 1.0f);
                        if (f9 > 0.66f) {
                            ndoVar2.g = Paint.Cap.SQUARE;
                        } else {
                            ndoVar2.g = Paint.Cap.ROUND;
                        }
                        Path path4 = ndoVar2.c;
                        path4.moveTo(0.0f, (-10.46f) * f9);
                        path4.lineTo(0.0f, 4.19f * f9);
                    } else {
                        if (next == ndmVar.g) {
                            float fD3 = ndo.d(f9);
                            float fC4 = ndo.c(f10, f9);
                            ndoVar2.e = ndo.g(fC4, f9);
                            ndoVar2.g = Paint.Cap.BUTT;
                            if (fD3 > 0.0f) {
                                RectF rectF3 = ndoVar2.a;
                                ndo.e(rectF3, fC4, 0.9f);
                                Path path5 = ndoVar2.c;
                                path5.addArc(rectF3, 88.0f, 184.0f);
                                ndo.e(rectF3, fC4, 0.94f);
                                path5.addArc(rectF3, 88.0f, 184.0f);
                                ndo.e(rectF3, fC4, 1.05f);
                                path5.addArc(rectF3, 33.0f, 57.0f);
                                ndo.e(rectF3, fC4, 0.89f);
                                path5.addArc(rectF3, 270.0f, (-270.0f) + (393.0f - (fD3 * 48.0f)));
                                float radians = (float) Math.toRadians(((-173.0f) + r12) - 11.0f);
                                float radians2 = (float) Math.toRadians(r12 - 11.0f);
                                double d2 = radians;
                                double d3 = fC4 * 1.15f;
                                f3 = fSin;
                                double dCos = d3 * Math.cos(d2);
                                double dSin = Math.sin(d2) * d3;
                                it = it2;
                                f4 = f9;
                                double d4 = radians2;
                                double dCos2 = d3 * Math.cos(d4);
                                double dSin2 = d3 * Math.sin(d4);
                                Path path6 = ndoVar2.d;
                                path6.moveTo((float) dCos, (float) dSin);
                                path6.lineTo((float) dCos2, (float) dSin2);
                                ndoVar2.f = ndoVar2.e * 0.85f;
                            } else {
                                f3 = fSin;
                                it = it2;
                                f4 = f9;
                                ndoVar2.c.addCircle(0.0f, 0.0f, fC4, Path.Direction.CW);
                            }
                        }
                        ndoVar2.b(fCos, f3 + (f4 * 0.6f), this.k);
                        h(canvas2, ndoVar2);
                    }
                    f3 = fSin;
                    it = it2;
                    f4 = f9;
                    ndoVar2.b(fCos, f3 + (f4 * 0.6f), this.k);
                    h(canvas2, ndoVar2);
                } else {
                    f2 = f5;
                    it = it2;
                    ndj ndjVar = next.f;
                    float f26 = ndjVar.c;
                    if (f26 < -0.001f || f26 > 0.001f) {
                        paint.setStrokeWidth(next.d() * this.k);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        float f27 = ndjVar.c;
                        float f28 = this.k;
                        float f29 = fCos * f28;
                        canvas2.drawLine(f29, (fSin - f27) * f28, f29, (f27 + fSin) * f28, paint);
                        canvas2 = canvas;
                    } else {
                        float fD4 = next.d() * next.f();
                        paint.setStyle(Paint.Style.FILL);
                        float f30 = this.k;
                        canvas2.drawCircle(fCos * f30, fSin * f30, (fD4 / f2) * f30, paint);
                    }
                }
                f5 = f2;
                it2 = it;
            }
        }
        setAlpha(ndmVar.h.c);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long jMin = Math.min(100L, j2); jMin > 0; jMin -= 10) {
            ndm ndmVar = this.a;
            long jMin2 = Math.min(jMin, 10L);
            Iterator<ndl> it = ndmVar.iterator();
            while (it.hasNext()) {
                ndl next = it.next();
                next.a.f(jMin2);
                next.b.f(jMin2);
                next.c.f(jMin2);
                next.d.f(jMin2);
                next.e.f(jMin2);
                next.f.f(jMin2);
                next.h.f(jMin2);
                next.i.f(jMin2);
                next.g.f(jMin2);
                next.j.f(jMin2);
            }
            huo huoVar = ndmVar.l;
            if (huoVar.a) {
                ndj ndjVar = (ndj) huoVar.b;
                ndjVar.f(jMin2);
                ndj ndjVar2 = (ndj) huoVar.c;
                ndjVar2.e(ndjVar2.c + (ndjVar.c * (Math.min(jMin2, 50.0f) / 1000.0f)));
            } else {
                ((ndj) huoVar.c).f(jMin2);
            }
            ndmVar.h.f(jMin2);
        }
        ndm ndmVar2 = this.a;
        Iterator<ndl> it2 = ndmVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                ndl next2 = it2.next();
                if (!next2.a.e || !next2.b.e || !next2.c.e || !next2.d.e || !next2.e.e || !next2.f.e || !next2.h.e || !next2.i.e || !next2.g.e || !next2.j.e) {
                    break;
                }
            } else {
                huo huoVar2 = ndmVar2.l;
                if (huoVar2.a || !((ndj) huoVar2.c).e || !ndmVar2.h.e) {
                    break;
                }
                this.g.end();
                if (this.d.i == 6 && this.b != 255) {
                    this.h.start();
                }
            }
        }
        this.h.cancel();
        this.c = 255;
        this.b = 0;
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        c(isShown());
    }
}
