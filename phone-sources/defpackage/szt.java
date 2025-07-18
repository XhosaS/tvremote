package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szt extends szz {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public szt(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.szz
    public final void a(Matrix matrix, sza szaVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((szz) it.next()).a(this.b, szaVar, i, canvas);
        }
    }
}
