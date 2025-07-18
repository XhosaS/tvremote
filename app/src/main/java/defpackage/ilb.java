package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilb extends ayc {
    public static final /* synthetic */ int l = 0;
    final /* synthetic */ ild k;

    public ilb(ild ildVar) {
        this.k = ildVar;
    }

    @Override // defpackage.ayc
    public final int b() {
        return this.k.c.g() ? R.layout.homegraph_guidedactions_input_m3 : R.layout.homegraph_guidedactions_input;
    }

    @Override // defpackage.ayc
    public final void e(final ayb aybVar, axh axhVar) {
        aybVar.getClass();
        axhVar.getClass();
        super.e(aybVar, axhVar);
        ild ildVar = this.k;
        ildVar.d = aybVar;
        TextView textView = aybVar.t;
        if (textView != null) {
            textView.setHint(R.string.homegraph_add_home_home_name_placeholder);
        }
        TextView textView2 = aybVar.u;
        if (textView2 != null) {
            textView2.setVisibility(8);
            textView2.setAlpha(aco.c(textView2.getResources()));
        }
        final EditText editTextA = aybVar.A();
        if (editTextA != null) {
            editTextA.setImeOptions(6);
            editTextA.setPrivateImeOptions(true != ildVar.g ? "horizontalAlignment=right" : "horizontalAlignment=left");
            if (ildVar.a.c) {
                editTextA.setPrivateImeOptions(String.valueOf(editTextA.getPrivateImeOptions()).concat(",com.google.android.inputmethod.latin.noMicrophoneKey"));
            }
            editTextA.addTextChangedListener(new ila(aybVar, ildVar));
            if (!ildVar.c.g()) {
                editTextA.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: iky
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        int i = ilb.l;
                        EditText editText = editTextA;
                        Resources resources = editText.getResources();
                        int i2 = R.color.G200;
                        editText.setTextColor(resources.getColor(z ? R.color.G900 : R.color.G200, null));
                        Resources resources2 = editText.getResources();
                        if (true == z) {
                            i2 = R.color.G900p50;
                        }
                        editText.setHintTextColor(resources2.getColor(i2, null));
                    }
                });
            }
        }
        View view = ildVar.e;
        if (view == null) {
            agvy.b("hiddenView");
            view = null;
        }
        view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ikz
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                EditText editTextA2;
                int i = ilb.l;
                if (!z || (editTextA2 = aybVar.A()) == null) {
                    return;
                }
                editTextA2.setFocusable(true);
                editTextA2.requestFocus();
            }
        });
    }

    @Override // defpackage.ayc
    protected final void h(ayb aybVar, boolean z, boolean z2) {
        aybVar.getClass();
        super.h(aybVar, true, z2);
    }
}
