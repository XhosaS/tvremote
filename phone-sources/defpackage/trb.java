package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trb implements uha {
    final /* synthetic */ tqt a;
    final /* synthetic */ uha b;

    public trb(tqt tqtVar, uha uhaVar) {
        this.a = tqtVar;
        this.b = uhaVar;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        th.getClass();
        tqt tqtVarE = tqg.e(tqg.d(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    @Override // defpackage.uha
    public final void b(Object obj) {
        tqt tqtVarE = tqg.e(tqg.d(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }
}
