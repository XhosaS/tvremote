package defpackage;

import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxk {
    public cxn b;
    private final Uri c;
    private int e;
    public final ArrayList a = new ArrayList();
    private final ArrayList d = new ArrayList();

    public cxk(Uri uri) {
        this.c = uri;
    }

    public final cxl a() {
        ArrayList arrayList = this.d;
        return new cxl(this.a, (String[]) arrayList.toArray(new String[arrayList.size()]), this.c, this.b);
    }

    public final void b(String... strArr) {
        this.d.addAll(Arrays.asList(strArr));
    }

    public final void c(cxl cxlVar, String str) {
        cxlVar.getClass();
        this.a.add(new cxm(cxlVar, "slice", str, cxlVar.d));
    }

    public final void d(IconCompat iconCompat, List list) {
        iconCompat.getClass();
        cxl.d(iconCompat);
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        cxl.d(iconCompat);
        this.a.add(new cxm(iconCompat, "image", null, strArr));
    }

    public final void e(CharSequence charSequence, String... strArr) {
        this.a.add(new cxm(charSequence, "text", null, strArr));
    }

    public cxk(cxk cxkVar) {
        Uri.Builder builderAppendPath = cxkVar.c.buildUpon().appendPath("_gen");
        int i = cxkVar.e;
        cxkVar.e = i + 1;
        this.c = builderAppendPath.appendPath(String.valueOf(i)).build();
    }
}
