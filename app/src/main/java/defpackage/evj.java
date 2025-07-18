package defpackage;

import com.google.android.apps.tvsearch.app.TvSearchRoot_Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public class evj extends evk {
    private boolean g = false;
    private final aeih h = new aeih(new evi(this));

    @Override // defpackage.wik
    public final aeih b() {
        return this.h;
    }

    @Override // defpackage.wik, defpackage.aeja
    public final /* synthetic */ aeiz cO() {
        return this.h;
    }

    @Override // defpackage.evk, defpackage.wil, android.app.Application
    public void onCreate() {
        if (!this.g) {
            this.g = true;
            TvSearchRoot_Application tvSearchRoot_Application = (TvSearchRoot_Application) this;
            eup eupVar = (eup) b().dN();
            tvSearchRoot_Application.d = (wxc) eupVar.ii.a();
            tvSearchRoot_Application.e = eupVar.kj;
            tvSearchRoot_Application.a = (gyj) eupVar.fX.a();
            tvSearchRoot_Application.b = (hag) eupVar.s.a();
            tvSearchRoot_Application.c = eupVar.fg;
        }
        super.onCreate();
    }
}
