package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.widget.EditText;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.tv.remote.virtual.ui.textedit.RemoteTextEdit;
import com.google.android.tv.remote.virtual.ui.trackpad.TrackpadView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zft {
    public final /* synthetic */ Object a;

    public zft() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        name.getClass();
        return ylh.ac(name, ((String) this.a).concat("."));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ybv] */
    public final xva b() {
        return new xva(this.a);
    }

    public final void c(Object obj) {
        ((col) this.a).f(obj);
    }

    public final void d(Throwable th) {
        ((col) this.a).g(th);
    }

    public final void e(boolean z) {
        if (z) {
            return;
        }
        ((ums) ((uiz) this.a).f.a()).c();
    }

    public final void f(tow towVar, tlv tlvVar) {
        ((tug) ((tug) TrackpadView.a.e()).j("com/google/android/tv/remote/virtual/ui/trackpad/TrackpadView", "<init>", 73, "TrackpadView.java")).B("Sending action %s in direction %s", tlvVar, towVar);
        TrackpadView trackpadView = (TrackpadView) this.a;
        ivd ivdVar = ((iur) trackpadView.b).a;
        tlvVar.getClass();
        ivdVar.f(towVar.g, ivd.g(tlvVar));
        trackpadView.performHapticFeedback(3);
        if (towVar == tow.NONE) {
            int iOrdinal = tlvVar.ordinal();
            if (iOrdinal == 0) {
                trackpadView.d = true;
            } else if (iOrdinal == 1) {
                trackpadView.d = false;
            } else if (iOrdinal == 2) {
                trackpadView.c = true;
            }
            trackpadView.refreshDrawableState();
        }
    }

    public final void g(int i, EditorInfo editorInfo, int i2, ExtractedText extractedText) {
        boolean z = i != 0;
        Object obj = this.a;
        if (!z ? ((tok) obj).b.getVisibility() != 0 : ((tok) obj).a.getVisibility() != 0) {
            tok tokVar = (tok) obj;
            tokVar.a.setVisibility(true != z ? 8 : 0);
            tokVar.b.setVisibility(true != z ? 0 : 8);
            if (z) {
                tokVar.a.requestFocus();
                tokVar.e.showSoftInput(tokVar.a, 1);
            } else {
                tokVar.b.requestFocus();
                tokVar.c.requestFocus();
                tokVar.e.showSoftInput(tokVar.c, 2);
            }
        }
        RemoteTextEdit remoteTextEdit = ((tok) obj).a;
        if (remoteTextEdit.b == i && remoteTextEdit.c == i2) {
            return;
        }
        remoteTextEdit.b = i;
        remoteTextEdit.c = i2;
        remoteTextEdit.g = new xqr(editorInfo.inputType);
        remoteTextEdit.d = false;
        remoteTextEdit.beginBatchEdit();
        remoteTextEdit.setInputType(editorInfo.inputType);
        remoteTextEdit.setLines(1);
        remoteTextEdit.setMaxHeight(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        remoteTextEdit.setHorizontallyScrolling(false);
        remoteTextEdit.setImeOptions(editorInfo.imeOptions);
        remoteTextEdit.setPrivateImeOptions(editorInfo.privateImeOptions);
        remoteTextEdit.setImeActionLabel(editorInfo.actionLabel, editorInfo.actionId);
        if (editorInfo.hintLocales != null) {
            remoteTextEdit.setTextLocales(editorInfo.hintLocales);
        }
        if (editorInfo.hintText != null) {
            remoteTextEdit.setHint(editorInfo.hintText);
        } else if (xqr.d(editorInfo.inputType)) {
            remoteTextEdit.setHint(R.string.default_password_hint);
        } else {
            remoteTextEdit.setHint(R.string.default_input_hint);
        }
        if (extractedText != null) {
            String string = extractedText.text.toString();
            remoteTextEdit.g.c(extractedText.selectionStart, extractedText.selectionEnd, string);
            remoteTextEdit.setText(string);
            remoteTextEdit.e = extractedText.selectionStart;
            int i3 = extractedText.selectionEnd;
            remoteTextEdit.f = i3;
            remoteTextEdit.setSelection(remoteTextEdit.e, i3);
        } else {
            remoteTextEdit.setText("");
        }
        remoteTextEdit.endBatchEdit();
        remoteTextEdit.d = true;
    }

    public final void h(int i) {
        if (i == 1) {
            ((tkb) this.a).e(false);
        } else {
            ((tjk) this.a).c(new csl(this, i, 19));
        }
        ((tkb) this.a).f = null;
    }

    public final void i(Exception exc) {
        tlx tlxVar = (tlx) this.a;
        tlxVar.f = 5;
        pku.h(new tme(exc, null));
        tmc tmcVar = tmc.CONNECTION_FAILED;
        pku pkuVar = tlxVar.h;
        pkuVar.g(tmcVar);
        pkuVar.g(tmc.DISCONNECTED);
    }

    public final void j(TextInputLayout textInputLayout) {
        tcn tcnVar = (tcn) this.a;
        EditText editText = tcnVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(tcnVar.k);
            if (tcnVar.j.getOnFocusChangeListener() == tcnVar.c().d()) {
                tcnVar.j.setOnFocusChangeListener(null);
            }
        }
        tcnVar.j = textInputLayout.c;
        EditText editText2 = tcnVar.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(tcnVar.k);
        }
        tcnVar.c().g(tcnVar.j);
        tcnVar.n(tcnVar.c());
    }

    public final void k(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((taz) this.a).f(0);
    }

    public final sze l(sze szeVar) {
        return szeVar instanceof szn ? szeVar : new szc(-((szk) this.a).v(), szeVar);
    }

    public final void m(Drawable drawable) {
        if (drawable != null) {
            super/*svf*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean n() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void o(float f) {
        sym symVar = (sym) this.a;
        ColorStateList colorStateList = symVar.d;
        if (colorStateList != null) {
            symVar.g.N(ColorStateList.valueOf(sip.f(symVar.c, colorStateList.getDefaultColor(), f)));
        }
    }

    public final void p() {
        Object obj = this.a;
        synchronized (((smq) obj).h) {
            int i = ((smq) obj).k;
            sij.y(i > 0, "Refcount went negative!", i);
            ((smq) obj).k--;
            ((smq) obj).c();
        }
    }

    public final boolean q(String str, String str2) {
        ryp[] rypVarArrG = ((unx) this.a).g(str);
        if (rypVarArrG == null || rypVarArrG.length == 0) {
            return false;
        }
        if (!str2.equals("")) {
            return Arrays.binarySearch(rypVarArrG, str2) >= 0;
        }
        ryp rypVar = rypVarArrG[0];
        unx unxVar = ryp.h;
        return rypVar.c.equals("");
    }

    public final uhp r(ImmutableList immutableList) {
        return sfy.C(ImmutableList.copyOf((Collection) immutableList));
    }

    public /* synthetic */ zft(Object obj) {
        this.a = obj;
    }

    public zft(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
