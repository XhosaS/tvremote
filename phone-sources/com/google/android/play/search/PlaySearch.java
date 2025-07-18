package com.google.android.play.search;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.CollapsibleActionView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.tbx;
import defpackage.tci;
import defpackage.tdk;
import defpackage.tgt;
import defpackage.tgv;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tgz;
import defpackage.tha;
import defpackage.thh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearch extends FrameLayout implements CollapsibleActionView, View.OnFocusChangeListener, tgx {
    public tgx a;
    public tgw b;
    public Point c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    private PlaySearchPlate i;
    private PlaySearchSuggestionsList j;
    private CharSequence k;
    private Drawable l;
    private boolean m;

    public PlaySearch(Context context) {
        this(context, null);
    }

    private final void n(boolean z, boolean z2) {
        View view = this.d;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            if (view.getVisibility() == 8) {
                return;
            }
            if (!z2) {
                this.d.setVisibility(8);
                return;
            }
            z = false;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new tgv(this, z));
        this.d.startAnimation(alphaAnimation);
    }

    public void a(String str) {
        tgx tgxVar = this.a;
        if (tgxVar != null) {
            tgxVar.a(str);
        }
    }

    public void b(tha thaVar) {
        tgx tgxVar = this.a;
        if (tgxVar != null) {
            tgxVar.b(thaVar);
        }
    }

    public final Point c() {
        Point point = this.c;
        if (point == null) {
            View view = (View) getParent();
            return new Point(view.getRight() - (view.getHeight() / 2), (view.getTop() + view.getBottom()) / 2);
        }
        Point point2 = new Point(point);
        Rect rect = new Rect();
        Point point3 = new Point();
        getGlobalVisibleRect(rect, point3);
        point2.offset(-point3.x, -point3.y);
        return point2;
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        tgx tgxVar = this.a;
        if (tgxVar != null) {
            tgxVar.d(i);
        }
        if (this.m) {
            boolean z = i == 3;
            n(z, z || i == 2);
        }
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
        tgx tgxVar = this.a;
        if (tgxVar != null) {
            tgxVar.e(str, z);
        }
    }

    public final void f(String str) {
        this.b.f(str);
    }

    public final void g(int i) {
        if (i != 1) {
            i = 2;
        }
        this.b.c = i;
    }

    public final void h(int i) {
        this.b.e(i);
    }

    public final void i() {
        this.b.h();
    }

    public final void j(tgz tgzVar) {
        this.j.f(tgzVar);
    }

    public final void k() {
        tgz tgzVar = this.j.e;
    }

    public final void l() {
        PlaySearchPlateTextContainer playSearchPlateTextContainer = this.i.b;
    }

    @Override // android.support.v7.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        i();
    }

    @Override // android.support.v7.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        View view;
        setVisibility(0);
        if (((View) getParent()) == null || (view = this.e) == null || !view.isAttachedToWindow()) {
            return;
        }
        Point pointC = c();
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this.e, pointC.x, pointC.y, 0.0f, r0.getWidth());
        animatorCreateCircularReveal.setDuration(300L);
        i();
        animatorCreateCircularReveal.addListener(new tgt(this));
        animatorCreateCircularReveal.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        n(false, false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (PlaySearchPlate) findViewById(R.id.play_search_plate);
        this.j = (PlaySearchSuggestionsList) findViewById(R.id.play_search_suggestions_list);
        this.d = findViewById(R.id.play_search_overlay);
        this.e = findViewById(R.id.play_search_container);
        this.d.setOnClickListener(new tbx((View) this, 4));
        tgw tgwVar = new tgw();
        this.b = tgwVar;
        tgwVar.a(this);
        PlaySearchPlate playSearchPlate = this.i;
        tgw tgwVar2 = this.b;
        thh thhVar = new thh(this.b);
        PlaySearchNavigationButton playSearchNavigationButton = playSearchPlate.a;
        tgw tgwVar3 = playSearchNavigationButton.a;
        if (tgwVar3 != null) {
            tgwVar3.d(playSearchNavigationButton);
        }
        playSearchNavigationButton.a = tgwVar2;
        playSearchNavigationButton.a.a(playSearchNavigationButton);
        PlaySearchPlateTextContainer playSearchPlateTextContainer = playSearchPlate.b;
        tgw tgwVar4 = playSearchPlateTextContainer.a;
        if (tgwVar4 != null) {
            tgwVar4.d(playSearchPlateTextContainer);
        }
        playSearchPlateTextContainer.a = tgwVar2;
        playSearchPlateTextContainer.a.a(playSearchPlateTextContainer);
        playSearchPlateTextContainer.b = thhVar;
        PlaySearchActionButtonsContainer playSearchActionButtonsContainer = playSearchPlate.c;
        PlaySearchActionButton playSearchActionButton = playSearchActionButtonsContainer.b;
        tgw tgwVar5 = playSearchActionButton.a;
        if (tgwVar5 != null) {
            tgwVar5.d(playSearchActionButton);
        }
        playSearchActionButton.a = tgwVar2;
        playSearchActionButton.a.a(playSearchActionButton);
        playSearchActionButtonsContainer.a = tgwVar2;
        playSearchActionButtonsContainer.a.a(playSearchActionButtonsContainer);
        PlaySearchSuggestionsList playSearchSuggestionsList = this.j;
        tgw tgwVar6 = this.b;
        tgw tgwVar7 = playSearchSuggestionsList.b;
        if (tgwVar7 != null) {
            tgwVar7.d(playSearchSuggestionsList);
        }
        playSearchSuggestionsList.b = tgwVar6;
        playSearchSuggestionsList.b.a(playSearchSuggestionsList);
        tgz tgzVar = playSearchSuggestionsList.e;
        if (tgzVar != null) {
            tgzVar.b = playSearchSuggestionsList.b;
        }
        PlaySearchPlate playSearchPlate2 = this.i;
        int id = this.j.a.getId();
        PlaySearchPlateTextContainer playSearchPlateTextContainer2 = playSearchPlate2.b;
        playSearchPlateTextContainer2.d.setOnFocusChangeListener(this);
        playSearchPlateTextContainer2.d.setNextFocusDownId(id);
        PlaySearchSuggestionsList playSearchSuggestionsList2 = this.j;
        playSearchSuggestionsList2.a.setOnFocusChangeListener(this);
        playSearchSuggestionsList2.a.setNextFocusUpId(R.id.search_box_text_input);
        PlaySearchPlate playSearchPlate3 = this.i;
        playSearchPlate3.b.c.setImageDrawable(this.l);
        PlaySearchPlate playSearchPlate4 = this.i;
        playSearchPlate4.b.c.setContentDescription(this.k);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            return;
        }
        post(new tci(this, 5, null));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d.getVisibility() != 8) {
            View view = this.d;
            view.layout(0, 0, view.getMeasuredWidth(), this.d.getMeasuredHeight());
        }
        View view2 = this.e;
        int i5 = this.f;
        view2.layout(i5, this.h, view2.getMeasuredWidth() + i5, this.h + this.e.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 == 0) {
            size2 = View.MeasureSpec.getMode(i2) == 0 ? getContext().getResources().getDisplayMetrics().heightPixels : 0;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((size - this.f) - this.g, 1073741824), 0);
        if (this.d.getVisibility() != 8) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            size2 = this.h + this.e.getMeasuredHeight();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("play_search.parent_instance_state"));
        int i = bundle.getInt("play_search.mode_state", -1);
        if (i >= 0) {
            h(i);
        }
        String string = bundle.getString("play_search.query_state");
        if (string != null) {
            f(string);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search.parent_instance_state", super.onSaveInstanceState());
        tgw tgwVar = this.b;
        if (tgwVar != null) {
            bundle.putInt("play_search.mode_state", tgwVar.b);
            bundle.putString("play_search.query_state", this.b.d);
        }
        return bundle;
    }

    public PlaySearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.i);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.l = drawable == null ? getResources().getDrawable(2131231885) : drawable;
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.recycle();
        this.k = text == null ? context.getText(R.string.play_accessibility_search_plate_search_button) : text;
    }

    @Override // defpackage.tgx
    public final void m() {
    }
}
