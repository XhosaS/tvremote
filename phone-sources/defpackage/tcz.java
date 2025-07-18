package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcz extends cuo {
    private final TextInputLayout a;

    public tcz(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        TextView textView;
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.c;
        CharSequence contentDescription = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence charSequenceD = textInputLayout.d();
        CharSequence charSequenceC = textInputLayout.c();
        CharSequence charSequence = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        if (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) {
            contentDescription = textView.getContentDescription();
        }
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceD);
        boolean z = textInputLayout.p;
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceC);
        boolean z2 = !zIsEmpty3;
        boolean z3 = (zIsEmpty3 && TextUtils.isEmpty(contentDescription)) ? false : true;
        String string = !zIsEmpty2 ? charSequenceD.toString() : "";
        tcw tcwVar = textInputLayout.a;
        TextView textView2 = tcwVar.a;
        if (textView2.getVisibility() == 0) {
            cyqVar.F(textView2);
            cyqVar.V(textView2);
        } else {
            cyqVar.V(tcwVar.c);
        }
        if (!zIsEmpty) {
            cyqVar.T(text);
        } else if (!TextUtils.isEmpty(string)) {
            cyqVar.T(string);
            if (!z && charSequence != null) {
                cyqVar.T(string + ", " + charSequence.toString());
            }
        } else if (charSequence != null) {
            cyqVar.T(charSequence);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cyqVar.E(string);
            } else {
                if (!zIsEmpty) {
                    string = String.valueOf(text) + ", " + string;
                }
                cyqVar.T(string);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                cyqVar.b.setShowingHintText(zIsEmpty);
            } else {
                cyqVar.o(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        cyqVar.H(i);
        if (z3) {
            if (true != z2) {
                charSequenceC = contentDescription;
            }
            cyqVar.A(charSequenceC);
        }
        View view2 = textInputLayout.d.o;
        if (view2 != null) {
            cyqVar.F(view2);
        }
        textInputLayout.b.c().v(cyqVar);
    }

    @Override // defpackage.cuo
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
