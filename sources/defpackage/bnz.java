package defpackage;

import android.os.Build;
import android.view.inputmethod.ExtractedText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnz {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/ImeProtoHelper");

    static bvj a(int i, ExtractedText extractedText) {
        clo cloVarO = bvj.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvj bvjVar = (bvj) cloVarO.b;
        bvjVar.b |= 1;
        bvjVar.c = i;
        if (extractedText.startOffset != 0) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/ImeProtoHelper", "convertExtractedText", 88, "ImeProtoHelper.java")).r("Extracted text doesn't start at position 0 but at %d", extractedText.startOffset);
        }
        if (extractedText.partialStartOffset != -1) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/ImeProtoHelper", "convertExtractedText", 92, "ImeProtoHelper.java")).w("Extracted text is partial %d:%d", extractedText.partialStartOffset, extractedText.partialEndOffset);
        }
        int i2 = extractedText.selectionStart;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvj bvjVar2 = (bvj) cloVarO.b;
        bvjVar2.b |= 4;
        bvjVar2.e = i2;
        int i3 = extractedText.selectionEnd;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bvj bvjVar3 = (bvj) cloVarO.b;
        bvjVar3.b |= 8;
        bvjVar3.f = i3;
        if (Build.VERSION.SDK_INT >= 28 && extractedText.hint != null) {
            String string = extractedText.hint.toString();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bvj bvjVar4 = (bvj) cloVarO.b;
            string.getClass();
            bvjVar4.b |= 32;
            bvjVar4.h = string;
        }
        if (extractedText.flags != 0) {
            int i4 = extractedText.flags;
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bvj bvjVar5 = (bvj) cloVarO.b;
            bvjVar5.b |= 16;
            bvjVar5.g = i4;
        }
        if (extractedText.text != null) {
            String string2 = extractedText.text.toString();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bvj bvjVar6 = (bvj) cloVarO.b;
            string2.getClass();
            bvjVar6.b |= 2;
            bvjVar6.d = string2;
        }
        return (bvj) cloVarO.i();
    }
}
