package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jni extends sbx {
    public final jaf a;
    private final kdh b;

    public jni(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jry jryVar = (jry) obj;
        kjy kjyVarD = this.b.d();
        kjyVarD.a = new jmm(this, jryVar, 4);
        kjyVarD.b = new jnq(this, jryVar, 1);
        return kjyVarD;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jry jryVar = (jry) obj;
        Object obj3 = jryVar.b;
        Object obj4 = jryVar.d;
        kjy kjyVar = (kjy) obj2;
        wus wusVar = (wus) obj3;
        wll wllVar = wusVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(((iqs) obj4).b(wllVar));
        String str = ((ixi) jryVar).a;
        kjyVar.F(str, new String[0]);
        boolean zL = jryVar.l();
        String str2 = wusVar.c;
        str2.getClass();
        kjyVar.s(str2);
        kjyVar.t(R.drawable.ic_thumb_up_24dp_selector);
        kjyVar.u(jryVar.l());
        kjyVar.v(str);
        kjyVar.r(new jhz(this, zL, jryVar, 6));
    }
}
