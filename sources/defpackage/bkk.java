package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkk extends bkq {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public bkk(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.bkq
    public final void a(Matrix matrix, bjt bjtVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bkq) it.next()).a(this.b, bjtVar, i, canvas);
        }
    }
}
