package androidx.core.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.dab;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new dab(this, intExtra, intExtra2);
        }
        throw new IllegalStateException("No view id was present in the intent");
    }
}
