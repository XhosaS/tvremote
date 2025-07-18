package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dkr implements dap {
    private final dlr a;
    private final ddz b;

    public dkr(dlr dlrVar, ddz ddzVar) {
        this.a = dlrVar;
        this.b = ddzVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        ddp ddpVarC = this.a.c((Uri) obj, danVar);
        if (ddpVarC == null) {
            return null;
        }
        return dka.a(this.b, ((dlp) ddpVarC).c(), i, i2);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
