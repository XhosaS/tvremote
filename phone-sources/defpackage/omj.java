package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class omj implements ont {
    public final /* synthetic */ omm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ oml e;
    public final /* synthetic */ long f;
    private final /* synthetic */ int g;

    public /* synthetic */ omj(omm ommVar, int i, String str, Executor executor, oml omlVar, long j, int i2) {
        this.g = i2;
        this.a = ommVar;
        this.b = i;
        this.c = str;
        this.d = executor;
        this.e = omlVar;
        this.f = j;
    }

    @Override // defpackage.ont
    public final void a(onz onzVar) {
        int i;
        if (this.g == 0) {
            boolean zI = onzVar.i();
            if (!zI) {
                onzVar.d();
            }
            oml omlVar = this.e;
            if (zI || (i = this.b) <= 1) {
                omlVar.a(zI);
                return;
            }
            long j = this.f;
            Executor executor = this.d;
            String str = this.c;
            omm ommVar = this.a;
            Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + ommVar.c + " failed, retrying");
            ommVar.f(str, executor, omlVar, i, j);
            return;
        }
        boolean zI2 = onzVar.i();
        long j2 = this.f;
        oml omlVar2 = this.e;
        Executor executor2 = this.d;
        String str2 = this.c;
        int i2 = this.b;
        omm ommVar2 = this.a;
        if (zI2) {
            if (!ommVar2.g((olu) onzVar.e())) {
                omlVar2.a(false);
                return;
            }
            String str3 = ((olu) onzVar.e()).a;
            if (str3 == null || str3.isEmpty()) {
                omlVar2.a(true);
                return;
            } else {
                ommVar2.b.a(str3).l(executor2, new omj(ommVar2, i2, str2, executor2, omlVar2, j2, 0));
                return;
            }
        }
        boolean z = ommVar2.d.get() && i2 > 1;
        onzVar.d();
        if (z) {
            Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + ommVar2.c + " failed, retrying");
            ommVar2.f(str2, executor2, omlVar2, i2, j2);
            return;
        }
        Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + ommVar2.c + " failed");
        omlVar2.a(false);
    }
}
