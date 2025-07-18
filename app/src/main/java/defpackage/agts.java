package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agts extends agto {
    public agts(agsw agswVar) {
        super(agswVar);
        if (agswVar != null && agswVar.fr() != agtf.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return agtf.a;
    }
}
