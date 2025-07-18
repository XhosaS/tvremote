package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufz implements ufw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ufz(tqt tqtVar, ufw ufwVar, int i) {
        this.c = i;
        this.a = tqtVar;
        this.b = ufwVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tqt] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ugc] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uga] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ufw] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) {
        ugb ugbVar;
        ugb ugbVar2;
        int i = this.c;
        if (i == 0) {
            ugbVar = new ugb();
            ?? r1 = this.a;
            ugbVar2 = ((uge) this.b).b;
            try {
                return sfy.C(r1.a(ugbVar.a, obj));
            } finally {
            }
        }
        if (i != 1) {
            ugbVar = new ugb();
            ?? r12 = this.a;
            ugbVar2 = ((uge) this.b).b;
            try {
                uge ugeVarA = r12.a(ugbVar.a, obj);
                ugeVarA.c(ugbVar);
                return ugeVarA.c;
            } finally {
            }
        }
        tqt tqtVarE = tqg.e(tqg.d(), this.a);
        try {
            uhp uhpVarA = this.b.a(obj);
            if (uhpVarA != null) {
                return uhpVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        int i = this.c;
        if (i == 0) {
            return this.a.toString();
        }
        if (i != 1) {
            return this.a.toString();
        }
        return "propagating=[" + this.b + "]";
    }

    public ufz(uge ugeVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = ugeVar;
    }
}
