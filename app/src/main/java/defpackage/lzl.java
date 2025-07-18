package defpackage;

import android.content.pm.PackageManager;
import android.os.Binder;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzl {
    public static final zdy a = zdy.h("com/google/android/katniss/setting/AssistantSettingsServicePeer");
    public static final Duration b = Duration.ofSeconds(50);
    public final iax d;
    public final iba e;
    public final Supplier f;
    public final gph g;
    public final gtu h;
    public final gtw i;
    public final ftw j;
    public final PackageManager k;
    public final idl l;
    public final Supplier m;
    public final agow n;
    public final gvn p;
    private final vtm q;
    boolean c = true;
    public final lzp o = new lzk(this);

    public lzl(iax iaxVar, iba ibaVar, Supplier supplier, gvn gvnVar, gph gphVar, vtm vtmVar, gtu gtuVar, gtw gtwVar, ftw ftwVar, PackageManager packageManager, idl idlVar, Supplier supplier2, agow agowVar) {
        this.d = iaxVar;
        this.e = ibaVar;
        this.f = supplier;
        this.p = gvnVar;
        this.g = gphVar;
        this.q = vtmVar;
        this.h = gtuVar;
        this.i = gtwVar;
        this.j = ftwVar;
        this.k = packageManager;
        this.l = idlVar;
        this.m = supplier2;
        this.n = agowVar;
    }

    final void a() {
        if (!this.c) {
            ((zdv) ((zdv) a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer", "maybeScheduleJobToFixSettings", 873, "AssistantSettingsServicePeer.java")).u("Already scheduled a job to fix settings.");
        } else {
            this.q.c(iht.a.a(Duration.ZERO));
            this.c = false;
        }
    }

    public final boolean b() {
        String[] packagesForUid = this.k.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (str.equals("com.google.android.tungsten.setupwraith")) {
                    return true;
                }
            }
        }
        return false;
    }
}
