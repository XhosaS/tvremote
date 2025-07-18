package defpackage;

import android.util.Log;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class opw implements onu {
    private final /* synthetic */ int a;

    public /* synthetic */ opw(int i) {
        this.a = i;
    }

    @Override // defpackage.onu
    public final void d(Exception exc) {
        if (this.a != 0) {
            GtvHomePageActivity.$r8$lambda$HOG4BiUCz9Fz3OnodttnSy6tOv4(exc);
        } else {
            ConcurrentHashMap concurrentHashMap = opz.a;
            Log.e("AppWidgetLogger", "Failed to log");
        }
    }
}
