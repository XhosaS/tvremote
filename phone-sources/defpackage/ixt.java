package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixt extends sbx {
    private static final tui c = tui.l("com/google/android/apps/googletv/app/framework/stream/ErrorPresenter");
    public final lhr a;
    public final kmo b;
    private final lfn d;
    private final lie e;
    private final mem f;
    private final kdh g;

    public ixt(lfn lfnVar, lie lieVar, kdh kdhVar, lhr lhrVar, mem memVar, kmo kmoVar) {
        lfnVar.getClass();
        lieVar.getClass();
        memVar.getClass();
        kmoVar.getClass();
        this.d = lfnVar;
        this.e = lieVar;
        this.g = kdhVar;
        this.a = lhrVar;
        this.f = memVar;
        this.b = kmoVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kjh(null);
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixp ixpVar = (ixp) obj;
        Throwable th = ixpVar.a;
        kjh kjhVar = (kjh) obj2;
        this.e.x(ieg.b(th));
        kjhVar.c(!d() ? Integer.valueOf(R.string.error_network) : Integer.valueOf(R.string.error_generic_with_retry));
        if (d()) {
            ((tug) ((tug) c.g()).i(th).j("com/google/android/apps/googletv/app/framework/stream/ErrorPresenter", "render", 51, "ErrorPresenter.kt")).s("Generic error, requires user to restart the app.");
        }
        lfn lfnVar = this.d;
        if (lfnVar.dq() || lfnVar.ck()) {
            String str = th + "\n" + th.getCause();
            if (!yks.e(kjhVar.d, str)) {
                kjhVar.d = str;
                kjhVar.G(2);
            }
            if (!yks.e(Boolean.valueOf(kjhVar.c), true)) {
                kjhVar.c = true;
                kjhVar.G(0);
            }
        }
        kjhVar.b(new iut((sbx) this, (Object) ixpVar, 3));
        kjhVar.f = new scc("R.id.send_feedback_button", kjhVar, new iut((sbx) this, (Object) ixpVar, 4));
        kjhVar.G(5);
    }

    public final boolean d() {
        return this.f.g().j();
    }
}
