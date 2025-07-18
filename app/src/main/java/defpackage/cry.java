package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cry extends csa {
    private final cto e;

    public cry(List list) {
        super(list);
        cto ctoVar = (cto) ((cwz) list.get(0)).b;
        int length = ctoVar != null ? ctoVar.b.length : 0;
        this.e = new cto(new float[length], new int[length]);
    }

    @Override // defpackage.crt
    public final /* bridge */ /* synthetic */ Object f(cwz cwzVar, float f) {
        cto ctoVar = (cto) cwzVar.b;
        cto ctoVar2 = (cto) cwzVar.c;
        int[] iArr = ctoVar.b;
        int length = iArr.length;
        int[] iArr2 = ctoVar2.b;
        int length2 = iArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.m(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            cto ctoVar3 = this.e;
            float f2 = ctoVar.a[i];
            float f3 = ctoVar2.a[i];
            PointF pointF = cwt.a;
            ctoVar3.a[i] = f2 + ((f3 - f2) * f);
            ctoVar3.b[i] = cwp.a(f, iArr[i], iArr2[i]);
        }
        return this.e;
    }
}
