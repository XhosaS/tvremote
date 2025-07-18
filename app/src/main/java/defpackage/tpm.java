package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpm {
    public static final tpm a;
    public static final tpm b;
    public final boolean c;
    public final boolean d;
    public final yyk e;
    public final yyk f;

    static {
        tpl tplVar = new tpl();
        tplVar.c();
        a = tplVar.a();
        tpl tplVar2 = new tpl();
        tplVar2.c();
        tplVar2.b(new tpk());
        tplVar2.a();
        tpl tplVar3 = new tpl();
        yqw.M(tplVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        tplVar3.a = true;
        b = tplVar3.a();
    }

    public tpm(boolean z, boolean z2, yyk yykVar, yyk yykVar2) {
        this.c = z;
        this.d = z2;
        this.e = yykVar;
        this.f = yykVar2;
    }
}
