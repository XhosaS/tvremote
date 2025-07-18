package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v7.appcompat.R;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ejq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ejq(int i, PowerManager.WakeLock wakeLock, qdo qdoVar, Runnable runnable, qgp qgpVar, int i2) {
        this.f = i2;
        this.a = i;
        this.c = wakeLock;
        this.b = qdoVar;
        this.e = runnable;
        this.d = qgpVar;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [fpg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int i3 = this.f;
        if (i3 == 0) {
            Pair pair = (Pair) this.c;
            ((ejs) this.b).a.j.k(((Integer) pair.first).intValue(), (evz) pair.second, (evq) this.d, (evv) this.e, this.a);
            return;
        }
        if (i3 == 1) {
            for (int i4 = 0; i4 < this.a; i4++) {
                View view = (View) ((ArrayList) this.d).get(i4);
                String str = (String) ((ArrayList) this.c).get(i4);
                int[] iArr = cww.a;
                cwm.m(view, str);
                cwm.m((View) ((ArrayList) this.e).get(i4), (String) ((ArrayList) this.b).get(i4));
            }
            return;
        }
        if (i3 == 2) {
            fph fphVar = (fph) this.b;
            foo fooVar = fphVar.b;
            ?? r3 = this.c;
            if (fooVar.s()) {
                return;
            }
            Object obj = this.e;
            int i5 = this.a;
            Object obj2 = this.d;
            if (!fphVar.d.m()) {
                edb.e("MediaSessionLegacyStub", "Ignore incoming session command before initialization. command=" + (obj2 == null ? Integer.valueOf(i5) : ((fqw) obj2).g).toString() + ", pid=" + ((fsf) obj).a());
                return;
            }
            fnw fnwVarA = fphVar.a((fsf) obj);
            if (obj2 != null) {
                if (!fphVar.n.u(fnwVarA, (fqw) obj2)) {
                    return;
                }
            } else if (!fphVar.n.t(fnwVarA, i5)) {
                return;
            }
            try {
                r3.a(fnwVarA);
                return;
            } catch (RemoteException e) {
                edb.f("MediaSessionLegacyStub", "Exception in ".concat(fnwVarA.toString()), e);
                return;
            }
        }
        if (i3 == 3) {
            kea keaVar = new kea();
            Object obj3 = this.c;
            by byVarF = hju.F((Context) obj3);
            byVarF.getClass();
            cr supportFragmentManager = byVarF.getSupportFragmentManager();
            supportFragmentManager.getClass();
            keaVar.c(supportFragmentManager, this.a, new nz(this.b, this.d, obj3, this.e, 9, null));
            return;
        }
        tvn tvnVar = qgs.a;
        Object obj4 = this.d;
        ?? r0 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.c;
        int i6 = this.a;
        try {
            ((tvk) ((tvk) qgs.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", R.styleable.AppCompatTheme_windowMinWidthMajor, "GnpExecutorApiImpl.java")).t("Started Broadcast execution [%d].", i6);
            ((PowerManager.WakeLock) obj6).acquire(((qdo) obj5).e() ? 300000L : ((qdo) obj5).a());
            r0.run();
            try {
                ((PowerManager.WakeLock) obj6).release();
                i2 = 139;
            } catch (RuntimeException e2) {
                i2 = 139;
                ((tvk) ((tvk) ((tvk) qgs.a.g()).i(e2)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", (char) 134, "GnpExecutorApiImpl.java")).s("WakeLock releasing failed, probably due to timeout passing.");
            }
            ((qgp) obj4).a();
            ((tvk) ((tvk) qgs.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", i2, "GnpExecutorApiImpl.java")).t("Finished Broadcast execution [%d].", i6);
        } catch (SecurityException e3) {
            i = 139;
            try {
                ((tvk) ((tvk) ((tvk) qgs.a.g()).i(e3)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", 128, "GnpExecutorApiImpl.java")).t("WakeLock acquiring failed for execution [%d].", i6);
                try {
                    ((PowerManager.WakeLock) obj6).release();
                } catch (RuntimeException e4) {
                    ((tvk) ((tvk) ((tvk) qgs.a.g()).i(e4)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", (char) 134, "GnpExecutorApiImpl.java")).s("WakeLock releasing failed, probably due to timeout passing.");
                }
                ((qgp) obj4).a();
                ((tvk) ((tvk) qgs.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", 139, "GnpExecutorApiImpl.java")).t("Finished Broadcast execution [%d].", i6);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    ((PowerManager.WakeLock) obj6).release();
                } catch (RuntimeException e5) {
                    ((tvk) ((tvk) ((tvk) qgs.a.g()).i(e5)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", (char) 134, "GnpExecutorApiImpl.java")).s("WakeLock releasing failed, probably due to timeout passing.");
                }
                ((qgp) obj4).a();
                ((tvk) ((tvk) qgs.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", i, "GnpExecutorApiImpl.java")).t("Finished Broadcast execution [%d].", i6);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 139;
            Throwable th22 = th;
            ((PowerManager.WakeLock) obj6).release();
            ((qgp) obj4).a();
            ((tvk) ((tvk) qgs.a.e()).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", i, "GnpExecutorApiImpl.java")).t("Finished Broadcast execution [%d].", i6);
            throw th22;
        }
    }

    public ejq(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.f = i2;
        this.a = i;
        this.d = arrayList;
        this.c = arrayList2;
        this.e = arrayList3;
        this.b = arrayList4;
    }

    public /* synthetic */ ejq(ejs ejsVar, Pair pair, evq evqVar, evv evvVar, int i, int i2) {
        this.f = i2;
        this.b = ejsVar;
        this.c = pair;
        this.d = evqVar;
        this.e = evvVar;
        this.a = i;
    }

    public /* synthetic */ ejq(fph fphVar, fqw fqwVar, int i, fsf fsfVar, fpg fpgVar, int i2) {
        this.f = i2;
        this.b = fphVar;
        this.d = fqwVar;
        this.a = i;
        this.e = fsfVar;
        this.c = fpgVar;
    }

    public /* synthetic */ ejq(igi igiVar, Context context, int i, wkg wkgVar, String str, int i2) {
        this.f = i2;
        this.b = igiVar;
        this.c = context;
        this.a = i;
        this.d = wkgVar;
        this.e = str;
    }
}
