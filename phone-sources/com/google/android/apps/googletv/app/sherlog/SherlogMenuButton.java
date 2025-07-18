package com.google.android.apps.googletv.app.sherlog;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.iej;
import defpackage.iuy;
import defpackage.kmo;
import defpackage.lhr;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SherlogMenuButton extends MaterialButton implements xce, iej {
    public static final /* synthetic */ int d = 0;
    public xcd a;
    public kmo b;
    public lhr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SherlogMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        Object applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((xce) applicationContext).androidInjector().a(this);
        setOnClickListener(new iuy(this, context, 9));
        dM();
    }

    public final kmo a() {
        kmo kmoVar = this.b;
        if (kmoVar != null) {
            return kmoVar;
        }
        yks.c("sherlogFeedbackManager");
        return null;
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        xcd xcdVar = this.a;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("injector");
        return null;
    }

    @Override // defpackage.iej
    public final void dM() {
        setSelected(a().d());
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a().ea(this);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a().ee(this);
    }
}
