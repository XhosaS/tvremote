package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoh {
    public static zyd a(final key keyVar, final yqi yqiVar, final Executor executor) {
        final zyu zyuVar = new zyu();
        keyVar.f(new kfd() { // from class: qoe
            @Override // defpackage.kfd
            public final void a(final kfc kfcVar) {
                Status statusB = kfcVar.b();
                if (statusB.f == 14) {
                    throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(kfcVar))));
                }
                final zyu zyuVar2 = zyuVar;
                if (statusB.c()) {
                    final yqi yqiVar2 = yqiVar;
                    executor.execute(new Runnable() { // from class: qod
                        @Override // java.lang.Runnable
                        public final void run() {
                            yqi yqiVar3 = yqiVar2;
                            zyu zyuVar3 = zyuVar2;
                            kfc kfcVar2 = kfcVar;
                            try {
                                try {
                                    zyuVar3.p(yqiVar3.apply(kfcVar2));
                                } catch (RuntimeException e) {
                                    zyuVar3.q(e);
                                }
                            } finally {
                                qoh.b(kfcVar2);
                            }
                        }
                    });
                } else {
                    zyuVar2.q(new qnv(kfcVar, statusB));
                    qoh.b(kfcVar);
                }
            }
        }, TimeUnit.SECONDS);
        zyuVar.d(wyo.h(new Runnable() { // from class: qof
            @Override // java.lang.Runnable
            public final void run() {
                if (zyuVar.valueField instanceof zue) {
                    keyVar.e();
                }
            }
        }), zwk.a);
        return zyuVar;
    }

    public static void b(kfc kfcVar) {
        if (kfcVar instanceof kez) {
            ((kez) kfcVar).a();
        }
    }
}
