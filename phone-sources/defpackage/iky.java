package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iky implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iky(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) throws Exception {
        wnq wnqVar;
        int i = 2;
        int i2 = 0;
        switch (this.c) {
            case 0:
                return ((ilc) this.a).a.d((gic) obj, (Object[]) this.b);
            case 1:
                return ilf.i((ilf) this.a, (imi[]) this.b, (yih) obj);
            case 2:
                ((ilc) this.a).b.e((gic) obj, (Object[]) this.b);
                return ygi.a;
            case 3:
                ((ili) this.a).b.e((gic) obj, (Object[]) this.b);
                return ygi.a;
            case 4:
                return ((ili) this.a).a.d((gic) obj, (Object[]) this.b);
            case 5:
                return ilf.i((ilf) this.a, (imi[]) this.b, (yih) obj);
            case 6:
                return ((ilk) this.a).b.d((gic) obj, (Object[]) this.b);
            case 7:
                ghi ghiVarA = ((gic) obj).a("SELECT * FROM watch_actions  WHERE account_name = ? AND entity_id = ?");
                Object obj2 = this.a;
                try {
                    ghiVarA.i(1, (String) this.b);
                    ghiVarA.i(2, ihz.c((wll) obj2));
                    int iJ = gez.J(ghiVarA, "account_name");
                    int iJ2 = gez.J(ghiVarA, "entity_id");
                    int iJ3 = gez.J(ghiVarA, "keep_forever");
                    int iJ4 = gez.J(ghiVarA, "watch_actions_blob");
                    int iJ5 = gez.J(ghiVarA, "last_server_write_millis");
                    imj imjVar = null;
                    if (ghiVarA.l()) {
                        String strD = ghiVarA.d(iJ);
                        wll wllVarD = ihz.d(ghiVarA.d(iJ2));
                        boolean z = ((int) ghiVarA.b(iJ3)) != 0;
                        byte[] bArrM = ghiVarA.m(iJ4);
                        try {
                            vuc vucVarP = vuc.p(wnq.a, bArrM, 0, bArrM.length, vtp.a());
                            vuc.B(vucVarP);
                            wnqVar = (wnq) vucVarP;
                        } catch (Exception unused) {
                            krd.c("Failed to parse byteArray into ProviderWatchActions proto");
                            wnqVar = null;
                        }
                        if (wnqVar == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.wireless.android.tv.gtv.ProviderWatchActions', but it was NULL.");
                        }
                        imjVar = new imj(strD, wllVarD, z, wnqVar, ghiVarA.b(iJ5));
                    }
                    return imjVar;
                } finally {
                    ghiVarA.close();
                }
            case 8:
                return ilf.i((ilf) this.a, (imi[]) this.b, (yih) obj);
            case 9:
                return ((ils) this.a).a.d((gic) obj, (Object[]) this.b);
            case 10:
                ((ils) this.a).b.e((gic) obj, (Object[]) this.b);
                return ygi.a;
            case 11:
                ((ilx) this.a).b.e((gic) obj, (Object[]) this.b);
                return ygi.a;
            case 12:
                return ((ilx) this.a).a.d((gic) obj, (Object[]) this.b);
            case 13:
                return ilf.i((ilf) this.a, (imi[]) this.b, (yih) obj);
            case 14:
                ((iqw) this.a).b(this.b);
                return ygi.a;
            case 15:
                vtw vtwVar = (vtw) obj;
                vtwVar.getClass();
                ((ieg) ((ylf) this.a).a).o(new jbj(new ill(vtwVar, 8), i2));
                ((ieg) ((ylf) this.b).a).o(new jbj(new ill(vtwVar, 9), i));
                return ygi.a;
            case 16:
                View view = (View) obj;
                view.getClass();
                jfv jfvVar = (jfv) this.b;
                if (((Boolean) xnf.a.et(((xnf) jfvVar.c).b)).booleanValue()) {
                    Object obj3 = this.a;
                    irc ircVar = jfvVar.d;
                    wkg wkgVar = ((wrx) ((ixi) obj3).b).k;
                    if (wkgVar == null) {
                        wkgVar = wkg.a;
                    }
                    wkgVar.getClass();
                    ircVar.f(wkgVar, view, pjw.c());
                }
                return ygi.a;
            case 17:
                wlx wlxVar = (wlx) obj;
                if (wlxVar != null) {
                    Object obj4 = this.a;
                    jgv jgvVar = (jgv) this.b;
                    jgvVar.g = wlxVar;
                    iyz iyzVar = jgvVar.k;
                    iyzVar.f(iyzVar.d(wlxVar));
                    joz jozVar = (joz) obj4;
                    if (jozVar.d && jgvVar.h != null) {
                        jozVar.d = false;
                        long jD = jgvVar.d(jgvVar.g);
                        Context context = jgvVar.h;
                        if (context == null) {
                            context = jgvVar.a;
                        }
                        wul wulVar = ((wum) ((ixi) obj4).b).h;
                        if (wulVar == null) {
                            wulVar = wul.a;
                        }
                        wql wqlVar = wulVar.c;
                        if (wqlVar == null) {
                            wqlVar = wql.a;
                        }
                        wqlVar.getClass();
                        jan.e(context, wqlVar, jD);
                    }
                }
                return ygi.a;
            case 18:
                String str = (String) obj;
                if (str == null) {
                    krd.c("No sort option is chosen.");
                } else {
                    jus jusVar = (jus) this.a;
                    wok wokVar = (wok) jusVar.d.get(str);
                    if (wokVar == null) {
                        wokVar = wok.a;
                        wokVar.getClass();
                    }
                    Object obj5 = this.b;
                    jusVar.j(wokVar);
                    ((ulp) obj5).az(new iya(str));
                }
                return ygi.a;
            case 19:
                View view2 = (View) obj;
                view2.getClass();
                wkg wkgVar2 = ((wun) ((ixi) this.a).b).k;
                if (wkgVar2 == null) {
                    wkgVar2 = wkg.a;
                }
                Object obj6 = this.b;
                wkgVar2.getClass();
                ((jwa) obj6).d.f(wkgVar2, view2, pjw.c());
                return ygi.a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                Object obj8 = this.b;
                if (zBooleanValue) {
                    bcb bcbVarB = ((jxa) obj8).b();
                    String string = ((Context) obj7).getString(R.string.user_feedback_add_wishlist_toast);
                    string.getClass();
                    bcbVarB.b(string);
                } else {
                    bcb bcbVarB2 = ((jxa) obj8).b();
                    String string2 = ((Context) obj7).getString(R.string.user_feedback_remove_wishlist_toast);
                    string2.getClass();
                    bcbVarB2.b(string2);
                }
                return ygi.a;
        }
    }

    public /* synthetic */ iky(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
