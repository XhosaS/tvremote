package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpd extends vww {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/observers/LauncherLiveTvDataObserver");
    public final Set a;
    private final Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpd(Executor executor, wxc wxcVar) {
        super(wxcVar, "LauncherLiveTvDataObserver", executor);
        executor.getClass();
        wxcVar.getClass();
        this.c = new LinkedHashSet();
        this.a = new LinkedHashSet();
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        if (esy.a.equals(uri)) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((gpf) it.next()).a();
            }
        } else {
            if (esy.b.equals(uri)) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    iuf iufVar = ((iuc) it2.next()).a;
                    ((zdv) iuf.a.b().q("com/google/android/apps/tvsearch/statesync/monitors/livetvchannels/LiveTvChannelsMonitor", "tvTunerChannelListener$lambda$0", 49, "LiveTvChannelsMonitor.kt")).u("Received new live tv channels.");
                    iufVar.b.a(iufVar);
                }
                return;
            }
            zdv zdvVar = (zdv) b.d().q("com/google/android/apps/tvsearch/observers/LauncherLiveTvDataObserver", "traceWrappedOnChange", 29, "LauncherLiveTvDataObserver.kt");
            String string = uri != null ? uri.toString() : null;
            if (string == null) {
                string = "";
            }
            zdvVar.x("Received unexpected change for uri: %s", string);
        }
    }
}
