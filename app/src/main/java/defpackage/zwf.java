package defpackage;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zwf extends zvc {
    private List c;

    public zwf(yxy yxyVar, boolean z) {
        super(yxyVar, z, true);
        List listA = yxyVar.isEmpty() ? Collections.EMPTY_LIST : Lists.a(yxyVar.size());
        for (int i = 0; i < yxyVar.size(); i++) {
            listA.add(null);
        }
        this.c = listA;
    }

    @Override // defpackage.zvc
    public final void f(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new zwe(obj));
        }
    }

    @Override // defpackage.zvc
    public final void h() {
        List list = this.c;
        if (list != null) {
            p(x(list));
        }
    }

    @Override // defpackage.zvc
    public final void w(int i) {
        this.a = null;
        this.c = null;
    }

    public abstract Object x(List list);
}
