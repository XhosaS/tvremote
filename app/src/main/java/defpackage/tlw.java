package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlw {
    public final uqx a;
    public final yrp b = yru.a(new yrp() { // from class: tlt
        @Override // defpackage.yrp
        public final Object eV() {
            uqo uqoVarC = this.a.a.c("/client_streamz/xuikit/client_errors/template_processing_error_count", new uqs("template_processing_error_type", Integer.class), new uqs("client_surface_id", Integer.class), new uqs("feature_attribution_id", Integer.class), new uqs("application_id", String.class));
            uqoVarC.d = false;
            return uqoVarC;
        }
    });
    public final yrp c = yru.a(new yrp() { // from class: tlu
        @Override // defpackage.yrp
        public final Object eV() {
            uqo uqoVarC = this.a.a.c("/client_streamz/xuikit/client_errors/internal_runtime_error_count", new uqs("internal_runtime_error_type", Integer.class), new uqs("client_surface_id", Integer.class), new uqs("feature_attribution_id", Integer.class), new uqs("application_id", String.class));
            uqoVarC.d = false;
            return uqoVarC;
        }
    });
    private final uqw d;

    public tlw(ScheduledExecutorService scheduledExecutorService, uqn uqnVar, Application application) {
        yru.a(new yrp() { // from class: tlv
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/xuikit/client_errors/unknown_error_count", new uqs("client_surface_id", Integer.class), new uqs("application_id", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        uqx uqxVarE = uqx.e("xuikit_android");
        this.a = uqxVarE;
        uqw uqwVar = uqxVarE.c;
        if (uqwVar == null) {
            this.d = ura.c(uqnVar, scheduledExecutorService, uqxVarE, application);
        } else {
            this.d = uqwVar;
            ((ura) uqwVar).f = uqnVar;
        }
    }
}
