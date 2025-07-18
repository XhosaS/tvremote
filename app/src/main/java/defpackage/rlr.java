package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlr {
    static void a(final zyd zydVar) {
        zydVar.d(new Runnable() { // from class: rlp
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    zxn.o(zydVar);
                } catch (ExecutionException e) {
                    uea.a().post(new Runnable() { // from class: rlq
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e.getCause());
                        }
                    });
                }
            }
        }, zwk.a);
    }
}
