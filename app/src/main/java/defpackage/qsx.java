package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qsx {
    public final qsz a;

    public qsx(Context context, qsz qszVar) {
        this.a = qszVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(qszVar.a);
        application.registerComponentCallbacks(qszVar.a);
    }
}
