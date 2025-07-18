package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoj {
    public final ttm A;
    public final ttm B;
    private final sni C;
    private final ttm D;
    private final ttm E;
    private final ttm F;
    private final ttm G;
    private final ttm H;
    private final ttm I;
    private final ttm J;
    private final ttm K;
    private final ttm L;
    private final ttm M;
    private final ttm N;
    private final ttm O;
    private final ttm P;
    public final snj a;
    public final ttm b;
    public final ttm c;
    public final ttm d;
    public final ttm e;
    public final ttm f;
    public final ttm g;
    public final ttm h;
    public final ttm i;
    public final ttm j;
    public final ttm k;
    public final ttm l;
    public final ttm m;
    public final ttm n;
    public final ttm o;
    public final ttm p;
    public final ttm q;
    public final ttm r;
    public final ttm s;
    public final ttm t;
    public final ttm u;
    public final ttm v;
    public final ttm w;
    public final ttm x;
    public final ttm y;
    public final ttm z;

    public qoj(ScheduledExecutorService scheduledExecutorService, aafi aafiVar, Application application) {
        final int i = 1;
        this.D = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i2 = 2;
        this.b = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i2) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i3 = 14;
        this.E = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i3) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i4 = 5;
        this.c = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i4) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i5 = 11;
        this.d = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i5) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i6 = 13;
        sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i6) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i3) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i7 = 15;
        sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i7) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i8 = 16;
        sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i8) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i9 = 17;
        this.e = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i9) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.F = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i5) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i10 = 0;
        this.G = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i10) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i11 = 12;
        this.f = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i11) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i12 = 18;
        this.g = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i12) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i13 = 19;
        this.h = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i13) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i14 = 20;
        this.H = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i14) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.i = sij.l(new qoi(this, i));
        this.I = sij.l(new qoi(this, i10));
        this.J = sij.l(new qoi(this, i2));
        this.K = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i10) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i15 = 3;
        sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i15) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i16 = 4;
        this.j = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i16) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.k = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i4) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i17 = 6;
        this.l = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i17) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i18 = 7;
        this.m = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i18) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i19 = 8;
        this.n = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i19) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i20 = 9;
        this.o = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i20) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        final int i21 = 10;
        this.p = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i21) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.q = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i11) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.r = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i6) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.L = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i7) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.s = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i8) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.M = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i9) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.t = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i12) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.u = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i13) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.v = sij.l(new ttm(this) { // from class: qog
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i14) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_started_count", new sne("package_name", String.class), new sne("status", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/gnp_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("job_key", String.class), new sne("result", String.class), new sne("failure_type", String.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new sne("app_package_name", String.class), new sne("path", String.class), new sne("status_code", Integer.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 3:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/growthkit_job_count", new sne("package_name", String.class), new sne("job_tag", String.class), new sne("status", String.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 4:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/promotion_shown_count", new sne("package_name", String.class), new sne("promotion_type", String.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 5:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/promotion_expired_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 6:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/promotion_expiration_overdue", new sne("package_name", String.class), new sne("account_type", String.class));
                        sncVarC.d();
                        return sncVarC;
                    case 7:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/trigger_applied_count", new sne("package_name", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 8:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/targeting_applied_count", new sne("package_name", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 9:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 10:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new sne("package_name", String.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 11:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new sne("app_package_name", String.class), new sne("status", String.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 12:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new sne("package_name", String.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 13:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new sne("package_name", String.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 14:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new sne("app_package_name", String.class), new sne("client_impl", String.class), new sne("path", String.class), new sne("status_code", Integer.class), new sne("purpose", String.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 15:
                        snf snfVarE15 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new sne("package_name", String.class), new sne("user_action", String.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 16:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new sne("package_name", String.class), new sne("account_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    case 17:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new sne("package_name", String.class), new sne("network_library", String.class), new sne("status", String.class), new sne("account_type", String.class), new sne("fetch_reason", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                    case 18:
                        snf snfVarE18 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new sne("package_name", String.class), new sne("account_type", String.class), new sne("event_code", String.class));
                        snfVarE18.d();
                        return snfVarE18;
                    case 19:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    default:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new sne("package_name", String.class), new sne("cache_enabled", Boolean.class), new sne("optimized_flow", Boolean.class), new sne("promo_shown", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                }
            }
        });
        this.w = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.x = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i2) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.y = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i15) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.N = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i16) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i22 = 6;
        this.z = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i22) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i23 = 7;
        this.A = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i23) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i24 = 8;
        this.B = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i24) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        final int i25 = 9;
        this.O = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i25) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        this.P = sij.l(new ttm(this) { // from class: qoh
            public final /* synthetic */ qoj a;

            {
                this.a = this;
            }

            @Override // defpackage.ttm
            public final Object get() {
                switch (i21) {
                    case 0:
                        snf snfVarE = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new sne("app_package_name", String.class), new sne("status", String.class), new sne("registration_reason", String.class), new sne("target_type", String.class));
                        snfVarE.d();
                        return snfVarE;
                    case 1:
                        snf snfVarE2 = this.a.a.e("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new sne("app_package_name", String.class), new sne("is_ui_thread", Boolean.class));
                        snfVarE2.d();
                        return snfVarE2;
                    case 2:
                        snc sncVarC = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC.d();
                        return sncVarC;
                    case 3:
                        snc sncVarC2 = this.a.a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new sne("package_name", String.class), new sne("did_fail", Boolean.class));
                        sncVarC2.d();
                        return sncVarC2;
                    case 4:
                        snf snfVarE3 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new sne("app_package_name", String.class), new sne("result", String.class));
                        snfVarE3.d();
                        return snfVarE3;
                    case 5:
                        snf snfVarE4 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("has_placeholder", Boolean.class), new sne("fetched_threads", Boolean.class));
                        snfVarE4.d();
                        return snfVarE4;
                    case 6:
                        snf snfVarE5 = this.a.a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE5.d();
                        return snfVarE5;
                    case 7:
                        snf snfVarE6 = this.a.a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new sne("app_package_name", String.class), new sne("is_failure", Boolean.class));
                        snfVarE6.d();
                        return snfVarE6;
                    case 8:
                        snf snfVarE7 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/account_storage_constraint_exception", new sne("app_package_name", String.class), new sne("target_type", String.class));
                        snfVarE7.d();
                        return snfVarE7;
                    case 9:
                        snf snfVarE8 = this.a.a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new sne("app_package_name", String.class), new sne("url_type", String.class));
                        snfVarE8.d();
                        return snfVarE8;
                    case 10:
                        snf snfVarE9 = this.a.a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new sne("app_package_name", String.class), new sne("is_chrome_ecct_supported", Boolean.class));
                        snfVarE9.d();
                        return snfVarE9;
                    case 11:
                        snc sncVarC3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class), new sne("fetched_threads", Boolean.class));
                        sncVarC3.d();
                        return sncVarC3;
                    case 12:
                        snf snfVarE10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new sne("app_package_name", String.class), new sne("requested_tray_limit", Integer.class), new sne("above_tray_limit_count", Integer.class), new sne("requested_slot_limit", Integer.class), new sne("above_slot_limit_count", Integer.class));
                        snfVarE10.d();
                        return snfVarE10;
                    case 13:
                        snf snfVarE11 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_insertion_equals_chime", Boolean.class));
                        snfVarE11.d();
                        return snfVarE11;
                    case 14:
                        snf snfVarE12 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_removal_equals_chime", Boolean.class));
                        snfVarE12.d();
                        return snfVarE12;
                    case 15:
                        snf snfVarE13 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new sne("app_package_name", String.class), new sne("gnp_update_equals_chime", Boolean.class));
                        snfVarE13.d();
                        return snfVarE13;
                    case 16:
                        snf snfVarE14 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new sne("app_package_name", String.class), new sne("accounts_count_equal", Boolean.class), new sne("accounts_content_equal", Boolean.class), new sne("migration_performed", Boolean.class));
                        snfVarE14.d();
                        return snfVarE14;
                    case 17:
                        snf snfVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class));
                        snfVarE15.d();
                        return snfVarE15;
                    case 18:
                        snc sncVarC4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new sne("app_package_name", String.class), new sne("failure", Boolean.class));
                        sncVarC4.d();
                        return sncVarC4;
                    case 19:
                        snf snfVarE16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new sne("app_package_name", String.class), new sne("encryption_requested", Boolean.class), new sne("key_generation_result", Boolean.class), new sne("target_type", String.class));
                        snfVarE16.d();
                        return snfVarE16;
                    default:
                        snf snfVarE17 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new sne("app_package_name", String.class), new sne("android_sdk_version", Integer.class), new sne("is_gnp_job", Boolean.class), new sne("job_key", String.class), new sne("executed_in_place", Boolean.class), new sne("result", String.class));
                        snfVarE17.d();
                        return snfVarE17;
                }
            }
        });
        snj snjVarD = snj.d("gnp_android");
        this.a = snjVarD;
        sni sniVar = snjVarD.c;
        if (sniVar == null) {
            this.C = snl.c(aafiVar, scheduledExecutorService, snjVarD, application);
        } else {
            this.C = sniVar;
            ((snl) sniVar).f = aafiVar;
        }
    }

    public final void a(String str, int i, boolean z, String str2, boolean z2, String str3) {
        ((snf) this.H.get()).b(str, Integer.valueOf(i), Boolean.valueOf(z), str2, Boolean.valueOf(z2), str3);
    }

    public final void b(String str, String str2) {
        ((snf) this.O.get()).b(str, str2);
    }

    public final void c(String str, String str2, String str3, int i, String str4) {
        ((snf) this.E.get()).b(str, str2, str3, Integer.valueOf(i), str4);
    }

    public final void d(String str, int i, String str2, String str3, String str4) {
        ((snf) this.D.get()).b(str, Integer.valueOf(i), str2, str3, str4);
    }

    public final void e(String str, boolean z) {
        ((snf) this.I.get()).b(str, Boolean.valueOf(z));
    }

    public final void f(String str, String str2) {
        ((snf) this.N.get()).b(str, str2);
    }

    public final void g(String str, String str2, String str3, String str4) {
        ((snf) this.G.get()).b(str, str2, str3, str4);
    }

    public final void h(int i, String str, String str2) {
        ((snf) this.F.get()).c(i, str, str2);
    }

    public final void i(String str, boolean z) {
        ((snf) this.P.get()).b(str, Boolean.valueOf(z));
    }

    public final void j(String str, String str2) {
        ((snf) this.L.get()).b(str, str2);
    }

    public final void k(String str, String str2) {
        ((snf) this.K.get()).b(str, str2);
    }

    public final void l(String str, String str2) {
        ((snf) this.J.get()).b(str, "Visual Element", str2);
    }

    public final void m(String str, String str2, String str3, String str4) {
        ((snf) this.M.get()).b(str, "GnpHttpClient_ExperimentGroup", str2, str3, str4);
    }
}
