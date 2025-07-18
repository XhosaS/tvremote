package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvy implements xcm {
    private final /* synthetic */ int a;
    private final Object b;

    public jvy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static idr a(kqf kqfVar) {
        idr idrVar = kqfVar.h;
        idrVar.getClass();
        return idrVar;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, xcq] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                return ((jwc) this.b).b();
            case 1:
                return ((jvr) this.b).b();
            case 2:
                return ((jwb) this.b).b();
            case 3:
                return ((jwi) this.b).b();
            case 4:
                return ((jzw) this.b).b();
            case 5:
                return ((kbt) this.b).b();
            case 6:
                return ((kbz) this.b).b();
            case 7:
                return new kdq(((jwl) this.b).b());
            case 8:
                return new kdu(((jwl) this.b).b());
            case 9:
                return new kju(((ihh) this.b).b());
            case 10:
                mdw mdwVar = (mdw) this.b.b();
                mdwVar.getClass();
                return mdwVar.e;
            case 11:
                return new kwy((jan) this.b.b());
            case 12:
                return a((kqf) this.b);
            case 13:
                String absolutePath = ((kqf) this.b).b.getCacheDir().getAbsolutePath();
                krf.c(absolutePath);
                absolutePath.getClass();
                return absolutePath;
            case 14:
                ExecutorService executorService = (ExecutorService) this.b.b();
                executorService.getClass();
                return executorService;
            case 15:
                SharedPreferences sharedPreferences = ((kqf) this.b).b.getSharedPreferences(krh.DOGFOOD_NAME, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 16:
                Context contextA = ((rgq) this.b).a();
                kwy kwyVar = new kwy(contextA.getContentResolver(), (byte[]) null);
                opc.e((ContentResolver) kwyVar.a, "videos");
                String[] strArr = ths.a;
                ulp ulpVar = thr.a;
                thr.a = new ulp(contextA.getContentResolver(), strArr);
                return kwyVar;
            case 17:
                ExecutorService executorService2 = (ExecutorService) this.b.b();
                executorService2.getClass();
                return executorService2;
            case 18:
                return new iem(((rgq) this.b).a(), "android.intent.action.LOCALE_CHANGED");
            case 19:
                return new miz(((rgq) this.b).a(), 1);
            default:
                return new men((mem) this.b.b());
        }
    }
}
