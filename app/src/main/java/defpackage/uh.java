package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uh implements AutoCloseable, bcj {
    final /* synthetic */ ui a;
    final /* synthetic */ bcg b;
    private final bha c;

    public uh(ue ueVar, ui uiVar, bcg bcgVar) {
        this.a = uiVar;
        this.b = bcgVar;
        ud udVar = new ud(ueVar);
        ueVar.b.add(udVar);
        this.c = udVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        if (bceVar != bce.ON_START) {
            if (bceVar == bce.ON_STOP) {
                this.c.e();
                return;
            } else {
                if (bceVar == bce.ON_DESTROY) {
                    this.c.e();
                    this.b.c(this);
                    return;
                }
                return;
            }
        }
        ui uiVar = this.a;
        bha bhaVar = this.c;
        bhc bhcVar = uiVar.a;
        if (bhaVar.b != null) {
            throw new IllegalStateException(a.c(bhaVar, "Callback '", "' is already registered with a dispatcher"));
        }
        bhcVar.c.addFirst(bhaVar);
        bhaVar.b = bhcVar;
        bhcVar.d();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.c(this);
    }
}
