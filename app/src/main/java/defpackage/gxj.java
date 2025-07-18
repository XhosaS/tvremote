package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxj extends vww {
    public final fby a;
    private final ahbt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxj(fby fbyVar, ahbt ahbtVar, Executor executor, wxc wxcVar) {
        super(wxcVar, "LauncherxAccountObserver", executor);
        fbyVar.getClass();
        ahbtVar.getClass();
        executor.getClass();
        wxcVar.getClass();
        this.a = fbyVar;
        this.b = ahbtVar;
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        ahal.e(this.b, null, 0, new gxi(this, null), 3);
        fby fbyVar = this.a;
        if (fbyVar.w()) {
            fbyVar.s();
        }
    }
}
