package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxn implements zgx {
    private static final zft a;
    private final aehf b;

    static {
        int i = yyk.e;
        a = new aaxj("", zcg.b);
    }

    public aaxn(aehf aehfVar) {
        this.b = aehfVar;
    }

    @Override // defpackage.zgx
    public final zft a(String str) {
        Set set = (Set) this.b.a();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((zgx) set.iterator().next()).a(str);
        }
        yyf yyfVarG = yyk.g(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            yyfVarG.g(((zgx) it.next()).a(str));
        }
        return new aaxj(str, yyfVarG.f());
    }
}
