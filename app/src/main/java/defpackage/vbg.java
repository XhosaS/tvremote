package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbg implements vbi {
    private final vbi a;
    private final float b;

    public vbg(float f, vbi vbiVar) {
        while (vbiVar instanceof vbg) {
            vbiVar = ((vbg) vbiVar).a;
            f += ((vbg) vbiVar).b;
        }
        this.a = vbiVar;
        this.b = f;
    }

    @Override // defpackage.vbi
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbg)) {
            return false;
        }
        vbg vbgVar = (vbg) obj;
        return this.a.equals(vbgVar.a) && this.b == vbgVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
