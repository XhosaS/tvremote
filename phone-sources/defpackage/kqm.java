package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqm implements xcm {
    private final /* synthetic */ int a;
    private final Object b;

    public kqm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static idr a(kqf kqfVar) {
        idr idrVar = kqfVar.e;
        idrVar.getClass();
        return idrVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, xcq] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        int i;
        String str;
        PackageInfo packageInfo = null;
        switch (this.a) {
            case 0:
                return new isy((lyz) this.b.b(), new ReentrantLock());
            case 1:
                mta mtaVar = (mta) this.b.b();
                mtaVar.getClass();
                return mtaVar;
            case 2:
                return ((kqf) this.b).x();
            case 3:
                return ((kqf) this.b).z();
            case 4:
                return ((kqf) this.b).b();
            case 5:
                Context applicationContext = ((rgq) this.b).a().getApplicationContext();
                try {
                    packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e) {
                    krd.g("could not retrieve application version name", e);
                }
                if (packageInfo == null || packageInfo.versionName == null) {
                    i = -1;
                    str = "Unknown";
                } else {
                    str = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
                return new lxc(str, i);
            case 6:
                return a((kqf) this.b);
            case 7:
                return yoz.l(ylh.ai((Executor) this.b.b()));
            case 8:
                Context contextA = ((rgq) this.b).a();
                jzs jzsVar = omg.a;
                return new omi(contextA);
            case 9:
                Context contextA2 = ((rgq) this.b).a();
                lbj lbjVar = new lbj(contextA2, 2);
                idh idhVarD = idh.d();
                idhVarD.e(new leo(contextA2, Integer.MIN_VALUE, Integer.MIN_VALUE));
                return idhVarD.b(new jxt(lbjVar, 7));
            case 10:
                return ((kdw) this.b).B();
            case 11:
                return ((lfn) this.b.b()).be();
            case 12:
                return Boolean.valueOf(((lfn) this.b.b()).dl());
            case 13:
                return new kwy(((lhb) this.b).b(), (byte[]) null);
            case 14:
                return new lhw((isy) this.b.b(), 1);
            case 15:
                return new lgw(((rgq) this.b).a());
            case 16:
                return new lhw(((lhv) this.b).b(), 0);
            case 17:
                uhs uhsVarV = sfy.v((ExecutorService) this.b.b());
                uhsVarV.getClass();
                return uhsVarV;
            case 18:
                return new lit(((rgq) this.b).a());
            case 19:
                return new lbj((idf) this.b.b(), 3);
            default:
                return new lqs((idf) this.b.b(), 1);
        }
    }
}
