package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.support.v7.widget.RecyclerView;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import com.google.android.tv.remote.virtual.ui.textedit.RemoteTextEdit;
import java.util.ArrayDeque;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlt implements tma {
    final /* synthetic */ tlu a;

    public tlt(tlu tluVar) {
        this.a = tluVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.tma
    public final void a(tnq tnqVar) {
        ExtractedText extractedTextD;
        int i = tnqVar.b;
        int iG = sis.g(i);
        CompletionInfo[] completionInfoArr = null;
        if (iG == 0) {
            throw null;
        }
        int i2 = iG - 1;
        int i3 = 0;
        if (i2 == 5) {
            tlu tluVar = this.a;
            tni tniVar = i == 20 ? (tni) tnqVar.c : tni.a;
            tnc tncVar = tniVar.c;
            if (tncVar == null) {
                tncVar = tnc.a;
            }
            int i4 = tncVar.c;
            tnc tncVar2 = tniVar.c;
            if (tncVar2 == null) {
                tncVar2 = tnc.a;
            }
            EditorInfo editorInfo = new EditorInfo();
            editorInfo.inputType = tncVar2.d;
            editorInfo.imeOptions = tncVar2.e;
            if ((8 & tncVar2.b) != 0) {
                editorInfo.privateImeOptions = tncVar2.f;
            }
            if ((tncVar2.b & 16) != 0) {
                editorInfo.actionLabel = tncVar2.g;
            }
            editorInfo.actionId = tncVar2.h;
            editorInfo.initialSelStart = tncVar2.i;
            editorInfo.initialSelEnd = tncVar2.j;
            editorInfo.initialCapsMode = tncVar2.k;
            if ((tncVar2.b & 512) != 0) {
                editorInfo.hintText = tncVar2.l;
            }
            if ((tncVar2.b & 1024) != 0) {
                editorInfo.label = tncVar2.m;
            }
            if ((tncVar2.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                editorInfo.packageName = tncVar2.n;
            }
            editorInfo.fieldId = tncVar2.o;
            if ((tncVar2.b & 8192) != 0) {
                editorInfo.fieldName = tncVar2.p;
            }
            if (tncVar2.q.size() != 0) {
                Locale[] localeArr = new Locale[tncVar2.q.size()];
                for (int i5 = 0; i5 < tncVar2.q.size(); i5++) {
                    tnb tnbVar = (tnb) tncVar2.q.get(i5);
                    localeArr[i5] = new Locale(tnbVar.b, tnbVar.c, tnbVar.d);
                }
                editorInfo.hintLocales = new LocaleList(localeArr);
            }
            if (Build.VERSION.SDK_INT >= 25 && tncVar2.r.size() != 0) {
                editorInfo.contentMimeTypes = new String[tncVar2.r.size()];
                while (i3 < tncVar2.r.size()) {
                    editorInfo.contentMimeTypes[i3] = (String) tncVar2.r.get(i3);
                    i3++;
                }
            }
            tnd tndVar = tniVar.d;
            if (tndVar == null) {
                tndVar = tnd.a;
            }
            int i6 = tndVar.c;
            int i7 = 2;
            if ((tniVar.b & 2) != 0) {
                tnd tndVar2 = tniVar.d;
                if (tndVar2 == null) {
                    tndVar2 = tnd.a;
                }
                extractedTextD = tlu.d(tndVar2);
            } else {
                extractedTextD = null;
            }
            tol tolVar = (tol) tluVar.b.a;
            tolVar.a = i4;
            tolVar.b = editorInfo;
            tolVar.c = i6;
            tolVar.d = extractedTextD;
            zft zftVar = tolVar.f;
            if (zftVar != null) {
                zftVar.g(i4, editorInfo, i6, extractedTextD);
            }
            if (editorInfo.inputType != 0) {
                i7 = 3;
            } else if (tom.a.contains(editorInfo.packageName)) {
                i7 = 1;
            }
            iwu iwuVar = tolVar.e;
            if (i7 == 1) {
                iwuVar.e.n(null);
                iwuVar.n();
                return;
            } else {
                iwuVar.e.n(new iwa(iwuVar.j, iwuVar.r, i7));
                iwuVar.n();
                return;
            }
        }
        if (i2 == 6) {
            tnh tnhVar = i == 21 ? (tnh) tnqVar.c : tnh.a;
            boolean z = tnhVar.c;
            int i8 = tnhVar.d;
            return;
        }
        if (i2 == 7) {
            tlu tluVar2 = this.a;
            tne tneVar = i == 22 ? (tne) tnqVar.c : tne.a;
            zft zftVar2 = tluVar2.b;
            boolean z2 = tneVar.b;
            tnd tndVar3 = tneVar.c;
            if (tndVar3 == null) {
                tndVar3 = tnd.a;
            }
            int i9 = tndVar3.c;
            tnd tndVar4 = tneVar.c;
            if (tndVar4 == null) {
                tndVar4 = tnd.a;
            }
            Object obj = zftVar2.a;
            ExtractedText extractedTextD2 = tlu.d(tndVar4);
            tol tolVar2 = (tol) obj;
            tolVar2.c = i9;
            tolVar2.d = extractedTextD2;
            zft zftVar3 = tolVar2.f;
            if (zftVar3 != null) {
                RemoteTextEdit remoteTextEdit = ((tok) zftVar3.a).a;
                if (extractedTextD2.text != null) {
                    remoteTextEdit.c = i9;
                    if (remoteTextEdit.g.e(extractedTextD2.selectionStart, extractedTextD2.selectionEnd, extractedTextD2.text)) {
                        return;
                    }
                    remoteTextEdit.d = false;
                    remoteTextEdit.beginBatchEdit();
                    remoteTextEdit.setText(extractedTextD2.text);
                    remoteTextEdit.e = extractedTextD2.selectionStart;
                    int i10 = extractedTextD2.selectionEnd;
                    remoteTextEdit.f = i10;
                    remoteTextEdit.setSelection(remoteTextEdit.e, i10);
                    remoteTextEdit.endBatchEdit();
                    remoteTextEdit.d = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 8) {
            if (i2 != 10) {
                return;
            }
            tlu tluVar3 = this.a;
            tna tnaVar = i == 29 ? (tna) tnqVar.c : tna.a;
            if (tnaVar.b != 0) {
                completionInfoArr = new CompletionInfo[tnaVar.c.size()];
                while (i3 < tnaVar.c.size()) {
                    tmz tmzVar = (tmz) tnaVar.c.get(i3);
                    completionInfoArr[i3] = new CompletionInfo(tmzVar.b, tmzVar.c, tmzVar.d, tmzVar.e);
                    i3++;
                }
            }
            zft zftVar4 = tluVar3.b;
            int i11 = tnaVar.b;
            zft zftVar5 = ((tol) zftVar4.a).f;
            if (zftVar5 != null) {
                RemoteTextEdit remoteTextEdit2 = ((tok) zftVar5.a).a;
                ((InputMethodManager) remoteTextEdit2.getContext().getSystemService(InputMethodManager.class)).displayCompletions(remoteTextEdit2, completionInfoArr);
                return;
            }
            return;
        }
        tlu tluVar4 = this.a;
        tng tngVar = i == 23 ? (tng) tnqVar.c : tng.a;
        zft zftVar6 = tluVar4.b;
        int i12 = tngVar.c;
        int i13 = tngVar.d;
        tol tolVar3 = (tol) zftVar6.a;
        ExtractedText extractedText = tolVar3.d;
        if (extractedText != null) {
            extractedText.selectionStart = i12;
            tolVar3.d.selectionEnd = i13;
            zft zftVar7 = tolVar3.f;
            if (zftVar7 != null) {
                RemoteTextEdit remoteTextEdit3 = ((tok) zftVar7.a).a;
                xqr xqrVar = remoteTextEdit3.g;
                ArrayDeque arrayDeque = (ArrayDeque) xqrVar.b;
                if (arrayDeque.isEmpty() || !xqrVar.e(i12, i13, ((zfd) arrayDeque.peek()).c)) {
                    remoteTextEdit3.d = false;
                    int length = remoteTextEdit3.getText().length();
                    if (i12 <= length && i13 <= length) {
                        remoteTextEdit3.setSelection(i12, i13);
                    }
                    remoteTextEdit3.d = true;
                }
            }
        }
    }

    @Override // defpackage.tma
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.tma
    public final /* synthetic */ void c(int i) {
    }
}
