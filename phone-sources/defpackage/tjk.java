package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tjk extends tjo {
    protected final Handler a;
    public final zft b;

    protected tjk(Context context, tkm tkmVar, zft zftVar, Handler handler) {
        super(context, tkmVar);
        new ir();
        this.b = zftVar;
        this.a = handler;
    }

    public final void c(Runnable runnable) {
        this.a.post(runnable);
    }
}
