package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzg {
    public static final kzf A;
    public static final kzf B;
    public static final kzf C;
    public static final kzf D;
    public static final kzf E;
    public static final kzf F;
    public static final kzf G;
    public static final kzf H;
    public static final kzf I;
    public static final kzf J;
    public static final kzf K;
    public static final kzf L;
    public static final kzf M;
    public static final kzf N;
    public static final kzf O;
    public static final kzf P;
    public static final kzf Q;
    public static final kzf R;
    public static final kzf S;
    public static final kzf T;
    public static final kzf U;
    public static final kzf V;
    public static final kzf W;
    public static final kzf X;
    public static final kzf Y;
    public static final kzf Z;
    public static final List a = DesugarCollections.synchronizedList(new ArrayList());
    public static final kzf aA;
    public static final kzf aB;
    public static final kzf aC;
    public static final kzf aD;
    public static final kzf aE;
    public static final kzf aF;
    public static final kzf aG;
    public static final kzf aH;
    public static final kzf aI;
    public static final kzf aJ;
    public static final kzf aK;
    public static final kzf aL;
    public static final kzf aM;
    public static final kzf aN;
    public static final kzf aO;
    public static final kzf aP;
    public static final kzf aQ;
    public static final kzf aR;
    public static final kzf aS;
    public static final kzf aT;
    public static final kzf aU;
    public static final kzf aV;
    public static final kzf aW;
    public static final kzf aX;
    public static final kzf aY;
    public static final kzf aZ;
    public static final kzf aa;
    public static final kzf ab;
    public static final kzf ac;
    public static final kzf ad;
    public static final kzf ae;
    public static final kzf af;
    public static final kzf ag;
    public static final kzf ah;
    public static final kzf ai;
    public static final kzf aj;
    public static final kzf ak;
    public static final kzf al;
    public static final kzf am;
    public static final kzf an;
    public static final kzf ao;
    public static final kzf ap;
    public static final kzf aq;
    public static final kzf ar;
    public static final kzf as;
    public static final kzf at;
    public static final kzf au;
    public static final kzf av;
    public static final kzf aw;
    public static final kzf ax;
    public static final kzf ay;
    public static final kzf az;
    public static final kzf b;
    public static final kzf ba;
    public static final kzf bb;
    public static final kzf bc;
    public static final kzf bd;
    public static final kzf be;
    public static final kzf bf;
    public static final kzf bg;
    public static final kzf bh;
    public static final kzf bi;
    public static final kzf bj;
    public static final kzf c;
    public static final kzf d;
    public static final kzf e;
    public static final kzf f;
    public static final kzf g;
    public static final kzf h;
    public static final kzf i;
    public static final kzf j;
    public static final kzf k;
    public static final kzf l;
    public static final kzf m;
    public static final kzf n;
    public static final kzf o;
    public static final kzf p;
    public static final kzf q;
    public static final kzf r;
    public static final kzf s;
    public static final kzf t;
    public static final kzf u;
    public static final kzf v;
    public static final kzf w;
    public static final kzf x;
    public static final kzf y;
    public static final kzf z;

    static {
        DesugarCollections.synchronizedSet(new HashSet());
        b = a("measurement.ad_id_cache_time", 10000L, new kzd() { // from class: kvs
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().a());
            }
        }, false);
        c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new kzd() { // from class: kwa
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().b());
            }
        }, false);
        d = a("measurement.monitoring.sample_period_millis", 86400000L, new kzd() { // from class: kwm
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().t());
            }
        }, false);
        e = a("measurement.config.cache_time", 86400000L, new kzd() { // from class: kwy
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().d());
            }
        }, false);
        f = a("measurement.config.url_scheme", "https", new kzd() { // from class: kxl
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ai();
            }
        }, false);
        g = a("measurement.config.url_authority", "app-measurement.com", new kzd() { // from class: kxx
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ah();
            }
        }, false);
        h = a("measurement.upload.max_bundles", 100, new kzd() { // from class: kyj
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().U());
            }
        }, false);
        i = a("measurement.upload.max_batch_size", 65536, new kzd() { // from class: kyv
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().ac());
            }
        }, false);
        j = a("measurement.upload.max_bundle_size", 65536, new kzd() { // from class: kuw
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().T());
            }
        }, false);
        k = a("measurement.upload.max_events_per_bundle", 1000, new kzd() { // from class: kvi
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().X());
            }
        }, false);
        l = a("measurement.upload.max_events_per_day", 100000, new kzd() { // from class: kvk
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().Y());
            }
        }, false);
        m = a("measurement.upload.max_error_events_per_day", 1000, new kzd() { // from class: kvq
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().W());
            }
        }, false);
        n = a("measurement.upload.max_public_events_per_day", 50000, new kzd() { // from class: kvr
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().Z());
            }
        }, false);
        o = a("measurement.upload.max_conversions_per_day", 10000, new kzd() { // from class: kvt
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().V());
            }
        }, false);
        p = a("measurement.upload.max_realtime_events_per_day", 10, new kzd() { // from class: kvu
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().ab());
            }
        }, false);
        q = a("measurement.store.max_stored_events_per_app", 100000, new kzd() { // from class: kvv
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().k());
            }
        }, false);
        r = a("measurement.upload.url", "https://app-measurement.com/a", new kzd() { // from class: kvw
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().at();
            }
        }, false);
        s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new kzd() { // from class: kvx
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().al();
            }
        }, false);
        t = a("measurement.sgtm.service_upload_apps_list", "", new kzd() { // from class: kvy
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().an();
            }
        }, false);
        u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", new kzd() { // from class: kvz
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ao();
            }
        }, false);
        v = a("measurement.sgtm.upload.retry_interval", 600000L, new kzd() { // from class: kwb
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().I());
            }
        }, false);
        w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, new kzd() { // from class: kwc
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().J());
            }
        }, false);
        x = a("measurement.sgtm.batch.retry_interval", 1800000L, new kzd() { // from class: kwe
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().A());
            }
        }, false);
        y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, new kzd() { // from class: kwf
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().C());
            }
        }, false);
        z = a("measurement.sgtm.batch.retry_max_count", 10, new kzd() { // from class: kwg
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().B());
            }
        }, false);
        A = a("measurement.sgtm.upload.max_queued_batches", 5000, new kzd() { // from class: kwh
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().E());
            }
        }, false);
        B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, new kzd() { // from class: kwi
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().D());
            }
        }, false);
        C = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, new kzd() { // from class: kwj
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().H());
            }
        }, false);
        D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new kzd() { // from class: kwk
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().G());
            }
        }, false);
        E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, new kzd() { // from class: kwl
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().F());
            }
        }, false);
        F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, new kzd() { // from class: kwn
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().z());
            }
        }, false);
        G = a("measurement.upload.backoff_period", 43200000L, new kzd() { // from class: kwp
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().Q());
            }
        }, false);
        a("measurement.upload.window_interval", 3600000L, new kzd() { // from class: kwq
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().af());
            }
        }, false);
        H = a("measurement.upload.interval", 3600000L, new kzd() { // from class: kwr
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().S());
            }
        }, false);
        I = a("measurement.upload.realtime_upload_interval", 10000L, new kzd() { // from class: kws
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().v());
            }
        }, false);
        J = a("measurement.upload.debug_upload_interval", 1000L, new kzd() { // from class: kwt
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().e());
            }
        }, false);
        K = a("measurement.upload.minimum_delay", 500L, new kzd() { // from class: kwu
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().s());
            }
        }, false);
        L = a("measurement.alarm_manager.minimum_interval", 60000L, new kzd() { // from class: kwv
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().r());
            }
        }, false);
        M = a("measurement.upload.stale_data_deletion_interval", 86400000L, new kzd() { // from class: kww
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().K());
            }
        }, false);
        N = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new kzd() { // from class: kwx
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().w());
            }
        }, false);
        O = a("measurement.upload.initial_upload_delay_time", 15000L, new kzd() { // from class: kxa
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().R());
            }
        }, false);
        P = a("measurement.upload.retry_time", 1800000L, new kzd() { // from class: kxb
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().ae());
            }
        }, false);
        Q = a("measurement.upload.retry_count", 6, new kzd() { // from class: kxc
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().ad());
            }
        }, false);
        R = a("measurement.upload.max_queue_time", 518400000L, new kzd() { // from class: kxd
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().aa());
            }
        }, false);
        S = a("measurement.upload.google_signal_max_queue_time", 300000L, new kzd() { // from class: kxe
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().g());
            }
        }, false);
        T = a("measurement.lifetimevalue.max_currency_tracked", 4, new kzd() { // from class: kxf
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().h());
            }
        }, false);
        U = a("measurement.audience.filter_result_max_count", 200, new kzd() { // from class: kxg
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().m());
            }
        }, false);
        V = a("measurement.upload.max_public_user_properties", 100, null, false);
        W = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        X = a("measurement.upload.max_public_event_params", 100, null, false);
        Y = a("measurement.service_client.idle_disconnect_millis", 5000L, new kzd() { // from class: kxh
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().x());
            }
        }, false);
        Z = a("measurement.service_client.reconnect_millis", 1000L, new kzd() { // from class: kxi
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().y());
            }
        }, false);
        aa = a("measurement.test.boolean_flag", false, new kzd() { // from class: kxj
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeut.a.eV().f());
            }
        }, false);
        ab = a("measurement.test.string_flag", "---", new kzd() { // from class: kxm
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aeut.a.eV().e();
            }
        }, false);
        ac = a("measurement.test.long_flag", -1L, new kzd() { // from class: kxn
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aeut.a.eV().d());
            }
        }, false);
        a("measurement.test.cached_long_flag", -1L, new kzd() { // from class: kxo
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aeut.a.eV().b());
            }
        }, true);
        ad = a("measurement.test.int_flag", -2, new kzd() { // from class: kxp
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aeut.a.eV().c());
            }
        }, false);
        ae = a("measurement.test.double_flag", Double.valueOf(-3.0d), new kzd() { // from class: kxq
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Double.valueOf(aeut.a.eV().a());
            }
        }, false);
        af = a("measurement.experiment.max_ids", 50, new kzd() { // from class: kxr
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().l());
            }
        }, false);
        ag = a("measurement.upload.max_item_scoped_custom_parameters", 27, new kzd() { // from class: kxs
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().n());
            }
        }, false);
        ah = a("measurement.upload.max_event_parameter_value_length", 500, new kzd() { // from class: kxt
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().j());
            }
        }, true);
        ai = a("measurement.max_bundles_per_iteration", 100, new kzd() { // from class: kxu
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().c());
            }
        }, false);
        aj = a("measurement.sdk.attribution.cache.ttl", 604800000L, new kzd() { // from class: kxw
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().O());
            }
        }, false);
        ak = a("measurement.redaction.app_instance_id.ttl", 7200000L, new kzd() { // from class: kxy
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().P());
            }
        }, false);
        al = a("measurement.rb.attribution.client.min_ad_services_version", 7, new kzd() { // from class: kxz
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().q());
            }
        }, false);
        am = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new kzd() { // from class: kya
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().i());
            }
        }, false);
        an = a("measurement.rb.attribution.uri_scheme", "https", new kzd() { // from class: kyb
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().as();
            }
        }, false);
        ao = a("measurement.rb.attribution.uri_authority", "google-analytics.com", new kzd() { // from class: kyc
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ap();
            }
        }, false);
        ap = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new kzd() { // from class: kyd
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().aq();
            }
        }, false);
        aq = a("measurement.session.engagement_interval", 3600000L, new kzd() { // from class: kye
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().f());
            }
        }, false);
        ar = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood", new kzd() { // from class: kyf
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().am();
            }
        }, false);
        as = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new kzd() { // from class: kyh
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().au();
            }
        }, false);
        at = a("measurement.rb.attribution.event_params", "value|currency", new kzd() { // from class: kyi
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().aj();
            }
        }, false);
        au = a("measurement.rb.attribution.query_parameters_to_remove", "", new kzd() { // from class: kyk
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ar();
            }
        }, false);
        av = a("measurement.rb.attribution.max_queue_time", 864000000L, new kzd() { // from class: kyl
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Long.valueOf(aetj.a.eV().N());
            }
        }, false);
        aw = a("measurement.rb.attribution.max_retry_delay_seconds", 16, new kzd() { // from class: kym
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().L());
            }
        }, false);
        ax = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, new kzd() { // from class: kyn
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().M());
            }
        }, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new kzd() { // from class: kyo
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().p());
            }
        }, false);
        ay = a("measurement.rb.max_trigger_registrations_per_day", 1000, new kzd() { // from class: kyp
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().o());
            }
        }, false);
        az = a("measurement.config.bundle_for_all_apps_on_backgrounded", true, new kzd() { // from class: kyq
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aetj.a.eV().av());
            }
        }, false);
        aA = a("measurement.config.notify_trigger_uris_on_backgrounded", true, new kzd() { // from class: kys
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aetj.a.eV().aw());
            }
        }, false);
        aB = a("measurement.rb.attribution.notify_app_delay_millis", 3000, new kzd() { // from class: kyt
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetj.a.eV().u());
            }
        }, false);
        aC = a("measurement.quality.checksum", false, null, false);
        aD = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, new kzd() { // from class: kyu
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeub.a.eV().b());
            }
        }, false);
        aE = a("measurement.audience.refresh_event_count_filters_timestamp", false, new kzd() { // from class: kyw
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeub.a.eV().a());
            }
        }, false);
        aF = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, new kzd() { // from class: kyx
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeub.a.eV().c());
            }
        }, true);
        aG = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, new kzd() { // from class: kyy
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuq.a.eV().a());
            }
        }, false);
        aH = a("measurement.integration.disable_firebase_instance_id", false, new kzd() { // from class: kyz
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevr.a.eV().a());
            }
        }, false);
        aI = a("measurement.collection.service.update_with_analytics_fix", false, new kzd() { // from class: kza
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevu.a.eV().a());
            }
        }, false);
        aJ = a("measurement.service.storage_consent_support_version", 203600, new kzd() { // from class: kzb
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Integer.valueOf((int) aetm.a.eV().a());
            }
        }, false);
        aK = a("measurement.service.store_null_safelist", true, new kzd() { // from class: kus
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aety.a.eV().a());
            }
        }, false);
        aL = a("measurement.service.store_safelist", true, new kzd() { // from class: kut
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aety.a.eV().b());
            }
        }, false);
        aM = a("measurement.session_stitching_token_enabled", false, new kzd() { // from class: kuu
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevf.a.eV().a());
            }
        }, false);
        aN = a("measurement.sgtm.client.upload_on_backgrounded.dev", false, new kzd() { // from class: kuv
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevl.a.eV().a());
            }
        }, true);
        aO = a("measurement.gmscore_client_telemetry", false, new kzd() { // from class: kux
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aeun.a.eV().a());
            }
        }, false);
        aP = a("measurement.rb.attribution.service", true, new kzd() { // from class: kuy
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().f());
            }
        }, true);
        aQ = a("measurement.rb.attribution.client2", true, new kzd() { // from class: kuz
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().a());
            }
        }, true);
        aR = a("measurement.rb.attribution.uuid_generation", true, new kzd() { // from class: kva
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().h());
            }
        }, false);
        aS = a("measurement.rb.attribution.enable_trigger_redaction", true, new kzd() { // from class: kvb
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().g());
            }
        }, false);
        a("measurement.rb.attribution.followup1.service", false, new kzd() { // from class: kvd
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().b());
            }
        }, false);
        aT = a("measurement.rb.attribution.retry_disposition", false, new kzd() { // from class: kve
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().e());
            }
        }, false);
        aU = a("measurement.client.sessions.enable_fix_background_engagement", false, new kzd() { // from class: kvf
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aevi.a.eV().a());
            }
        }, false);
        aV = a("measurement.set_default_event_parameters_propagate_clear.service.dev", true, new kzd() { // from class: kvg
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aets.a.eV().b());
            }
        }, false);
        aW = a("measurement.set_default_event_parameters_propagate_clear.client.dev", true, new kzd() { // from class: kvh
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aets.a.eV().a());
            }
        }, false);
        aX = a("measurement.service.ad_impression.convert_value_to_double", true, new kzd() { // from class: kwd
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aetg.a.eV().a());
            }
        }, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true, new kzd() { // from class: kwo
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().d());
            }
        }, false);
        a("measurement.remove_conflicting_first_party_apis.dev", false, new kzd() { // from class: kwz
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuz.a.eV().a());
            }
        }, false);
        aY = a("measurement.rb.attribution.service.trigger_uris_high_priority", true, new kzd() { // from class: kxk
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aeuw.a.eV().c());
            }
        }, false);
        aZ = a("measurement.tcf.consent_fix", false, new kzd() { // from class: kxv
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevo.a.eV().a());
            }
        }, false);
        ba = a("measurement.tcf.empty_pref_fix", true, new kzd() { // from class: kyg
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevo.a.eV().b());
            }
        }, false);
        bb = a("measurement.experiment.enable_phenotype_experiment_reporting", true, new kzd() { // from class: kyr
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return Boolean.valueOf(aevc.a.eV().a());
            }
        }, false);
        bc = a("measurement.set_default_event_parameters.fix_service_request_ordering", false, new kzd() { // from class: kzc
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aetp.a.eV().b());
            }
        }, false);
        bd = a("measurement.set_default_event_parameters.fix_app_update_logging", true, new kzd() { // from class: kvc
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aetp.a.eV().a());
            }
        }, false);
        be = a("measurement.service.fix_stop_bundling_bug", true, new kzd() { // from class: kvj
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aeuh.a.eV().a());
            }
        }, false);
        bf = a("measurement.fix_params_logcat_spam", true, new kzd() { // from class: kvl
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aeue.a.eV().a());
            }
        }, false);
        bg = a("measurement.gbraid_campaign.stop_lgclid", false, new kzd() { // from class: kvm
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aeuk.a.eV().a());
            }
        }, false);
        bh = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", new kzd() { // from class: kvn
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ag();
            }
        }, false);
        bi = a("measurement.edpb.service", false, new kzd() { // from class: kvo
            @Override // defpackage.kzd
            public final Object a() {
                return Boolean.valueOf(aetv.a.eV().a());
            }
        }, false);
        bj = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", new kzd() { // from class: kvp
            @Override // defpackage.kzd
            public final Object a() {
                List list = kzg.a;
                return aetj.a.eV().ak();
            }
        }, false);
    }

    static kzf a(String str, Object obj, kzd kzdVar, boolean z2) {
        kzf kzfVar = new kzf(str, obj, kzdVar);
        if (z2) {
            a.add(kzfVar);
        }
        return kzfVar;
    }
}
