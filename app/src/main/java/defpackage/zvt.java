package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zvt implements zvi {
    final /* synthetic */ zvv a;
    final /* synthetic */ zwc b;

    public zvt(zwc zwcVar, zvv zvvVar) {
        this.a = zvvVar;
        this.b = zwcVar;
    }

    @Override // defpackage.zvi
    public final zyd a(Object obj) {
        zvw zvwVar = new zvw();
        zvw zvwVar2 = this.b.c;
        try {
            zwc zwcVarA = this.a.a(zvwVar.a, obj);
            zwcVarA.h(zvwVar);
            return zwcVarA.d;
        } finally {
            zvwVar2.b(zvwVar, zwk.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
