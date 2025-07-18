package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.katniss.R;
import defpackage.abs;
import defpackage.cpd;
import defpackage.cpe;
import defpackage.cpf;
import defpackage.cpg;
import defpackage.cph;
import defpackage.cpp;
import defpackage.cqc;
import defpackage.cqd;
import defpackage.cqf;
import defpackage.cqh;
import defpackage.cqi;
import defpackage.cqm;
import defpackage.cqo;
import defpackage.cqp;
import defpackage.cqq;
import defpackage.cqr;
import defpackage.csm;
import defpackage.css;
import defpackage.cuh;
import defpackage.cws;
import defpackage.cwy;
import defpackage.cxb;
import defpackage.cxd;
import defpackage.lu;
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
public class LottieAnimationView extends lu {
    public static final cqf a = new cqf() { // from class: cpb
        @Override // defpackage.cqf
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            cqf cqfVar = LottieAnimationView.a;
            ThreadLocal threadLocal = cwy.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            cwr.a("Unable to load composition.", th);
        }
    };
    public cqf b;
    public int c;
    public final cqd d;
    public boolean e;
    public final Set f;
    private final cqf g;
    private final cqf h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private final Set m;
    private cqm n;
    private cph o;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new cqf() { // from class: coz
            @Override // defpackage.cqf
            public final void a(Object obj) {
                this.a.f((cph) obj);
            }
        };
        this.h = new cpd(this);
        this.c = 0;
        this.d = new cqd();
        this.k = false;
        this.l = false;
        this.e = true;
        this.f = new HashSet();
        this.m = new HashSet();
        j(null, R.attr.lottieAnimationViewStyle);
    }

    private final void i() {
        cqm cqmVar = this.n;
        if (cqmVar != null) {
            cqmVar.g(this.g);
            this.n.f(this.h);
        }
    }

    private final void j(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cqp.a, i, 0);
        this.e = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(7);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(17);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(7);
            if (string2 != null) {
                d(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(17)) != null) {
            e(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(6, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            this.d.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(15, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(14, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
            cqd cqdVar = this.d;
            if (z != cqdVar.j) {
                cqdVar.j = z;
                cuh cuhVar = cqdVar.k;
                if (cuhVar != null) {
                    cuhVar.j = z;
                }
                cqdVar.invalidateSelf();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            String string3 = typedArrayObtainStyledAttributes.getString(4);
            cqd cqdVar2 = this.d;
            cqdVar2.h = string3;
            csm csmVarB = cqdVar2.b();
            if (csmVarB != null) {
                csmVarB.e = string3;
            }
        }
        String string4 = typedArrayObtainStyledAttributes.getString(9);
        cqd cqdVar3 = this.d;
        cqdVar3.g = string4;
        k(typedArrayObtainStyledAttributes.getFloat(11, 0.0f), typedArrayObtainStyledAttributes.hasValue(11));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (cqdVar3.i != z2) {
            cqdVar3.i = z2;
            if (cqdVar3.a != null) {
                cqdVar3.d();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            cqdVar3.c(new css("**"), cqi.K, new cxb(new cqr(abs.b(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            cqq cqqVar = cqq.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(13, cqqVar.ordinal());
            if (iOrdinal >= cqq.values().length) {
                iOrdinal = cqqVar.ordinal();
            }
            cqdVar3.l = cqq.values()[iOrdinal];
            cqdVar3.f();
        }
        cqdVar3.d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            cqdVar3.b.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        ThreadLocal threadLocal = cwy.a;
        boolean z3 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
        Boolean.valueOf(z3).getClass();
        cqdVar3.c = z3;
    }

    private final void k(float f, boolean z) {
        if (z) {
            this.f.add(cpg.SET_PROGRESS);
        }
        this.d.q(f);
    }

    public final void a(css cssVar, Object obj, cxd cxdVar) {
        this.d.c(cssVar, obj, new cpe(cxdVar));
    }

    public final void b() {
        this.l = false;
        this.d.g();
    }

    public final void c() {
        this.f.add(cpg.PLAY_OPTION);
        this.d.h();
    }

    public final void d(final String str) {
        this.i = str;
        this.j = 0;
        g(isInEditMode() ? new cqm(new Callable() { // from class: cpa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                LottieAnimationView lottieAnimationView = this.a;
                return lottieAnimationView.e ? cpp.a(lottieAnimationView.getContext(), str2, "asset_".concat(String.valueOf(str2))) : cpp.a(lottieAnimationView.getContext(), str2, null);
            }
        }, true) : this.e ? cpp.f(getContext(), str, "asset_".concat(String.valueOf(str))) : cpp.f(getContext(), str, null));
    }

    public final void e(String str) {
        g(this.e ? cpp.h(getContext(), str) : cpp.i(getContext(), str, null));
    }

    public final void f(cph cphVar) {
        cqd cqdVar = this.d;
        cqdVar.setCallback(this);
        this.o = cphVar;
        boolean z = true;
        this.k = true;
        if (cqdVar.a == cphVar) {
            z = false;
        } else {
            cqdVar.m = true;
            cqdVar.e();
            cqdVar.a = cphVar;
            cqdVar.d();
            cws cwsVar = cqdVar.b;
            cph cphVar2 = cwsVar.j;
            cwsVar.j = cphVar;
            if (cphVar2 == null) {
                cwsVar.l(Math.max(cwsVar.h, cphVar.i), Math.min(cwsVar.i, cphVar.j));
            } else {
                cwsVar.l((int) cphVar.i, (int) cphVar.j);
            }
            float f = cwsVar.f;
            cwsVar.f = 0.0f;
            cwsVar.e = 0.0f;
            cwsVar.k((int) f);
            cwsVar.b();
            cqdVar.q(cwsVar.getAnimatedFraction());
            ArrayList arrayList = cqdVar.e;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                cqc cqcVar = (cqc) it.next();
                if (cqcVar != null) {
                    cqcVar.a();
                }
                it.remove();
            }
            arrayList.clear();
            cqo cqoVar = cphVar.a;
            cqdVar.f();
            Drawable.Callback callback = cqdVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(cqdVar);
            }
        }
        this.k = false;
        if (getDrawable() == cqdVar) {
            if (!z) {
                return;
            }
        } else if (!z) {
            boolean zR = cqdVar.r();
            i();
            super.setImageDrawable(null);
            i();
            super.setImageDrawable(cqdVar);
            if (zR) {
                cqdVar.i();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.m.iterator();
        while (it2.hasNext()) {
            ((cqh) it2.next()).a(cphVar);
        }
    }

    public final void g(cqm cqmVar) {
        this.f.add(cpg.SET_ANIMATION);
        this.o = null;
        this.d.e();
        i();
        cqmVar.e(this.g);
        cqmVar.d(this.h);
        this.n = cqmVar;
    }

    public boolean getClipToCompositionBounds() {
        return this.d.j;
    }

    public cph getComposition() {
        return this.o;
    }

    public long getDuration() {
        cph cphVar = this.o;
        if (cphVar != null) {
            return (long) cphVar.a();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.d.b.f;
    }

    public String getImageAssetsFolder() {
        return this.d.g;
    }

    public boolean getMaintainOriginalImageBounds() {
        return false;
    }

    public float getMaxFrame() {
        return this.d.b.d();
    }

    public float getMinFrame() {
        return this.d.b.e();
    }

    public cqo getPerformanceTracker() {
        cph cphVar = this.d.a;
        if (cphVar != null) {
            return cphVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.d.b.c();
    }

    public cqq getRenderMode() {
        return this.d.a();
    }

    public int getRepeatCount() {
        return this.d.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.d.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.d.b.c;
    }

    public final void h(cqh cqhVar) {
        cph cphVar = this.o;
        if (cphVar != null) {
            cqhVar.a(cphVar);
        }
        this.m.add(cqhVar);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof cqd) && ((cqd) drawable).a() == cqq.SOFTWARE) {
            this.d.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        cqd cqdVar = this.d;
        if (drawable2 == cqdVar) {
            super.invalidateDrawable(cqdVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.d.h();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.a;
        Set set = this.f;
        cpg cpgVar = cpg.SET_ANIMATION;
        if (!set.contains(cpgVar) && !TextUtils.isEmpty(this.i)) {
            d(this.i);
        }
        this.j = savedState.b;
        if (!set.contains(cpgVar) && (i = this.j) != 0) {
            setAnimation(i);
        }
        if (!set.contains(cpg.SET_PROGRESS)) {
            k(savedState.c, false);
        }
        if (!set.contains(cpg.PLAY_OPTION) && savedState.d) {
            c();
        }
        if (!set.contains(cpg.SET_IMAGE_ASSETS)) {
            this.d.g = savedState.e;
        }
        if (!set.contains(cpg.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f);
        }
        if (set.contains(cpg.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        savedState.b = this.j;
        cqd cqdVar = this.d;
        cws cwsVar = cqdVar.b;
        savedState.c = cwsVar.c();
        if (cqdVar.isVisible()) {
            z = cwsVar.k;
        } else {
            int i = cqdVar.n;
            z = i == 2 || i == 3;
        }
        savedState.d = z;
        savedState.e = cqdVar.g;
        savedState.f = cwsVar.getRepeatMode();
        savedState.g = cwsVar.getRepeatCount();
        return savedState;
    }

    public void setAnimation(final int i) {
        cqm cqmVarG;
        this.j = i;
        this.i = null;
        if (isInEditMode()) {
            cqmVarG = new cqm(new Callable() { // from class: cpc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    LottieAnimationView lottieAnimationView = this.a;
                    if (!lottieAnimationView.e) {
                        return cpp.c(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return cpp.c(context, i2, cpp.j(context, i2));
                }
            }, true);
        } else if (this.e) {
            Context context = getContext();
            cqmVarG = cpp.g(context, i, cpp.j(context, i));
        } else {
            cqmVarG = cpp.g(getContext(), i, null);
        }
        g(cqmVarG);
    }

    public void setFallbackResource(int i) {
        this.c = i;
    }

    public void setFrame(int i) {
        this.d.j(i);
    }

    @Override // defpackage.lu, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        i();
        super.setImageBitmap(bitmap);
    }

    @Override // defpackage.lu, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        i();
        super.setImageDrawable(drawable);
    }

    @Override // defpackage.lu, android.widget.ImageView
    public void setImageResource(int i) {
        i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.d.k(i);
    }

    public void setMaxProgress(float f) {
        this.d.l(f);
    }

    public void setMinFrame(int i) {
        this.d.o(i);
    }

    public void setMinProgress(float f) {
        this.d.p(f);
    }

    public void setProgress(float f) {
        k(f, true);
    }

    public void setRepeatCount(int i) {
        this.f.add(cpg.SET_REPEAT_COUNT);
        this.d.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f.add(cpg.SET_REPEAT_MODE);
        this.d.b.setRepeatMode(i);
    }

    public void setSpeed(float f) {
        this.d.b.c = f;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        cqd cqdVar;
        if (!this.k && drawable == (cqdVar = this.d) && cqdVar.r()) {
            b();
        } else if (!this.k && (drawable instanceof cqd)) {
            cqd cqdVar2 = (cqd) drawable;
            if (cqdVar2.r()) {
                cqdVar2.g();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new cqf() { // from class: coz
            @Override // defpackage.cqf
            public final void a(Object obj) {
                this.a.f((cph) obj);
            }
        };
        this.h = new cpd(this);
        this.c = 0;
        this.d = new cqd();
        this.k = false;
        this.l = false;
        this.e = true;
        this.f = new HashSet();
        this.m = new HashSet();
        j(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new cpf();
        String a;
        int b;
        float c;
        boolean d;
        String e;
        int f;
        int g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new cqf() { // from class: coz
            @Override // defpackage.cqf
            public final void a(Object obj) {
                this.a.f((cph) obj);
            }
        };
        this.h = new cpd(this);
        this.c = 0;
        this.d = new cqd();
        this.k = false;
        this.l = false;
        this.e = true;
        this.f = new HashSet();
        this.m = new HashSet();
        j(attributeSet, i);
    }
}
