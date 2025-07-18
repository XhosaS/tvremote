package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axl implements TextView.OnEditorActionListener {
    final /* synthetic */ axp a;

    public axl(axp axpVar) {
        this.a = axpVar;
    }

    public final boolean a(EditText editText, int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            axp axpVar = this.a;
            axpVar.g.d(axpVar, editText);
            return true;
        }
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        axp axpVar2 = this.a;
        axpVar2.g.c(axpVar2, editText);
        return true;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5 || i == 6) {
            axp axpVar = this.a;
            axpVar.g.c(axpVar, textView);
            return true;
        }
        if (i != 1) {
            return false;
        }
        axp axpVar2 = this.a;
        axpVar2.g.d(axpVar2, textView);
        return true;
    }
}
