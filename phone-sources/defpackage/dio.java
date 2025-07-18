package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dio extends bab {
    private final int c;

    public dio(djd djdVar) {
        super(djdVar);
        this.c = djdVar.b;
    }

    private final List m() {
        diz dizVar = (diz) this.b;
        if (dizVar instanceof djd) {
            return ((djd) dizVar).d;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // defpackage.bab
    protected final void e() {
        Object obj = this.a;
        obj.getClass();
        ((djd) obj).d.clear();
    }

    @Override // defpackage.bad
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
    }

    @Override // defpackage.bad
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
        diz dizVar = (diz) obj;
        Object obj2 = this.b;
        obj2.getClass();
        int i2 = ((djd) obj2).b;
        if (i2 > 0) {
            if (dizVar instanceof djd) {
                djd djdVar = (djd) dizVar;
                djdVar.b = djdVar.c ? this.c : i2 - 1;
            }
            m().add(i, dizVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = this.a;
        obj3.getClass();
        sb.append(((djd) obj3).b);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.bad
    public final void k(int i, int i2, int i3) {
        List listM = m();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = listM.subList(i, i3 + i);
            List listAn = yfm.an(listSubList);
            listSubList.clear();
            listM.addAll(i4, listAn);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            listM.set(i, listM.set(i2, listM.get(i)));
        } else {
            listM.add(i4, listM.remove(i));
        }
    }

    @Override // defpackage.bad
    public final void l(int i, int i2) {
        List listM = m();
        if (i2 == 1) {
            listM.remove(i);
        } else {
            listM.subList(i, i2 + i).clear();
        }
    }
}
