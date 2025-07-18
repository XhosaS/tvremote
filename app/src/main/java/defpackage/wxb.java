package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wxb {
    public wvl a = null;
    public boolean b = false;
    final /* synthetic */ wxc c;

    public wxb(wxc wxcVar) {
        this.c = wxcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(bq bqVar, boolean z) {
        if (z && this.a == null && !wum.t()) {
            boolean zU = wum.u();
            this.b = zU;
            if (!zU) {
                this.a = this.c.b("FragmentTransaction Popped", "com/google/apps/tiktok/tracing/TraceCreation$1", "onBackStackChangeStarted", 152);
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (bqVar instanceof wwo)) {
            ((wwo) bqVar).aO(wyt.b());
        }
    }
}
