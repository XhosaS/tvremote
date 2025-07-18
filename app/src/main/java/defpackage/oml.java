package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oml {
    public abstract omk a();

    public abstract yyk b();

    public abstract yyr c();

    public abstract yzq d();

    public abstract yzq e();

    public final oml f(oml omlVar) {
        omk omkVarA = a();
        omkVarA.c().i(omlVar.d());
        omkVarA.d().i(omlVar.e());
        omkVarA.b().h(omlVar.b());
        yyr yyrVarC = omlVar.c();
        ojf ojfVar = (ojf) omkVarA;
        if (ojfVar.a == null) {
            if (ojfVar.b == null) {
                ojfVar.a = new yyn(4);
            } else {
                ojfVar.a = new yyn(4);
                ojfVar.a.f(ojfVar.b);
                ojfVar.b = null;
            }
        }
        ojfVar.a.f(yyrVarC);
        return omkVarA.a();
    }
}
