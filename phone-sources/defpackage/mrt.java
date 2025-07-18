package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrt implements Handler.Callback, mrx, idy {
    private AnimatorSet A;
    private int B;
    private int D;
    private int E;
    private int F;
    private int G;
    private lck H;
    private lck I;
    private String J;
    public final ColorDrawable a;
    public final ImageView b;
    public final TextView c;
    public lck d;
    public lck e;
    public maj f;
    public int g;
    public rin h;
    public rin i;
    private final String j;
    private final int p;
    private final int q;
    private final int r;
    private final View s;
    private final TimeBar t;
    private final boolean u;
    private final Executor v;
    private final idf w;
    private final idf x;
    private LayerDrawable y;
    private Drawable z;
    private final RectF l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final RectF m = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final Rect n = new Rect();
    private final Matrix o = new Matrix();
    private int C = -1;
    private mfb K = mfi.a;
    private final Handler k = new Handler(Looper.getMainLooper(), this);

    public mrt(Executor executor, idf idfVar, idf idfVar2, String str, Context context, View view, TimeBar timeBar, ImageView imageView, TextView textView, boolean z) {
        this.j = str;
        this.s = view;
        this.t = timeBar;
        this.b = imageView;
        this.c = textView;
        this.v = executor;
        this.u = z;
        Resources resources = context.getResources();
        this.p = resources.getDimensionPixelSize(R.dimen.video_thumbnail_circle_radius);
        this.q = resources.getDimensionPixelSize(R.dimen.thumbnail_seeking_timestamp_padding);
        this.a = new ColorDrawable(jwq.C(context, R.attr.movies_controller_color));
        this.g = 0;
        this.r = resources.getDimensionPixelOffset(R.dimen.replay_video_thumbnail_bottom_margin);
        this.w = idfVar;
        this.x = idfVar2;
    }

    private static int l(lck lckVar, int i) {
        int i2;
        int i3 = lckVar.f;
        if (i3 <= 0 || (i2 = lckVar.e) <= 0) {
            return i / lckVar.g;
        }
        if (i > i3) {
            i = i3;
        }
        return (int) ((i * (i2 - 1)) / i3);
    }

    private final int m() {
        r();
        View view = this.s;
        int height = view.getHeight() - view.getPaddingBottom();
        return ((height - this.r) - (this.G / 2)) - this.n.top;
    }

    private final Animator n(int i, int i2, float f, float f2, boolean z) {
        Interpolator interpolator;
        ImageView imageView = this.b;
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(imageView, i, i2, f, f2);
        if (z) {
            Context applicationContext = imageView.getContext().getApplicationContext();
            if (ted.b == null) {
                ted.b = new tec(applicationContext);
            }
            interpolator = ted.b;
        } else {
            Context context = imageView.getContext();
            if (ted.a == null) {
                ted.a = AnimationUtils.loadInterpolator(context.getApplicationContext(), android.R.interpolator.fast_out_linear_in);
            }
            interpolator = ted.a;
        }
        animatorCreateCircularReveal.setInterpolator(interpolator);
        animatorCreateCircularReveal.addListener(new mrr(this));
        return animatorCreateCircularReveal;
    }

    private final ObjectAnimator o(float f, float f2, float f3, float f4, boolean z) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.b, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f3, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(z ? new AccelerateInterpolator(1.5f) : new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(new mrs(this, f));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private final lck p(boolean z, List list) {
        ImageView imageView = this.b;
        int paddingTop = imageView.getLayoutParams().height - (imageView.getPaddingTop() + imageView.getPaddingBottom());
        if (!z) {
            paddingTop /= 4;
        }
        return mjo.h(list, paddingTop);
    }

    private final void q(lck lckVar, int i) {
        int iL = l(lckVar, this.B);
        if (this.C != iL) {
            this.C = iL;
            t(0);
            h(i);
        }
    }

    private final void r() {
        TimeBar timeBar = this.t;
        Rect rect = this.n;
        int i = timeBar.c;
        int i2 = timeBar.d;
        rect.set(i, i2, i, i2);
        ((ViewGroup) this.b.getParent()).offsetDescendantRectToMyCoords(timeBar, rect);
    }

    private final void s() {
        LayerDrawable layerDrawable = this.y;
        if (layerDrawable == null) {
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.z, this.a});
            this.y = layerDrawable2;
            layerDrawable2.setId(0, android.R.id.background);
            this.b.setImageDrawable(this.y);
            return;
        }
        layerDrawable.setDrawableByLayerId(android.R.id.background, this.z);
        if (ksk.b > 22) {
            this.y.invalidateSelf();
            return;
        }
        ImageView imageView = this.b;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this.y);
    }

    private final void t(int i) {
        mrt mrtVar;
        ValueAnimator valueAnimatorOfInt;
        if (this.b.getVisibility() == i || this.F == 0 || this.G == 0) {
            return;
        }
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.A.end();
        }
        this.A = new AnimatorSet();
        int i2 = this.F;
        int i3 = this.G;
        double dSqrt = Math.sqrt((i2 * i2) + (i3 * i3)) + 0.5d;
        int iMin = Math.min(this.F, this.G) / 4;
        float f = iMin / this.p;
        float f2 = iMin;
        int i4 = (int) dSqrt;
        if (i == 0) {
            g(1.0f);
            r();
            mrtVar = this;
            ObjectAnimator objectAnimatorO = mrtVar.o(0.0f, f, 0.0f, m(), true);
            Animator animatorN = mrtVar.n(mrtVar.F / 2, mrtVar.G / 2, f2, i4 / 2, true);
            valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            animatorN.setDuration(200L);
            objectAnimatorO.setDuration(200L);
            valueAnimatorOfInt.setDuration(200L);
            mrtVar.A.play(animatorN).after(objectAnimatorO);
            mrtVar.A.play(animatorN).with(valueAnimatorOfInt);
        } else {
            mrtVar = this;
            Animator animatorN2 = mrtVar.n(mrtVar.F / 2, mrtVar.G / 2, i4 / 2, f2, false);
            valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
            ObjectAnimator objectAnimatorO2 = mrtVar.o(f, 0.0f, m(), 0.0f, false);
            animatorN2.setDuration(250L);
            objectAnimatorO2.setDuration(250L);
            valueAnimatorOfInt.setDuration(250L);
            mrtVar.A.play(animatorN2).with(valueAnimatorOfInt);
            mrtVar.A.play(objectAnimatorO2).after(animatorN2);
        }
        valueAnimatorOfInt.addUpdateListener(new mrp(this));
        mrtVar.A.addListener(new mrq(this, i));
        mrtVar.A.start();
    }

    private final void u(lck lckVar, int i) {
        int i2 = lckVar.h;
        int i3 = lckVar.i;
        int i4 = i % (i2 * i3);
        int i5 = lckVar.c * (i4 % i3);
        int i6 = (i4 / i3) * lckVar.d;
        int i7 = i5 + this.D;
        RectF rectF = this.m;
        rectF.set(i7, i6, this.E + i7, r4 + i6);
        this.o.setRectToRect(rectF, this.l, Matrix.ScaleToFit.FILL);
    }

    private static final int v(int i, lck lckVar) {
        return Math.min(i / (lckVar.h * lckVar.i), lckVar.j.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // defpackage.mrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r9) {
        /*
            r8 = this;
            com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar r0 = r8.t
            int r1 = r0.e
            if (r1 <= 0) goto L96
            r8.B = r9
            int r1 = r0.f
            r2 = 2
            r3 = 1
            if (r9 != r1) goto L18
            r9 = -1
            r8.C = r9
            r9 = 0
            r8.f = r9
            r8.d(r3)
            goto L57
        L18:
            rin r1 = r8.i
            if (r1 == 0) goto L50
            lck r1 = r8.H
            if (r1 == 0) goto L4a
            lck r1 = r8.I
            lck r4 = r8.d
            if (r1 == r4) goto L4a
            if (r1 != 0) goto L29
            goto L4a
        L29:
            int r9 = l(r1, r9)
            int r1 = r8.C
            if (r1 != r9) goto L32
            goto L50
        L32:
            lck r1 = r8.I
            int r9 = v(r9, r1)
            lck r1 = r8.I
            vun r1 = r1.j
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = r8.J
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L50
        L4a:
            lck r9 = r8.d
            r8.q(r9, r3)
            goto L57
        L50:
            lck r9 = r8.H
            if (r9 == 0) goto L57
            r8.q(r9, r2)
        L57:
            android.widget.TextView r9 = r8.c
            if (r9 == 0) goto L96
            int r1 = r8.B
            int r0 = r0.e
            long r4 = (long) r0
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L68
            goto L69
        L68:
            r3 = 0
        L69:
            java.lang.String r0 = defpackage.ksi.d(r1, r3)
            r9.setText(r0)
            android.widget.ImageView r0 = r8.b
            int r1 = r0.getLeft()
            int r3 = r0.getRight()
            int r1 = r1 + r3
            int r1 = r1 / r2
            int r3 = r9.getWidth()
            int r3 = r3 / r2
            int r1 = r1 - r3
            float r1 = (float) r1
            r9.setTranslationX(r1)
            int r0 = r0.getBottom()
            int r1 = r9.getTop()
            int r0 = r0 - r1
            int r1 = r8.q
            int r0 = r0 + r1
            float r0 = (float) r0
            r9.setTranslationY(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrt.E(int):void");
    }

    public final void a() {
        maj majVar = this.f;
        if (majVar != null) {
            int i = this.g;
            boolean z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
            mjo.e(new mbr(this, majVar, 2), new iei(z ? this.x : this.w, majVar), this.v);
        }
    }

    public final void b() {
        int i = this.g;
        if (i == 3 || i == 4) {
            h(5);
        }
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        lck lckVar;
        int i;
        int i2;
        List<lck> list = (List) obj;
        e();
        this.d = null;
        this.H = null;
        this.e = null;
        this.I = null;
        this.C = -1;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (lck lckVar2 : list) {
                if ((lckVar2.f != 0 && lckVar2.e > 1) || lckVar2.g > 0) {
                    arrayList.add(lckVar2);
                }
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lckVar = null;
                    break;
                }
                lckVar = (lck) it.next();
                if (lckVar.k <= 512000 && lckVar.j.size() == 1 && (i = lckVar.c) > 1 && (i2 = lckVar.d) > 1) {
                    if (i * lckVar.h * i2 * lckVar.i <= 262144) {
                        break;
                    }
                }
            }
            this.d = lckVar;
            this.H = p(true, arrayList);
            this.e = p(false, arrayList);
            lck lckVar3 = this.d;
            if (lckVar3 == this.H) {
                this.e = null;
                this.H = null;
            }
            if (lckVar3 == this.e) {
                this.e = null;
            }
            if (this.e == this.H) {
                this.e = null;
            }
            if (lckVar3 != null) {
                this.k.sendEmptyMessageDelayed(1, 4000L);
            }
        }
    }

    public final void d(boolean z) {
        this.J = null;
        this.I = null;
        if (z) {
            this.z = new ColorDrawable(-16777216);
            s();
        } else {
            this.z = null;
            this.y = null;
            this.b.setImageDrawable(null);
        }
        rin.n(this.h);
        this.h = null;
    }

    public final void e() {
        d(false);
        this.k.removeMessages(1);
        this.K.a();
        this.K = mfi.a;
        rin.n(this.i);
        this.i = null;
    }

    public final void f() {
        r();
        ImageView imageView = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = this.F;
        layoutParams.height = this.G;
        layoutParams.gravity = 80;
        View view = this.s;
        layoutParams.leftMargin = Math.max(view.getPaddingLeft(), Math.min((view.getWidth() - view.getPaddingRight()) - this.F, this.n.left - (this.F / 2)));
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = this.r;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setTranslationY(0.0f);
        imageView.setBackgroundResource(2131232615);
    }

    public final void g(float f) {
        r();
        ImageView imageView = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        int i = this.p;
        int i2 = i + i;
        layoutParams.width = i2;
        layoutParams.height = i2;
        layoutParams.gravity = 48;
        Rect rect = this.n;
        int i3 = rect.left - i;
        View view = this.s;
        layoutParams.leftMargin = i3 - view.getPaddingLeft();
        layoutParams.topMargin = (rect.top - i) - view.getPaddingTop();
        layoutParams.bottomMargin = 0;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        if (this.u) {
            imageView.setBackgroundResource(R.drawable.cast_scrubber);
        } else {
            imageView.setBackgroundResource(R.drawable.scrubber);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        if (i == 1) {
            this.g = 1;
            j(this.d, 0);
            i(this.d, 0, this.i.a());
            rin.n(this.h);
            this.h = null;
            if (this.H == null) {
                return;
            } else {
                i = 2;
            }
        }
        lck lckVar = (i == 3 || i == 4) ? this.e : this.H;
        int iL = l(lckVar, this.B);
        int iV = v(iL, lckVar);
        maj majVar = this.f;
        boolean z = majVar != null;
        if (z && lckVar == majVar.d && iV == majVar.a) {
            return;
        }
        this.g = i;
        if (!z && TextUtils.equals(this.J, (String) lckVar.j.get(iV))) {
            u(lckVar, iL);
            this.b.setImageMatrix(this.o);
            this.k.removeMessages(0);
            b();
            return;
        }
        this.f = new maj(this.j, lckVar, iV, 0);
        if (this.i == null && this.g == 2) {
            this.k.sendEmptyMessageDelayed(0, 500L);
        }
        if (z) {
            return;
        }
        a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            d(false);
            this.k.removeMessages(0);
            return true;
        }
        if (i != 1) {
            return false;
        }
        maj majVar = new maj(this.j, this.d, 0, 0);
        this.K = mjo.e(new mbr(this, majVar, 2), new iei(this.w, majVar), this.v);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(lck lckVar, int i, Bitmap bitmap) {
        this.z = new BitmapDrawable(this.b.getContext().getResources(), bitmap);
        s();
        this.J = (String) lckVar.j.get(i);
        this.I = lckVar;
        this.k.removeMessages(0);
    }

    public final void j(lck lckVar, int i) {
        int i2;
        if (lckVar != null) {
            ImageView imageView = this.b;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((this.G == 0 || layoutParams.height == this.G) && (this.F == 0 || layoutParams.width == this.F)) {
                int paddingTop = imageView.getPaddingTop() + imageView.getPaddingBottom();
                int paddingLeft = imageView.getPaddingLeft() + imageView.getPaddingRight();
                int i3 = layoutParams.height - paddingTop;
                int i4 = lckVar.c;
                int i5 = i4 * 9;
                int i6 = lckVar.d * 16;
                if (i5 <= i6) {
                    this.D = 0;
                    i2 = i4 - 2;
                    this.E = i2;
                } else {
                    int i7 = i4 - (i6 / 9);
                    int iMax = Math.max(2, i7 / 2);
                    int iMax2 = Math.max(0, i7 - iMax);
                    this.D = iMax2;
                    i2 = (lckVar.c - iMax2) - iMax;
                    this.E = i2;
                }
                int i8 = ((i2 + 2) * i3) / lckVar.d;
                layoutParams.width = paddingLeft + i8;
                this.l.set(0.0f, 0.0f, i8, i3);
                imageView.setLayoutParams(layoutParams);
                this.F = layoutParams.width;
                this.G = layoutParams.height;
            }
        }
        u(lckVar, Math.min(Math.max(l(lckVar, this.B), i * lckVar.h * lckVar.i), (r11 + r1) - 1));
        this.b.setImageMatrix(this.o);
    }

    @Override // defpackage.mrx
    public final void w() {
        this.f = null;
        this.k.removeMessages(0);
        t(4);
        this.J = null;
        this.I = null;
    }

    @Override // defpackage.mrx
    public final void x(int i) {
        w();
    }

    @Override // defpackage.mrx
    public final void y() {
    }
}
