package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jve extends sbx {
    public final jaf a;
    private final hfw b;

    public jve(hfw hfwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        int iBm = a.bm(((wuc) ixiVar.b).b);
        if (iBm == 0) {
            iBm = 1;
        }
        int i = iBm - 1;
        jvh jvhVar = new jvh(i != 1 ? i != 2 ? R.layout.spacer_view : R.layout.spacer_appbar_view : R.layout.spacer_fab_view);
        jvhVar.a = new jsi(this, ixiVar, 10);
        jvhVar.b = new jtt(this, ixiVar, 6);
        return jvhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((jvh) obj2).F(((ixi) obj).a, new String[0]);
    }
}
