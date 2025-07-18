package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfm implements xcm {
    private final /* synthetic */ int a;

    public kfm(int i) {
        this.a = i;
    }

    public static idr a(kqf kqfVar) {
        idr idrVar = kqfVar.g;
        idrVar.getClass();
        return idrVar;
    }

    public static krb c() {
        krb krbVar = krb.a;
        krbVar.getClass();
        return krbVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                return new kfw();
            case 1:
                return new keb();
            case 2:
                return new kfo();
            case 3:
                return new kft();
            case 4:
                return new kja();
            case 5:
                return new kjc();
            case 6:
                return new kjg();
            case 7:
                return new kjx();
            case 8:
                return new kld();
            case 9:
                return new kgu();
            case 10:
                return new shx();
            case 11:
                return new kmh();
            case 12:
                return new kgu();
            case 13:
                return new ThreadPoolExecutor(4, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("bitmap", 10, 1));
            case 14:
                return new mef();
            case 15:
                return new ThreadPoolExecutor(3, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("local", 10, 1));
            case 16:
                int i = kqf.a;
                return new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("cpu", 2, 1));
            case 17:
                return new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("drm", -1, 1));
            case 18:
                throw null;
            case 19:
                return c();
            default:
                return new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rna("local", 1, 1));
        }
    }
}
