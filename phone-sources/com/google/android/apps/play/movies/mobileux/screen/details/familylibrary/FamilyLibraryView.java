package com.google.android.apps.play.movies.mobileux.screen.details.familylibrary;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.gea;
import defpackage.myn;
import defpackage.nbo;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FamilyLibraryView extends LinearLayout implements nbo<myn> {
    public SwitchCompat a;
    private View b;

    public FamilyLibraryView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(myn mynVar) throws Resources.NotFoundException {
        this.a.setVisibility(0);
        if (mynVar.b) {
            this.a.setEnabled(true);
            this.a.setOnCheckedChangeListener(null);
            this.a.setChecked(mynVar.a);
            this.a.setOnCheckedChangeListener(new gea(this, 9));
        } else {
            this.a.setEnabled(false);
        }
        tst tstVar = mynVar.c;
        if (!tstVar.g()) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            ((nbo) this.b).a(tstVar.c());
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (SwitchCompat) findViewById(R.id.familylibrary_switch);
        this.b = findViewById(R.id.family_sharing_card);
    }

    public FamilyLibraryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FamilyLibraryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FamilyLibraryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
