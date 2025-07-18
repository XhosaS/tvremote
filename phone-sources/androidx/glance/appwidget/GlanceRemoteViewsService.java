package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.dhq;
import defpackage.dly;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {
    public static final dhq a = new dhq();

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Intent is null");
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new dly(this, intExtra, intExtra2, stringExtra);
    }
}
