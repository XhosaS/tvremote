package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pie extends bv {
    public static final tvn a = tvn.n("GnpSdk");
    public yfo b;
    public oxp c;
    public String d;
    public uvu e = uvu.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
    public kwy f;
    private gp g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            Object obj = qhj.a(context).ab().get(pie.class);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objB = ((yfo) obj).b();
            objB.getClass();
            ((owv) objB).a(this);
            oyd oydVar = ctk.b() ? (oyd) requireArguments().getParcelable("promo_context", oyd.class) : (oyd) requireArguments().getParcelable("promo_context");
            if (oydVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uwi uwiVar = oydVar.c;
            uyr uyrVar = uwiVar.f;
            if (uyrVar == null) {
                uyrVar = uyr.a;
            }
            if (uyrVar.c == 6) {
                uyr uyrVar2 = uwiVar.f;
                if (uyrVar2 == null) {
                    uyrVar2 = uyr.a;
                }
                uyo uyoVar = uyrVar2.c == 6 ? (uyo) uyrVar2.d : uyo.a;
                uyoVar.getClass();
                uyn uynVar = uyoVar.e;
                if (uynVar == null) {
                    uynVar = uyn.b;
                }
                T t = new vul(uynVar.c, uyn.a).get(0);
                t.getClass();
                uvu uvuVar = (uvu) t;
                this.e = uvuVar;
                this.d = osk.A(uvuVar);
                this.g = registerForActivityResult(new gz(), new pid(this, oydVar, 0));
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) a.g()).i(e)).s("Failed to inject members.");
        }
    }

    @Override // defpackage.bv
    public final void onStart() {
        gp gpVar;
        super.onStart();
        String str = this.d;
        if (str == null || (gpVar = this.g) == null) {
            return;
        }
        gpVar.b(str);
    }
}
