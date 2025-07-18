package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.bjh;
import defpackage.bjo;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    protected final void U(View view) {
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

    protected final void V(bjh bjhVar) {
        U(bjhVar.z(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (M(Boolean.valueOf(z))) {
            k(z);
        }
    }

    @Override // androidx.preference.Preference
    protected final Parcelable cu() {
        Parcelable parcelableCu = super.cu();
        if (this.w) {
            return parcelableCu;
        }
        SavedState savedState = new SavedState(parcelableCu);
        savedState.a = this.a;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final Object cv(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        k(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(N(((Boolean) obj).booleanValue()));
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
            if (Q() && z != N(!z)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putBoolean(this.s, z);
                super.K(editorB);
            }
            if (z2) {
                w(j());
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

    public final void n(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bjo();
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
