package defpackage;

import android.content.ContentResolver;
import com.google.android.apps.tvsearch.providers.launcher.WidgetInfoProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcg implements gtt {
    final /* synthetic */ WidgetInfoProvider a;

    public hcg(WidgetInfoProvider widgetInfoProvider) {
        this.a = widgetInfoProvider;
    }

    @Override // defpackage.gtt
    public final Object a(agsw agswVar) {
        ContentResolver contentResolver = this.a.a;
        if (contentResolver == null) {
            agvy.b("contentResolver");
            contentResolver = null;
        }
        contentResolver.notifyChange(hcm.a, null);
        return agpu.a;
    }
}
