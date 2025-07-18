package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdr extends hdn {
    private final hhv e;

    public hdr(List list) {
        super(list);
        this.e = new hhv();
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        Object obj;
        float f2;
        Object obj2 = hhsVar.b;
        if (obj2 == null || (obj = hhsVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hhv hhvVar = (hhv) obj2;
        hhv hhvVar2 = (hhv) obj;
        hhu hhuVar = this.d;
        if (hhuVar != null) {
            f2 = f;
            hhv hhvVar3 = (hhv) hhuVar.b(hhsVar.g, hhsVar.h.floatValue(), hhvVar, hhvVar2, f2, c(), this.c);
            if (hhvVar3 != null) {
                return hhvVar3;
            }
        } else {
            f2 = f;
        }
        hhv hhvVar4 = this.e;
        float f3 = hhvVar.a;
        float f4 = hhvVar2.a;
        PointF pointF = hhm.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = hhvVar.b;
        float f7 = f6 + ((hhvVar2.b - f6) * f2);
        hhvVar4.a = f5;
        hhvVar4.b = f7;
        return hhvVar4;
    }
}
