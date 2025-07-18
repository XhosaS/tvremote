package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qey {
    public final Executor a;
    final qee b;
    public final qee c;

    public qey(Context context, yqt yqtVar, Executor executor) {
        this.a = executor;
        this.b = qee.a(executor);
        this.c = new qee(executor, new qex(yqtVar, context));
    }
}
