package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpe extends vww {
    private final fby a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpe(fby fbyVar, Executor executor, wxc wxcVar) {
        super(wxcVar, "LauncherxAppAccessObserver", executor);
        fbyVar.getClass();
        executor.getClass();
        wxcVar.getClass();
        this.a = fbyVar;
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        this.a.s();
    }
}
