package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class agn implements agp {
    private final ScrollFeedbackProvider a;

    public agn(View view) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    @Override // defpackage.agp
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.agp
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
