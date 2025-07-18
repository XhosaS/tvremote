package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zb implements zr {
    private final yy a;

    public zb(yy yyVar) {
        this.a = yyVar;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return clxVar.cu(this.a.a());
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return clxVar.cu(this.a.b(cmiVar));
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return clxVar.cu(this.a.c(cmiVar));
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return clxVar.cu(this.a.d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zb) {
            return yks.e(((zb) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        yy yyVar = this.a;
        cmi cmiVar = cmi.a;
        return "PaddingValues(" + ((Object) cma.a(yyVar.b(cmiVar))) + ", " + ((Object) cma.a(yyVar.d())) + ", " + ((Object) cma.a(yyVar.c(cmiVar))) + ", " + ((Object) cma.a(yyVar.a())) + ')';
    }
}
