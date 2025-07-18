package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cop extends col {
    final /* synthetic */ coq d;

    public cop(coq coqVar) {
        this.d = coqVar;
    }

    @Override // defpackage.col
    protected final String b() {
        com comVar = (com) this.d.a.get();
        if (comVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + comVar.a + "]";
    }
}
