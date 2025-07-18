package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghn {
    public final uqx a;
    public final yrp b;
    public final yrp c;
    public final yrp d;
    public final yrp e;
    public final yrp f;
    public final yrp g;
    public final yrp h;
    public final yrp i;
    public final yrp j;
    public final yrp k;
    public final yrp l;
    private final uqw m;
    private final yrp n = yru.a(new yrp() { // from class: ggt
        @Override // defpackage.yrp
        public final Object eV() {
            uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/katniss_request_count", new uqs("method", String.class), new uqs("rpc_source_name", String.class), new uqs("status", String.class), new uqs("status_code", String.class));
            uqoVarC.d = false;
            return uqoVarC;
        }
    });
    private final yrp o;
    private final yrp p;
    private final yrp q;

    public ghn(ScheduledExecutorService scheduledExecutorService, uqn uqnVar, Application application) {
        yru.a(new yrp() { // from class: ggv
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/katniss_error_count", new uqs("method", String.class), new uqs("rpc_source_name", String.class), new uqs("status_code", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.b = yru.a(new yrp() { // from class: ggw
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/katniss_client_op", new uqs("client_op", String.class), new uqs("rpc_source_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.c = yru.a(new yrp() { // from class: ggx
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/opa_tv/katniss_latency_in_ms", new uqs("method", String.class), new uqs("rpc_source_name", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        this.o = yru.a(new yrp() { // from class: ggy
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/katniss_state_sync_count", new uqs("event", String.class), new uqs("status", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.p = yru.a(new yrp() { // from class: ggz
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/assistant_invocation_event", new uqs("status", String.class), new uqs("reason", String.class), new uqs("device", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.q = yru.a(new yrp() { // from class: gha
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/suggested_queries_fetch_event", new uqs("status", String.class), new uqs("tv_foreground_page", String.class), new uqs("reason", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.d = yru.a(new yrp() { // from class: ghb
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/opeator_access_token_count", new uqs("device", String.class), new uqs("is_empty", Boolean.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: ghc
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/search_tab_fetch_event", new uqs("status", String.class), new uqs("reason", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: ghd
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/phenotype_test_device_interactor", new uqs("flag_val", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.e = yru.a(new yrp() { // from class: ghe
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/phenotype_test_device_search", new uqs("flag_val", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: ghf
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/phenotype_test_user_interactor", new uqs("flag_val", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: ghg
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/phenotype_test_user_search", new uqs("flag_val", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.f = yru.a(new yrp() { // from class: ghh
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/phenotype_reaper_counter", new uqs[0]);
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.g = yru.a(new yrp() { // from class: ghi
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/empty_cast_id_retrieval_counter", new uqs[0]);
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.h = yru.a(new yrp() { // from class: ghj
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/empty_cast_cert_retrieval_counter", new uqs[0]);
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.i = yru.a(new yrp() { // from class: ghk
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/oobe_phenotype_sync_complete", new uqs("is_synced", Boolean.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.j = yru.a(new yrp() { // from class: ghl
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/katniss_activity_start_count", new uqs("activity", String.class), new uqs("device", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.k = yru.a(new yrp() { // from class: ghm
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/conversation_starters_fetch_success", new uqs[0]);
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.l = yru.a(new yrp() { // from class: ggu
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/opa_tv/conversation_starters_fallback", new uqs[0]);
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        uqx uqxVarE = uqx.e("app_for_tv_android");
        this.a = uqxVarE;
        uqw uqwVar = uqxVarE.c;
        if (uqwVar == null) {
            this.m = ura.c(uqnVar, scheduledExecutorService, uqxVarE, application);
        } else {
            this.m = uqwVar;
            ((ura) uqwVar).f = uqnVar;
        }
    }

    public final void a(String str, String str2, String str3) {
        ((uqo) this.p.eV()).a(1L, str, str2, str3);
    }

    public final void b(String str, String str2, String str3) {
        ((uqo) this.q.eV()).a(1L, str, str2, str3);
    }

    public final void c(String str, String str2, String str3) {
        ((uqo) this.n.eV()).a(1L, str, str2, str3, "");
    }

    public final void d(String str) {
        ((uqo) this.o.eV()).a(1L, "media_session", str);
    }
}
