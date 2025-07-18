package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csi extends cxb {
    final /* synthetic */ cxa a;
    final /* synthetic */ cxb b;
    final /* synthetic */ csp c;

    public csi(cxa cxaVar, cxb cxbVar, csp cspVar) {
        this.a = cxaVar;
        this.b = cxbVar;
        this.c = cspVar;
    }

    @Override // defpackage.cxb
    public final /* bridge */ /* synthetic */ Object a(cxa cxaVar) {
        float f = cxaVar.a;
        float f2 = cxaVar.b;
        String str = ((csp) cxaVar.c).a;
        String str2 = ((csp) cxaVar.d).a;
        cxa cxaVar2 = this.a;
        cxaVar2.a(f, f2, str, str2, cxaVar.e, cxaVar.f, cxaVar.g);
        String str3 = (String) this.b.a(cxaVar2);
        csp cspVar = (csp) (cxaVar.f == 1.0f ? cxaVar.d : cxaVar.c);
        csp cspVar2 = this.c;
        cspVar2.a(str3, cspVar.b, cspVar.c, cspVar.m, cspVar.d, cspVar.e, cspVar.f, cspVar.g, cspVar.h, cspVar.i, cspVar.j, cspVar.k, cspVar.l);
        return cspVar2;
    }
}
