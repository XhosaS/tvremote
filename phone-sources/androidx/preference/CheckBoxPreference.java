package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdw;
import defpackage.gdx;
import defpackage.gea;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final gea c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int i = crn.i(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, i);
        this.c = new gea(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.b, i, 0);
        o(crn.n(typedArrayObtainStyledAttributes, 5, 0));
        l(crn.n(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = crn.o(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        super.a(gdwVar);
        T(gdwVar.a(android.R.id.checkbox));
        S(gdwVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(android.R.id.checkbox));
            R(view.findViewById(android.R.id.summary));
        }
    }
}
