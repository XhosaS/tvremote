package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhw implements ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ rhw(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            return new Thread(runnable);
        }
        if (i == 1) {
            return new ctz(runnable);
        }
        if (i != 2) {
            return Executors.defaultThreadFactory().newThread(new xyp(runnable, 17));
        }
        Context context = rwv.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
