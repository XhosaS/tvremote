package defpackage;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqv {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher");
    public final PackageManager b;
    public final bqy c;
    public String d;
    public int e;
    public final bsi f;
    private final Context g;
    private final crv h;
    private final btf i;
    private final boolean j;
    private final SearchManager k;

    public bqv(buf bufVar, bsi bsiVar, bqy bqyVar, crv crvVar, btf btfVar, boolean z) {
        this.g = bufVar;
        this.b = bufVar.getPackageManager();
        this.f = bsiVar;
        this.c = bqyVar;
        this.h = crvVar;
        this.i = btfVar;
        this.j = z;
        byte[] bArr = null;
        this.k = Build.VERSION.SDK_INT >= 29 ? (SearchManager) bufVar.getSystemService(SearchManager.class) : null;
        bte bteVar = new bte() { // from class: bqu
            @Override // defpackage.bte
            public final void a(String str) throws PackageManager.NameNotFoundException {
                bqv bqvVar = this.a;
                bqvVar.d = str;
                String str2 = bqvVar.d;
                int packageUid = -1;
                if (str2 != null) {
                    try {
                        packageUid = bqvVar.b.getPackageUid(str2, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        ((cbs) ((cbs) bqv.a.f().i(e)).j("com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher", "getPackageUid", 95, "AssistantServiceLauncher.java")).t("Package %s is not found", str2);
                    }
                }
                bqvVar.e = packageUid;
            }
        };
        btfVar.c(bteVar);
        bufVar.k(new ame(btfVar, bteVar, 19, bArr));
    }

    private final void c(long j, Bundle bundle) {
        SearchManager searchManager = this.k;
        if (searchManager == null) {
            ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher", "launchAssistantWithBundle", 194, "AssistantServiceLauncher.java")).p("Launching assistant by ACTION_ASSIST intent");
            this.g.startActivity(new Intent("android.intent.action.ASSIST").setFlags(268435456).putExtra("SHOW_SESSION_ARGS", bundle));
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("android.intent.extra.TIME", j);
        if (bundle != null) {
            bundle2.putBundle("SHOW_SESSION_ARGS", bundle);
        }
        ((cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher", "launchAssistantWithBundle", 191, "AssistantServiceLauncher.java")).p("Launching assistant from SearchManager");
        searchManager.launchAssist(bundle2);
    }

    public final bqr a(bqq bqqVar, int i, long j) {
        bqz bqzVar;
        Bundle bundle = new Bundle();
        if (this.k == null && !this.j) {
            bqzVar = null;
        } else if (((btj) this.h.a()).a) {
            boc bocVar = new boc(this, this.e, this.d);
            bqzVar = bocVar.a;
            bmq bmqVar = new bmq();
            bmqVar.d(i);
            bmqVar.b = bocVar;
            bmqVar.b(16);
            bmqVar.c(1);
            bmqVar.e(16000);
            bundle.putParcelable("AUDIO_STREAM_KEY", bmqVar.a());
        } else {
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher", "prepareAssistantInternal", 165, "AssistantServiceLauncher.java")).p("PTT/HTT interaction is not allowed during setup");
            bqzVar = null;
        }
        if (bqzVar != null) {
            String str = bqzVar.g;
            if (bqzVar.b.b(bqzVar.c, true, bqzVar.f, str)) {
                bqzVar.h = bqqVar;
                ParcelFileDescriptor[] parcelFileDescriptorArrH = bqz.h();
                if (parcelFileDescriptorArrH != null) {
                    bqzVar.f(parcelFileDescriptorArrH);
                    c(j, bundle);
                    return bqzVar;
                }
            }
            if (this.b.checkPermission("android.permission.RECORD_AUDIO", this.i.b) == -1) {
                c(j, null);
            }
        }
        return null;
    }

    public final boolean b() {
        return this.k != null || this.j;
    }
}
