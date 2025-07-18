package defpackage;

import android.accounts.Account;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.tvsearch.setup.settings.EnableAssistantSettingsJobService;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqk {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/settings/EnableAssistantSettingsJobServicePeer");
    public static final Duration b;
    public final fda c;
    public final ahbt d;
    public final gtu e;
    public final agow f;
    public zyd g;
    public final Handler h;
    public JobParameters i;
    public final Runnable j;
    public boolean k;
    private final iax l;
    private final agow m;
    private final agow n;
    private final gph o;
    private final idl p;
    private final EnableAssistantSettingsJobService q;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(3L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
    }

    public iqk(iax iaxVar, fda fdaVar, Context context, ahbt ahbtVar, agow agowVar, agow agowVar2, gph gphVar, gtu gtuVar, idl idlVar, EnableAssistantSettingsJobService enableAssistantSettingsJobService, agow agowVar3) {
        iaxVar.getClass();
        fdaVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        idlVar.getClass();
        agowVar3.getClass();
        this.l = iaxVar;
        this.c = fdaVar;
        this.d = ahbtVar;
        this.m = agowVar;
        this.n = agowVar2;
        this.o = gphVar;
        this.e = gtuVar;
        this.p = idlVar;
        this.q = enableAssistantSettingsJobService;
        this.f = agowVar3;
        this.h = new Handler(Looper.getMainLooper());
        this.j = new Runnable() { // from class: iqe
            @Override // java.lang.Runnable
            public final void run() {
                iqk iqkVar = this.a;
                zyd zydVar = iqkVar.g;
                zyd zydVar2 = null;
                if (zydVar == null) {
                    agvy.b("castInfoFuture");
                    zydVar = null;
                }
                if (zydVar.isDone()) {
                    return;
                }
                zyd zydVar3 = iqkVar.g;
                if (zydVar3 == null) {
                    agvy.b("castInfoFuture");
                } else {
                    zydVar2 = zydVar3;
                }
                zydVar2.cancel(false);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if (r2 == r5) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v1, types: [iax] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r23, defpackage.ymc r24, defpackage.agsw r25) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqk.a(android.accounts.Account, ymc, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (a((android.accounts.Account) r11, (defpackage.ymc) r12, r0) == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.accounts.Account r11, defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqk.b(android.accounts.Account, agsw):java.lang.Object");
    }

    public final void c(Account account) {
        this.h.removeCallbacks(this.j);
        ahal.e(this.d, null, 0, new iqh(this, account, null), 3);
    }
}
