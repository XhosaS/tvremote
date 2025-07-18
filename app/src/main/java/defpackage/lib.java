package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lib implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lih b;

    public lib(lih lihVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lihVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AppMetadata appMetadata = this.a;
        String str = appMetadata.a;
        kkk.k(str);
        lih lihVar = this.b;
        lct lctVarN = lihVar.n(str);
        lcs lcsVar = lcs.ANALYTICS_STORAGE;
        if (lctVarN.n(lcsVar) && lct.h(appMetadata.s, 100).n(lcsVar)) {
            return lihVar.f(appMetadata).u();
        }
        lihVar.aB().k.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
