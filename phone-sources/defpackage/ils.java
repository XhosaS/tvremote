package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ils extends ilo {
    public final gei a = new ilq();
    public final geh b = new ilr();
    private final gex c;

    public ils(gex gexVar) {
        this.c = gexVar;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 10), yihVar);
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 9), yihVar);
    }

    @Override // defpackage.ilo
    public final Object c(String str, wll wllVar, boolean z, long j, yih yihVar) {
        return gez.k(this.c, new ilp(this, str, wllVar, z, j, 0), yihVar);
    }

    @Override // defpackage.ilo
    public final ysx e(String str) {
        ill illVar = new ill(str, 2);
        return gez.p(this.c, new String[]{"user_entity_state"}, illVar);
    }

    @Override // defpackage.ilf
    public final Object f(String str, List list, yih yihVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM user_entity_state  WHERE account_name = ? AND entity_id In (");
        gez.G(sb, list.size());
        sb.append(")");
        return gez.l(this.c, true, false, new ikc((Object) sb.toString(), (Object) str, (Object) list, 4, (byte[]) null), yihVar);
    }

    @Override // defpackage.ilf
    public final Object g(imi[] imiVarArr, yih yihVar) {
        return gez.k(this.c, new iky(this, imiVarArr, 8), yihVar);
    }
}
