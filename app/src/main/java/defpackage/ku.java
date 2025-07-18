package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ku extends ju {
    final /* synthetic */ kw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(kw kwVar, Context context, jj jjVar, View view) {
        super(context, jjVar, view, true, R.attr.actionOverflowMenuStyle);
        this.d = kwVar;
        this.b = 8388613;
        e(kwVar.m);
    }

    @Override // defpackage.ju
    protected final void c() {
        kw kwVar = this.d;
        jj jjVar = kwVar.c;
        if (jjVar != null) {
            jjVar.g(true);
        }
        kwVar.j = null;
        super.c();
    }
}
