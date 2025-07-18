package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy extends FrameLayout implements bgr {
    public final WebView a;
    private final bgh b;
    private List c;
    private bgi d;
    private float e;
    private float f;

    public bgy(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = bgi.a;
        this.e = 0.0533f;
        this.f = 0.08f;
        bgh bghVar = new bgh(context);
        this.b = bghVar;
        bgx bgxVar = new bgx(context);
        this.a = bgxVar;
        bgxVar.setBackgroundColor(0);
        addView(bghVar);
        addView(bgxVar);
    }

    private static int b(int i) {
        return 0;
    }

    private final String c(int i, float f) {
        getHeight();
        float fC = bgu.c(i, f, (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fC == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fC / getContext().getResources().getDisplayMetrics().density)};
        int i2 = bgf.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b8, code lost:
    
        if (((android.text.style.TypefaceSpan) r3).getFamily() != null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgy.d():void");
    }

    @Override // defpackage.bgr
    public final void a(List list, bgi bgiVar, float f, float f2) {
        this.d = bgiVar;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            bfz bfzVar = (bfz) list.get(i);
            Bitmap bitmap = bfzVar.d;
            arrayList2.add(bfzVar);
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            d();
        }
        this.b.a(arrayList, bgiVar, f, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        d();
    }
}
