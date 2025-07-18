package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dml implements dmo {
    private final Resources a;

    public dml(Resources resources) {
        dqk.d(resources, "Argument must not be null");
        this.a = resources;
    }

    @Override // defpackage.dmo
    public final ddp a(ddp ddpVar, dan danVar) {
        return dkn.f(this.a, ddpVar);
    }
}
