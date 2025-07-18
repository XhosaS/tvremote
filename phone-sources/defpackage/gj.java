package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gj extends fv {
    public yow a;
    public yjz d;
    public boolean e;
    public ft f;

    public gj(boolean z, yow yowVar, yjz yjzVar) {
        super(z);
        this.a = yowVar;
        this.d = yjzVar;
    }

    @Override // defpackage.fv
    public final void a() {
        ft ftVar = this.f;
        if (ftVar != null) {
            ftVar.a();
        }
        ft ftVar2 = this.f;
        if (ftVar2 != null) {
            ftVar2.b();
        }
        this.e = false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ysn] */
    @Override // defpackage.fv
    public final void b() {
        ft ftVar = this.f;
        if (ftVar != null && !ftVar.b) {
            ftVar.a();
            this.f = null;
        }
        if (this.f == null) {
            this.f = new ft(this.a, false, this.d, this);
        }
        ft ftVar2 = this.f;
        if (ftVar2 != null) {
            ftVar2.c.e(null);
        }
        ft ftVar3 = this.f;
        if (ftVar3 != null) {
            ftVar3.b();
        }
        this.e = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yrz] */
    @Override // defpackage.fv
    public final void c(fd fdVar) {
        ft ftVar = this.f;
        if (ftVar != null) {
            ftVar.c.b(fdVar);
        }
    }

    @Override // defpackage.fv
    public final void d(fd fdVar) {
        ft ftVar = this.f;
        if (ftVar != null) {
            ftVar.a();
        }
        if (this.b) {
            this.f = new ft(this.a, true, this.d, this);
        }
        this.e = true;
    }
}
