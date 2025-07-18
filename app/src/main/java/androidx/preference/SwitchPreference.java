package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bjh;
import defpackage.bji;
import defpackage.bjm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final bjm c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iB = acp.b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iB);
        this.c = new bjm(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.l, iB, 0);
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
    private final void W(View view) {
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
    public final void a(bjh bjhVar) {
        super.a(bjhVar);
        W(bjhVar.z(android.R.id.switch_widget));
        V(bjhVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            W(view.findViewById(android.R.id.switch_widget));
            U(view.findViewById(android.R.id.summary));
        }
    }
}
