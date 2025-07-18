package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bej extends bfp {
    public static final bej a = new bej();

    private bej() {
        super(0, 2, 1);
    }

    @Override // defpackage.bfp
    protected final void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar) {
        int i = ((bhr) bfsVar.c(0)).a;
        List list = (List) bfsVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            badVar.i(i3, obj);
            badVar.j(i3, obj);
        }
    }
}
