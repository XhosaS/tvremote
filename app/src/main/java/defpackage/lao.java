package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
class lao extends lcn {
    static final Pair a = new Pair("", 0L);
    public SharedPreferences b;
    public lam c;
    public final lal d;
    public final lal e;
    public final lan f;
    public String g;
    public boolean h;
    public long i;
    public final lal j;
    public final laj k;
    public final lan l;
    public final lak m;
    public final laj n;
    public final lal o;
    public final lal p;
    public boolean q;
    public final laj r;
    public final laj s;
    public final lal t;
    public final lan u;
    public final lan v;
    public final lal w;
    public final lak x;
    private SharedPreferences z;

    public lao(lbk lbkVar) {
        super(lbkVar);
        this.j = new lal(this, "session_timeout", 1800000L);
        this.k = new laj(this, "start_new_session", true);
        this.o = new lal(this, "last_pause_time", 0L);
        this.p = new lal(this, "session_id", 0L);
        this.l = new lan(this, "non_personalized_ads");
        this.m = new lak(this, "last_received_uri_timestamps_by_source");
        this.n = new laj(this, "allow_remote_dynamite", false);
        this.d = new lal(this, "first_open_time", 0L);
        this.e = new lal(this, "app_install_time", 0L);
        this.f = new lan(this, "app_instance_id");
        this.r = new laj(this, "app_backgrounded", false);
        this.s = new laj(this, "deep_link_retrieval_complete", false);
        this.t = new lal(this, "deep_link_retrieval_attempts", 0L);
        this.u = new lan(this, "firebase_feature_rollouts");
        this.v = new lan(this, "deferred_attribution_cache");
        this.w = new lal(this, "deferred_attribution_cache_timestamp", 0L);
        this.x = new lak(this, "default_event_parameters");
    }

    @Override // defpackage.lcn
    protected final boolean a() {
        return true;
    }

    protected final SharedPreferences b() {
        g();
        o();
        if (this.z == null) {
            lbk lbkVar = this.y;
            Context context = lbkVar.a;
            String strValueOf = String.valueOf(context.getPackageName());
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzz kzzVar = labVar.k;
            String strConcat = strValueOf.concat("_preferences");
            kzzVar.b("Default prefs file", strConcat);
            this.z = context.getSharedPreferences(strConcat, 0);
        }
        return this.z;
    }

    protected final SharedPreferences c() {
        g();
        o();
        kkk.k(this.b);
        return this.b;
    }

    final SparseArray d() {
        Bundle bundleA = this.m.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    final kuk e() {
        g();
        return kuk.b(c().getString("dma_consent_settings", null));
    }

    final lct f() {
        g();
        return lct.h(c().getString("consent_settings", "G1"), c().getInt("consent_source", 100));
    }

    final Boolean h() {
        g();
        if (c().contains("measurement_enabled")) {
            return Boolean.valueOf(c().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // defpackage.lcn
    protected final void i() {
        lbk lbkVar = this.y;
        SharedPreferences sharedPreferences = lbkVar.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.q = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        ktx ktxVar = lbkVar.d;
        this.c = new lam(this, Math.max(0L, ((Long) kzg.d.a(null)).longValue()));
    }

    final void j(Boolean bool) {
        g();
        SharedPreferences.Editor editorEdit = c().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void k(boolean z) {
        g();
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.k.b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = c().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final boolean l(long j) {
        lal lalVar = this.j;
        lalVar.a();
        long j2 = j - lalVar.a;
        lal lalVar2 = this.o;
        lalVar2.a();
        return j2 > lalVar2.a;
    }

    final boolean m(int i) {
        return lct.o(i, c().getInt("consent_source", 100));
    }

    protected final boolean n(lhh lhhVar) {
        g();
        String string = c().getString("stored_tcf_param", "");
        String strC = lhhVar.c();
        if (strC.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = c().edit();
        editorEdit.putString("stored_tcf_param", strC);
        editorEdit.apply();
        return true;
    }
}
