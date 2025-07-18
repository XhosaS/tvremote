package androidx.work;

import android.content.Context;
import defpackage.fki;
import defpackage.gel;
import defpackage.gem;
import defpackage.gli;
import defpackage.gpm;
import defpackage.uhp;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends gpm {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public abstract gli a();

    @Override // defpackage.gpm
    public final uhp c() {
        return fki.aU(i(), new gel(7));
    }

    @Override // defpackage.gpm
    public final uhp d() {
        return fki.aU(i(), new gem(this, 17));
    }
}
