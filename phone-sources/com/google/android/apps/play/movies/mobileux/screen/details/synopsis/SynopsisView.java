package com.google.android.apps.play.movies.mobileux.screen.details.synopsis;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActivityChooserView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.a;
import defpackage.iuy;
import defpackage.jco;
import defpackage.jwq;
import defpackage.lif;
import defpackage.lio;
import defpackage.mzx;
import defpackage.nbo;
import defpackage.pke;
import defpackage.pkg;
import defpackage.tst;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SynopsisView extends LinearLayout implements nbo<mzx> {
    public TextView a;
    public boolean b;
    private View c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public SynopsisView(Context context) {
        super(context);
        this.b = true;
        this.m = false;
        this.n = false;
    }

    private final CharSequence e(List list, int i) throws Resources.NotFoundException {
        String string = getResources().getString(i);
        String strF = jwq.F(getResources(), false, list);
        if (TextUtils.isEmpty(strF)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(a.cq(strF, string, " "));
        spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.gray_200)), 0, string.length(), 33);
        return spannableString;
    }

    private static void f(TextView textView, CharSequence charSequence, boolean z) {
        textView.setText(charSequence);
        int i = 8;
        if (z && !TextUtils.isEmpty(charSequence)) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final int b() {
        return this.l ? getResources().getInteger(R.integer.details_synopsis_replay_compressed_line_count) : getResources().getInteger(R.integer.details_synopsis_compressed_line_count);
    }

    @Override // defpackage.nbo
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(mzx mzxVar) {
        boolean z = mzxVar.d;
        this.j = z;
        boolean z2 = true;
        this.i = z || mzxVar.b;
        ImmutableList immutableList = mzxVar.e;
        if (immutableList.isEmpty() && mzxVar.f.isEmpty() && mzxVar.g.isEmpty() && mzxVar.h.isEmpty()) {
            z2 = false;
        }
        this.k = z2;
        this.l = mzxVar.c;
        if (getResources().getBoolean(R.bool.details_synopsis_show_header)) {
            TextView textView = (TextView) findViewById(R.id.details_synopsis_header);
            textView.setVisibility(0);
            textView.setText(getResources().getString(R.string.details_synopsis_header));
        }
        this.a.setText(mzxVar.a);
        this.a.setMaxLines(this.i ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : b());
        this.a.setEllipsize(this.i ? null : TextUtils.TruncateAt.END);
        this.a.addOnLayoutChangeListener(new jco(this, mzxVar, 3));
        f(this.e, e(immutableList, R.string.actors_label), this.i);
        f(this.f, e(mzxVar.f, R.string.directors_label), this.i);
        f(this.g, e(mzxVar.h, R.string.writers_label), this.i);
        f(this.h, e(mzxVar.g, R.string.producers_label), this.i);
        d(mzxVar.i, mzxVar.j, mzxVar.k);
    }

    public final void d(lio lioVar, tst tstVar, tst tstVar2) {
        boolean z = (this.b || this.k) && !this.j;
        this.c.setVisibility(8);
        this.c.setOnClickListener(null);
        this.d.setVisibility(8);
        this.d.setOnClickListener(null);
        if (z) {
            if (this.i) {
                this.d.setVisibility(0);
                lif lifVar = new lif(611, lioVar);
                lioVar.d(lifVar.b);
                if (tstVar.g() && !this.n) {
                    ((pke) ((pkg) tstVar.c()).b).b(114336).a(this.d);
                    this.n = true;
                }
                this.d.setOnClickListener(new iuy(tstVar2, lifVar, 18));
                return;
            }
            this.c.setVisibility(0);
            lif lifVar2 = new lif(610, lioVar);
            lioVar.d(lifVar2.b);
            if (tstVar.g() && !this.m) {
                ((pke) ((pkg) tstVar.c()).b).b(114337).a(this.c);
                this.m = true;
            }
            this.c.setOnClickListener(new iuy(tstVar2, lifVar2, 19));
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.synopsis_text);
        this.c = findViewById(R.id.read_more);
        this.d = (TextView) findViewById(R.id.read_less);
        this.e = (TextView) findViewById(R.id.actors_credits);
        this.f = (TextView) findViewById(R.id.directors_credits);
        this.g = (TextView) findViewById(R.id.writers_credits);
        this.h = (TextView) findViewById(R.id.producers_credits);
    }

    public SynopsisView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.m = false;
        this.n = false;
    }

    public SynopsisView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.m = false;
        this.n = false;
    }
}
