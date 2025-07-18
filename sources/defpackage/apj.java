package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class apj implements amf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ apj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.amf
    public final void d(Exception exc) {
        int i = this.b;
        if (i == 0) {
            boolean z = apk.a;
            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
        } else if (i == 1) {
            boolean z2 = apk.a;
            Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
        } else if (i == 2) {
            ((adx) this.a).g(exc);
        } else {
            ((cbs) bsr.a.g().j("com/google/android/tv/remote/service/clearcut/EnabledOptInObserver", "configureOptInTask", 68, "EnabledOptInObserver.java")).t("Usage reporting API error: %s", exc.getMessage());
            ((bsr) this.a).a(false);
        }
    }
}
