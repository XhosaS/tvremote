package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnw extends sbx {
    public final jaf a;
    private final kdh b;

    public jnw(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jtz jtzVar = (jtz) obj;
        kjy kjyVarD = this.b.d();
        kjyVarD.a = new jmm(this, jtzVar, 6);
        kjyVarD.b = new jnq(this, jtzVar, 2);
        return kjyVarD;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        String str;
        jtz jtzVar = (jtz) obj;
        Object obj3 = jtzVar.b;
        icu icuVar = jtzVar.e;
        kjy kjyVar = (kjy) obj2;
        wuv wuvVar = (wuv) obj3;
        wll wllVar = wuvVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(((iqs) icuVar).b(new iog(wllVar, ((ksn) ((ldy) jtzVar.d).a().g()).a)));
        String str2 = ((ixi) jtzVar).a;
        kjyVar.F(str2, new String[0]);
        boolean zJ = jtzVar.j();
        if (jtzVar.j()) {
            str = wuvVar.d;
            str.getClass();
        } else {
            str = wuvVar.c;
            str.getClass();
        }
        kjyVar.s(str);
        kjyVar.t(R.drawable.ic_bookmark_24dp_selector);
        kjyVar.u(jtzVar.j());
        kjyVar.v(str2);
        kjyVar.r(new jhz(this, zJ, jtzVar, 8));
    }
}
