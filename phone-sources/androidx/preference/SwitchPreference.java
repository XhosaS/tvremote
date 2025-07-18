package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdw;
import defpackage.gdx;
import defpackage.gea;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final gea c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int i = crn.i(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, i);
        this.c = new gea(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.l, i, 0);
        o(crn.n(typedArrayObtainStyledAttributes, 7, 0));
        l(crn.n(typedArrayObtainStyledAttributes, 6, 1));
        this.d = crn.n(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = crn.n(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = crn.o(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        super.a(gdwVar);
        T(gdwVar.a(android.R.id.switch_widget));
        S(gdwVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(android.R.id.switch_widget));
            R(view.findViewById(android.R.id.summary));
        }
    }
}
