package com.google.android.apps.play.movies.mobileux.screen.details.actionpanel;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatButton;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.iuy;
import defpackage.mwu;
import defpackage.mwv;
import defpackage.mww;
import defpackage.nbo;
import defpackage.ras;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionPanelView extends LinearLayout implements nbo<mwu> {
    private MaterialButton a;
    private AppCompatButton b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private LinearLayout g;
    private int h;

    public ActionPanelView(Context context) {
        super(context);
        this.h = 0;
    }

    private static void b(mwv mwvVar, TextView textView, boolean z) {
        if (z) {
            textView.setVisibility(8);
            return;
        }
        tst tstVar = mwvVar.h;
        if (!tstVar.g()) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        mww mwwVar = (mww) tstVar.c();
        String str = mwwVar.a;
        tst tstVar2 = mwwVar.b;
        if (!tstVar2.g()) {
            textView.setText(str);
            textView.setContentDescription(str);
            return;
        }
        String str2 = str + " " + ((String) tstVar2.c());
        textView.setText(str2, TextView.BufferType.SPANNABLE);
        textView.setContentDescription(str2);
        ((Spannable) textView.getText()).setSpan(new StrikethroughSpan(), str.length() + 1, str2.length(), 33);
    }

    @Override // defpackage.nbo
    public final /* synthetic */ void a(Object obj) throws Resources.NotFoundException {
        mwu mwuVar = (mwu) obj;
        boolean z = mwuVar.c;
        this.c.setVisibility(true != z ? 8 : 0);
        mwv mwvVar = mwuVar.a;
        String str = mwvVar.a;
        this.a.setText(str);
        tst tstVar = mwvVar.g;
        if (tstVar.g()) {
            MaterialButton materialButton = this.a;
            Resources resources = getContext().getResources();
            ((Integer) tstVar.c()).intValue();
            materialButton.m(resources.getDrawable(R.drawable.ic_play_arrow_24px));
            MaterialButton materialButton2 = this.a;
            int dimension = (int) getContext().getResources().getDimension(R.dimen.gtv_primary_action_icon_size);
            if (dimension < 0) {
                throw new IllegalArgumentException("iconSize cannot be less than 0");
            }
            if (materialButton2.h != dimension) {
                materialButton2.h = dimension;
                materialButton2.r(true);
            }
        } else {
            this.a.m(null);
        }
        MaterialButton materialButton3 = this.a;
        tst tstVar2 = mwvVar.b;
        str.getClass();
        materialButton3.setContentDescription(str);
        this.a.setOnClickListener(new iuy(mwuVar, mwvVar, 14, null));
        b(mwvVar, this.d, z);
        tst tstVar3 = mwuVar.b;
        if (tstVar3.g()) {
            this.g.setVisibility(0);
            Object objC = tstVar3.c();
            this.b.setVisibility(0);
            AppCompatButton appCompatButton = this.b;
            mwv mwvVar2 = (mwv) objC;
            String str2 = mwvVar2.a;
            appCompatButton.setText(str2);
            AppCompatButton appCompatButton2 = this.b;
            str2.getClass();
            appCompatButton2.setContentDescription(str2);
            this.b.setOnClickListener(new iuy(mwuVar, objC, 15, null));
            b(mwvVar2, this.e, z);
        } else {
            this.g.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setVisibility(true != mwuVar.d ? 8 : 0);
            String string = getContext().getResources().getString(R.string.also_watch_on_play_movies);
            String string2 = getContext().getResources().getString(R.string.also_watch_on_play_movies_learn_more);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(string).concat(" "));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) string2);
            spannableStringBuilder.setSpan(new UnderlineSpan(), length, spannableStringBuilder.length(), 33);
            this.f.setText(spannableStringBuilder);
            this.f.setOnClickListener(new ras(1));
        }
        if (this.d.getVisibility() == 0) {
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(4);
            }
        } else if (this.e.getVisibility() == 0) {
            this.d.setVisibility(4);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (MaterialButton) findViewById(R.id.primary_action);
        this.b = (AppCompatButton) findViewById(R.id.secondary_action);
        this.c = (TextView) findViewById(R.id.multiple_discounts_annotation);
        this.d = (TextView) findViewById(R.id.primary_discount_annotation);
        this.e = (TextView) findViewById(R.id.secondary_discount_annotation);
        this.f = (TextView) findViewById(R.id.also_watch_on);
        this.g = (LinearLayout) findViewById(R.id.secondary_action_layout);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a.getVisibility() == 0 && this.b.getVisibility() == 0) {
            int iMax = Math.max(this.a.getHeight(), this.b.getHeight());
            if (this.a.getHeight() == this.b.getHeight() && this.h == iMax) {
                return;
            }
            this.h = iMax;
            this.a.setHeight(iMax);
            this.b.setHeight(iMax);
        }
    }

    public ActionPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
    }

    public ActionPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
    }

    public ActionPanelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = 0;
    }
}
