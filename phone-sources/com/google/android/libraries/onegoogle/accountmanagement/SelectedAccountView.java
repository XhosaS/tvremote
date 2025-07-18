package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.quv;
import defpackage.quw;
import defpackage.qux;
import defpackage.sij;
import defpackage.tst;
import defpackage.unc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectedAccountView<AccountT> extends ConstraintLayout implements quw<AccountT> {
    private static final Property u = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc j;
    public final ImageView k;
    public final ImageView l;
    public final FrameLayout m;
    public final ObjectAnimator n;
    public boolean o;
    public qux p;
    public String q;
    public String r;
    public quv s;
    public unc t;
    private final TextView v;
    private final TextView w;
    private final TextView x;
    private final String y;
    private final String z;

    public SelectedAccountView(Context context) {
        this(context, null);
    }

    public final void e() {
        tst tstVar = this.p.a;
        if (tstVar.g()) {
            tstVar.c();
        }
        sij.x(true, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    @Override // defpackage.quw
    public final TextView f() {
        return this.x;
    }

    @Override // defpackage.quw
    public final TextView g() {
        return this.v;
    }

    @Override // defpackage.quw
    public final TextView h() {
        return this.w;
    }

    @Override // defpackage.quw
    public final AccountParticleDisc i() {
        return this.j;
    }

    public final void j(boolean z) {
        int[] iArr = cww.a;
        ImageView imageView = this.k;
        imageView.setImportantForAccessibility(1);
        imageView.setContentDescription(z ? this.q : this.r);
        cww.r(this, z ? this.z : this.y);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.p = qux.a().a();
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height);
        if (dimensionPixelSize != this.e) {
            this.e = dimensionPixelSize;
            requestLayout();
        }
        this.v = (TextView) findViewById(R.id.og_primary_account_information);
        this.w = (TextView) findViewById(R.id.og_secondary_account_information);
        this.x = (TextView) findViewById(R.id.counter);
        this.j = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.k = imageView;
        this.n = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) u, 360.0f, 180.0f);
        this.l = (ImageView) findViewById(R.id.og_custom_icon);
        this.m = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
        this.y = getResources().getString(R.string.og_account_list_collapsed_a11y);
        this.z = getResources().getString(R.string.og_account_list_expanded_a11y);
    }
}
