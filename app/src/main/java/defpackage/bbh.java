package defpackage;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbh implements Runnable {
    final /* synthetic */ DatePicker a;

    public bbh(DatePicker datePicker) {
        this.a = datePicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DatePicker datePicker = this.a;
        int[] iArr = {datePicker.c, datePicker.b, datePicker.d};
        boolean z = true;
        boolean z2 = true;
        for (int i = 2; i >= 0; i--) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                int i3 = DatePicker.a[i];
                bbm bbmVarG = datePicker.g(i2);
                boolean zD = (z ? DatePicker.d(bbmVarG, datePicker.e.get(i3)) : DatePicker.d(bbmVarG, datePicker.g.getActualMinimum(i3))) | (z2 ? DatePicker.c(bbmVarG, datePicker.f.get(i3)) : DatePicker.c(bbmVarG, datePicker.g.getActualMaximum(i3)));
                z &= datePicker.g.get(i3) == datePicker.e.get(i3);
                boolean z3 = datePicker.g.get(i3) == datePicker.f.get(i3);
                if (zD) {
                    datePicker.h(iArr[i], bbmVarG);
                }
                z2 &= z3;
                int i4 = iArr[i];
                int i5 = datePicker.g.get(i3);
                bbm bbmVar = (bbm) datePicker.k.get(i4);
                if (bbmVar.a != i5) {
                    bbmVar.a = i5;
                    VerticalGridView verticalGridView = (VerticalGridView) datePicker.j.get(i4);
                    if (verticalGridView != null) {
                        verticalGridView.setSelectedPosition(i5 - ((bbm) datePicker.k.get(i4)).b);
                    }
                }
            }
        }
    }
}
