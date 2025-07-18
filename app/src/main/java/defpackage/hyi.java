package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyi implements TextWatcher {
    public final String a;
    public final Context b;
    public final fyq c;
    public final InputMethodManager d;
    public final EditText e;
    public final boolean f;
    public afhq g;
    public hxt h;
    private final boolean i;
    private final agpc j;
    private final agpc k;
    private final zyg l;

    public hyi(String str, Context context, fyq fyqVar, boolean z, InputMethodManager inputMethodManager, EditText editText, boolean z2) {
        fyqVar.getClass();
        inputMethodManager.getClass();
        editText.getClass();
        this.a = str;
        this.b = context;
        this.c = fyqVar;
        this.i = z;
        this.d = inputMethodManager;
        this.e = editText;
        this.f = z2;
        this.j = new agpn(new agum() { // from class: hyf
            @Override // defpackage.agum
            public final Object a() {
                hyi hyiVar = this.a;
                afhq afhqVarA = hyiVar.c.a(hyiVar.b, "assistanttvautocomplete-pa.googleapis.com", hyiVar.a, "AIzaSyCnLQdwaGvxOj98ZuMxNmCI2kKYDx9QAGM", null);
                hyiVar.g = afhqVarA;
                return (cya) agec.b(new cxz(), afhqVarA, afem.a);
            }
        });
        this.k = new agpn(new agum() { // from class: hyg
            @Override // defpackage.agum
            public final Object a() {
                return new hyh(this.a);
            }
        });
        this.l = new zwl();
    }

    public final void a() throws InterruptedException {
        try {
            zyg zygVar = this.l;
            if (zygVar != null) {
                zygVar.shutdown();
                zygVar.awaitTermination(1L, TimeUnit.SECONDS);
            }
            afhq afhqVar = this.g;
            if (afhqVar != null) {
                afhqVar.f();
                afhqVar.e(1L, TimeUnit.SECONDS);
            }
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        hxt hxtVar = this.h;
        if (charSequence.length() == 0) {
            if (!this.f || hxtVar == null) {
                return;
            }
            hxtVar.af(new SuggestionChipList("", agrd.a, 157862));
            return;
        }
        if (this.f && this.i && hxtVar != null) {
            hxtVar.af(new SuggestionChipList("", agrd.a, 157862));
            return;
        }
        Locale locale = this.b.getResources().getConfiguration().getLocales().get(0);
        Object objA = this.j.a();
        objA.getClass();
        cya cyaVar = (cya) objA;
        cxw cxwVar = cxw.a;
        cxv cxvVar = new cxv();
        String string = charSequence.toString();
        if ((cxvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            cxvVar.y();
        }
        cxw cxwVar2 = (cxw) cxvVar.b;
        cxwVar2.b |= 1;
        cxwVar2.c = string;
        cxu cxuVar = cxu.a;
        cxt cxtVar = new cxt();
        xdl xdlVar = xdl.a;
        xdc xdcVar = new xdc(new xdi());
        String language = locale.getLanguage();
        language.getClass();
        xdi xdiVar = xdcVar.a;
        if ((xdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xdiVar.y();
        }
        xdl xdlVar2 = (xdl) xdiVar.b;
        xdlVar2.b |= 1;
        xdlVar2.e = language;
        String country = locale.getCountry();
        country.getClass();
        if ((xdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xdiVar.y();
        }
        xdl xdlVar3 = (xdl) xdiVar.b;
        xdlVar3.b |= 2;
        xdlVar3.f = country;
        xdl xdlVarA = xdcVar.a();
        if ((cxtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            cxtVar.y();
        }
        cxu cxuVar2 = (cxu) cxtVar.b;
        cxuVar2.c = xdlVarA;
        cxuVar2.b |= 2;
        abxd abxdVarV = cxtVar.v();
        abxdVarV.getClass();
        cxu cxuVar3 = (cxu) abxdVarV;
        if ((cxvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            cxvVar.y();
        }
        cxw cxwVar3 = (cxw) cxvVar.b;
        cxwVar3.d = cxuVar3;
        cxwVar3.b |= 2;
        abxd abxdVarV2 = cxvVar.v();
        abxdVarV2.getClass();
        afen afenVar = cyaVar.a;
        cxw cxwVar4 = (cxw) abxdVarV2;
        afil afilVarA = cyb.a;
        if (afilVarA == null) {
            synchronized (cyb.class) {
                afilVarA = cyb.a;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("assistant.tv.autocomplete.v1.AutocompleteService", "GetQueryAutocomplete");
                    afiiVarC.e = true;
                    cxw cxwVar5 = cxw.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(cxwVar5);
                    afiiVarC.b = new agdz(cxy.a);
                    afilVarA = afiiVarC.a();
                    cyb.a = afilVarA;
                }
            }
        }
        zxn.p(agen.a(afenVar.a(afilVarA, cyaVar.b), cxwVar4), (zxe) this.k.a(), this.l);
    }
}
