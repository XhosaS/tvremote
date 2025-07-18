package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaRoute2Info;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tj {
    public tj() {
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static pl b(View view, pl plVar) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(plVar);
            Log.d("ReceiveContent", "onReceive: ".concat(plVar.toString()));
        }
        pj pjVar = plVar.a;
        if (pjVar.b() == 2) {
            return plVar;
        }
        ClipData clipDataC = pjVar.c();
        int iA = pjVar.a();
        Editable text = ((fn) view).getText();
        Context context = ((TextView) view).getContext();
        boolean z = false;
        for (int i = 0; i < clipDataC.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataC.getItemAt(i);
            if ((iA & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    text.insert(Selection.getSelectionEnd(text), "\n");
                    text.insert(Selection.getSelectionEnd(text), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(text);
                    int selectionEnd = Selection.getSelectionEnd(text);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(text, iMax2);
                    text.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                }
                z = true;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zf c(android.media.MediaRoute2Info r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj.c(android.media.MediaRoute2Info):zf");
    }

    public static List d(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM50m = pd$$ExternalSyntheticApiModelOutline3.m50m(it.next());
            if (mediaRoute2InfoM50m != null) {
                arrayList.add(mediaRoute2InfoM50m.getId());
            }
        }
        return arrayList;
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }

    public static void h(cja cjaVar) {
        cjaVar.m(new ama(cjaVar, 15, null), chz.a);
    }

    public static /* synthetic */ boolean i(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public void e(String str, Bundle bundle) {
        throw null;
    }

    public void f(Bundle bundle) {
        throw null;
    }

    public tj(byte[] bArr) {
    }
}
