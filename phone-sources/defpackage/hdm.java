package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdm extends hdn {
    public hdm(List list) {
        super(list);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        return Integer.valueOf(k(hhsVar, f));
    }

    public final int k(hhs hhsVar, float f) {
        float f2;
        Object obj = hhsVar.b;
        if (obj == null || hhsVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hhu hhuVar = this.d;
        if (hhuVar != null) {
            f2 = f;
            Integer num = (Integer) hhuVar.b(hhsVar.g, hhsVar.h.floatValue(), (Integer) obj, (Integer) hhsVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iIntValue = hhsVar.k;
        if (iIntValue == 784923401) {
            iIntValue = ((Integer) obj).intValue();
            hhsVar.k = iIntValue;
        }
        int iIntValue2 = hhsVar.l;
        if (iIntValue2 == 784923401) {
            iIntValue2 = ((Integer) hhsVar.c).intValue();
            hhsVar.l = iIntValue2;
        }
        PointF pointF = hhm.a;
        return (int) (iIntValue + ((iIntValue2 - iIntValue) * f2));
    }
}
