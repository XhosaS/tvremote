package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxd implements iaw {
    final /* synthetic */ gxf a;

    public gxd(gxf gxfVar) {
        this.a = gxfVar;
    }

    @Override // defpackage.iaw
    public final void a(Throwable th) {
        ((zdv) ((zdv) gxf.a.d()).p(th).q("com/google/android/apps/tvsearch/platform/account/state/AutoLogoutHandlerImpl$fetchSettingsListener$1", "onFetchSettingsFailure", 109, "AutoLogoutHandlerImpl.kt")).u("Failed to fetch Settings. Dropping attempt to check settings and auto logout users.");
    }

    @Override // defpackage.iaw
    public final void b() {
        gxf gxfVar = this.a;
        ahal.e(gxfVar.c, null, 0, new gxc(gxfVar, null), 3).w(new agux() { // from class: gxb
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) gxf.a.d()).p(th).q("com/google/android/apps/tvsearch/platform/account/state/AutoLogoutHandlerImpl$fetchSettingsListener$1", "onFetchSettingsSuccess$lambda$0", 98, "AutoLogoutHandlerImpl.kt")).u("Failed to handle fetched settings.");
                }
                return agpu.a;
            }
        });
        gxfVar.b.n(this);
    }
}
