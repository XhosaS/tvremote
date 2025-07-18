package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqr extends ViewOutlineProvider {
    final /* synthetic */ pqw a;

    public pqr(pqw pqwVar) {
        this.a = pqwVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        pqw pqwVar = this.a;
        pqwVar.g.getOutlineProvider().getOutline(pqwVar.g, outline);
    }
}
