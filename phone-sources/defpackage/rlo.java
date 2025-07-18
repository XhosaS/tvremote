package defpackage;

import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlo extends Property {
    public rlo(Class cls) {
        super(cls, "elevationProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExpandableDialogView) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        expandableDialogView.g = fFloatValue;
        float f = fFloatValue * expandableDialogView.f;
        szk szkVar = expandableDialogView.e;
        szkVar.M(f);
        szkVar.N(ColorStateList.valueOf(expandableDialogView.c(f)));
        View view = expandableDialogView.d;
        int[] iArr = cww.a;
        cwm.j(view, f);
        expandableDialogView.invalidate();
    }
}
