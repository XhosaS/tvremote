package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vbz extends vcf {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public vbz(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.vcf
    public final void a(Matrix matrix, vbe vbeVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vcf) it.next()).a(this.b, vbeVar, i, canvas);
        }
    }
}
