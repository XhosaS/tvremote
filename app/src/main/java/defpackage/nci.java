package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nci extends mix implements nmi {
    private final aegw a;

    public nci(aegw aegwVar) {
        this.a = aegwVar;
    }

    @Override // defpackage.nmi
    public final float g() {
        aegw aegwVar = this.a;
        return aegwVar.b.getFloat(aegwVar.a + 4);
    }

    @Override // defpackage.nmi
    public final float h() {
        aegw aegwVar = this.a;
        return aegwVar.b.getFloat(aegwVar.a);
    }

    @Override // defpackage.nmi
    public final boolean i() {
        return true;
    }

    @Override // defpackage.nmi
    public final boolean j() {
        return true;
    }
}
