package defpackage;

import android.text.Html;
import android.util.SparseArray;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgp {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("(&#13;)?&#10;");

    public static bgo a(SparseArray sparseArray, int i) {
        bgo bgoVar = (bgo) sparseArray.get(i);
        if (bgoVar != null) {
            return bgoVar;
        }
        bgo bgoVar2 = new bgo();
        sparseArray.put(i, bgoVar2);
        return bgoVar2;
    }

    public static String b(CharSequence charSequence) {
        return b.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
