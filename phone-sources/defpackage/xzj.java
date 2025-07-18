package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzj extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ xzm b;
    private yby c;

    public xzj(xzm xzmVar) {
        this.b = xzmVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        yby ybyVar = this.c;
        if (ybyVar == null || ybyVar.b() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            this.c.c(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            xzm xzmVar = this.b;
            yby ybyVarA = xzmVar.g.a(Math.max(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, i2));
            this.c = ybyVarA;
            this.a.add(ybyVarA);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.c.b());
            if (iMin == 0) {
                int iA = this.c.a();
                yby ybyVarA2 = this.b.g.a(Math.max(i2, iA + iA));
                this.c = ybyVarA2;
                this.a.add(ybyVarA2);
            } else {
                this.c.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
