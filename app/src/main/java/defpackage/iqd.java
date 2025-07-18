package defpackage;

import android.accounts.Account;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqd implements ipx {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/settings/AssistantSettingsUiCacheImpl");
    private static final Duration h;
    public final frl b;
    public yjc c;
    public ylx d;
    public yni e;
    public yin f;
    public ylo g;
    private final ahbt i;
    private final ztw j;
    private Instant k;
    private boolean l;
    private boolean m;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(10L);
        durationOfMinutes.getClass();
        h = durationOfMinutes;
    }

    public iqd(frl frlVar, ahbt ahbtVar, ztw ztwVar) {
        ahbtVar.getClass();
        ztwVar.getClass();
        this.b = frlVar;
        this.i = ahbtVar;
        this.j = ztwVar;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.k = instant;
        yjc yjcVar = yjc.a;
        this.c = yjf.a(new yjb());
        ylx ylxVar = ylx.a;
        this.d = ylr.a(new yls());
        yni yniVar = yni.a;
        this.e = ymr.a(new ynf());
        yin yinVar = yin.a;
        this.f = yhz.a(new yim());
        ylo yloVar = ylo.a;
        this.g = ylk.a(new yln());
    }

    @Override // defpackage.ipx
    public final void a(String str) {
        str.getClass();
        this.l = false;
        this.m = false;
        ahal.e(this.i, null, 0, new iqa(this, str, null), 3).w(new agux() { // from class: ipy
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                zdy zdyVar = iqd.a;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) iqd.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/settings/AssistantSettingsUiCacheImpl", "clearAccountRelatedSettingsFromPDS$lambda$7", 140, "AssistantSettingsUiCacheImpl.kt")).u("Failed to clear fields from PDS.");
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ipx
    public final void b(String str, agum agumVar) {
        str.getClass();
        ahal.e(this.i, null, 0, new iqc(this, str, agumVar, null), 3).w(new agux() { // from class: ipz
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                zdy zdyVar = iqd.a;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) iqd.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/settings/AssistantSettingsUiCacheImpl", "whenReady$lambda$6", 117, "AssistantSettingsUiCacheImpl.kt")).u("Failed to load in settings from PDS.");
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ipx
    public final boolean c(Account account) {
        account.getClass();
        if (this.j.a().getEpochSecond() - this.k.getEpochSecond() >= h.getSeconds()) {
            return false;
        }
        if (!this.l && !this.m) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/setup/settings/AssistantSettingsUiCacheImpl", "onlyFirstScreenOobeSelected", 83, "AssistantSettingsUiCacheImpl.kt")).u("Did not get valid intent for determining firstScreenOobeSelected and secondScreenOobeSelected from ATV!");
        }
        return this.l && !this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.agsw r6) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqd.d(java.lang.String, agsw):java.lang.Object");
    }
}
