package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ani extends and {
    private final agu a;
    private final ane b;
    private final anf c;

    public ani(anf anfVar, agu aguVar, ane aneVar) {
        this.c = anfVar;
        this.a = aguVar;
        this.b = aneVar;
    }

    @Override // defpackage.and
    public final void c(Status status) {
        if (status.a()) {
            this.a.l();
        } else {
            this.a.l();
        }
    }

    @Override // defpackage.and
    public final void d(Status status) {
        if (!status.a()) {
            this.a.l();
            return;
        }
        ane aneVar = this.b;
        if (aneVar == null) {
            this.a.l();
        } else {
            this.c.a(aneVar, this);
        }
    }
}
