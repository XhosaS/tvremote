package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdg {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            adx.a().b(new adp() { // from class: bdf
                @Override // defpackage.adp
                public final void a(adh adhVar) {
                    int i = bdg.a;
                    try {
                        adhVar.c(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
