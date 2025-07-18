package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bjh;
import defpackage.bji;
import defpackage.bjn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final bjn c;
    private final CharSequence d;
    private final CharSequence e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.c = new bjn(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.m, R.attr.switchPreferenceCompatStyle, 0);
        n(acp.f(typedArrayObtainStyledAttributes, 7, 0));
        l(acp.f(typedArrayObtainStyledAttributes, 6, 1));
        this.d = acp.f(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = acp.f(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.e(this.d);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.d(this.e);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(bjh bjhVar) throws Resources.NotFoundException {
        super.a(bjhVar);
        W(bjhVar.z(R.id.switchWidget));
        V(bjhVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) throws Resources.NotFoundException {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            W(view.findViewById(R.id.switchWidget));
            U(view.findViewById(android.R.id.summary));
        }
    }
}
