package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bhq;
import defpackage.bjh;
import defpackage.bji;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final bhq c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iB = acp.b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iB);
        this.c = new bhq(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.b, iB, 0);
        n(acp.f(typedArrayObtainStyledAttributes, 5, 0));
        l(acp.f(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W(View view) {
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
    public final void a(bjh bjhVar) {
        super.a(bjhVar);
        W(bjhVar.z(android.R.id.checkbox));
        V(bjhVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            W(view.findViewById(android.R.id.checkbox));
            U(view.findViewById(android.R.id.summary));
        }
    }
}
