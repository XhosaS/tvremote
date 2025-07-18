package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxh extends cxi {
    public cxh(cxk cxkVar, cxn cxnVar) {
        super(cxkVar, cxnVar);
    }

    @Override // defpackage.cxi
    public final void a(cxk cxkVar) {
        cxkVar.a.add(new cxm(Long.valueOf(System.currentTimeMillis()), "long", "millis", new String[]{"last_updated"}));
    }

    public final void b(cxe cxeVar, String str) {
        cxk cxkVar = this.a;
        cxg cxgVar = new cxg(new cxk(cxkVar));
        cxgVar.b(cxeVar);
        cxgVar.a.b("list_item");
        cxkVar.c(cxgVar.d(), str);
    }

    public final void c() {
        this.a.b("partial");
    }
}
