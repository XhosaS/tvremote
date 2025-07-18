package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utu {
    public static final /* synthetic */ int a = 0;
    private static final String b = new String(new char[64]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "a ");
    private static final int c = View.MeasureSpec.makeMeasureSpec(64, 1073741824);
    private static final SparseArray d = new SparseArray(4);
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final int i;
    private final utt[] j;
    private final SparseIntArray k = new SparseIntArray(4);

    private utu(Context context, int i) {
        utr utrVar = new utr(context);
        LayoutInflater.from(context).inflate(i, (ViewGroup) utrVar, true);
        Configuration configuration = context.getResources().getConfiguration();
        this.e = configuration.densityDpi;
        this.f = configuration.screenWidthDp;
        this.g = configuration.screenHeightDp;
        this.h = configuration.fontScale;
        this.i = Build.VERSION.SDK_INT >= 31 ? configuration.fontWeightAdjustment : 0;
        this.j = new utt[utrVar.getChildCount()];
        for (int i2 = 0; i2 < this.j.length; i2++) {
            TextView textView = (TextView) utrVar.getChildAt(i2);
            textView.setText(b);
            utrVar.measureChild(textView, c, 0);
            textView.onPreDraw();
            this.j[i2] = new utt(textView);
        }
    }

    public static utu c(Context context) {
        Context baseContext = context;
        while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof ve) && !(baseContext instanceof Activity)) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        boolean z = baseContext instanceof ve;
        int i = R.layout.card_text_area;
        if (!z) {
            return new utu(context, R.layout.card_text_area);
        }
        ve veVar = (ve) baseContext;
        int i2 = veVar.a;
        SparseArray sparseArray = d;
        utu utuVar = (utu) sparseArray.get(i2);
        if (utuVar != null) {
            Configuration configuration = veVar.a().getConfiguration();
            if (utuVar.e != configuration.densityDpi || utuVar.f != configuration.screenWidthDp || utuVar.g != configuration.screenHeightDp || utuVar.h != configuration.fontScale || (Build.VERSION.SDK_INT >= 31 && utuVar.i != configuration.fontWeightAdjustment)) {
                sparseArray.remove(i2);
                utuVar = null;
            }
        }
        if (utuVar != null) {
            return utuVar;
        }
        TypedValue typedValue = new TypedValue();
        veVar.getTheme().resolveAttribute(R.attr.cardTextAreaLayoutRes, typedValue, true);
        int i3 = typedValue.resourceId;
        if (i3 != 0) {
            i = i3;
        }
        utu utuVar2 = new utu(veVar, i);
        sparseArray.put(i2, utuVar2);
        return utuVar2;
    }

    public final int a(int i) {
        SparseIntArray sparseIntArray = this.k;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int i3 = b(i).a.n;
        sparseIntArray.put(i, i3);
        return i3;
    }

    public final uts b(int i) {
        int i2 = 0;
        while (true) {
            utt[] uttVarArr = this.j;
            if (i2 >= uttVarArr.length) {
                throw new Resources.NotFoundException();
            }
            utt uttVar = uttVarArr[i2];
            if (uttVar.q == i) {
                return new uts(uttVar);
            }
            i2++;
        }
    }
}
