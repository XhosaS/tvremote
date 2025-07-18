package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
class btv extends Property {
    public btv(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        buc bucVar = (buc) obj;
        PointF pointF = (PointF) obj2;
        bucVar.a = Math.round(pointF.x);
        bucVar.b = Math.round(pointF.y);
        int i = bucVar.e + 1;
        bucVar.e = i;
        if (i == bucVar.f) {
            bucVar.a();
        }
    }
}
