package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.UserManager;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfu implements lfn, lfr {
    public static final /* synthetic */ int c = 0;
    private static final Uri d = Uri.parse("https://play.google.com/video/downloads/");
    private static final Uri e = Uri.parse("https://s.youtube.com/api/stats/");
    private final hfx A;
    lfk a;
    lfk b;
    private final Context f;
    private final SharedPreferences g;
    private final lft h;
    private final xbw i;
    private final ieh j;
    private final boolean k;
    private final xbw l;
    private final xbw m;
    private final boolean n;
    private final boolean o;
    private final xbw p;
    private final xbw q;
    private final xbw r;
    private final xbw s;
    private final xbw t;
    private final xbw u;
    private final xbw v;
    private final xbw w;
    private final xbw x;
    private int y = -1;
    private final kwy z;

    public lfu(Context context, lxc lxcVar, SharedPreferences sharedPreferences, xbw xbwVar, kwy kwyVar, ieh iehVar, xbw xbwVar2, xbw xbwVar3, xbw xbwVar4, xbw xbwVar5, xbw xbwVar6, xbw xbwVar7, xbw xbwVar8, xbw xbwVar9, xbw xbwVar10, xbw xbwVar11, xbw xbwVar12) throws PackageManager.NameNotFoundException {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        ContentResolver contentResolver = context.getContentResolver();
        hfx hfxVar = new hfx(contentResolver);
        this.A = hfxVar;
        this.a = new lfl(contentResolver);
        this.b = new lfm(lxcVar.b, this.a, new kqd(contentResolver, 3));
        Signature[] apkContentsSigners = null;
        if (sharedPreferences.getString("environment_value", "DONT_OVERRIDE").equals("DONT_OVERRIDE")) {
            this.h = new lfs(hfxVar, this.a, 1);
        } else {
            String string = sharedPreferences.getString("environment_apiary_base_uri", null);
            string.getClass();
            String string2 = sharedPreferences.getString("environment_license_base_uri", null);
            string2.getClass();
            this.h = new lfs(string, string2, 0);
        }
        this.f = context;
        this.g = sharedPreferences;
        this.i = xbwVar;
        this.z = kwyVar;
        this.j = iehVar;
        this.p = xbwVar2;
        this.q = xbwVar3;
        this.r = xbwVar4;
        this.s = xbwVar5;
        this.t = xbwVar6;
        this.u = xbwVar7;
        this.v = xbwVar8;
        this.w = xbwVar9;
        this.k = ksk.s(packageManager);
        this.l = xbwVar10;
        this.m = xbwVar11;
        this.x = xbwVar12;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager != null) {
            devicePolicyManager.isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent");
        }
        if (!ksk.p()) {
            ((UserManager) context.getSystemService("user")).getUserRestrictions().getBoolean("no_modify_accounts", false);
        }
        DevicePolicyManager devicePolicyManager2 = (DevicePolicyManager) context.getSystemService("device_policy");
        this.n = devicePolicyManager2 != null && devicePolicyManager2.isLockTaskPermitted(context.getPackageName());
        try {
            if (ksk.b >= 28) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
                if (packageInfo != null && packageInfo.signingInfo != null) {
                    apkContentsSigners = packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
                }
            } else {
                apkContentsSigners = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (apkContentsSigners == null) {
            krd.b("Signatures is null, returning false");
        } else {
            for (Signature signature : apkContentsSigners) {
                if (krh.c(signature).equals("24BB24C05E47E0AEFA68A58A766179D9B613A600")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.o = z;
        if (dD("enable_k2")) {
            ((lfx) this.i.b()).c(12669830);
        }
    }

    private final Uri dF(String str, String str2) {
        Uri uriDG = dG(str, str2);
        if (uriDG == null) {
            return null;
        }
        return this.A.j(uriDG);
    }

    private final Uri dG(String str, String str2) {
        String strD = this.a.d(str, str2);
        if (strD == null) {
            return null;
        }
        return Uri.parse(strD);
    }

    private final Set dH(String str, String str2, String str3) {
        HashSet hashSet;
        Pattern pattern = ksh.a;
        if (TextUtils.isEmpty(str)) {
            hashSet = new HashSet();
        } else {
            String[] strArrSplit = str.split(",");
            HashSet hashSet2 = new HashSet(strArrSplit.length);
            for (String str4 : strArrSplit) {
                hashSet2.add(Integer.valueOf(str4.trim()));
            }
            hashSet = hashSet2;
        }
        String strD = this.a.d(str2, null);
        if (!TextUtils.isEmpty(strD)) {
            hashSet.addAll(ksh.g(strD));
        }
        String strD2 = this.a.d(str3, null);
        if (!TextUtils.isEmpty(strD2)) {
            hashSet.removeAll(ksh.g(strD2));
        }
        return hashSet;
    }

    @Override // defpackage.lfn
    public final int A() {
        return (int) ((xit) this.m.b()).j();
    }

    @Override // defpackage.lfn
    public final int B() {
        return (int) ((xit) this.m.b()).l();
    }

    @Override // defpackage.lfn
    public final int C() {
        return this.a.b("exo_v2_high_watermark_ms", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @Override // defpackage.lfn
    public final int D() {
        return this.k ? this.a.b("exo_v2_init_bitrate_algo_tv", 1) : this.a.b("exo_v2_init_bitrate_algo", 2);
    }

    @Override // defpackage.lfn
    public final int E() {
        return this.a.b("exo_v2_load_timeout_ms", WVMediaCrypto.TYPE);
    }

    @Override // defpackage.lfn
    public final int F() {
        return this.a.b("exo_v2_low_watermark_ms", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @Override // defpackage.lfn
    public final int G() {
        return this.a.b("exo_v2_min_loadable_retries", 3);
    }

    @Override // defpackage.lfn
    public final int H() {
        return this.a.b("gtv_cache_hard_cap_size", 40000000);
    }

    @Override // defpackage.lfn
    public final int I() {
        return this.a.b("gtv_cache_soft_cap_size", 20000000);
    }

    @Override // defpackage.lfn
    public final int J() {
        return this.a.b("max_recent_search_query", 2);
    }

    @Override // defpackage.lfn
    public final int K() {
        return this.b.b("nur_cache_size_in_bytes_vs", 10000000);
    }

    @Override // defpackage.lfn
    public final int L() {
        return this.a.b("impression_settle_time_ms", 2000);
    }

    @Override // defpackage.lfn
    public final int M() {
        return this.b.b("sync_asset_metadata_batch_size_vs", 100);
    }

    @Override // defpackage.lfn
    public final int N() {
        return this.a.b("in_app_drm_player_streaming_height_cap", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @Override // defpackage.lfn
    public final int O() {
        return this.a.b("knowledge_dim_entities_after_disappearing_for_millis", WVMediaCrypto.TYPE);
    }

    @Override // defpackage.lfn
    public final int P() {
        return this.a.b("knowledge_dont_dim_entities_reappearing_within_millis", 20000);
    }

    @Override // defpackage.lfn
    public final int Q() {
        return this.a.b("knowledge_dont_remove_entities_reappearing_within_millis", 20000);
    }

    @Override // defpackage.lfn
    public final int R() {
        return this.a.b("knowledge_remove_entities_after_disappearing_for_millis", WVMediaCrypto.TYPE);
    }

    @Override // defpackage.lfn
    public final int S() {
        return this.a.b("knowledge_show_recent_actors_within_millis", WVMediaCrypto.TYPE);
    }

    @Override // defpackage.lfn
    public final int T() {
        return this.a.b("maxConcurrentPinningTasks", 3);
    }

    @Override // defpackage.lfn
    public final int U() {
        return this.a.b("exo_initial_video_bitrate_fast_network", 600000);
    }

    @Override // defpackage.lfn
    public final int V() {
        return this.a.b("exo_initial_video_bitrate_slow_network", 300000);
    }

    @Override // defpackage.lfn
    public final int W() {
        return this.a.b("maxPinningTaskRetries", 20);
    }

    @Override // defpackage.lfn
    public final int X() {
        return this.a.b("maxPinningTaskRetryDelayMillis", 60000);
    }

    @Override // defpackage.lfn
    public final int Y() {
        return (int) ((xlo) this.q.b()).e();
    }

    @Override // defpackage.lfn
    public final int Z() {
        return this.b.b("memory_cache_size", 1000);
    }

    @Override // defpackage.lfn
    public final double a() {
        return ((xit) this.m.b()).c();
    }

    @Override // defpackage.lfn
    public final long aA() {
        return this.a.c("license_refresh_task_period_seconds", 172800L);
    }

    @Override // defpackage.lfn
    public final long aB() {
        return this.a.c("promotion_cache_period", 43200000L);
    }

    @Override // defpackage.lfn
    public final long aC() {
        return ((xlo) this.q.b()).a();
    }

    @Override // defpackage.lfn
    public final long aD() {
        return ((xlo) this.q.b()).b();
    }

    @Override // defpackage.lfn
    public final long aE() {
        return this.a.c("search_history_validity_window_seconds", 86400L);
    }

    @Override // defpackage.lfn
    public final long aF() {
        return ((xlo) this.q.b()).f();
    }

    @Override // defpackage.lfn
    public final long aG() {
        return this.a.c("sync_last_playbacks_ttl_seconds", 2419200L);
    }

    @Override // defpackage.lfn
    public final long aH() {
        return this.a.c("video_collection_http_cache_soft_ttl_millis", 86400000L);
    }

    @Override // defpackage.lfn
    public final long aI() {
        return this.a.c("watch_next_cache_ttl_millis", 0L);
    }

    @Override // defpackage.lfn
    public final long aJ() {
        return this.z.i();
    }

    @Override // defpackage.lfn
    public final long aK() {
        return ((xlo) this.q.b()).c();
    }

    @Override // defpackage.lfn
    public final long aL() {
        return this.a.c("knowledge_recheck_data_after_millis", 604800000L);
    }

    @Override // defpackage.lfn
    public final long aM() {
        return ((xlo) this.q.b()).d();
    }

    @Override // defpackage.lfn
    public final long aN() {
        return this.b.c("nur_backoff_effective_duration_ms_vs", 21600000L);
    }

    @Override // defpackage.lfn
    public final long aO() {
        return this.b.c("nur_backoff_max_delay_ms_vs", 120000L);
    }

    @Override // defpackage.lfn
    public final long aP() {
        return this.b.c("nur_backoff_min_delay_ms_vs", 2000L);
    }

    @Override // defpackage.lfn
    public final long aQ() {
        return this.a.c("qoe_expiration_time_request_millis", 259200000L);
    }

    @Override // defpackage.lfn
    public final long aR() {
        return this.a.c("qoe_first_timeout_millis", 500L);
    }

    @Override // defpackage.lfn
    public final long aS() {
        return this.a.c("refreshLicensesOlderThanMillis", 432000000L);
    }

    @Override // defpackage.lfn
    public final long aT() {
        return this.a.c("user_sentiments_batch_update_delay_window_begin_secs", 60L);
    }

    @Override // defpackage.lfn
    public final long aU() {
        return this.a.c("user_sentiments_cache_soft_ttl_millis", 60000L);
    }

    @Override // defpackage.lfn
    public final Uri aV() {
        return this.A.j(d);
    }

    @Override // defpackage.lfn
    public final Uri aW() {
        return dF("consumer_information_uri", "https://support.google.com/googleplay/answer/7588573");
    }

    @Override // defpackage.lfn
    public final Uri aX() {
        return dF("my_activity_uri", "https://myactivity.google.com/myactivity");
    }

    @Override // defpackage.lfn
    public final Uri aY() {
        return dF("my_accounts_uri", "https://myaccount.google.com/accountlinking");
    }

    @Override // defpackage.lfn
    public final Uri aZ() {
        return this.A.j(e);
    }

    @Override // defpackage.lfn
    public final int aa() {
        return this.a.b("minPinningTaskRetryDelayMillis", WVMediaCrypto.TYPE);
    }

    @Override // defpackage.lfn
    public final int ab() {
        return this.b.b("minimum_version_vs", 0);
    }

    @Override // defpackage.lfn
    public final int ac() {
        return this.a.b("modular_drm_forced_security_level", 0);
    }

    @Override // defpackage.lfn
    public final int ad() {
        return this.a.b("qoe_max_request_failures", 3);
    }

    @Override // defpackage.lfn
    public final int ae() {
        return this.a.b("qoe_request_store_limit", 500);
    }

    @Override // defpackage.lfn
    public final int af() {
        return this.b.b("ulex_logging_impression_delay_millis", 2000);
    }

    @Override // defpackage.lfn
    public final int ag(Display display) throws NumberFormatException {
        Point point;
        int iB = this.a.b("video_height_cap", -1);
        if (iB == -1) {
            if (display.getDisplayId() == 0) {
                point = edt.G(this.f);
            } else {
                point = new Point();
                if (ksk.b >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            }
            iB = Math.min(point.x, point.y);
        }
        if (display.getDisplayId() != 0) {
            return iB;
        }
        int iB2 = this.y;
        if (iB2 == -1) {
            if (this.k) {
                iB2 = this.a.b("video_height_cap_tv", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                Context context = this.f;
                iB2 = jwq.Q(context).smallestScreenWidthDp >= 720 ? this.a.b("video_height_cap_large_tablet", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) : jwq.S(context) ? this.a.b("video_height_cap_tablet", 720) : this.a.b("video_height_cap_phone", 720);
            }
            this.y = iB2;
        }
        return Math.min(iB, iB2);
    }

    @Override // defpackage.lfn
    public final long ah() {
        return this.a.c("exo_v2_max_duration_for_down", 22000L);
    }

    @Override // defpackage.lfn
    public final long ai() {
        return this.a.b("exo_v2_min_buffer_ms", 2500);
    }

    @Override // defpackage.lfn
    public final long aj() {
        return this.a.c("exo_v2_min_duration_for_up", 13000L);
    }

    @Override // defpackage.lfn
    public final long ak() {
        return this.a.c("exo_v2_min_duration_retain", 23000L);
    }

    @Override // defpackage.lfn
    public final long al() {
        return this.a.c("exo_v2_min_duration_retain_tp", 8000L);
    }

    @Override // defpackage.lfn
    public final long am() {
        return this.a.b("exo_v2_min_rebuffer_ms", 5000);
    }

    @Override // defpackage.lfn
    public final long an() {
        return ((xky) this.v.b()).a();
    }

    @Override // defpackage.lfn
    public final long ao() {
        return this.a.c("app_index_refresh_window_start_delay_seconds", 3600L);
    }

    @Override // defpackage.lfn
    public final long ap() {
        return this.b.c("cache_force_flush_timestamp_seconds_vs", 0L);
    }

    @Override // defpackage.lfn
    public final long aq() {
        return this.a.c("cache_soft_ttl_seconds", 86400L);
    }

    @Override // defpackage.lfn
    public final long ar() {
        return this.a.c("cache_soft_ttl_seconds_for_assets_table_sync_vs", 86400L);
    }

    @Override // defpackage.lfn
    public final long as() {
        return this.a.c("cache_soft_ttl_seconds_for_library_sync_vs", 604800L);
    }

    @Override // defpackage.lfn
    public final long at() {
        return this.a.c("cleanup_search_history_interval_seconds", 604800L);
    }

    @Override // defpackage.lfn
    public final long au() {
        return this.a.c("flush_qoe_log_flex_seconds", 86400L);
    }

    @Override // defpackage.lfn
    public final long av() {
        return this.a.c("flush_qoe_log_period_seconds", 86400L);
    }

    @Override // defpackage.lfn
    public final long aw() {
        return this.a.c("gtv_cache_cleanup_period_millis", 3600000L);
    }

    @Override // defpackage.lfn
    public final long ax() {
        return this.a.c("library_filter_unwatched_cutoff_time", 1503532800L);
    }

    @Override // defpackage.lfn
    public final long ay() {
        return this.a.c("license_force_refresh_task_window_start_delay_seconds", 3600L);
    }

    @Override // defpackage.lfn
    public final long az() {
        return this.a.c("license_refresh_task_flex_seconds", 172800L);
    }

    @Override // defpackage.lfn
    public final double b() {
        return ((xit) this.m.b()).d();
    }

    @Override // defpackage.lfn
    public final List bA() {
        return ksh.g(this.a.d("retryCencDrmErrorCodes", "7000,8000"));
    }

    @Override // defpackage.lfn
    public final Set bB() {
        return dH("133,134,135,136,137,142,143,144,145,146,212,213,214,215,216,217,222,223,224,225,226,227", "dashVideoItagWhitelist", "dashVideoItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bC() {
        return dH("213,215,223,225", "dashVideoHighEdgeItagWhitelist", "dashVideoHighEdgeItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bD() {
        return dH("136,145", "dashVideoLowEdgeItagWhitelist", "dashVideoLowEdgeItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bE() {
        return dH("443,444,445,446,447,448,503,504,505,506,507,508,509,510,511,512,460,461,462,463,464,465,537,538,539,540,541,542,543,544,545,546", "dashSonicDolbyVisionVideoItagWhitelist", "dashSonicDolbyVisionVideoItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bF() {
        return dH("432,433,434,435,436,480,481,482,483,484,485,486,487,488,489,490,491,449,450,451,452,453,514,515,516,517,518,519,520,521,522,523,524,525", "dashSonicH265VideoItagWhitelist", "dashSonicH265VideoItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bG() {
        return dH("437,438,439,440,441,442,492,493,494,495,496,497,498,499,500,501,454,455,456,457,458,459,526,527,528,529,530,531,532,533,534,535", "dashSonicHdr10VideoItagWhitelist", "dashSonicHdr10VideoItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bH() {
        return dH("242,243,244,245,246,247,248,271,272,273,274,275,276,277,279,280,313,314,317,318,559,561,577,578,579,583,584,585,331,332,333,334,335,336,337,560,580,581,582,589,590,362,363,364,365,366,367,368,562,586,587,588,591,592", "dashWebmVideoItagWhitelist", "dashWebmVideoItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bI() {
        return dH("246,273", "dashWebmVideoHighEdgeItagWhitelist", "dashWebmVideoHighEdgeItagBlacklist");
    }

    @Override // defpackage.lfn
    public final Set bJ() {
        return dH("", "dashWebmVideoLowEdgeItagWhitelist", "dashWebmVideoLowEdgeItagBlacklist");
    }

    @Override // defpackage.lfn
    public final boolean bK() {
        return this.a.e("allow_downloads", !this.k);
    }

    @Override // defpackage.lfn
    public final boolean bL() {
        return this.a.e("allowPassThroughAudio", this.k);
    }

    @Override // defpackage.lfn
    public final boolean bM() {
        return this.a.e("allowSurroundSound", true);
    }

    @Override // defpackage.lfn
    public final boolean bN() {
        return this.a.e("always_start_transfer_service", true);
    }

    @Override // defpackage.lfn
    public final boolean bO() {
        return this.a.e("appendDncParam", true);
    }

    @Override // defpackage.lfn
    public final boolean bP() throws ClassNotFoundException {
        if (this.a.e("atv_choosies_enabled_inside_out", false)) {
            String str = "";
            Iterable<String> iterableB = uof.g(',').b(this.a.d("atv_choosies_redemption_blacklisted", ""));
            ArrayList arrayList = new ArrayList();
            for (String str2 : iterableB) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                Context context = this.f;
                Executor executor = ksk.a;
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                    String str3 = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, "ro.svp.modelname");
                    krd.e("getSystemProperty key:ro.svp.modelname result:" + str3);
                    str = str3;
                } catch (Exception e2) {
                    krd.d("Exception: getSystemProperty key:ro.svp.modelname", e2);
                }
                if (TextUtils.isEmpty(str) || !arrayList.contains(str)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean bQ() {
        return ((xlf) this.r.b()).a();
    }

    @Override // defpackage.lfn
    public final boolean bR() {
        return cW() ? this.a.e("binge_watch_enabled_tv", true) : this.a.e("binge_watch_enabled", true);
    }

    @Override // defpackage.lfn
    public final boolean bS(SharedPreferences sharedPreferences) {
        return krh.isBingeWatchingEnabledInPreferences(sharedPreferences);
    }

    @Override // defpackage.lfn
    public final boolean bT() {
        return this.b.e("bundle_details_page_enabled_vs", true);
    }

    @Override // defpackage.lfn
    public final boolean bU() {
        boolean zDC = dC("opt_in_in_app_drm_player_fallback");
        if (nel.a) {
            return this.a.e("can_fallback_to_in_app_drm", false) || zDC;
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean bV() {
        return ((xhu) this.s.b()).a();
    }

    @Override // defpackage.lfn
    public final boolean bW() {
        return this.a.e("cast_debugging_enabled", false);
    }

    @Override // defpackage.lfn
    public final boolean bX() {
        return (this.k || cW() || !this.a.e("cast_v2_enabled", true)) ? false : true;
    }

    @Override // defpackage.lfn
    public final boolean bY() {
        return ((xhz) this.p.b()).a() || dC("enable_cast_v3_experience");
    }

    @Override // defpackage.lfn
    public final boolean bZ(String str) {
        return this.a.d("consumer_information_countries", "FR").contains(str);
    }

    @Override // defpackage.lfn
    public final ieg ba() {
        return ieg.a(dG("how_to_play_support_uri", null));
    }

    @Override // defpackage.lfn
    public final ieg bb() {
        return ieg.a(dG("ma_help_uri", "https://support.google.com/googleplay/answer/6124423"));
    }

    @Override // defpackage.lfn
    public final ieg bc() {
        return ieg.a(dG("refund_policy_uri", null));
    }

    @Override // defpackage.lfn
    public final String bd() {
        return this.h.b();
    }

    @Override // defpackage.lfn
    public final String be() {
        lft lftVar = this.h;
        long jI = this.z.i();
        mew mewVar = new mew(lftVar.a());
        mewVar.l("make", Build.MANUFACTURER);
        mewVar.l("model", Build.MODEL);
        mewVar.l("product", Build.PRODUCT);
        mewVar.l("device", Build.DEVICE);
        mewVar.h("devid", jI == 0 ? "" : Long.toString(jI));
        int i = 1;
        mewVar.h("apptype", Integer.toString(1));
        if (cW()) {
            i = 3;
        } else if (jwq.S(this.f)) {
            i = 2;
        }
        mewVar.h("devtype", Integer.toString(i));
        return mewVar.a();
    }

    @Override // defpackage.lfn
    public final String bf() {
        return this.b.d("blacklisted_versions_vs", "");
    }

    @Override // defpackage.lfn
    public final String bg() {
        return cL() ? this.a.d("gtv_cast_v2_receiver_app_id", "F40BF0CE") : this.a.d("cast_v2_receiver_app_id", "9381F2BD");
    }

    @Override // defpackage.lfn
    public final String bh() {
        return this.z.j();
    }

    @Override // defpackage.lfn
    public final String bi() {
        return this.a.d("generate_http_204_url", "https://clients3.google.com/generate_204");
    }

    @Override // defpackage.lfn
    public final String bj() {
        return this.g.getString("chime_environment", "PRODUCTION");
    }

    @Override // defpackage.lfn
    public final String bk() {
        return true != dC("use_debug_sender_id") ? "68971793635" : "316244322451";
    }

    @Override // defpackage.lfn
    public final String bl() {
        return this.b.d("fallback_country_code", "");
    }

    @Override // defpackage.lfn
    public final String bm() {
        return true != this.o ? "AIzaSyCnmBLI5drpBPGwTfDJDXqPejmSv16drcQ" : "AIzaSyD2r-HRqHfQqsZJzNbhewjsdirTKix934I";
    }

    @Override // defpackage.lfn
    public final String bn() {
        String string = this.g.getString("nur_hostname", "");
        return (TextUtils.isEmpty(string) || string.equals("DONT_OVERRIDE")) ? this.b.d("nur_hostname_vs", "") : string;
    }

    @Override // defpackage.lfn
    public final String bo() {
        return ((lys) this.w.b()).c(((ldy) this.j).a());
    }

    @Override // defpackage.lfn
    public final String bp() {
        String string = this.g.getString("slendro_hostname", "");
        return (TextUtils.isEmpty(string) || string.equals("DONT_OVERRIDE")) ? this.b.d("slendro_hostname_vs", "") : string;
    }

    @Override // defpackage.lfn
    public final String bq() {
        return this.a.d("watch_on_tv_app_id", "CFE7FEDA");
    }

    @Override // defpackage.lfn
    public final String br(String str) {
        return this.A.k(this.a.d("wv_provisioning_server_uri", str));
    }

    @Override // defpackage.lfn
    public final List bs() {
        return ksh.g(this.a.d("dashWebmHdrVideoItags", "331,332,333,334,335,336,337,560,580,581,582,589,590,362,363,364,365,366,367,368,562,586,587,588,591,592"));
    }

    @Override // defpackage.lfn
    public final List bt(List list) {
        String strD = this.b.d("manifest_audio_codec_filters_vs", "");
        return TextUtils.isEmpty(strD) ? list : ksh.g(strD);
    }

    @Override // defpackage.lfn
    public final List bu(List list) {
        String strD = this.b.d("manifest_audio_container_filters_vs", "");
        return TextUtils.isEmpty(strD) ? list : ksh.g(strD);
    }

    @Override // defpackage.lfn
    public final List bv(List list) {
        String strD = this.b.d("manifest_video_codec_filters_vs", "");
        return TextUtils.isEmpty(strD) ? list : ksh.g(strD);
    }

    @Override // defpackage.lfn
    public final List bw(List list) {
        String strD = this.b.d("manifest_video_container_filters_vs", "");
        return TextUtils.isEmpty(strD) ? list : ksh.g(strD);
    }

    @Override // defpackage.lfn
    public final List bx() {
        return ksh.g(this.b.d("ordered_dash_audio_itags_vs", "329,261,259,150,149,148,328,258,256,141,140,139"));
    }

    @Override // defpackage.lfn
    public final List by() {
        return ksh.g(this.b.d("ordered_dash_audio_webm_itags_vs", "352,351,350,251,250,249"));
    }

    @Override // defpackage.lfn
    public final List bz() {
        return ksh.g(this.a.d("orderedDashDownloadItags", "224,222,143,142,214,212,134,133,150,149,256,141,140"));
    }

    @Override // defpackage.lfn
    public final double c() {
        return ((xit) this.m.b()).a();
    }

    @Override // defpackage.lfn
    public final boolean cA() {
        return this.a.e("guide_feed_refresh_after_watch_action", true);
    }

    @Override // defpackage.lfn
    public final boolean cB() {
        return this.a.e("ignore_display_hdr_audio_capability", false) || dC("ignore_hdr_audio_capability");
    }

    @Override // defpackage.lfn
    public final boolean cC() {
        return this.a.e("ignore_display_hdr_capability", false) || dC("ignore_hdr_display_capability");
    }

    @Override // defpackage.lfn
    public final boolean cD() {
        return this.a.e("in_app_drm_player_fallback_allowed_for_known_drm_error", false);
    }

    @Override // defpackage.lfn
    public final boolean cE() {
        return this.a.e("in_app_drm_player_fallback_allowed_for_network", false);
    }

    @Override // defpackage.lfn
    public final boolean cF() {
        return ((xhl) this.l.b()).a();
    }

    @Override // defpackage.lfn
    public final boolean cG() {
        return dC("enable_entity_page_dynamic_color");
    }

    @Override // defpackage.lfn
    public final boolean cH() {
        return cL();
    }

    @Override // defpackage.lfn
    public final boolean cI() {
        return ((xms) this.u.b()).a().b.contains(bo());
    }

    @Override // defpackage.lfn
    public final boolean cJ() {
        return dC("enable_light_mode");
    }

    @Override // defpackage.lfn
    public final boolean cK() {
        return Build.MANUFACTURER.equals("NVIDIA");
    }

    @Override // defpackage.lfn
    public final boolean cL() {
        return !dC("disable_pelog_experience");
    }

    @Override // defpackage.lfn
    public final boolean cM() {
        return this.o;
    }

    @Override // defpackage.lfn
    public final boolean cN() {
        return ((xlf) this.r.b()).d();
    }

    @Override // defpackage.lfn
    public final boolean cO() {
        return cT() && dE("enable_k2", 12669830L);
    }

    @Override // defpackage.lfn
    public final boolean cP() {
        if (!this.a.e("knowledge_enabled_tablets", false)) {
            return false;
        }
        if (jwq.S(this.f)) {
            return true;
        }
        return this.a.e("knowledge_enabled_phones", false);
    }

    @Override // defpackage.lfn
    public final boolean cQ() {
        return ((xlf) this.r.b()).e();
    }

    @Override // defpackage.lfn
    public final boolean cR() {
        return this.a.e("needs_system_update", false);
    }

    @Override // defpackage.lfn
    public final boolean cS() {
        return ((xlf) this.r.b()).f();
    }

    @Override // defpackage.lfn
    public final boolean cT() {
        return dE("enable_nur_metadata_internal", 12668606L);
    }

    @Override // defpackage.lfn
    public final boolean cU() {
        return dD("enable_nur_metadata_tv_internal");
    }

    @Override // defpackage.lfn
    public final boolean cV() {
        return ((xlf) this.r.b()).h();
    }

    @Override // defpackage.lfn
    public final boolean cW() {
        return this.z.n(this.f);
    }

    @Override // defpackage.lfn
    public final boolean cX() {
        return ((xlf) this.r.b()).b();
    }

    @Override // defpackage.lfn
    public final boolean cY() {
        return ((xlf) this.r.b()).g();
    }

    @Override // defpackage.lfn
    public final boolean cZ() {
        return dE("enable_playable_sequence_internal", 12668626L);
    }

    @Override // defpackage.lfn
    public final boolean ca() {
        return ((xlf) this.r.b()).c();
    }

    @Override // defpackage.lfn
    public final boolean cb() {
        if (this.a.e("preferWebMAudio", false)) {
            try {
                if (ete.a("audio/opus", false, cw()) != null) {
                    krd.e("WebM preferred and Opus decoder found");
                    return true;
                }
                krd.f("WebM preferred but no suitable Opus decoder found. Falling back to MP4.");
            } catch (etb e2) {
                krd.d("WebM preferred but failed to query Opus decoder. Falling back to MP4.", e2);
            }
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean cc(boolean z) {
        if (this.a.e(true != z ? "preferWebMClearElysium" : "preferWebMEncElysium", false)) {
            try {
                if (ete.a("video/x-vnd.on2.vp9", z, cw()) != null) {
                    krd.e("WebM preferred and VP9 decoder found (encrypted=" + z + ").");
                    return true;
                }
                if (z && ete.a("video/avc", true, cw()) == null && ete.a("video/x-vnd.on2.vp9", false, cw()) != null) {
                    krd.e("WebM preferred and VP9 decoder found (encrypted=true, secure=false).");
                    return true;
                }
                krd.f("WebM preferred but no suitable VP9 decoder found (encrypted=" + z + "). Falling back to MP4.");
            } catch (etb e2) {
                krd.d("WebM preferred but failed to query VP9 decoder (encrypted=" + z + "). Falling back to MP4.", e2);
            }
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean cd() {
        return dC("debug_log_events");
    }

    @Override // defpackage.lfn
    public final boolean ce() {
        return dC("debug_log_impression_summary");
    }

    @Override // defpackage.lfn
    public final boolean cf() {
        return dC("debug_log_impression_tree_collecting");
    }

    @Override // defpackage.lfn
    public final boolean cg() {
        return this.a.e("details_page_selection_enabled", true);
    }

    @Override // defpackage.lfn
    public final boolean ch() {
        return this.a.e("device_capabilities_filter_enabled", false);
    }

    @Override // defpackage.lfn
    public final boolean ci() {
        return dC("disable_chrome_custom_tab");
    }

    @Override // defpackage.lfn
    public final boolean cj() {
        return dC("display_auth_token_in_http_requests");
    }

    @Override // defpackage.lfn
    public final boolean ck() {
        return ((xmv) this.x.b()).a() || this.a.e("dogfood_enabled", false);
    }

    @Override // defpackage.lfn
    public final boolean cl() {
        return this.b.e("download_dub_cards_enabled_vs", false);
    }

    @Override // defpackage.lfn
    public final boolean cm() {
        return ((xlo) this.q.b()).e() > 1;
    }

    @Override // defpackage.lfn
    public final boolean cn() {
        return this.b.e("enable_license_refresh_lock_timeout", true);
    }

    @Override // defpackage.lfn
    public final boolean co() {
        return this.a.e("allow_pip_mode", false) || dC("enable_pip_mode");
    }

    @Override // defpackage.lfn
    public final boolean cp() {
        return this.g.getBoolean("enable_short_offline_licenses", false);
    }

    @Override // defpackage.lfn
    public final boolean cq() {
        return this.b.e("enable_uploading_sentiment_without_title", false);
    }

    @Override // defpackage.lfn
    public final boolean cr() {
        return this.b.e("exo_v2_abr_enable_parallel_adaptation_vs", false);
    }

    @Override // defpackage.lfn
    public final boolean cs() {
        return this.a.e("exo_v2_alternate_redirect_enabled_n", true);
    }

    @Override // defpackage.lfn
    public final boolean ct() {
        return ((xit) this.m.b()).o();
    }

    @Override // defpackage.lfn
    public final boolean cu() {
        return this.a.e("exo_v2_play_clear_samples_without_keys", false);
    }

    @Override // defpackage.lfn
    public final boolean cv() {
        return this.a.e("exo_v2_prioritize_time_over_size_thresholds", false);
    }

    @Override // defpackage.lfn
    public final boolean cw() {
        return this.b.e("exo_v2_tunnelling_enabled_vs", false) || dC("enable_exo_v2_tunnelling");
    }

    @Override // defpackage.lfn
    public final boolean cx() {
        return this.a.e("exo_v2_use_block_buffer_pool", false);
    }

    @Override // defpackage.lfn
    public final boolean cy() {
        return dB(12605901L) || this.a.e("family_sharing_enabled", false);
    }

    @Override // defpackage.lfn
    public final boolean cz() {
        return this.b.e("force_refresh_license_after_upgrade_sdk_vs", true);
    }

    @Override // defpackage.lfn
    public final double d() {
        return ((xit) this.m.b()).b();
    }

    @Override // defpackage.lfr
    public final long dA() {
        return this.a.c("flush_logs_task_period_seconds", 86400L);
    }

    public final boolean dB(long j) {
        return ((lfx) this.i.b()).a(((ldy) this.j).a()).d.contains(Long.valueOf(j));
    }

    final boolean dC(String str) {
        try {
            try {
                return this.g.getBoolean(str, false);
            } catch (ClassCastException unused) {
                return false;
            }
        } catch (ClassCastException unused2) {
            String string = this.g.getString(str, "");
            if (!string.equals("0")) {
                return string.equals("1");
            }
            return false;
        }
    }

    final boolean dD(String str) {
        String strConcat = str.concat("_force_off_vs");
        String strConcat2 = str.concat("_feature_vs");
        if (strConcat.equals(strConcat2)) {
            throw new IllegalArgumentException();
        }
        if (this.b.e(strConcat, false)) {
            return false;
        }
        String string = this.g.getString(str, "0");
        return !string.equals("0") ? string.equals("1") : this.b.e(strConcat2, false);
    }

    final boolean dE(String str, long j) {
        String strConcat = str.concat("_force_off_vs");
        String strConcat2 = str.concat("_force_on_vs");
        if (strConcat.equals(strConcat2)) {
            throw new IllegalArgumentException();
        }
        if (this.b.e(strConcat, false)) {
            return false;
        }
        String string = this.g.getString(str, "0");
        if (!string.equals("0")) {
            return string.equals("1");
        }
        if (this.b.e(strConcat2, false)) {
            return true;
        }
        return dB(j);
    }

    @Override // defpackage.lfn
    public final boolean da() {
        return this.b.e("playable_sequence_qoe_logging_enabled_vs", cZ());
    }

    @Override // defpackage.lfn
    public final boolean db() {
        return this.a.e("playback_debug_logging_enabled", false);
    }

    @Override // defpackage.lfn
    public final boolean dc() {
        return dC("enable_playback_debug_menu") || this.b.e("playback_debug_menu_enabled_vs", false) || ((xky) this.v.b()).b();
    }

    @Override // defpackage.lfn
    public final boolean dd() {
        if (nel.a) {
            return dC("prefer_in_app_drm_player_streaming") || this.a.e("in_app_drm_player_preferred_for_streaming", false);
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean de() {
        return dE("enable_primetime_setup_v2_internal", 12667953L);
    }

    @Override // defpackage.lfn
    public final boolean df() {
        return dC("print_http_requests");
    }

    @Override // defpackage.lfn
    public final boolean dg() {
        return ((xlf) this.r.b()).i();
    }

    @Override // defpackage.lfn
    public final boolean dh() {
        return !this.n && this.a.e("screen_pinning_enabled", true);
    }

    @Override // defpackage.lfn
    public final boolean di() {
        return this.a.e("search_recent_enabled", true);
    }

    @Override // defpackage.lfn
    public final boolean dj() {
        return this.b.e("guide_setup_in_sidebar_enabled_vs", true);
    }

    @Override // defpackage.lfn
    public final boolean dk() {
        return this.g.getBoolean("show_debug_info", false);
    }

    @Override // defpackage.lfn
    public final boolean dl() {
        return this.g.getBoolean("skip_http_response_cache", false);
    }

    @Override // defpackage.lfn
    public final boolean dm() {
        return this.g.getBoolean("skip_rpc_response_cache", false);
    }

    @Override // defpackage.lfn
    public final boolean dn() {
        try {
            if (dp() && dD("enable_dolby_vision_streams")) {
                return !ete.d("video/dolby-vision", false, cw()).isEmpty();
            }
            return false;
        } catch (etb unused) {
            krd.c("Unable to find Dolby Vision decoder.");
            return false;
        }
    }

    @Override // defpackage.lfn
    /* renamed from: do */
    public final boolean mo454do() {
        if (!cK() && dp() && dD("enable_hdr10_streams") && ksk.b >= 24) {
            try {
                for (ess essVar : ete.d("video/hevc", false, cw())) {
                    if (!essVar.h) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : essVar.i()) {
                            if (codecProfileLevel.profile == 4096) {
                                return true;
                            }
                        }
                    }
                }
            } catch (etb unused) {
                krd.c("Unable to find H265 decoder.");
            }
        }
        return false;
    }

    @Override // defpackage.lfn
    public final boolean dp() {
        try {
            if (dD("enable_sonic_streams")) {
                return !ete.d("video/hevc", false, cw()).isEmpty();
            }
            return false;
        } catch (etb unused) {
            krd.c("Unable to find H265 decoder.");
            return false;
        }
    }

    @Override // defpackage.lfn
    public final boolean dq() {
        return ((xmv) this.x.b()).b();
    }

    @Override // defpackage.lfn
    public final boolean dr() {
        return ((xlf) this.r.b()).j();
    }

    @Override // defpackage.lfn
    public final boolean ds() {
        if (this.g.getBoolean("skip_asset_cache", false)) {
            return false;
        }
        return this.a.e("use_cache_in_database", true);
    }

    @Override // defpackage.lfn
    public final boolean dt() {
        return ((xmn) this.t.b()).a();
    }

    @Override // defpackage.lfn
    public final boolean du() {
        return this.a.e("in_app_drm_open_gl_enabled", true);
    }

    @Override // defpackage.lfn
    public final boolean dv() {
        return this.a.e("use_playback_preparation_logger", true);
    }

    @Override // defpackage.lfn
    public final boolean dw() {
        return this.a.e("use_v2_hdr_audio_capability", false) || dC("use_v2_audio_capability");
    }

    @Override // defpackage.lfn
    public final boolean dx() {
        return (this.b.e("hdr_playback_enabled_vs", true) && dy()) || dC("enable_hdr_playback");
    }

    @Override // defpackage.lfn
    public final boolean dy() {
        if (ksk.b < 24) {
            return false;
        }
        try {
            for (ess essVar : ete.d("video/x-vnd.on2.vp9", false, cw())) {
                if (!essVar.h || !cK()) {
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : essVar.i()) {
                        if (codecProfileLevel.profile == 4096) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (etb unused) {
            krd.c("Unable to find VP9 decoder.");
            return false;
        }
    }

    @Override // defpackage.lfr
    public final long dz() {
        return this.a.c("flush_logs_task_flex_seconds", 57600L);
    }

    @Override // defpackage.lfn
    public final float e() {
        return this.a.a("exo_v2_bandwidth_bucket_history_selection_percentile", 0.9f);
    }

    @Override // defpackage.lfn
    public final float f() {
        return this.a.a("exo_v2_bandwidth_fraction", 0.7f);
    }

    @Override // defpackage.lfn
    public final float g() {
        return this.b.a("nur_backoff_delay_multiplier_vs", 2.0f);
    }

    @Override // defpackage.lfn
    public final float h() {
        return this.b.a("nur_backoff_recover_multiplier_vs", 1.6f);
    }

    @Override // defpackage.lfn
    public final int i() {
        return this.a.b("binge_watch_count_down_max_duration_ms", 20000);
    }

    @Override // defpackage.lfn
    public final int j() {
        return this.a.b("binge_watch_count_down_min_duration_ms", 5000);
    }

    @Override // defpackage.lfn
    public final int k() {
        return ag(((WindowManager) this.f.getSystemService("window")).getDefaultDisplay());
    }

    @Override // defpackage.lfn
    public final int l(Display display) {
        return ag(display);
    }

    @Override // defpackage.lfn
    public final int m() {
        return this.a.b("exo_v2_abr_algo", 0);
    }

    @Override // defpackage.lfn
    public final int n() {
        return this.a.b("exo_v2_abr_initial_format_height_cap", true != this.k ? 480 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @Override // defpackage.lfn
    public final int o() {
        lfk lfkVar = this.a;
        return lfkVar.b("exo_v2_bandwidth_bucket_history_min_count", lfkVar.b("exo_bandwidth_bucket_history_min_count", 500));
    }

    @Override // defpackage.lfn
    public final int p() {
        return this.a.b("exo_v2_buffer_chunk_count_n", 585);
    }

    @Override // defpackage.lfn
    public final int q() {
        return this.a.b("exo_v2_buffer_chunk_size_n", 102400);
    }

    @Override // defpackage.lfn
    public final int r() {
        lfk lfkVar = this.a;
        return lfkVar.b("exo_v2_early_playback_cutoff_time_ms", lfkVar.b("exo_early_playback_cutoff_time_ms", 30000));
    }

    @Override // defpackage.lfn
    public final int s() {
        return (int) ((xit) this.m.b()).h();
    }

    @Override // defpackage.lfn
    public final int t() {
        return (int) ((xit) this.m.b()).i();
    }

    @Override // defpackage.lfn
    public final int u() {
        return (int) ((xit) this.m.b()).k();
    }

    @Override // defpackage.lfn
    public final int v() {
        return (int) ((xit) this.m.b()).n();
    }

    @Override // defpackage.lfn
    public final int w() {
        return (int) ((xit) this.m.b()).m();
    }

    @Override // defpackage.lfn
    public final int x() {
        return (int) ((xit) this.m.b()).e();
    }

    @Override // defpackage.lfn
    public final int y() {
        return (int) ((xit) this.m.b()).f();
    }

    @Override // defpackage.lfn
    public final int z() {
        return (int) ((xit) this.m.b()).g();
    }
}
