package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafl implements aaft, aafs {
    public final int a;
    public final aafo b;
    private final aafl[] c;

    public aafl(int i, aafl[] aaflVarArr) {
        this.a = i;
        this.c = aaflVarArr;
        this.b = null;
    }

    public aafl(aafl aaflVar, aafo aafoVar) {
        this.a = aaflVar.a;
        this.c = aaflVar.c;
        aafo aafoVar2 = aaflVar.b;
        this.b = aafoVar2 != null ? new aafk(aafoVar2, aafoVar) : aafoVar;
    }
}
