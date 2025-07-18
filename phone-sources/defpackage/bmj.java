package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmj implements bmi {
    public boolean a = true;
    public final bml b;
    public final bml c;
    public final bml d;
    public final bml e;
    public final bml f;
    public final bml g;
    public final bml h;
    public final bml i;
    public yjv j;
    public yjv k;

    public bmj() {
        bml bmlVar = bml.a;
        this.b = bmlVar;
        this.c = bmlVar;
        this.d = bmlVar;
        this.e = bmlVar;
        this.f = bmlVar;
        this.g = bmlVar;
        this.h = bmlVar;
        this.i = bmlVar;
        this.j = lo.i;
        this.k = lo.j;
    }

    @Override // defpackage.bmi
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.bmi
    public final void b(yjv yjvVar) {
        this.j = yjvVar;
    }

    @Override // defpackage.bmi
    public final void c(yjv yjvVar) {
        this.k = yjvVar;
    }

    @Override // defpackage.bmi
    public final boolean d() {
        return this.a;
    }
}
