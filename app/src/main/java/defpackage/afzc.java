package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzc extends afow {
    final /* synthetic */ affi a;
    final /* synthetic */ String b;
    final /* synthetic */ afzk c;
    final /* synthetic */ afyx d;
    final /* synthetic */ zyu e;
    final /* synthetic */ afzf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzc(afzf afzfVar, affi affiVar, String str, afzk afzkVar, afyx afyxVar, zyu zyuVar) {
        super(affiVar);
        this.a = affiVar;
        this.b = str;
        this.c = afzkVar;
        this.d = afyxVar;
        this.e = zyuVar;
        this.f = afzfVar;
    }

    @Override // defpackage.afow
    public final void a() {
        int i = agfd.a;
        try {
            afgg afggVar = this.f.c.f;
            String str = this.b;
            afjm afjmVar = (afjm) ((afsb) afggVar).a.get(str);
            if (afjmVar == null) {
                this.c.j();
                afjmVar = null;
            }
            if (afjmVar != null) {
                throw null;
            }
            Status statusWithDescription = Status.j.withDescription(a.j(str, "Method not found: "));
            this.d.g(afzg.c);
            this.c.b(statusWithDescription, new afih());
            this.a.j(null);
            this.e.cancel(false);
        } catch (Throwable th) {
            this.d.g(afzg.c);
            this.c.b(Status.b(th), new afih());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
