package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ili extends ilf {
    public final gei a = new ilg();
    public final geh b = new ilh();
    private final gex c;

    public ili(gex gexVar) {
        this.c = gexVar;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 3), yihVar);
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 4), yihVar);
    }

    @Override // defpackage.ilf
    public final Object f(String str, List list, yih yihVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM user_entity_state  WHERE account_name = ? AND entity_id In (");
        gez.G(sb, list.size());
        sb.append(")");
        return gez.l(this.c, true, false, new ikc((Object) sb.toString(), (Object) str, (Object) list, 3, (byte[]) null), yihVar);
    }

    @Override // defpackage.ilf
    public final Object g(imi[] imiVarArr, yih yihVar) {
        return gez.k(this.c, new iky(this, imiVarArr, 5), yihVar);
    }
}
