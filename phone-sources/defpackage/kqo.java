package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.apps.play.movies.common.service.backup.VideosBackupAgent;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqo implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;
    private final Object c;

    public kqo(Object obj, xcq xcqVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = xcqVar;
    }

    public static void a(kqf kqfVar, lxh lxhVar) {
        kqfVar.o();
        lxhVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, xcq] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                Context contextA = ((rgq) this.a).a();
                SharedPreferences sharedPreferences = contextA.getSharedPreferences(krh.SHARED_NAME, 0);
                int i = VideosBackupAgent.a;
                final BackupManager backupManager = new BackupManager(contextA);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: leg
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                        int i2 = VideosBackupAgent.a;
                        if (str == null || !ktw.d(str)) {
                            return;
                        }
                        backupManager.dataChanged();
                    }
                };
                kqf kqfVar = (kqf) this.c;
                kqfVar.l = onSharedPreferenceChangeListener;
                sharedPreferences.registerOnSharedPreferenceChangeListener(kqfVar.l);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 1:
                xcq xcqVar = this.a;
                return Boolean.valueOf(((kwy) xcqVar.b()).n(((rgq) this.c).a()));
            case 2:
                maz mazVarB = ((mba) this.a).b();
                ((kqf) this.c).k(mazVarB);
                return mazVarB;
            case 3:
                lxh lxhVar = (lxh) this.a.b();
                a((kqf) this.c, lxhVar);
                return lxhVar;
            case 4:
                return ((kqf) this.c).a((SharedPreferences) this.a.b());
            case 5:
                lhz lhzVar = (lhz) this.a.b();
                kqf kqfVar2 = (kqf) this.c;
                return new lia(lhzVar, kqfVar2.j, kqfVar2.k);
            case 6:
                lia liaVar = (lia) this.a.b();
                lfn lfnVar = (lfn) this.c.b();
                return new nqq(liaVar, lfnVar.cd(), lfnVar.ce(), lfnVar.cf(), lfnVar.L());
            case 7:
                Context contextA2 = ((rgq) this.c).a();
                String str = ((lxc) this.a.b()).a;
                String packageName = contextA2.getPackageName();
                String str2 = Build.VERSION.RELEASE;
                String str3 = Build.MODEL;
                String str4 = Build.ID;
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append('/');
                sb.append(str);
                sb.append("(Linux; U; Android ");
                sb.append(str2);
                sb.append("; ");
                sb.append(Locale.getDefault());
                if (str3.length() > 0) {
                    sb.append("; ");
                    sb.append(str3);
                }
                if (str4.length() > 0) {
                    sb.append(" Build/");
                    sb.append(str4);
                }
                sb.append(')');
                return sb.toString();
            case 8:
                lfn lfnVar2 = (lfn) this.a.b();
                ((kpw) this.c).b();
                return new kwy(lfnVar2.Z());
            case 9:
                return new lgj((iea) this.c.b(), (ino) this.a.b());
            case 10:
                return new isy((gpz) this.a.b(), (lfn) this.c.b());
            case 11:
                return new lhy((Executor) this.a.b(), (lgr) this.c.b(), 1);
            case 12:
                return new lhy((ExecutorService) this.a.b(), (lht) this.c.b(), 0);
            case 13:
                return new lnw((gpz) this.a.b(), (lfr) this.c.b(), 1);
            case 14:
                return new nux((mem) this.c.b(), ((kqn) this.a).b());
            case 15:
                return new lme(((rgq) this.a).a(), (lfn) this.c.b());
            case 16:
                return new kuw((gpz) this.a.b(), ((lnb) this.c).b(), (byte[]) null);
            case 17:
                return new lhy((Executor) this.a.b(), ((lnb) this.c).b(), 2);
            case 18:
                return new lnp((lie) this.c.b(), (lny) this.a.b());
            case 19:
                return new lnw((gpz) this.a.b(), (lfn) this.c.b(), 0);
            default:
                return new lny((Executor) this.a.b(), ((lse) this.c).b());
        }
    }

    public kqo(xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.b = i;
        this.a = xcqVar;
        this.c = xcqVar2;
    }
}
