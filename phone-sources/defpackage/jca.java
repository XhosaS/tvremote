package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jca implements Handler.Callback, ftp, idy {
    private int A;
    private lck B;
    private lck C;
    private String D;
    private mfb E;
    private long F;
    private final DefaultTimeBar G;
    public lck a;
    public lck b;
    public maj c;
    public int d;
    public rin e;
    public rin f;
    private final Context g;
    private final ExoPlayer h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final idf m;
    private final idf n;
    private final Executor o;
    private final Handler p;
    private final RectF q;
    private final RectF r;
    private final Matrix s;
    private LayerDrawable t;
    private Drawable u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public jca(Context context, ExoPlayer exoPlayer, DefaultTimeBar defaultTimeBar, ImageView imageView, View view, ImageView imageView2, TextView textView, idf idfVar, idf idfVar2, Executor executor) {
        idfVar.getClass();
        idfVar2.getClass();
        executor.getClass();
        this.g = context;
        this.h = exoPlayer;
        this.G = defaultTimeBar;
        this.i = imageView;
        this.j = view;
        this.k = imageView2;
        this.l = textView;
        this.m = idfVar;
        this.n = idfVar2;
        this.o = executor;
        this.p = new Handler(Looper.getMainLooper(), this);
        this.q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.s = new Matrix();
        this.w = -1;
        this.E = mfi.a;
        new ColorDrawable(jwq.C(context, R.attr.movies_controller_color));
    }

    private final lck h(boolean z, List list) {
        ImageView imageView = this.k;
        int paddingTop = imageView.getPaddingTop() + imageView.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.getClass();
        int i = layoutParams.height - paddingTop;
        if (!z) {
            i /= 4;
        }
        return mjo.h(list, i);
    }

    private final void i(lck lckVar, int i) {
        int iM = jbr.m(lckVar, this.v);
        if (this.w != iM) {
            this.w = iM;
            d(i);
        }
    }

    private final void j(boolean z) {
        this.D = null;
        this.C = null;
        if (z) {
            this.u = new ColorDrawable(-16777216);
            k();
        } else {
            this.u = null;
            this.t = null;
            this.k.setImageDrawable(null);
        }
        rin.n(this.e);
        this.e = null;
    }

    private final void k() {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null) {
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.u});
            this.t = layerDrawable2;
            layerDrawable2.setId(0, android.R.id.background);
            this.k.setImageDrawable(this.t);
            return;
        }
        layerDrawable.setDrawableByLayerId(android.R.id.background, this.u);
        LayerDrawable layerDrawable3 = this.t;
        layerDrawable3.getClass();
        layerDrawable3.invalidateSelf();
    }

    private final void l(lck lckVar, int i) {
        int i2 = lckVar.h;
        int i3 = lckVar.i;
        int i4 = i % (i2 * i3);
        int i5 = lckVar.c * (i4 % i3);
        int i6 = (i4 / i3) * lckVar.d;
        int i7 = i5 + this.x;
        RectF rectF = this.r;
        rectF.set(i7, i6, this.y + i7, r4 + i6);
        this.s.setRectToRect(rectF, this.q, Matrix.ScaleToFit.FILL);
    }

    private static final int m(int i, lck lckVar) {
        return Math.min(i / (lckVar.h * lckVar.i), lckVar.j.size() - 1);
    }

    @Override // defpackage.ftp
    public final void G(DefaultTimeBar defaultTimeBar, long j) {
        ImageView imageView = this.i;
        imageView.setVisibility(0);
        ExoPlayer exoPlayer = this.h;
        imageView.setX(defaultTimeBar.getX() + ((j / exoPlayer.E()) * defaultTimeBar.getWidth()));
        imageView.setY(defaultTimeBar.getY() + (defaultTimeBar.getHeight() / 3));
        this.F = exoPlayer.D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        if (defpackage.yks.e((java.lang.String) r12.j.get(r11), r10.D) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ftp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(long r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.H(long):void");
    }

    @Override // defpackage.ftp
    public final void I(long j, boolean z) {
        this.j.setVisibility(4);
        this.c = null;
        this.p.removeMessages(0);
        this.D = null;
        this.C = null;
        this.i.setVisibility(8);
    }

    public final void a() {
        maj majVar = this.c;
        if (majVar != null) {
            int i = this.d;
            boolean z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
            mjo.e(new jbz(this, majVar), new iei(z ? this.n : this.m, majVar), this.o);
        }
    }

    public final void b() {
        int i = this.d;
        if (i == 3 || i == 4) {
            d(5);
        }
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        lck lckVar;
        int i;
        int i2;
        List<lck> list = (List) obj;
        list.getClass();
        j(false);
        Handler handler = this.p;
        handler.removeMessages(1);
        this.E.a();
        this.E = mfi.a;
        rin.n(this.f);
        this.f = null;
        this.a = null;
        this.B = null;
        this.b = null;
        this.C = null;
        this.w = -1;
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
        this.a = lckVar;
        this.B = h(true, arrayList);
        this.b = h(false, arrayList);
        lck lckVar3 = this.a;
        if (lckVar3 == this.B) {
            this.b = null;
            this.B = null;
        }
        if (lckVar3 == this.b) {
            this.b = null;
        }
        if (this.b == this.B) {
            this.b = null;
        }
        if (lckVar3 != null) {
            handler.sendEmptyMessageDelayed(1, 4000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        if (i == 1) {
            this.d = 1;
            lck lckVar = this.a;
            lckVar.getClass();
            f(lckVar, 0);
            lck lckVar2 = this.a;
            lckVar2.getClass();
            rin rinVar = this.f;
            rinVar.getClass();
            Bitmap bitmapA = rinVar.a();
            bitmapA.getClass();
            e(lckVar2, 0, bitmapA);
            rin.n(this.e);
            this.e = null;
            if (this.B == null) {
                return;
            } else {
                i = 2;
            }
        }
        lck lckVar3 = (i == 3 || i == 4) ? this.b : this.B;
        if (lckVar3 == null) {
            return;
        }
        int iM = jbr.m(lckVar3, this.v);
        int iM2 = m(iM, lckVar3);
        maj majVar = this.c;
        boolean z = majVar != null;
        if (z) {
            majVar.getClass();
            if (lckVar3 == majVar.d) {
                majVar.getClass();
                if (iM2 == majVar.a) {
                    return;
                }
            }
        }
        this.d = i;
        if (!z && TextUtils.equals(this.D, (String) lckVar3.j.get(iM2))) {
            l(lckVar3, iM);
            this.p.removeMessages(0);
            b();
            return;
        }
        this.c = new maj(null, lckVar3, iM2, 0);
        if (this.f == null && this.d == 2) {
            this.p.sendEmptyMessageDelayed(0, 500L);
        }
        if (z) {
            return;
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(lck lckVar, int i, Bitmap bitmap) {
        this.u = new BitmapDrawable(this.k.getContext().getResources(), bitmap);
        k();
        this.D = (String) lckVar.j.get(i);
        this.C = lckVar;
        this.p.removeMessages(0);
    }

    public final void f(lck lckVar, int i) {
        int i2;
        ImageView imageView = this.k;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.getClass();
        if (((this.A == 0 || layoutParams.height == this.A) && this.z == 0) || layoutParams.width == this.z) {
            int paddingTop = imageView.getPaddingTop() + imageView.getPaddingBottom();
            int paddingLeft = imageView.getPaddingLeft() + imageView.getPaddingRight();
            int i3 = layoutParams.height - paddingTop;
            int i4 = lckVar.c;
            int i5 = i4 * 9;
            int i6 = lckVar.d * 16;
            if (i5 <= i6) {
                this.x = 0;
                i2 = i4 - 2;
                this.y = i2;
            } else {
                int i7 = i4 - (i6 / 9);
                int iMax = Math.max(2, i7 / 2);
                int iMax2 = Math.max(0, i7 - iMax);
                this.x = iMax2;
                i2 = (lckVar.c - iMax2) - iMax;
                this.y = i2;
            }
            int i8 = ((i2 + 2) * i3) / lckVar.d;
            layoutParams.width = paddingLeft + i8;
            this.q.set(0.0f, 0.0f, i8, i3);
            imageView.setLayoutParams(layoutParams);
            this.z = layoutParams.width;
            this.A = layoutParams.height;
        }
        l(lckVar, Math.min(Math.max(jbr.m(lckVar, this.v), i * lckVar.h * lckVar.i), (r11 + r2) - 1));
        imageView.setImageMatrix(this.s);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        message.getClass();
        int i = message.what;
        if (i == 0) {
            j(false);
            this.p.removeMessages(0);
            return true;
        }
        if (i != 1) {
            return false;
        }
        maj majVar = new maj(null, this.a, 0, 0);
        this.E = mjo.e(new jbz(this, majVar), new iei(this.m, majVar), this.o);
        return true;
    }
}
