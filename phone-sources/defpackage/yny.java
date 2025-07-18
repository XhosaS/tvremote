package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yny extends yqh {
    public ypm a;
    public final ynu b = new ynu(null, ynv.a);
    final /* synthetic */ ztj c;
    private final yoe h;

    public yny(ztj ztjVar, yoe yoeVar) {
        this.c = ztjVar;
        this.h = yoeVar;
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        if (th != null) {
            yoe yoeVar = this.h;
            yxo yxoVarD = ((yof) yoeVar).D(new yon(th), null);
            if (yxoVarD != null) {
                yoeVar.a(yxoVarD);
                ynz ynzVar = (ynz) this.b.a;
                if (ynzVar != null) {
                    ynzVar.a();
                    return;
                }
                return;
            }
            return;
        }
        ztj ztjVar = this.c;
        if (((yns) ztjVar.a).a() == 0) {
            yoe yoeVar2 = this.h;
            ypc[] ypcVarArr = (ypc[]) ztjVar.b;
            ArrayList arrayList = new ArrayList(ypcVarArr.length);
            for (ypc ypcVar : ypcVarArr) {
                arrayList.add(ypcVar.o());
            }
            yoeVar2.resumeWith(arrayList);
        }
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return false;
    }
}
