package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bas implements ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ bas(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.a != 0) {
            return new ov(runnable);
        }
        Object obj = bav.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
