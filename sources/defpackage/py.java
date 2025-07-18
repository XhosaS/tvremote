package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class py implements qa {
    private final ScrollFeedbackProvider a;

    public py(View view) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    @Override // defpackage.qa
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.qa
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
