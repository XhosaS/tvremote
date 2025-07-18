package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetl implements aetk {
    public static final rgi A;
    public static final rgi B;
    public static final rgi C;
    public static final rgi D;
    public static final rgi E;
    public static final rgi F;
    public static final rgi G;
    public static final rgi H;
    public static final rgi I;
    public static final rgi J;
    public static final rgi K;
    public static final rgi L;
    public static final rgi M;
    public static final rgi N;
    public static final rgi O;
    public static final rgi P;
    public static final rgi Q;
    public static final rgi R;
    public static final rgi S;
    public static final rgi T;
    public static final rgi U;
    public static final rgi V;
    public static final rgi W;
    public static final rgi X;
    public static final rgi Y;
    public static final rgi Z;
    public static final rgi a;
    public static final rgi aa;
    public static final rgi ab;
    public static final rgi ac;
    public static final rgi ad;
    public static final rgi ae;
    public static final rgi af;
    public static final rgi ag;
    public static final rgi ah;
    public static final rgi ai;
    public static final rgi aj;
    public static final rgi ak;
    public static final rgi al;
    public static final rgi am;
    public static final rgi an;
    public static final rgi ao;
    public static final rgi ap;
    public static final rgi aq;
    public static final rgi ar;
    public static final rgi as;
    public static final rgi at;
    public static final rgi au;
    public static final rgi av;
    public static final rgi aw;
    public static final rgi b;
    public static final rgi c;
    public static final rgi d;
    public static final rgi e;
    public static final rgi f;
    public static final rgi g;
    public static final rgi h;
    public static final rgi i;
    public static final rgi j;
    public static final rgi k;
    public static final rgi l;
    public static final rgi m;
    public static final rgi n;
    public static final rgi o;
    public static final rgi p;
    public static final rgi q;
    public static final rgi r;
    public static final rgi s;
    public static final rgi t;
    public static final rgi u;
    public static final rgi v;
    public static final rgi w;
    public static final rgi x;
    public static final rgi y;
    public static final rgi z;

    static {
        rgg rggVarA = new rgg(rff.a("com.google.android.gms.measurement")).c().a();
        a = rggVarA.e("measurement.ad_id_cache_time", 10000L);
        b = rggVarA.e("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = rggVarA.f("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        d = rggVarA.e("measurement.max_bundles_per_iteration", 100L);
        e = new rgc(rggVarA, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f = rggVarA.e("measurement.config.cache_time", 86400000L);
        new rgc(rggVarA, "measurement.log_tag", "FA");
        g = new rgc(rggVarA, "measurement.config.url_authority", "app-measurement.com");
        h = new rgc(rggVarA, "measurement.config.url_scheme", "https");
        i = rggVarA.e("measurement.upload.debug_upload_interval", 1000L);
        rggVarA.f("measurement.config.default_flag_values", true);
        j = rggVarA.e("measurement.session.engagement_interval", 3600000L);
        k = new rgc(rggVarA, "measurement.rb.attribution.event_params", "value|currency");
        l = new rgc(rggVarA, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        m = rggVarA.e("measurement.upload.google_signal_max_queue_time", 605000L);
        n = new rgc(rggVarA, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        o = rggVarA.e("measurement.lifetimevalue.max_currency_tracked", 4L);
        p = rggVarA.e("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        q = rggVarA.e("measurement.upload.max_event_parameter_value_length", 500L);
        r = rggVarA.e("measurement.store.max_stored_events_per_app", 100000L);
        s = rggVarA.e("measurement.experiment.max_ids", 50L);
        t = rggVarA.e("measurement.audience.filter_result_max_count", 200L);
        u = rggVarA.e("measurement.upload.max_item_scoped_custom_parameters", 27L);
        v = rggVarA.e("measurement.rb.max_trigger_registrations_per_day", 1000L);
        w = rggVarA.e("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        x = rggVarA.e("measurement.rb.attribution.client.min_ad_services_version", 7L);
        y = rggVarA.e("measurement.alarm_manager.minimum_interval", 60000L);
        z = rggVarA.e("measurement.upload.minimum_delay", 500L);
        A = rggVarA.e("measurement.monitoring.sample_period_millis", 86400000L);
        B = rggVarA.e("measurement.rb.attribution.notify_app_delay_millis", 3000L);
        C = rggVarA.f("measurement.config.notify_trigger_uris_on_backgrounded", true);
        D = new rgc(rggVarA, "measurement.rb.attribution.app_allowlist", "com.labpixies.flood");
        E = rggVarA.e("measurement.upload.realtime_upload_interval", 10000L);
        F = rggVarA.e("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        rggVarA.e("measurement.config.cache_time.service", 3600000L);
        G = rggVarA.e("measurement.service_client.idle_disconnect_millis", 5000L);
        new rgc(rggVarA, "measurement.log_tag.service", "FA-SVC");
        H = rggVarA.e("measurement.service_client.reconnect_millis", 1000L);
        new rgc(rggVarA, "measurement.sgtm.app_allowlist", "*");
        I = rggVarA.e("measurement.sgtm.batch.long_queuing_threshold", 240000L);
        J = rggVarA.e("measurement.sgtm.batch.retry_interval", 1800000L);
        K = rggVarA.e("measurement.sgtm.batch.retry_max_count", 10L);
        L = rggVarA.e("measurement.sgtm.batch.retry_max_wait", 21600000L);
        M = new rgc(rggVarA, "measurement.sgtm.service_upload_apps_list", "");
        N = new rgc(rggVarA, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = rggVarA.e("measurement.sgtm.upload.batches_retrieval_limit", 5L);
        P = rggVarA.e("measurement.sgtm.upload.max_queued_batches", 5000L);
        Q = rggVarA.e("measurement.sgtm.upload.min_delay_after_background", 600000L);
        R = rggVarA.e("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
        S = rggVarA.e("measurement.sgtm.upload.min_delay_after_startup", 5000L);
        T = rggVarA.e("measurement.sgtm.upload.retry_interval", 600000L);
        U = rggVarA.e("measurement.sgtm.upload.retry_max_wait", 21600000L);
        V = rggVarA.e("measurement.upload.stale_data_deletion_interval", 86400000L);
        W = rggVarA.e("measurement.rb.attribution.max_retry_delay_seconds", 16L);
        X = rggVarA.e("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L);
        Y = new rgc(rggVarA, "measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = rggVarA.e("measurement.rb.attribution.max_queue_time", 864000000L);
        aa = new rgc(rggVarA, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        ab = new rgc(rggVarA, "measurement.rb.attribution.query_parameters_to_remove", "");
        ac = new rgc(rggVarA, "measurement.rb.attribution.uri_scheme", "https");
        ad = rggVarA.e("measurement.sdk.attribution.cache.ttl", 604800000L);
        ae = rggVarA.e("measurement.redaction.app_instance_id.ttl", 7200000L);
        af = rggVarA.e("measurement.upload.backoff_period", 43200000L);
        ag = rggVarA.e("measurement.upload.initial_upload_delay_time", 15000L);
        ah = rggVarA.e("measurement.upload.interval", 3600000L);
        ai = rggVarA.e("measurement.upload.max_bundle_size", 65536L);
        aj = rggVarA.e("measurement.upload.max_bundles", 100L);
        ak = rggVarA.e("measurement.upload.max_conversions_per_day", 500L);
        al = rggVarA.e("measurement.upload.max_error_events_per_day", 1000L);
        am = rggVarA.e("measurement.upload.max_events_per_bundle", 1000L);
        an = rggVarA.e("measurement.upload.max_events_per_day", 100000L);
        ao = rggVarA.e("measurement.upload.max_public_events_per_day", 50000L);
        ap = rggVarA.e("measurement.upload.max_queue_time", 518400000L);
        aq = rggVarA.e("measurement.upload.max_realtime_events_per_day", 10L);
        ar = rggVarA.e("measurement.upload.max_batch_size", 65536L);
        as = rggVarA.e("measurement.upload.retry_count", 6L);
        at = rggVarA.e("measurement.upload.retry_time", 1800000L);
        au = new rgc(rggVarA, "measurement.upload.url", "https://app-measurement.com/a");
        av = rggVarA.e("measurement.upload.window_interval", 3600000L);
        aw = new rgc(rggVarA, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override // defpackage.aetk
    public final long A() {
        return ((Long) J.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long B() {
        return ((Long) K.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long C() {
        return ((Long) L.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long D() {
        return ((Long) O.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long E() {
        return ((Long) P.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long F() {
        return ((Long) Q.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long G() {
        return ((Long) R.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long H() {
        return ((Long) S.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long I() {
        return ((Long) T.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long J() {
        return ((Long) U.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long K() {
        return ((Long) V.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long L() {
        return ((Long) W.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long M() {
        return ((Long) X.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long N() {
        return ((Long) Z.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long O() {
        return ((Long) ad.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long P() {
        return ((Long) ae.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long Q() {
        return ((Long) af.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long R() {
        return ((Long) ag.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long S() {
        return ((Long) ah.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long T() {
        return ((Long) ai.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long U() {
        return ((Long) aj.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long V() {
        return ((Long) ak.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long W() {
        return ((Long) al.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long X() {
        return ((Long) am.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long Y() {
        return ((Long) an.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long Z() {
        return ((Long) ao.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long aa() {
        return ((Long) ap.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long ab() {
        return ((Long) aq.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long ac() {
        return ((Long) ar.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long ad() {
        return ((Long) as.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long ae() {
        return ((Long) at.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long af() {
        return ((Long) av.b()).longValue();
    }

    @Override // defpackage.aetk
    public final String ag() {
        return (String) e.b();
    }

    @Override // defpackage.aetk
    public final String ah() {
        return (String) g.b();
    }

    @Override // defpackage.aetk
    public final String ai() {
        return (String) h.b();
    }

    @Override // defpackage.aetk
    public final String aj() {
        return (String) k.b();
    }

    @Override // defpackage.aetk
    public final String ak() {
        return (String) l.b();
    }

    @Override // defpackage.aetk
    public final String al() {
        return (String) n.b();
    }

    @Override // defpackage.aetk
    public final String am() {
        return (String) D.b();
    }

    @Override // defpackage.aetk
    public final String an() {
        return (String) M.b();
    }

    @Override // defpackage.aetk
    public final String ao() {
        return (String) N.b();
    }

    @Override // defpackage.aetk
    public final String ap() {
        return (String) Y.b();
    }

    @Override // defpackage.aetk
    public final String aq() {
        return (String) aa.b();
    }

    @Override // defpackage.aetk
    public final String ar() {
        return (String) ab.b();
    }

    @Override // defpackage.aetk
    public final String as() {
        return (String) ac.b();
    }

    @Override // defpackage.aetk
    public final String at() {
        return (String) au.b();
    }

    @Override // defpackage.aetk
    public final String au() {
        return (String) aw.b();
    }

    @Override // defpackage.aetk
    public final boolean av() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.aetk
    public final boolean aw() {
        return ((Boolean) C.b()).booleanValue();
    }

    @Override // defpackage.aetk
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long d() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long e() {
        return ((Long) i.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long f() {
        return ((Long) j.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long g() {
        return ((Long) m.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long h() {
        return ((Long) o.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long i() {
        return ((Long) p.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long j() {
        return ((Long) q.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long k() {
        return ((Long) r.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long l() {
        return ((Long) s.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long m() {
        return ((Long) t.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long n() {
        return ((Long) u.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long o() {
        return ((Long) v.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long p() {
        return ((Long) w.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long q() {
        return ((Long) x.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long r() {
        return ((Long) y.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long s() {
        return ((Long) z.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long t() {
        return ((Long) A.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long u() {
        return ((Long) B.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long v() {
        return ((Long) E.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long w() {
        return ((Long) F.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long x() {
        return ((Long) G.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long y() {
        return ((Long) H.b()).longValue();
    }

    @Override // defpackage.aetk
    public final long z() {
        return ((Long) I.b()).longValue();
    }
}
