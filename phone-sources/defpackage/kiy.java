package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiy {
    public final Context a;
    public final View b;
    public final yjk c;
    private final int d = 0;
    private final View.OnClickListener e = null;

    public /* synthetic */ kiy(Context context, View view, yjk yjkVar) {
        this.a = context;
        this.b = view;
        this.c = yjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiy)) {
            return false;
        }
        kiy kiyVar = (kiy) obj;
        if (!yks.e(this.a, kiyVar.a) || !yks.e(this.b, kiyVar.b)) {
            return false;
        }
        int i = kiyVar.d;
        if (!yks.e(this.c, kiyVar.c)) {
            return false;
        }
        View.OnClickListener onClickListener = kiyVar.e;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "SnackbarProperties(context=" + this.a + ", view=" + this.b + ", length=0, yTranslation=" + this.c + ", dismissListener=null)";
    }
}
