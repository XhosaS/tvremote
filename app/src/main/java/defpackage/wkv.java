package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkv {
    public final uqx a;
    public final yrp b = yru.a(new yrp() { // from class: wku
        @Override // defpackage.yrp
        public final Object eV() {
            uqq uqqVarD = this.a.a.d("/client_streamz/tiktok/grpc/global/duration", new uqs("app_package", String.class), new uqs("status", Integer.class));
            uqqVarD.d = false;
            return uqqVarD;
        }
    });
    private final uqw c;

    public wkv(ScheduledExecutorService scheduledExecutorService, uqn uqnVar, Application application) {
        uqx uqxVarE = uqx.e("tiktok");
        this.a = uqxVarE;
        uqw uqwVar = uqxVarE.c;
        if (uqwVar == null) {
            this.c = ura.c(uqnVar, scheduledExecutorService, uqxVarE, application);
        } else {
            this.c = uqwVar;
            ((ura) uqwVar).f = uqnVar;
        }
    }
}
