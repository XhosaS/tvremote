package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wky {
    public final uqx a;
    private final uqw b;
    private final yrp c = yru.a(new yrp() { // from class: wkw
        @Override // defpackage.yrp
        public final Object eV() {
            uqo uqoVarC = this.a.a.c("/client_streamz/tiktok/sync/synclet/count", new uqs("app_package", String.class), new uqs("synclet_key_name", String.class), new uqs("status", String.class));
            uqoVarC.d = false;
            return uqoVarC;
        }
    });
    private final yrp d = yru.a(new yrp() { // from class: wkx
        @Override // defpackage.yrp
        public final Object eV() {
            uqq uqqVarD = this.a.a.d("/client_streamz/tiktok/sync/synclet/duration", new uqs("app_package", String.class), new uqs("synclet_key_name", String.class), new uqs("status", String.class));
            uqqVarD.d = false;
            return uqqVarD;
        }
    });

    public wky(ScheduledExecutorService scheduledExecutorService, uqn uqnVar, Application application) {
        uqx uqxVarE = uqx.e("tiktok");
        this.a = uqxVarE;
        uqw uqwVar = uqxVarE.c;
        if (uqwVar == null) {
            this.b = ura.c(uqnVar, scheduledExecutorService, uqxVarE, application);
        } else {
            this.b = uqwVar;
            ((ura) uqwVar).f = uqnVar;
        }
    }

    public final void a(String str, String str2, String str3) {
        ((uqo) this.c.eV()).a(1L, str, str2, str3);
    }

    public final void b(double d, String str, String str2, String str3) {
        ((uqq) this.d.eV()).b(d, str, str2, str3);
    }
}
