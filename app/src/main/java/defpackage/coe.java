package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coe {
    public final cnp a;
    public final ahbm b;
    final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new cod(this);

    public coe(Executor executor) {
        cnp cnpVar = new cnp(executor);
        this.a = cnpVar;
        this.b = ahdd.a(cnpVar);
    }
}
