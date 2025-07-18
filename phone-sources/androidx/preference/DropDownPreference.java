package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.videos.R;
import defpackage.gco;
import defpackage.gdw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context G;
    private final ArrayAdapter H;
    private Spinner I;
    private final AdapterView.OnItemSelectedListener J;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.J = new gco(this);
        this.G = context;
        this.H = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        R();
    }

    private final void R() {
        ArrayAdapter arrayAdapter = this.H;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        Spinner spinner = (Spinner) gdwVar.itemView.findViewById(R.id.spinner);
        this.I = spinner;
        spinner.setAdapter((SpinnerAdapter) this.H);
        this.I.setOnItemSelectedListener(this.J);
        Spinner spinner2 = this.I;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i);
        super.a(gdwVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.I.performClick();
    }

    @Override // androidx.preference.Preference
    protected final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.H;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(CharSequence[] charSequenceArr) {
        ((ListPreference) this).g = charSequenceArr;
        R();
    }

    @Override // androidx.preference.ListPreference
    public final void f(int i) {
        o(((ListPreference) this).h[i].toString());
    }
}
