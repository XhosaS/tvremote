package androidx.work;

import android.content.Context;
import defpackage.gli;
import defpackage.gov;
import defpackage.gow;
import defpackage.gpm;
import defpackage.uhp;
import defpackage.yih;
import defpackage.yil;
import defpackage.yks;
import defpackage.yot;
import defpackage.yqg;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends gpm {
    private final WorkerParameters a;
    private final yot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = workerParameters;
        this.b = gov.a;
    }

    public abstract Object a(yih yihVar);

    public yot b() {
        return this.b;
    }

    @Override // defpackage.gpm
    public final uhp c() {
        return gli.v(b().plus(new yqg(null)), new gow(this, (yih) null, 0));
    }

    @Override // defpackage.gpm
    public final uhp d() {
        yil yilVarB = !yks.e(b(), gov.a) ? b() : this.a.f;
        yilVarB.getClass();
        return gli.v(yilVarB.plus(new yqg(null)), new gow(this, (yih) null, 2, (byte[]) null));
    }

    @Override // defpackage.gpm
    public final void e() {
    }
}
