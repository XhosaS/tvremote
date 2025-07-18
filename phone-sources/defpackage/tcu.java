package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcu extends tco {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public tcu(tcn tcnVar, int i) {
        super(tcnVar);
        this.b = R.drawable.design_password_eye;
        this.c = new tbx(this, 3);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.tco
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.tco
    public final int b() {
        return this.b;
    }

    @Override // defpackage.tco
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.tco
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.tco
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.tco
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.tco
    public final boolean s() {
        return true;
    }

    @Override // defpackage.tco
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.tco
    public final void y() {
        x();
    }
}
