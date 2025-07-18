package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihl {
    public final vts a(Duration duration) {
        duration.getClass();
        ((zdv) iht.b.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker$Companion", "workSpec", 381, "FixAssistantSettingsWorker.kt")).x("WorkSpec with initial delay [%s]", duration);
        vto vtoVarN = vts.n(iht.class);
        vte vteVar = new vte(duration.toMillis(), TimeUnit.MILLISECONDS);
        vtb vtbVar = (vtb) vtoVarN;
        vtbVar.c = vteVar;
        vtbVar.g = yqt.i(new vtf("fix_assistant_settings", 3));
        vtbVar.f = yqt.i(new vtd(new vte(24L, TimeUnit.HOURS), ypv.a));
        cah cahVar = cah.a;
        vtbVar.j = yqt.i(new vte(1L, TimeUnit.MINUTES));
        vtbVar.i = yqt.i(cahVar);
        cao caoVar = new cao();
        caoVar.b(2);
        vtbVar.b = caoVar.a();
        return vtoVarN.b();
    }
}
