package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilx extends ilu {
    public final gei a = new ilv();
    public final geh b = new ilw();
    private final gex c;

    public ilx(gex gexVar) {
        this.c = gexVar;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 11), yihVar);
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 12), yihVar);
    }

    @Override // defpackage.ilu
    public final Object c(String str, wll wllVar, boolean z, long j, yih yihVar) {
        return gez.k(this.c, new ilp(this, str, wllVar, z, j, 2), yihVar);
    }

    @Override // defpackage.ilu
    public final ysx e(String str) {
        ill illVar = new ill(str, 3);
        return gez.p(this.c, new String[]{"user_entity_state"}, illVar);
    }

    @Override // defpackage.ilf
    public final Object f(String str, List list, yih yihVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM user_entity_state  WHERE account_name = ? AND entity_id In (");
        gez.G(sb, list.size());
        sb.append(")");
        return gez.l(this.c, true, false, new ikc((Object) sb.toString(), (Object) str, (Object) list, 5, (byte[]) null), yihVar);
    }

    @Override // defpackage.ilf
    public final Object g(imi[] imiVarArr, yih yihVar) {
        return gez.k(this.c, new iky(this, imiVarArr, 13), yihVar);
    }
}
