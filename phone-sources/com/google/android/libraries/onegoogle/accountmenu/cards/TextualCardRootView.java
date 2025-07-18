package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.videos.R;
import defpackage.rel;
import defpackage.rjg;
import defpackage.rji;
import defpackage.trk;
import defpackage.tst;
import defpackage.xrk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextualCardRootView extends FrameLayout implements rji {
    public tst a;
    public xrk b;
    public xrk c;
    private Chip d;
    private Chip e;
    private int f;

    public TextualCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        if (this.a.g()) {
            rjgVar.b(this.d, ((rel) this.a.c()).b);
            rjgVar.b(this.e, ((rel) this.a.c()).c);
        }
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        if (this.a.g()) {
            rjgVar.e(this.d);
            rjgVar.e(this.e);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (Chip) findViewById(R.id.og_text_card_action);
        this.e = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.b = new xrk(this.d);
        this.c = new xrk(this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f) {
            this.f = size;
            this.b.k(size);
            this.c.k(this.f);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = trk.a;
    }
}
