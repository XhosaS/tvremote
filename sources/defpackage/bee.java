package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.ExtractedText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bee(ali aliVar, int i, CompletionInfo[] completionInfoArr, int i2) {
        this.d = i2;
        this.c = aliVar;
        this.a = i;
        this.b = completionInfoArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i = this.d;
        if (i == 0) {
            Layout layout = ((TextView) ((bs) this.b).findViewById(R.id.license_activity_textview)).getLayout();
            if (layout != null) {
                ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                return;
            }
            return;
        }
        if (i == 1) {
            gi.f((TextView) this.b, (Typeface) this.c, this.a);
            return;
        }
        if (i == 2) {
            ((BottomSheetBehavior) this.b).ab((View) this.c, this.a, false);
            return;
        }
        if (i == 3) {
            ((boq) ((ali) this.c).a).d.e(this.a, (CompletionInfo[]) this.b);
            return;
        }
        if (i == 4) {
            ((boq) ((ali) this.b).a).d.g(this.a, (ExtractedText) this.c);
            return;
        }
        cir cirVar = (cir) this.b;
        cja[] cjaVarArr = cirVar.d;
        int i2 = this.a;
        cja cjaVar = cjaVarArr[i2];
        cjaVar.getClass();
        cjaVarArr[i2] = null;
        int i3 = cirVar.e;
        while (true) {
            Object obj = this.c;
            int i4 = ((cax) obj).c;
            if (i3 >= i4) {
                cirVar.e = i4;
                return;
            }
            int i5 = i3 + 1;
            if (((cgx) ((bzs) obj).get(i3)).e(cjaVar)) {
                cirVar.a();
                cirVar.e = i5;
                return;
            }
            i3 = i5;
        }
    }

    public bee(TextView textView, Typeface typeface, int i, int i2) {
        this.d = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }

    public /* synthetic */ bee(cir cirVar, bzs bzsVar, int i, int i2) {
        this.d = i2;
        this.b = cirVar;
        this.c = bzsVar;
        this.a = i;
    }

    public bee(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    public /* synthetic */ bee(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }
}
