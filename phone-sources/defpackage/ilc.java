package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilc extends ikx {
    public final gei a = new ila();
    public final geh b = new ilb();
    private final gex c;

    public ilc(gex gexVar) {
        this.c = gexVar;
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 2), yihVar);
    }

    @Override // defpackage.ijf
    public final /* bridge */ /* synthetic */ Object b(Object[] objArr, yih yihVar) {
        imi[] imiVarArr = (imi[]) objArr;
        imiVarArr.getClass();
        return gez.l(this.c, false, true, new iky(this, imiVarArr, 0), yihVar);
    }

    @Override // defpackage.ikx
    public final Object c(final String str, final wll wllVar, final wog wogVar, final long j, yih yihVar) {
        return gez.k(this.c, new yjv() { // from class: ikz
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                return ikx.d(this.a, str, wllVar, wogVar, j, (yih) obj);
            }
        }, yihVar);
    }

    @Override // defpackage.ikx
    public final ysx e(String str) {
        ill illVar = new ill(str, 1);
        return gez.p(this.c, new String[]{"user_entity_state"}, illVar);
    }

    @Override // defpackage.ilf
    public final Object f(String str, List list, yih yihVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM user_entity_state  WHERE account_name = ? AND entity_id In (");
        gez.G(sb, list.size());
        sb.append(")");
        return gez.l(this.c, true, false, new ikc((Object) sb.toString(), (Object) str, (Object) list, 2, (byte[]) null), yihVar);
    }

    @Override // defpackage.ilf
    public final Object g(imi[] imiVarArr, yih yihVar) {
        return gez.k(this.c, new iky(this, imiVarArr, 1), yihVar);
    }
}
