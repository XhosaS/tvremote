package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tof extends bl {
    public Button a;
    public List b;
    public toe c;
    public int d = 0;
    public boolean e;
    private TextView f;

    public final void a() {
        this.e = true;
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof toe) {
            this.c = (toe) context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.remote_pairing_fragment, viewGroup);
        ImmutableList immutableListOf = ImmutableList.of(Integer.valueOf(R.id.pairing_pin1), Integer.valueOf(R.id.pairing_pin2), Integer.valueOf(R.id.pairing_pin3), Integer.valueOf(R.id.pairing_pin4), Integer.valueOf(R.id.pairing_pin5), Integer.valueOf(R.id.pairing_pin6));
        InputFilter[] inputFilterArr = {new InputFilter.AllCaps(), new InputFilter.LengthFilter(1)};
        this.b = new ArrayList();
        for (final int i = 0; i < immutableListOf.size(); i++) {
            EditText editText = (EditText) viewInflate.findViewById(((Integer) immutableListOf.get(i)).intValue());
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: tob
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        this.a.d = i;
                    }
                }
            });
            editText.addTextChangedListener(new tod(this, i));
            editText.setOnKeyListener(new toc(this, i));
            editText.setFilters(inputFilterArr);
            this.b.add(editText);
        }
        boolean z = getArguments().getBoolean("incorrect_code", false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.pairing_error_text);
        this.f = textView;
        int i2 = 8;
        textView.setVisibility(true != z ? 8 : 0);
        viewInflate.findViewById(R.id.pairing_cancel).setOnClickListener(new tbx(this, i2));
        Button button = (Button) viewInflate.findViewById(R.id.pairing_ok);
        this.a = button;
        button.setOnClickListener(new tbx(this, 9));
        return viewInflate;
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        if (!this.e) {
            this.c.d();
        }
        a();
    }

    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        this.e = false;
        EditText editText = (EditText) this.b.get(this.d);
        editText.requestFocus();
        editText.selectAll();
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onStart() {
        super.onStart();
        Window window = requireActivity().getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(new Rect());
        requireDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        requireDialog().getWindow().setSoftInputMode(5);
    }
}
