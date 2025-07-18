package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.widget.SeekBar;
import com.google.android.videos.R;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tak extends dao {
    final Rect e;
    private final tam f;

    public tak(tam tamVar) {
        super(tamVar);
        this.e = new Rect();
        this.f = tamVar;
    }

    @Override // defpackage.dao
    protected final int a(float f, float f2) {
        int i = 0;
        while (true) {
            tam tamVar = this.f;
            if (i >= tamVar.c().size()) {
                return -1;
            }
            Rect rect = this.e;
            tamVar.j(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.dao
    protected final void c(List list) {
        for (int i = 0; i < this.f.c().size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.dao
    protected final void h(int i, cyq cyqVar) {
        cyqVar.j(cyp.l);
        tam tamVar = this.f;
        List listC = tamVar.c();
        Float f = (Float) listC.get(i);
        float fFloatValue = f.floatValue();
        float fFloatValue2 = tamVar.f;
        float fFloatValue3 = tamVar.g;
        if (tamVar.isEnabled()) {
            if (fFloatValue > fFloatValue2) {
                cyqVar.i(8192);
            }
            if (fFloatValue < fFloatValue3) {
                cyqVar.i(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            fFloatValue2 = numberInstance.parse(numberInstance.format(fFloatValue2)).floatValue();
            fFloatValue3 = numberInstance.parse(numberInstance.format(fFloatValue3)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            Log.w(tam.a, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f, Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3)));
        }
        cyqVar.ak(cvw.k(fFloatValue2, fFloatValue3, fFloatValue));
        cyqVar.t(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        tam tamVar2 = this.f;
        if (tamVar2.getContentDescription() != null) {
            sb.append(tamVar2.getContentDescription());
            sb.append(",");
        }
        String strB = tamVar2.b(fFloatValue);
        String string = tamVar2.getContext().getString(R.string.material_slider_value);
        if (listC.size() > 1) {
            string = i == tamVar2.c().size() + (-1) ? tamVar2.getContext().getString(R.string.material_slider_range_end) : i == 0 ? tamVar2.getContext().getString(R.string.material_slider_range_start) : "";
        }
        CharSequence charSequenceH = cww.h(tamVar2);
        if (TextUtils.isEmpty(charSequenceH)) {
            sb.append(String.format(Locale.getDefault(), "%s, %s", string, strB));
        } else {
            cyqVar.S(charSequenceH);
        }
        cyqVar.x(sb.toString());
        Rect rect = this.e;
        tamVar2.j(i, rect);
        cyqVar.p(rect);
    }

    @Override // defpackage.dao
    protected final boolean o(int i, int i2, Bundle bundle) {
        tam tamVar = this.f;
        if (!tamVar.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !tamVar.o(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            tamVar.k();
            tamVar.postInvalidate();
            d(i);
            return true;
        }
        float fP = tamVar.p();
        if (i2 == 8192) {
            fP = -fP;
        }
        if (tamVar.m()) {
            fP = -fP;
        }
        if (!tamVar.o(i, cmq.k(((Float) tamVar.c().get(i)).floatValue() + fP, tamVar.f, tamVar.g))) {
            return false;
        }
        tamVar.h = i;
        Runnable runnable = tamVar.k;
        tamVar.removeCallbacks(runnable);
        tamVar.postDelayed(runnable, tamVar.j);
        tamVar.k();
        tamVar.postInvalidate();
        d(i);
        return true;
    }
}
