package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssu extends Property {
    final /* synthetic */ ssv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssu(ssv ssvVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.a = ssvVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        stk stkVar = (stk) obj;
        int iAlpha = Color.alpha(stkVar.E.getColorForState(stkVar.getDrawableState(), this.a.a.E.getDefaultColor()));
        float fAlpha = Color.alpha(stkVar.getCurrentTextColor());
        TimeInterpolator timeInterpolator = sns.a;
        return Float.valueOf(((fAlpha / 255.0f) / iAlpha) + 0.0f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        stk stkVar = (stk) obj;
        Float f = (Float) obj2;
        int colorForState = stkVar.E.getColorForState(stkVar.getDrawableState(), this.a.a.E.getDefaultColor());
        float fAlpha = Color.alpha(colorForState);
        float fFloatValue = f.floatValue();
        TimeInterpolator timeInterpolator = sns.a;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (((fFloatValue * ((fAlpha / 255.0f) + 0.0f)) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            stkVar.z(stkVar.E);
        } else {
            stkVar.z(colorStateListValueOf);
        }
    }
}
