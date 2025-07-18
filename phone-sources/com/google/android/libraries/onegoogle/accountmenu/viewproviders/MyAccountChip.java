package com.google.android.libraries.onegoogle.accountmenu.viewproviders;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import defpackage.qwn;
import defpackage.rjg;
import defpackage.rji;
import defpackage.xrk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MyAccountChip<T> extends Chip implements rji {
    public static final /* synthetic */ int c = 0;
    public qwn a;
    public final xrk b;

    public MyAccountChip(Context context) {
        super(context, null);
        this.b = new xrk(this);
        a();
    }

    private final void a() {
        Resources resources = getResources();
        this.b.j(ImmutableList.of(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        rjgVar.c(this, 90139);
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        rjgVar.e(this);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new xrk(this);
        a();
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new xrk(this);
        a();
    }
}
