package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjl extends hji {
    final /* synthetic */ hjm g;

    public hjl(hjm hjmVar) {
        this.g = hjmVar;
    }

    @Override // defpackage.hji
    protected final String a() {
        hjj hjjVar = (hjj) this.g.a.get();
        if (hjjVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(hjjVar.a) + "]";
    }
}
