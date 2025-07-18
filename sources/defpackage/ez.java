package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ez extends ee {
    final /* synthetic */ fa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(fa faVar, Context context, du duVar, View view) {
        super(context, duVar, view, true);
        this.d = faVar;
        this.b = 8388613;
        e(faVar.l);
    }

    @Override // defpackage.ee
    protected final void c() {
        fa faVar = this.d;
        du duVar = faVar.c;
        if (duVar != null) {
            duVar.close();
        }
        faVar.i = null;
        super.c();
    }
}
