package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gja extends Property {
    public gja(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        gjh gjhVar = (gjh) obj;
        PointF pointF = (PointF) obj2;
        gjhVar.a = Math.round(pointF.x);
        gjhVar.b = Math.round(pointF.y);
        int i = gjhVar.e + 1;
        gjhVar.e = i;
        if (i == gjhVar.f) {
            gjhVar.a();
        }
    }
}
