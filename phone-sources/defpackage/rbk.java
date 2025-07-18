package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbk extends rbn {
    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vop) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ust ustVar = (ust) obj;
        vop vopVar = (vop) obj2;
        vopVar.getClass();
        int i = vopVar.b;
        int i2 = vopVar.a;
        int i3 = (i - i2) + 1;
        String strValueOf = i2 == 1 ? String.valueOf(i3) : a.cf(i3, "+");
        TextView textView = (TextView) ustVar.a;
        textView.setText(strValueOf);
        textView.setImportantForAccessibility(2);
    }
}
