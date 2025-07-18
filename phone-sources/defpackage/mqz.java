package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mqz implements View.OnClickListener {
    final /* synthetic */ mra a;
    private final lie b;
    private final String c;
    private final ldv d;
    private final ieh e;

    public mqz(mra mraVar, lie lieVar, String str, ldv ldvVar, ieh iehVar) {
        this.a = mraVar;
        this.b = lieVar;
        this.c = str;
        this.d = ldvVar;
        this.e = iehVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mra mraVar = this.a;
        lhr lhrVar = mraVar.f;
        ieg iegVarA = ((ldy) this.e).a();
        lhrVar.c(this.b, this.d, iegVarA, mraVar.getActivity(), this.c);
    }
}
