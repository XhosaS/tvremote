package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
class btw extends Property {
    public btw(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        buc bucVar = (buc) obj;
        PointF pointF = (PointF) obj2;
        bucVar.c = Math.round(pointF.x);
        bucVar.d = Math.round(pointF.y);
        int i = bucVar.f + 1;
        bucVar.f = i;
        if (bucVar.e == i) {
            bucVar.a();
        }
    }
}
