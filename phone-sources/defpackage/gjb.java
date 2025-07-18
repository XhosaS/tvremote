package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjb extends Property {
    public gjb(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        gjh gjhVar = (gjh) obj;
        PointF pointF = (PointF) obj2;
        gjhVar.c = Math.round(pointF.x);
        gjhVar.d = Math.round(pointF.y);
        int i = gjhVar.f + 1;
        gjhVar.f = i;
        if (gjhVar.e == i) {
            gjhVar.a();
        }
    }
}
