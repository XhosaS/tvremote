package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncb extends mix implements nlp {
    private final aegp a;

    public ncb(aegp aegpVar) {
        this.a = aegpVar;
    }

    @Override // defpackage.nlp
    public final float g() {
        aegp aegpVar = this.a;
        return aegpVar.b.getFloat(aegpVar.a);
    }

    @Override // defpackage.nlp
    public final float h() {
        aegp aegpVar = this.a;
        return aegpVar.b.getFloat(aegpVar.a + 4);
    }

    @Override // defpackage.nlp
    public final boolean i() {
        return true;
    }

    @Override // defpackage.nlp
    public final boolean j() {
        return true;
    }
}
