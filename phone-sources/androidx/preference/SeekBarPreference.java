package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.gdw;
import defpackage.gdx;
import defpackage.gdy;
import defpackage.gdz;
import defpackage.toh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private final boolean G;
    private final SeekBar.OnSeekBarChangeListener H;
    private final View.OnKeyListener I;
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
        this.H = new gdy(this);
        this.I = new toh(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gdx.k, R.attr.seekBarPreferenceStyle, 0);
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
        this.G = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
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
            if (M() && i != p(~i)) {
                SharedPreferences.Editor editorB = this.k.b();
                editorB.putInt(this.t, i);
                super.H(editorB);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        super.a(gdwVar);
        gdwVar.itemView.setOnKeyListener(this.I);
        this.d = (SeekBar) gdwVar.a(R.id.seekbar);
        TextView textView = (TextView) gdwVar.a(R.id.seekbar_value);
        this.i = textView;
        if (this.G) {
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
        seekBar.setOnSeekBarChangeListener(this.H);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(L());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable dE() {
        Parcelable parcelableDE = super.dE();
        if (this.x) {
            return parcelableDE;
        }
        gdz gdzVar = new gdz(parcelableDE);
        gdzVar.a = this.a;
        gdzVar.b = this.b;
        gdzVar.c = this.g;
        return gdzVar;
    }

    @Override // androidx.preference.Preference
    protected final Object dF(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(gdz.class)) {
            super.g(parcelable);
            return;
        }
        gdz gdzVar = (gdz) parcelable;
        super.g(gdzVar.getSuperState());
        this.a = gdzVar.a;
        this.b = gdzVar.b;
        this.g = gdzVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(p(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            Q(Integer.valueOf(progress));
            o(progress, false);
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
