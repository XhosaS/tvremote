package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnr extends sbx {
    public final jaf a;
    private final kdh b;

    public jnr(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        kjy kjyVarD = this.b.d();
        kjyVarD.a = new jmm(this, jryVar, 5);
        kjyVarD.b = new jnq(this, jryVar, 0);
        return kjyVarD;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        String str;
        jry jryVar = (jry) obj;
        Object obj3 = jryVar.b;
        Object obj4 = jryVar.d;
        kjy kjyVar = (kjy) obj2;
        wuu wuuVar = (wuu) obj3;
        wll wllVar = wuuVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(((iqs) obj4).b(wllVar));
        String str2 = ((ixi) jryVar).a;
        kjyVar.F(str2, new String[0]);
        boolean zJ = jryVar.j();
        if (jryVar.j()) {
            str = wuuVar.d;
            str.getClass();
        } else {
            str = wuuVar.c;
            str.getClass();
        }
        kjyVar.s(str);
        kjyVar.t(R.drawable.ic_check_circle_24dp_selector);
        kjyVar.u(jryVar.j());
        kjyVar.v(str2);
        kjyVar.r(new jhz(this, jryVar, zJ, 7));
    }
}
