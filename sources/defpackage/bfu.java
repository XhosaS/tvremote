package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bfu implements cht {
    private final /* synthetic */ int a;

    public /* synthetic */ bfu(int i) {
        this.a = i;
    }

    @Override // defpackage.cht
    public final cja a(Object obj) {
        if (this.a == 0) {
            return qm.K("");
        }
        afy afyVar = (afy) obj;
        throw new bbh(afyVar.a(), afyVar.getMessage(), afyVar);
    }
}
