package defpackage;

import android.content.Context;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class eku extends EditText implements TextView.OnEditorActionListener {
    public dtu a;
    public dtu b;
    public dru c;
    public AtomicReference d;
    public TextWatcher e;
    public boolean f;
    private int g;

    public eku(Context context) {
        super(context);
        this.g = -1;
        this.f = false;
        setOnEditorActionListener(this);
    }

    final void a(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        if (!z) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            this.f = false;
        } else if (inputMethodManager.isActive(this)) {
            inputMethodManager.showSoftInput(this, 0);
            this.f = false;
        } else {
            post(new eks(this, inputMethodManager));
            this.f = true;
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        dtu dtuVar = this.b;
        if (dtuVar == null) {
            return false;
        }
        int i2 = ekr.R;
        efv efvVar = new efv();
        efvVar.a = textView;
        return ((Boolean) dtuVar.b.n().x(dtuVar, efvVar)).booleanValue();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g = getLineCount();
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dru druVar;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.d;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        dtu dtuVar = this.a;
        if (dtuVar != null) {
            String string = charSequence.toString();
            int i4 = ekr.R;
            ekl eklVar = new ekl();
            eklVar.a = this;
            eklVar.b = string;
            dtuVar.b.n().x(dtuVar, eklVar);
        }
        int lineCount = getLineCount();
        int i5 = this.g;
        if (i5 == -1 || i5 == lineCount || (druVar = this.c) == null) {
            return;
        }
        ekr.aB(druVar);
    }
}
