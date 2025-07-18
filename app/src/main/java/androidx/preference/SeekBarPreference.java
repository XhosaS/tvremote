package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.katniss.R;
import defpackage.bjh;
import defpackage.bji;
import defpackage.bjj;
import defpackage.bjk;
import defpackage.bjl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private final boolean E;
    private final SeekBar.OnSeekBarChangeListener F;
    private final View.OnKeyListener G;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.F = new bjj(this);
        this.G = new bjk(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bji.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.E = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void n(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (Q() && i != o(~i)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putInt(this.s, i);
                super.K(editorB);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(bjh bjhVar) {
        super.a(bjhVar);
        bjhVar.a.setOnKeyListener(this.G);
        this.d = (SeekBar) bjhVar.z(R.id.seekbar);
        TextView textView = (TextView) bjhVar.z(R.id.seekbar_value);
        this.i = textView;
        if (this.E) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.F);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(P());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable cu() {
        Parcelable parcelableCu = super.cu();
        if (this.w) {
            return parcelableCu;
        }
        SavedState savedState = new SavedState(parcelableCu);
        savedState.a = this.a;
        savedState.b = this.b;
        savedState.c = this.g;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final Object cv(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        this.a = savedState.a;
        this.b = savedState.b;
        this.g = savedState.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        n(o(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (M(Integer.valueOf(progress))) {
                n(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                l(this.a);
            }
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* compiled from: PG */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bjl();
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
