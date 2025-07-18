package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.goe;
import defpackage.grz;
import defpackage.hbh;
import defpackage.hbi;
import defpackage.hbj;
import defpackage.hbk;
import defpackage.hbp;
import defpackage.hbu;
import defpackage.hbv;
import defpackage.hbx;
import defpackage.hbz;
import defpackage.hca;
import defpackage.hcd;
import defpackage.hcf;
import defpackage.hcg;
import defpackage.hed;
import defpackage.hfl;
import defpackage.hhl;
import defpackage.hhr;
import defpackage.hhu;
import defpackage.hjs;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final hbx a = new hbx() { // from class: hbf
        @Override // defpackage.hbx
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            hbx hbxVar = LottieAnimationView.a;
            ThreadLocal threadLocal = hhr.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            hhk.b("Unable to load composition.", th);
        }
    };
    public int b;
    public boolean c;
    private final hbx d;
    private final hbx e;
    private final hbv f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    private final Set k;
    private final Set l;
    private hcd m;

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new hbx() { // from class: hbe
            @Override // defpackage.hbx
            public final void a(Object obj) {
                this.a.c((hbk) obj);
            }
        };
        this.e = new hbh(this);
        this.b = 0;
        this.f = new hbv();
        this.i = false;
        this.j = false;
        this.c = true;
        this.k = new HashSet();
        this.l = new HashSet();
        h(null, R.attr.lottieAnimationViewStyle);
    }

    private final void g() {
        hcd hcdVar = this.m;
        if (hcdVar != null) {
            hcdVar.g(this.d);
            this.m.f(this.e);
        }
    }

    private final void h(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hcf.a, i, 0);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(7);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(17);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                a(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(7);
            if (string2 != null) {
                b(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(17)) != null) {
            i(this.c ? hbp.g(getContext(), string, "url_".concat(string)) : hbp.g(getContext(), string, null));
        }
        this.b = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            this.f.o(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            f(typedArrayObtainStyledAttributes.getInt(15, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            e(typedArrayObtainStyledAttributes.getInt(14, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            this.f.b.c = typedArrayObtainStyledAttributes.getFloat(16, 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
            hbv hbvVar = this.f;
            if (z != hbvVar.j) {
                hbvVar.j = z;
                hfl hflVar = hbvVar.k;
                if (hflVar != null) {
                    hflVar.j = z;
                }
                hbvVar.invalidateSelf();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            String string3 = typedArrayObtainStyledAttributes.getString(4);
            hbv hbvVar2 = this.f;
            hbvVar2.h = string3;
            goe goeVarQ = hbvVar2.q();
            if (goeVarQ != null) {
                goeVarQ.e = string3;
            }
        }
        d(typedArrayObtainStyledAttributes.getString(9));
        j(typedArrayObtainStyledAttributes.getFloat(11, 0.0f), typedArrayObtainStyledAttributes.hasValue(11));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        hbv hbvVar3 = this.f;
        if (hbvVar3.i != z2) {
            hbvVar3.i = z2;
            if (hbvVar3.a != null) {
                hbvVar3.g();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            hbvVar3.f(new hed("**"), hca.K, new hhu(new hcg(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(13, 0);
            a.aZ();
            if (i2 >= 3) {
                i2 = 0;
            }
            hbvVar3.o = a.aZ()[i2];
            hbvVar3.i();
        }
        hbvVar3.d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            hbvVar3.b.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        ThreadLocal threadLocal = hhr.a;
        boolean z3 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
        Boolean.valueOf(z3).getClass();
        hbvVar3.c = z3;
    }

    private final void i(hcd hcdVar) {
        this.k.add(hbj.SET_ANIMATION);
        this.f.h();
        g();
        hcdVar.e(this.d);
        hcdVar.d(this.e);
        this.m = hcdVar;
    }

    private final void j(float f, boolean z) {
        if (z) {
            this.k.add(hbj.SET_PROGRESS);
        }
        this.f.n(f);
    }

    public final void a(final int i) {
        hcd hcdVarF;
        this.h = i;
        this.g = null;
        if (isInEditMode()) {
            hcdVarF = new hcd(new Callable() { // from class: hbg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    LottieAnimationView lottieAnimationView = this.a;
                    if (!lottieAnimationView.c) {
                        return hbp.c(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return hbp.c(context, i2, hbp.h(context, i2));
                }
            }, true);
        } else if (this.c) {
            Context context = getContext();
            hcdVarF = hbp.f(context, i, hbp.h(context, i));
        } else {
            hcdVarF = hbp.f(getContext(), i, null);
        }
        i(hcdVarF);
    }

    public final void b(String str) {
        this.g = str;
        this.h = 0;
        i(isInEditMode() ? new hcd(new grz(this, str, 2, null), true) : this.c ? hbp.e(getContext(), str, "asset_".concat(String.valueOf(str))) : hbp.e(getContext(), str, null));
    }

    public final void c(hbk hbkVar) {
        hbv hbvVar = this.f;
        hbvVar.setCallback(this);
        boolean z = true;
        this.i = true;
        if (hbvVar.a == hbkVar) {
            z = false;
        } else {
            hbvVar.m = true;
            hbvVar.h();
            hbvVar.a = hbkVar;
            hbvVar.g();
            hhl hhlVar = hbvVar.b;
            hbk hbkVar2 = hhlVar.j;
            hhlVar.j = hbkVar;
            if (hbkVar2 == null) {
                hhlVar.l(Math.max(hhlVar.h, hbkVar.h), Math.min(hhlVar.i, hbkVar.i));
            } else {
                hhlVar.l((int) hbkVar.h, (int) hbkVar.i);
            }
            float f = hhlVar.f;
            hhlVar.f = 0.0f;
            hhlVar.e = 0.0f;
            hhlVar.k((int) f);
            hhlVar.b();
            hbvVar.n(hhlVar.getAnimatedFraction());
            ArrayList arrayList = hbvVar.e;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                hbu hbuVar = (hbu) it.next();
                if (hbuVar != null) {
                    hbuVar.a();
                }
                it.remove();
            }
            arrayList.clear();
            hjs hjsVar = hbkVar.m;
            hbvVar.i();
            Drawable.Callback callback = hbvVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(hbvVar);
            }
        }
        this.i = false;
        if (getDrawable() == hbvVar) {
            if (!z) {
                return;
            }
        } else if (!z) {
            boolean zP = hbvVar.p();
            setImageDrawable(null);
            setImageDrawable(hbvVar);
            if (zP) {
                hbvVar.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            ((hbz) it2.next()).a();
        }
    }

    public final void d(String str) {
        this.f.g = str;
    }

    public final void e(int i) {
        this.k.add(hbj.SET_REPEAT_COUNT);
        this.f.o(i);
    }

    public final void f(int i) {
        this.k.add(hbj.SET_REPEAT_MODE);
        this.f.b.setRepeatMode(i);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof hbv) && ((hbv) drawable).l) {
            this.f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        hbv hbvVar = this.f;
        if (drawable2 == hbvVar) {
            super.invalidateDrawable(hbvVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.j) {
            return;
        }
        this.f.k();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof hbi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hbi hbiVar = (hbi) parcelable;
        super.onRestoreInstanceState(hbiVar.getSuperState());
        this.g = hbiVar.a;
        Set set = this.k;
        hbj hbjVar = hbj.SET_ANIMATION;
        if (!set.contains(hbjVar) && !TextUtils.isEmpty(this.g)) {
            b(this.g);
        }
        this.h = hbiVar.b;
        if (!set.contains(hbjVar) && (i = this.h) != 0) {
            a(i);
        }
        if (!set.contains(hbj.SET_PROGRESS)) {
            j(hbiVar.c, false);
        }
        hbj hbjVar2 = hbj.PLAY_OPTION;
        if (!set.contains(hbjVar2) && hbiVar.d) {
            set.add(hbjVar2);
            this.f.k();
        }
        if (!set.contains(hbj.SET_IMAGE_ASSETS)) {
            d(hbiVar.e);
        }
        if (!set.contains(hbj.SET_REPEAT_MODE)) {
            f(hbiVar.f);
        }
        if (set.contains(hbj.SET_REPEAT_COUNT)) {
            return;
        }
        e(hbiVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        hbi hbiVar = new hbi(super.onSaveInstanceState());
        hbiVar.a = this.g;
        hbiVar.b = this.h;
        hbv hbvVar = this.f;
        hbiVar.c = hbvVar.c();
        if (hbvVar.isVisible()) {
            z = hbvVar.b.k;
        } else {
            int i = hbvVar.n;
            z = i == 2 || i == 3;
        }
        hbiVar.d = z;
        hbiVar.e = hbvVar.g;
        hbiVar.f = hbvVar.b.getRepeatMode();
        hbiVar.g = hbvVar.e();
        return hbiVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        g();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        g();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        g();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        hbv hbvVar;
        if (!this.i && drawable == (hbvVar = this.f) && hbvVar.p()) {
            this.j = false;
            hbvVar.j();
        } else if (!this.i && (drawable instanceof hbv)) {
            hbv hbvVar2 = (hbv) drawable;
            if (hbvVar2.p()) {
                hbvVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new hbx() { // from class: hbe
            @Override // defpackage.hbx
            public final void a(Object obj) {
                this.a.c((hbk) obj);
            }
        };
        this.e = new hbh(this);
        this.b = 0;
        this.f = new hbv();
        this.i = false;
        this.j = false;
        this.c = true;
        this.k = new HashSet();
        this.l = new HashSet();
        h(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new hbx() { // from class: hbe
            @Override // defpackage.hbx
            public final void a(Object obj) {
                this.a.c((hbk) obj);
            }
        };
        this.e = new hbh(this);
        this.b = 0;
        this.f = new hbv();
        this.i = false;
        this.j = false;
        this.c = true;
        this.k = new HashSet();
        this.l = new HashSet();
        h(attributeSet, i);
    }
}
