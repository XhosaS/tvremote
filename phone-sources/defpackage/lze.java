package defpackage;

import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lze {
    public final Executor a;
    public final Executor b;
    public final lzc c;
    public final ksn d;
    public final String e;
    public mfb f;
    public mfb g;
    public final ApiActivity h;
    public final lrc i;

    public lze(ExecutorService executorService, Executor executor, lzc lzcVar, lrc lrcVar, ksn ksnVar, String str, ApiActivity apiActivity) {
        mfi mfiVar = mfi.a;
        this.f = mfiVar;
        this.g = mfiVar;
        this.a = executorService;
        this.b = executor;
        this.c = lzcVar;
        this.i = lrcVar;
        this.d = ksnVar;
        krf.c(str);
        this.e = str;
        this.h = apiActivity;
    }

    public final void a(ksy ksyVar, boolean z) {
        ApiActivity apiActivity = this.h;
        apiActivity.c = ksyVar;
        apiActivity.d = z;
        String string = ksyVar.toString();
        String str = apiActivity.b;
        StringBuilder sb = new StringBuilder("Found ");
        sb.append(string);
        sb.append(true != z ? " not playable" : "");
        sb.append(" for ");
        sb.append(str);
        krd.e(sb.toString());
        ldd.a(apiActivity);
        int i = apiActivity.f;
        if (i == 1) {
            if (!ksy.v(ksyVar)) {
                apiActivity.a(1, new Throwable());
                return;
            }
            apiActivity.h.p(apiActivity.a);
            apiActivity.o.f(apiActivity, ksyVar.b, kgu.C(apiActivity.e, "api"), apiActivity.p, false, true, false);
            apiActivity.b();
            return;
        }
        if (i != 4) {
            if (!ksy.v(ksyVar)) {
                apiActivity.a(1, new Throwable());
                return;
            } else if (apiActivity.f != 3) {
                apiActivity.r.c(apiActivity, apiActivity.getSupportFragmentManager(), apiActivity.a, ksyVar);
                return;
            } else {
                PinBroadcastReceiver.c(apiActivity, apiActivity.a, ksyVar.b);
                apiActivity.b();
                return;
            }
        }
        if (!ksy.v(ksyVar) && !ksy.w(ksyVar)) {
            apiActivity.a(1, new Throwable());
            return;
        }
        apiActivity.s = new kwy(apiActivity.k);
        mdz mdzVar = new mdz(apiActivity, 1);
        lid lidVar = lid.a;
        rfa rfaVarA = lof.a(18, "e_".concat(String.valueOf(apiActivity.e)), (ieg) apiActivity.l.a());
        rfaVarA.p(ksyVar.b);
        rfaVarA.f = (ksn) ieg.f(apiActivity.a).c;
        rfaVarA.m(1);
        rfaVarA.q(true);
        int iZ = kfw.z(apiActivity, mdzVar, lidVar, rfaVarA.j());
        if (iZ != -1) {
            apiActivity.c(iZ);
            apiActivity.a(3, new Throwable());
        }
    }

    public final void b() {
        this.h.d(2);
    }
}
