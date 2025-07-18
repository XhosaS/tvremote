package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdw;
import defpackage.gdx;
import defpackage.gea;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final CharSequence c;
    private final CharSequence d;
    private final gea e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.e = new gea(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.m, R.attr.switchPreferenceCompatStyle, 0);
        o(crn.n(typedArrayObtainStyledAttributes, 7, 0));
        l(crn.n(typedArrayObtainStyledAttributes, 6, 1));
        this.c = crn.n(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = crn.n(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = crn.o(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.c);
            switchCompat.setTextOff(this.d);
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) throws Resources.NotFoundException {
        super.a(gdwVar);
        T(gdwVar.a(R.id.switchWidget));
        S(gdwVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) throws Resources.NotFoundException {
        C();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(R.id.switchWidget));
            R(view.findViewById(android.R.id.summary));
        }
    }
}
