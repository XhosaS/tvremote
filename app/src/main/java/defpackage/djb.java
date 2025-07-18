package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djb implements dap {
    private final dap a;
    private final Resources b;

    public djb(Resources resources, dap dapVar) {
        dqk.d(resources, "Argument must not be null");
        this.b = resources;
        this.a = dapVar;
    }

    @Override // defpackage.dap
    public final ddp a(Object obj, int i, int i2, dan danVar) {
        return dkn.f(this.b, this.a.a(obj, i, i2, danVar));
    }

    @Override // defpackage.dap
    public final boolean b(Object obj, dan danVar) {
        return this.a.b(obj, danVar);
    }
}
