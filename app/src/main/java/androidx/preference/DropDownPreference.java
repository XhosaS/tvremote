package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.katniss.R;
import defpackage.bhs;
import defpackage.bjh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context E;
    private final ArrayAdapter F;
    private Spinner G;
    private final AdapterView.OnItemSelectedListener H;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.H = new bhs(this);
        this.E = context;
        this.F = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        U();
    }

    private final void U() {
        ArrayAdapter arrayAdapter = this.F;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(bjh bjhVar) {
        Spinner spinner = (Spinner) bjhVar.a.findViewById(R.id.spinner);
        this.G = spinner;
        spinner.setAdapter((SpinnerAdapter) this.F);
        this.G.setOnItemSelectedListener(this.H);
        Spinner spinner2 = this.G;
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
        super.a(bjhVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.G.performClick();
    }

    @Override // androidx.preference.Preference
    protected final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.F;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(CharSequence[] charSequenceArr) {
        ((ListPreference) this).g = charSequenceArr;
        U();
    }

    @Override // androidx.preference.ListPreference
    public final void f(int i) {
        n(((ListPreference) this).h[i].toString());
    }
}
