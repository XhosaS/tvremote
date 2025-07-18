package defpackage;

import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.TextAttribute;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjf extends InputConnectionWrapper {
    private String a;

    public kjf() {
        super(null, true);
        this.a = "";
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        charSequence.getClass();
        String str = this.a;
        Objects.toString(charSequence);
        this.a = String.valueOf(str).concat(charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        charSequence.getClass();
        return super.setComposingText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        List textConversionSuggestions;
        charSequence.getClass();
        if (textAttribute != null && (textConversionSuggestions = textAttribute.getTextConversionSuggestions()) != null) {
            yfm.ac(textConversionSuggestions);
        }
        return super.setComposingText(charSequence, i, textAttribute);
    }
}
