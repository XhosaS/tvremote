package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvf implements uvo {
    private final uvo[] a;
    private final boolean b;
    private final boolean c;

    public uvf(uvo[] uvoVarArr) {
        this.a = uvoVarArr;
        int length = uvoVarArr.length;
        boolean z = true;
        this.b = length > 0 && uvoVarArr[0].e();
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (uvoVarArr[i].f()) {
                break;
            } else {
                i++;
            }
        }
        this.c = z;
    }

    @Override // defpackage.uvo
    public final /* synthetic */ uvq b() {
        return new uuy(this);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void c(Canvas canvas, bho bhoVar) {
        k(canvas, bhoVar);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.uvo
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uvf) {
            return Arrays.equals(this.a, ((uvf) obj).a);
        }
        return false;
    }

    @Override // defpackage.uvo
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.uvo
    public /* synthetic */ djg h(int i, int i2, Bitmap.Config config) {
        return new uvh(this, null, null, i, i2, config);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void i(Canvas canvas) {
        j(canvas, null);
    }

    @Override // defpackage.uvo
    public final void j(Canvas canvas, ColorFilter colorFilter) {
        int i = 0;
        while (true) {
            uvo[] uvoVarArr = this.a;
            if (i >= uvoVarArr.length) {
                return;
            }
            uvoVarArr[i].j(canvas, colorFilter);
            i++;
        }
    }

    @Override // defpackage.uvo
    public final void k(Canvas canvas, bho bhoVar) {
        int i = 0;
        while (true) {
            uvo[] uvoVarArr = this.a;
            if (i >= uvoVarArr.length) {
                return;
            }
            uvoVarArr[i].k(canvas, bhoVar);
            i++;
        }
    }

    public final String toString() {
        return "MultiScrimRenderer{renderers=" + Arrays.toString(this.a) + "}";
    }
}
