package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class iq extends ahy {
    final /* synthetic */ ir a;
    private boolean b = false;
    private int c = 0;

    public iq(ir irVar) {
        this.a = irVar;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        ir irVar = this.a;
        if (i == irVar.a.size()) {
            ahx ahxVar = irVar.b;
            if (ahxVar != null) {
                ahxVar.a();
            }
            this.c = 0;
            this.b = false;
            irVar.c = false;
        }
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ahx ahxVar = this.a.b;
        if (ahxVar != null) {
            ahxVar.b();
        }
    }
}
