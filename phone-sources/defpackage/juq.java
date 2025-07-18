package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juq extends sbx {
    public final jaf a;
    public final kwy b;
    private final kdh c;

    public juq(kdh kdhVar, kwy kwyVar, jaf jafVar) {
        kwyVar.getClass();
        jafVar.getClass();
        this.c = kdhVar;
        this.b = kwyVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        kjy kjyVarD = this.c.d();
        kjyVarD.a = new jsi(this, ixiVar, 8);
        kjyVarD.b = new jtt(this, ixiVar, 4);
        return kjyVarD;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        String str = ixiVar.a;
        kjy kjyVar = (kjy) obj2;
        kjyVar.F(str, new String[0]);
        kjyVar.s(((wua) ixiVar.b).b);
        kjyVar.t(R.drawable.ic_baseline_share_24);
        kjyVar.v(str);
        kjyVar.r(new juu(this, ixiVar, 1));
    }
}
