package defpackage;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyr implements fyq {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/grpc/GrpcHelperImpl");
    private static final afid b;
    private final zyh c;

    static {
        afib afibVar = afih.b;
        int i = afid.c;
        b = new afia("x-goog-api-key", afibVar);
    }

    public fyr(zyh zyhVar) {
        zyhVar.getClass();
        this.c = zyhVar;
    }

    @Override // defpackage.fyq
    public final afhq a(Context context, String str, String str2, String str3, afih afihVar) {
        if (afihVar == null) {
            afihVar = new afih();
        }
        if (str3.length() > 0) {
            afid afidVar = b;
            if (!afihVar.f(afidVar)) {
                afihVar.e(afidVar, str3);
            }
        }
        try {
            afmh afmhVarC = afmh.c(str, 443, new CronetEngine.Builder(context).build());
            afer[] aferVarArr = {new fyt(afihVar, str2)};
            afuv afuvVar = afmhVarC.c;
            afuvVar.e(Arrays.asList(aferVarArr));
            zyh zyhVar = this.c;
            afuvVar.d(zyhVar);
            afmhVarC.a = zyhVar;
            return afuvVar.a();
        } catch (Throwable th) {
            ((zdv) ((zdv) a.d()).p(th).q("com/google/android/apps/tvsearch/grpc/GrpcHelperImpl", "provideManagedChannelWithMetadata", 51, "GrpcHelperImpl.kt")).u("Failed to load Cronet channel. Falling back to OkHttp.");
            agbo agboVar = new agbo(afrq.d(str, 443));
            afer[] aferVarArr2 = {new fyt(afihVar, str2)};
            afuv afuvVar2 = agboVar.c;
            afuvVar2.e(Arrays.asList(aferVarArr2));
            zyh zyhVar2 = this.c;
            afuvVar2.d(zyhVar2);
            agboVar.f = new afrb(zyhVar2);
            return afuvVar2.a();
        }
    }
}
