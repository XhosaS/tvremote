package defpackage;

import android.util.Property;
import androidx.leanback.widget.PagingIndicator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azg extends Property {
    public azg(Class cls) {
        super(cls, "diameter");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((azi) obj).e);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        azi aziVar = (azi) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        aziVar.e = fFloatValue;
        float f = fFloatValue / 2.0f;
        aziVar.f = f;
        PagingIndicator pagingIndicator = aziVar.j;
        aziVar.g = f * pagingIndicator.m;
        pagingIndicator.invalidate();
    }
}
