package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jne extends sbx {
    public final jaf a;
    private final kdh b;

    public jne(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        kjy kjyVarD = this.b.d();
        kjyVarD.a = new jmm(this, jryVar, 3);
        kjyVarD.b = new jev(this, jryVar, 20);
        return kjyVarD;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        Object obj3 = jryVar.b;
        Object obj4 = jryVar.d;
        kjy kjyVar = (kjy) obj2;
        wur wurVar = (wur) obj3;
        wll wllVar = wurVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(((iqs) obj4).b(wllVar));
        String str = ((ixi) jryVar).a;
        kjyVar.F(str, new String[0]);
        boolean zN = jryVar.n();
        String str2 = wurVar.c;
        str2.getClass();
        kjyVar.s(str2);
        kjyVar.t(R.drawable.ic_thumb_down_24dp_selector);
        kjyVar.u(jryVar.n());
        kjyVar.v(str);
        kjyVar.r(new jhz(this, zN, jryVar, 5));
    }
}
