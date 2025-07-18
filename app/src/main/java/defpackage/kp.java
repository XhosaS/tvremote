package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kp extends ju {
    final /* synthetic */ kw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(kw kwVar, Context context, ke keVar, View view) {
        super(context, keVar, view, false, R.attr.actionOverflowMenuStyle);
        this.d = kwVar;
        if (!keVar.n.o()) {
            View view2 = kwVar.g;
            this.a = view2 == null ? (View) kwVar.f : view2;
        }
        e(kwVar.m);
    }

    @Override // defpackage.ju
    protected final void c() {
        this.d.k = null;
        super.c();
    }
}
