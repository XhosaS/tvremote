package defpackage;

import android.widget.Button;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mqx implements idy {
    final /* synthetic */ mra a;
    private final lie b;
    private final Button c;
    private final TextView d;
    private final Button e;
    private final Button f;
    private final ldv g;
    private final ieh h;

    public mqx(mra mraVar, lie lieVar, Button button, TextView textView, Button button2, Button button3, ldv ldvVar, ieh iehVar) {
        this.a = mraVar;
        this.b = lieVar;
        this.c = button;
        this.d = textView;
        this.e = button2;
        this.f = button3;
        this.g = ldvVar;
        this.h = iehVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        llt lltVar = (llt) obj;
        mra mraVar = this.a;
        this.d.setText((CharSequence) mraVar.h.b(lltVar));
        this.e.setVisibility(true != lltVar.c() ? 8 : 0);
        this.f.setVisibility(true != lltVar.d() ? 8 : 0);
        int i = (lltVar.b().m() && mraVar.a.d() && !jwq.M(mraVar.getActivity())) ? 0 : 8;
        Button button = this.c;
        button.setVisibility(i);
        button.setOnClickListener(new mqz(mraVar, this.b, (String) lltVar.b().h("mobile_movie_troubleshoot"), this.g, this.h));
    }
}
