package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.gdw;
import defpackage.gec;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected final void R(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence charSequenceM = m();
                if (TextUtils.isEmpty(charSequenceM)) {
                    i = 8;
                } else {
                    textView.setText(charSequenceM);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    protected final void S(gdw gdwVar) {
        R(gdwVar.a(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        Q(Boolean.valueOf(z));
        k(z);
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dE() {
        Parcelable parcelableDE = super.dE();
        if (this.x) {
            return parcelableDE;
        }
        gec gecVar = new gec(parcelableDE);
        gecVar.a = this.a;
        return gecVar;
    }

    @Override // androidx.preference.Preference
    protected final Object dF(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gec.class)) {
            super.g(parcelable);
            return;
        }
        gec gecVar = (gec) parcelable;
        super.g(gecVar.getSuperState());
        k(gecVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(J(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        return super.j();
    }

    public final void k(boolean z) {
        boolean z2 = this.a != z;
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            if (M() && z != J(!z)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putBoolean(this.t, z);
                super.H(editorB);
            }
            if (z2) {
                x(j());
                d();
            }
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
