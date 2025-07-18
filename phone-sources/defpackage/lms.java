package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lms implements efu {
    private final lmq a;
    private final SparseArray b;

    public lms(lmq lmqVar, SparseArray sparseArray) {
        this.a = lmqVar;
        this.b = sparseArray;
    }

    @Override // defpackage.efu
    public final eey b(eey eeyVar) throws NumberFormatException, IOException {
        lvd lvdVar;
        String strSubstring;
        int iLastIndexOf;
        String str = eeyVar.h;
        if (TextUtils.isEmpty(str)) {
            lvdVar = null;
        } else {
            int iLastIndexOf2 = str.lastIndexOf(".");
            int i = -1;
            if (iLastIndexOf2 != -1 && (iLastIndexOf = (strSubstring = str.substring(0, iLastIndexOf2)).lastIndexOf(".")) != -1) {
                try {
                    i = Integer.parseInt(strSubstring.substring(iLastIndexOf + 1));
                } catch (NumberFormatException unused) {
                }
            }
            lvdVar = (lvd) this.b.get(i);
        }
        if (lvdVar != null) {
            return eeyVar.c(this.a.a(lvdVar).a);
        }
        throw new IOException("Could not get stream to match from dataSpec cache key ".concat(String.valueOf(eeyVar.h)));
    }

    @Override // defpackage.efu
    public final /* synthetic */ Uri a(Uri uri) {
        return uri;
    }
}
