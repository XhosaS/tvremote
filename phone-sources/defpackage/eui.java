package defpackage;

import android.app.job.JobInfo;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eui implements eua {
    public final euc a;
    public euk b;
    private final Context c;
    private final boolean d;
    private final Class e;
    private eur f;
    private final euq g;

    public eui(Context context, euc eucVar, boolean z, euq euqVar, Class cls) {
        this.c = context;
        this.a = eucVar;
        this.d = z;
        this.g = euqVar;
        this.e = cls;
        eucVar.a(this);
        h();
    }

    private final void i() {
        eur eurVar = new eur(0);
        if (k(eurVar)) {
            this.g.c.cancel(2);
            this.f = eurVar;
        }
    }

    private final void j() {
        if (this.d) {
            try {
                Context context = this.c;
                edt.aD(context, euk.h(context, this.e, "androidx.media3.exoplayer.downloadService.action.RESTART"));
                return;
            } catch (IllegalStateException unused) {
                edb.e("DownloadService", "Failed to restart (foreground launch restriction)");
                return;
            }
        }
        try {
            Context context2 = this.c;
            context2.startService(euk.h(context2, this.e, "androidx.media3.exoplayer.downloadService.action.INIT"));
        } catch (IllegalStateException unused2) {
            edb.e("DownloadService", "Failed to restart (process is idle)");
        }
    }

    private final boolean k(eur eurVar) {
        return !Objects.equals(this.f, eurVar);
    }

    private final boolean l() {
        euk eukVar = this.b;
        return eukVar == null || eukVar.f;
    }

    @Override // defpackage.eua
    public final void a(euc eucVar, etn etnVar, Exception exc) {
        euj eujVar;
        euk eukVar = this.b;
        if (eukVar != null && (eujVar = eukVar.b) != null) {
            if (euk.n(etnVar.b)) {
                eujVar.b();
            } else {
                eujVar.a();
            }
        }
        if (l() && euk.n(etnVar.b)) {
            edb.e("DownloadService", "DownloadService wasn't running. Restarting.");
            j();
        }
    }

    @Override // defpackage.eua
    public final void b(euc eucVar, etn etnVar) {
        euj eujVar;
        euk eukVar = this.b;
        if (eukVar == null || (eujVar = eukVar.b) == null) {
            return;
        }
        eujVar.a();
    }

    @Override // defpackage.eua
    public final void c(euc eucVar) {
        euk eukVar = this.b;
        if (eukVar != null) {
            eukVar.k(eucVar.l);
        }
    }

    @Override // defpackage.eua
    public final void d(euc eucVar, boolean z) {
        if (z || eucVar.i || !l()) {
            return;
        }
        List list = eucVar.l;
        for (int i = 0; i < list.size(); i++) {
            if (((etn) list.get(i)).b == 0) {
                j();
                return;
            }
        }
    }

    @Override // defpackage.eua
    public final void f() {
        euk eukVar = this.b;
        if (eukVar != null) {
            eukVar.l();
        }
    }

    @Override // defpackage.eua
    public final void g() {
        h();
    }

    public final boolean h() {
        euc eucVar = this.a;
        boolean z = eucVar.k;
        euq euqVar = this.g;
        if (euqVar == null) {
            return !z;
        }
        if (!z) {
            i();
            return true;
        }
        eur eurVar = eucVar.m.b;
        int i = euq.a;
        if (!eurVar.b(i).equals(eurVar)) {
            i();
            return false;
        }
        if (!k(eurVar)) {
            return true;
        }
        String packageName = this.c.getPackageName();
        eur eurVarB = eurVar.b(i);
        if (!eurVarB.equals(eurVar)) {
            edb.e("PlatformScheduler", "Ignoring unsupported requirements: " + (eurVarB.a ^ eurVar.a));
        }
        JobInfo.Builder builder = new JobInfo.Builder(2, euqVar.b);
        if (eurVar.g()) {
            builder.setRequiredNetworkType(2);
        } else if (eurVar.e()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(eurVar.d());
        builder.setRequiresCharging(eurVar.c());
        if (Build.VERSION.SDK_INT >= 26 && eurVar.f()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", packageName);
        persistableBundle.putInt("requirements", eurVar.a);
        builder.setExtras(persistableBundle);
        if (euqVar.c.schedule(builder.build()) == 1) {
            this.f = eurVar;
            return true;
        }
        edb.e("DownloadService", "Failed to schedule restart");
        i();
        return false;
    }

    @Override // defpackage.eua
    public final /* synthetic */ void e(euc eucVar) {
    }
}
