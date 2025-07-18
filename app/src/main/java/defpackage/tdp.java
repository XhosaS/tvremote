package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.apps.tiktok.account.AccountId;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdp implements vta {
    public static final zdy a = zdy.h("com/google/android/libraries/search/geller/retry/GellerSyncRetryWorker");
    public final Set b;
    public final tdk c;
    public final GellerLoggingCallback d;
    private final Executor e;
    private final vjo f;
    private final AccountId g;
    private final tbs h;
    private final ltg i;
    private final String j;
    private final Optional k;

    public tdp(zyg zygVar, Set set, vjo vjoVar, tbs tbsVar, tdk tdkVar, GellerLoggingCallback gellerLoggingCallback, AccountId accountId, ltg ltgVar, String str, Optional optional) {
        this.e = zygVar;
        this.b = set;
        this.f = vjoVar;
        this.h = tbsVar;
        this.c = tdkVar;
        this.d = gellerLoggingCallback;
        this.g = accountId;
        this.i = ltgVar;
        this.j = str;
        this.k = optional;
    }

    public static cbu c(Map map, yzq yzqVar, int i, int i2) {
        return !e(map, yzqVar).isEmpty() ? i2 < i ? new cbs() : new cbr(caz.b) : new cbt(caz.b);
    }

    public static Set e(Map map, yzq yzqVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            if (f(entry, yzqVar)) {
                hashSet.add((acgd) entry.getKey());
            }
        }
        return hashSet;
    }

    public static boolean f(Map.Entry entry, yzq yzqVar) {
        yyk yykVarB = ((oml) entry.getValue()).b();
        int i = ((zcg) yykVarB).d;
        for (int i2 = 0; i2 < i; i2++) {
            Throwable th = (Throwable) yykVarB.get(i2);
            if (th instanceof oll) {
                Status status = Status.OK;
                if (th.getCause() instanceof StatusException) {
                    status = ((StatusException) th.getCause()).a;
                } else if (th.getCause() instanceof afjx) {
                    status = ((afjx) th.getCause()).a;
                }
                if (yzqVar.contains(Integer.valueOf(status.getCode().value()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // defpackage.vta, defpackage.vtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd b(final androidx.work.WorkerParameters r14) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdp.b(androidx.work.WorkerParameters):zyd");
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
