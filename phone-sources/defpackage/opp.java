package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opp implements opr {
    private static final osk e = new osk();
    public final Context a;
    public final List b;
    public final unc c;

    public opp(Context context, unc uncVar, ExecutorService executorService) {
        this.a = context;
        this.c = uncVar;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        List<AppWidgetProviderInfo> installedProviders = (appWidgetManager == null || (installedProviders = appWidgetManager.getInstalledProviders()) == null) ? yhb.a : installedProviders;
        ArrayList arrayList = new ArrayList(yfm.z(installedProviders, 10));
        for (AppWidgetProviderInfo appWidgetProviderInfo : installedProviders) {
            slp slpVar = new slp(this.a.getApplicationContext().getApplicationContext(), executorService);
            slpVar.d = appWidgetProviderInfo.provider.getClassName();
            boolean z = true;
            sij.o(true, "Cannot call forKeys() with null argument");
            ImmutableSet.Builder builder = ImmutableSet.builder();
            builder.add((Object[]) new String[]{"ids"});
            ImmutableSet immutableSetBuild = builder.build();
            sij.o(immutableSetBuild.size() == 1, "Duplicate keys specified");
            slpVar.e = immutableSetBuild;
            slpVar.b = true;
            slpVar.f = new zft(e);
            if (slpVar.e == null) {
                z = false;
            }
            sij.o(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
            arrayList.add(new slq(slpVar));
        }
        this.b = arrayList;
    }
}
