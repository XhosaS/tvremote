package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdl extends hdn {
    private final ghd e;

    public hdl(List list) {
        super(list);
        ghd ghdVar = (ghd) ((hhs) list.get(0)).b;
        int length = ghdVar != null ? ((int[]) ghdVar.b).length : 0;
        this.e = new ghd(new float[length], new int[length]);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        ghd ghdVar = (ghd) hhsVar.b;
        ghd ghdVar2 = (ghd) hhsVar.c;
        int[] iArr = (int[]) ghdVar.b;
        int length = iArr.length;
        int[] iArr2 = (int[]) ghdVar2.b;
        int length2 = iArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.cn(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            ghd ghdVar3 = this.e;
            float f2 = ((float[]) ghdVar.a)[i];
            float f3 = ((float[]) ghdVar2.a)[i];
            PointF pointF = hhm.a;
            ((float[]) ghdVar3.a)[i] = f2 + ((f3 - f2) * f);
            ((int[]) ghdVar3.b)[i] = hjs.j(f, iArr[i], iArr2[i]);
        }
        return this.e;
    }
}
