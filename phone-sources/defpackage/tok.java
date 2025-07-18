package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.tv.remote.virtual.ui.textedit.RemoteTextEdit;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tok extends bv {
    public RemoteTextEdit a;
    public View b;
    public EditText c;
    public tlu d;
    public InputMethodManager e;
    private tol f;

    public final void a() {
        tlx tlxVar = this.d.a;
        vtw vtwVarM = tms.a.m();
        vtw vtwVarM2 = tnh.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        tnh tnhVar = (tnh) vucVar;
        tnhVar.b |= 1;
        tnhVar.c = false;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        tnh tnhVar2 = (tnh) vtwVarM2.b;
        tnhVar2.b |= 2;
        tnhVar2.d = 0;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tms tmsVar = (tms) vtwVarM.b;
        tnh tnhVar3 = (tnh) vtwVarM2.r();
        tnhVar3.getClass();
        tmsVar.c = tnhVar3;
        tmsVar.b = 22;
        tlxVar.a((tms) vtwVarM.r());
        getParentFragmentManager().ac();
    }

    public final void b(tlu tluVar, tol tolVar) {
        this.d = tluVar;
        this.f = tolVar;
    }

    @Override // defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.e = (InputMethodManager) getContext().getSystemService("input_method");
    }

    @Override // defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().b(this, new toi(this));
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.keyboard_fragment, viewGroup, false);
    }

    @Override // defpackage.bv
    public final void onDetach() {
        this.f.f = null;
        super.onDetach();
    }

    @Override // defpackage.bv
    public final void onStop() {
        this.e.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        super.onStop();
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        RemoteTextEdit remoteTextEdit = (RemoteTextEdit) view.findViewById(R.id.keyboard_edit_text);
        this.a = remoteTextEdit;
        remoteTextEdit.a = this.d;
        View viewFindViewById = view.findViewById(R.id.no_input_field_layout);
        this.b = viewFindViewById;
        viewFindViewById.setOnClickListener(new tbx(this, 10));
        EditText editText = (EditText) view.findViewById(R.id.no_input_edit);
        this.c = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: tog
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                this.a.a();
                return true;
            }
        });
        this.c.addTextChangedListener(new toj(this));
        this.c.setOnKeyListener(new toh(this, 0));
        tol tolVar = this.f;
        zft zftVar = new zft(this, null);
        tolVar.f = zftVar;
        int i = tolVar.a;
        if (i != -1) {
            zftVar.g(i, tolVar.b, tolVar.c, tolVar.d);
        }
    }
}
