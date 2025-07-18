package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsn extends tsp {
    final /* synthetic */ String a = "";
    final /* synthetic */ tsp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsn(tsp tspVar, tsp tspVar2) {
        super(tspVar2);
        this.b = tspVar;
    }

    @Override // defpackage.tsp
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
