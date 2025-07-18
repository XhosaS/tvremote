package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lwt extends lwr {
    private final kfv a;
    private final lwv b;
    private final lwp c;

    public lwt(lwp lwpVar, kfv kfvVar, lwv lwvVar) {
        this.c = lwpVar;
        this.a = kfvVar;
        this.b = lwvVar;
    }

    @Override // defpackage.lwr, defpackage.lwm
    public final void a(Status status) {
        if (status.c()) {
            this.a.i(Status.a);
        } else {
            this.a.i(status);
        }
    }

    @Override // defpackage.lwr, defpackage.lwm
    public final void d(Status status) {
        if (!status.c()) {
            this.a.i(status);
            return;
        }
        lwv lwvVar = this.b;
        if (lwvVar == null) {
            this.a.i(Status.a);
        } else {
            this.c.e(lwvVar, this);
        }
    }
}
