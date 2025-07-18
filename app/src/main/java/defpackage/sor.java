package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sor {
    public final uqx a;
    public final yrp b = yru.a(new yrp() { // from class: sns
        @Override // defpackage.yrp
        public final Object eV() {
            uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/app_flow_client_info_not_set", new uqs("app_flow_event", String.class));
            uqoVarC.d = false;
            return uqoVarC;
        }
    });
    public final yrp c;
    public final yrp d;
    public final yrp e;
    public final yrp f;
    public final yrp g;
    public final yrp h;
    public final yrp i;
    public final yrp j;
    public final yrp k;
    private final uqw l;
    private final yrp m;
    private final yrp n;
    private final yrp o;
    private final yrp p;

    public sor(ScheduledExecutorService scheduledExecutorService, uqn uqnVar, Application application) {
        yru.a(new yrp() { // from class: snu
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_adapter_timeout", new uqs("adapter_key", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.c = yru.a(new yrp() { // from class: soa
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/audio_library_android/audio_buffer_available_bytes", new uqs("device_ram_gb", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        this.d = yru.a(new yrp() { // from class: sob
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_buffer_overflow", new uqs("device_ram_gb", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.m = yru.a(new yrp() { // from class: soc
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_focus_acquire_status", new uqs("status", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.n = yru.a(new yrp() { // from class: soe
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_focus_release_status", new uqs("status", String.class), new uqs("reason", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.e = yru.a(new yrp() { // from class: sof
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_format_characteristics", new uqs("channel_config", String.class), new uqs("sample_rate", String.class), new uqs("encoding", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.o = yru.a(new yrp() { // from class: sog
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_listening_session_closing_status", new uqs("status", String.class), new uqs("reason", String.class), new uqs("device_ram_gb", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.p = yru.a(new yrp() { // from class: soh
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_listening_session_opening_status", new uqs("status", String.class), new uqs("device_ram_gb", String.class), new uqs("client_name", String.class), new uqs("successful", Boolean.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: soi
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_route_dynamic_switching", new uqs("client", String.class), new uqs("next_route", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: sod
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_routing_disconnect_status", new uqs("audio_route_type", String.class), new uqs("status", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: soj
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/audio_library_android/audio_routing_latency", new uqs("audio_route_type", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        yru.a(new yrp() { // from class: sok
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/audio_routing_status", new uqs("audio_route_type", String.class), new uqs("status", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.f = yru.a(new yrp() { // from class: sol
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/audio_library_android/audio_source_start_latency", new uqs("client", String.class), new uqs("route", String.class), new uqs("device_ram_gb", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        this.g = yru.a(new yrp() { // from class: som
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/audio_library_android/audio_start_recording_correction_duration", new uqs("negative", Boolean.class), new uqs("client_type", String.class), new uqs("client", String.class), new uqs("source_type", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        this.h = yru.a(new yrp() { // from class: son
            @Override // defpackage.yrp
            public final Object eV() {
                uqq uqqVarD = this.a.a.d("/client_streamz/audio_library_android/audio_start_time_computation_duration", new uqs("source_type", String.class), new uqs("completion_reason", String.class), new uqs("found_start_time", Boolean.class), new uqs("device_ram_gb", String.class));
                uqqVarD.d = false;
                return uqqVarD;
            }
        });
        this.i = yru.a(new yrp() { // from class: soo
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/client_info_undefined", new uqs("client_type", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: sop
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/hotword_listening_session_timeout", new uqs("hotword_client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: soq
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/hotword_session_closing_status", new uqs("status", String.class), new uqs("reason", String.class), new uqs("device_ram_gb", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: snt
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/hotword_session_opening_status", new uqs("status", String.class), new uqs("device_ram_gb", String.class), new uqs("successful", Boolean.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.j = yru.a(new yrp() { // from class: snv
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/listening_session_timeout", new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: snw
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/missing_audio_source_policy", new uqs("audio_intent", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: snx
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/prewarming_channel_status", new uqs("status_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        this.k = yru.a(new yrp() { // from class: sny
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/read_error", new uqs("device_ram_gb", String.class), new uqs("error_code", Integer.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        yru.a(new yrp() { // from class: snz
            @Override // defpackage.yrp
            public final Object eV() {
                uqo uqoVarC = this.a.a.c("/client_streamz/audio_library_android/seamless_handover_timeout", new uqs("device_ram_gb", String.class), new uqs("client_name", String.class));
                uqoVarC.d = false;
                return uqoVarC;
            }
        });
        uqx uqxVarE = uqx.e("audio_library_android");
        this.a = uqxVarE;
        uqw uqwVar = uqxVarE.c;
        if (uqwVar == null) {
            this.l = ura.c(uqnVar, scheduledExecutorService, uqxVarE, application);
        } else {
            this.l = uqwVar;
            ((ura) uqwVar).f = uqnVar;
        }
    }

    public final void a(String str, String str2) {
        ((uqo) this.m.eV()).a(1L, str, str2);
    }

    public final void b(String str, String str2, String str3) {
        ((uqo) this.n.eV()).a(1L, str, str2, str3);
    }

    public final void c(String str, String str2, String str3, String str4) {
        ((uqo) this.o.eV()).a(1L, str, str2, str3, str4);
    }

    public final void d(String str, String str2, String str3, boolean z) {
        ((uqo) this.p.eV()).a(1L, str, str2, str3, Boolean.valueOf(z));
    }
}
